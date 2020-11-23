package com.macro.mall.portal.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class AliPayNotifyVO implements Serializable {

    private String payOrderId;
    private String mchId;
    private String mchOrderNo;
    private String channelId;
    private String amount;
    private String currency;
    private String status;
    private String clientIp;
    private String device;
    private String subject;
    private String channelOrderNo;
    private String param1;
    private String param2;
    private String paySuccTime;
    private String backType;
    private String sign;
}
