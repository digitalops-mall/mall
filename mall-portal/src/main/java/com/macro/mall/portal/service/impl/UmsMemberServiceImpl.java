package com.macro.mall.portal.service.impl;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.mapper.UmsMemberLevelMapper;
import com.macro.mall.mapper.UmsMemberMapper;
import com.macro.mall.model.UmsMember;
import com.macro.mall.model.UmsMemberExample;
import com.macro.mall.model.UmsMemberLevel;
import com.macro.mall.model.UmsMemberLevelExample;
import com.macro.mall.portal.constant.PortalResultCode;
import com.macro.mall.portal.domain.MemberDetails;
import com.macro.mall.portal.service.RedisService;
import com.macro.mall.portal.service.UmsMemberService;
import com.macro.mall.portal.vo.WxUserInfoVO;
import com.macro.mall.security.util.JwtTokenUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * 会员管理Service实现类
 * Created by macro on 2018/8/3.
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsMemberServiceImpl.class);
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private UmsMemberMapper memberMapper;
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;
    @Autowired
    private RedisService redisService;
    @Value("${redis.key.prefix.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;
    @Value("${redis.key.expire.authCode}")
    private Long AUTH_CODE_EXPIRE_SECONDS;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
    public UmsMember getByUsername(String username) {
        UmsMemberExample example = new UmsMemberExample();
        example.createCriteria().andUsernameEqualTo(username);
        example.or().andPhoneEqualTo(username);
        List<UmsMember> memberList = memberMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(memberList)) {
            return memberList.get(0);
        }
        return null;
    }

    @Override
    public UmsMember getById(Long id) {
        return memberMapper.selectByPrimaryKey(id);
    }

    @Override
    public CommonResult register(String username, String password, String telephone, String authCode, String type, String value) {
        //验证验证码
        if(!verifyAuthCode(authCode,telephone)){
            return CommonResult.failed("验证码错误");
        }
        //查询是否已有该用户
        UmsMemberExample example = new UmsMemberExample();
        example.createCriteria().andUsernameEqualTo(username);
        example.or(example.createCriteria().andPhoneEqualTo(telephone));
        List<UmsMember> umsMembers = memberMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(umsMembers)) {
            return CommonResult.failed("该用户已经存在");
        }
        //没有该用户进行添加操作
        UmsMember umsMember = new UmsMember();
        umsMember.setUsername(username);
        umsMember.setPhone(telephone);
        umsMember.setPassword(passwordEncoder.encode(password));
        umsMember.setCreateTime(new Date());
        umsMember.setStatus(1);

        //如果openid没有绑定则进行添加操作
        if(StringUtils.isNoneBlank(type,value)) {
            if("openid".equals(type)) {
                UmsMember memberByOpenId = getMemberByOpenId(value);
                if(memberByOpenId == null) {
                    umsMember.setOpenId(value);
                }
            }
        }

        //获取默认会员等级并设置
        UmsMemberLevelExample levelExample = new UmsMemberLevelExample();
        levelExample.createCriteria().andDefaultStatusEqualTo(1);
        List<UmsMemberLevel> memberLevelList = memberLevelMapper.selectByExample(levelExample);
        if (!CollectionUtils.isEmpty(memberLevelList)) {
            umsMember.setMemberLevelId(memberLevelList.get(0).getId());
        }
        memberMapper.insert(umsMember);
        umsMember.setPassword(null);
        return CommonResult.success(null,"注册成功");
    }

    @Override
    public CommonResult generateAuthCode(String telephone) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i=0;i<6;i++){
            sb.append(random.nextInt(10));
        }
        //验证码绑定手机号并存储到redis
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE+telephone,sb.toString());
        redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE+telephone,AUTH_CODE_EXPIRE_SECONDS);
        return CommonResult.success(sb.toString(),"获取验证码成功");
    }

    @Override
    public CommonResult updatePassword(String telephone, String password, String authCode) {
        UmsMemberExample example = new UmsMemberExample();
        example.createCriteria().andPhoneEqualTo(telephone);
        List<UmsMember> memberList = memberMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(memberList)){
            return CommonResult.failed("该账号不存在");
        }
        //验证验证码
        if(!verifyAuthCode(authCode,telephone)){
            return CommonResult.failed("验证码错误");
        }
        UmsMember umsMember = memberList.get(0);
        umsMember.setPassword(passwordEncoder.encode(password));
        memberMapper.updateByPrimaryKeySelective(umsMember);
        return CommonResult.success(null,"密码修改成功");
    }

    @Override
    public UmsMember getCurrentMember() {
        SecurityContext ctx = SecurityContextHolder.getContext();
        Authentication auth = ctx.getAuthentication();
        MemberDetails memberDetails = (MemberDetails) auth.getPrincipal();
        return memberDetails.getUmsMember();
    }

    @Override
    public void updateIntegration(Long id, Integer integration) {
        UmsMember record=new UmsMember();
        record.setId(id);
        record.setIntegration(integration);
        memberMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        UmsMember member = getByUsername(username);
        if(member!=null){
            return new MemberDetails(member);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }

    @Override
    public UserDetails loadUser(String type, String value) {
        if("openid".equals(type)) {
            UmsMember member = getMemberByOpenId(value);
            if(member!=null){
                return new MemberDetails(member);
            }
        }
        throw new UsernameNotFoundException("找不到用户对应的微信信息");
    }

    @Override
    public Map<String, String> login(String username, String password) {
        String token = null;
        Map<String, String> res = new HashMap<String, String> ();
        //密码需要客户端加密后传递
        try {
            UserDetails userDetails = loadUserByUsername(username);
            if(!passwordEncoder.matches(password,userDetails.getPassword())){
                throw new BadCredentialsException("密码不正确");
            }
            authenticate(res, userDetails);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return res;
    }

    @Override
    public Map<String, String> login(String username, String password, WxUserInfoVO wxUserInfoVO) {
        String token = null;
        Map<String, String> res = new HashMap<String, String> ();
        //密码需要客户端加密后传递
        try {
            UmsMember member = getByUsername(username);
            if(member==null){
                throw new UsernameNotFoundException("用户名或密码错误");
            }
            updateMember(wxUserInfoVO, member);
            UserDetails userDetails = new MemberDetails(member);;
            if(!passwordEncoder.matches(password,userDetails.getPassword())){
                throw new BadCredentialsException("密码不正确");
            }
            authenticate(res, userDetails);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return res;
    }

    private void updateMember(WxUserInfoVO wxUserInfoVO, UmsMember member) {
        if (StringUtils.isAllBlank(member.getNickname(), member.getIcon(), member.getCity())) {
            member.setNickname(wxUserInfoVO.getNickName());
            member.setIcon(wxUserInfoVO.getHeadUrl());
            member.setGender(Integer.valueOf(wxUserInfoVO.getGender()));
            member.setCity(wxUserInfoVO.getCity());
            member.setProvince(wxUserInfoVO.getProvince());
            member.setCountry(wxUserInfoVO.getCountry());
            member.setOpenId(wxUserInfoVO.getOpenId());
            memberMapper.updateByPrimaryKeySelective(member);
        }
    }

    @Override
    public Map<String, String> loginByUniqueType(String type, String value) {
        String token = null;
        Map<String, String> res = new HashMap<String, String> ();
        //密码需要客户端加密后传递
        try {
            UserDetails userDetails = loadUser(type, value);
            authenticate(res, userDetails);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return res;
    }

    private void authenticate(Map<String, String> res, UserDetails userDetails) {
        String token;
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        token = jwtTokenUtil.generateToken(userDetails);
        res.put("token", token);
        MemberDetails memberDetails = (MemberDetails) authentication.getPrincipal();
        res.put("memberId", memberDetails.getUmsMember().getId().toString());
    }

    @Override
    public String refreshToken(String token) {
        return jwtTokenUtil.refreshHeadToken(token);
    }

    @Override
    public UmsMember getMemberByOpenId(String openId) {
        //查询是否已有该用户
        UmsMemberExample example = new UmsMemberExample();
        example.createCriteria().andOpenIdEqualTo(openId);
        List<UmsMember> umsMembers = memberMapper.selectByExample(example);
        return (umsMembers!=null && !umsMembers.isEmpty())?umsMembers.get(0):null;
    }

    @Override
    public UmsMember getMemberByMobilePhoneNumber(String mobilePhoneNumber) {
        //查询是否已有该用户
        UmsMemberExample example = new UmsMemberExample();
        example.createCriteria().andPhoneEqualTo(mobilePhoneNumber);
        List<UmsMember> umsMembers = memberMapper.selectByExample(example);
        return (umsMembers!=null && !umsMembers.isEmpty())?umsMembers.get(0):null;
    }

    @Override
    public CommonResult updateMemberInfo(WxUserInfoVO wxUserInfoVO) {
        String openId = wxUserInfoVO.getOpenId();
        UmsMember member = this.getMemberByOpenId(openId);
        if(member == null) {
            return CommonResult.failed(PortalResultCode.MEMBER_MISS);
        }
        member.setNickname(wxUserInfoVO.getNickName());
        member.setIcon(wxUserInfoVO.getHeadUrl());
        member.setGender(Integer.valueOf(wxUserInfoVO.getGender()));
        member.setCity(wxUserInfoVO.getCity());
        member.setProvince(wxUserInfoVO.getProvince());
        member.setCountry(wxUserInfoVO.getCountry());
        member.setOpenId(wxUserInfoVO.getOpenId());
        memberMapper.updateByPrimaryKeySelective(member);
        return CommonResult.success("更新用户数据成功");
    }

    @Override
    public CommonResult loginAndUpdateUserInfo(WxUserInfoVO wxUserInfoVO) {
        String openId = wxUserInfoVO.getOpenId();
        UmsMember member = this.getMemberByOpenId(openId);
        if(member == null) {
            return CommonResult.failed(PortalResultCode.MEMBER_MISS);
        }
        updateMember(wxUserInfoVO, member);
        MemberDetails memberDetails = new MemberDetails(member);
        Map<String, String> res = new HashMap<String, String> ();
        authenticate(res,memberDetails);
        res.put("tokenHead", tokenHead);
        return CommonResult.success(res);
    }

    //对输入的验证码进行校验
    private boolean verifyAuthCode(String authCode, String telephone){
        if(StringUtils.isEmpty(authCode)){
            return false;
        }
        String realAuthCode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + telephone);
        return authCode.equals(realAuthCode);
    }

}
