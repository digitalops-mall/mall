package com.macro.mall.portal.service;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.UmsMember;
import com.macro.mall.portal.vo.WxUserInfoVO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * 会员管理Service
 * Created by macro on 2018/8/3.
 */
public interface UmsMemberService {
    /**
     * 根据用户名获取会员
     */
    UmsMember getByUsername(String username);

    /**
     * 根据会员编号获取会员
     */
    UmsMember getById(Long id);

    /**
     * 用户注册
     */
    @Transactional
    CommonResult register(String username, String password, String telephone, String authCode, String type, String value);

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 修改密码
     */
    @Transactional
    CommonResult updatePassword(String telephone, String password, String authCode);

    /**
     * 获取当前登录会员
     */
    UmsMember getCurrentMember();

    /**
     * 根据会员id修改会员积分
     */
    void updateIntegration(Long id,Integer integration);


    /**
     * 获取用户信息
     */
    UserDetails loadUserByUsername(String username);

    /**
     * 获取用户信息
     * @param type 标识用户唯一的数据类型
     * @param value 标识用户唯一的数据值
     * @return
     */
    UserDetails loadUser(String type,String value);

    /**
     * 登录后获取token
     * @return
     */
    Map<String, String> login(String username, String password);

    /**
     * 登录后获取token
     * @return
     */
    Map<String, String> login(String username, String password, WxUserInfoVO wxUserInfoVO);

    /**
     * 登录后获取token
     * @return
     */
    Map<String, String> loginByUniqueType(String type, String value);

    /**
     * 刷新token
     */
    String refreshToken(String token);

    UmsMember getMemberByOpenId(String openId);

    UmsMember getMemberByMobilePhoneNumber(String mobilePhoneNumber);

    CommonResult updateMemberInfo(WxUserInfoVO wxUserInfoVO);

    CommonResult loginAndUpdateUserInfo(WxUserInfoVO wxUserInfoVO);
}
