package com.macro.mall.portal.vo;

import lombok.Data;

@Data
public class WxUserInfoVO {
    private String appid;
    private String openId;
    private String nickName;
    private String headUrl;
    private String gender;
    private String city;
    private String province;
    private String country;
}
