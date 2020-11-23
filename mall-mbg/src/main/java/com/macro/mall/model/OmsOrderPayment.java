package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OmsOrderPayment implements Serializable {
    private Long id;

    @ApiModelProperty(value = "??id")
    private Long orderId;

    @ApiModelProperty(value = "????")
    private String orderSn;

    private String paymentId;

    @ApiModelProperty(value = "?????")
    private String paymentSn;

    @ApiModelProperty(value = "????")
    private BigDecimal paymentMoney;

    @ApiModelProperty(value = "渠道ID")
    private String channelId;

    @ApiModelProperty(value = "货币类型")
    private String currency;

    @ApiModelProperty(value = "支付状态")
    private String status;

    @ApiModelProperty(value = "客户端IP")
    private String clientIp;

    @ApiModelProperty(value = "设备")
    private String device;

    @ApiModelProperty(value = "渠道订单号")
    private String channelOrderNo;

    private String param1;

    private String param2;

    @ApiModelProperty(value = "支付成功时间")
    private Date paySuccTime;

    private String mchId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentSn() {
        return paymentSn;
    }

    public void setPaymentSn(String paymentSn) {
        this.paymentSn = paymentSn;
    }

    public BigDecimal getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(BigDecimal paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getChannelOrderNo() {
        return channelOrderNo;
    }

    public void setChannelOrderNo(String channelOrderNo) {
        this.channelOrderNo = channelOrderNo;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public Date getPaySuccTime() {
        return paySuccTime;
    }

    public void setPaySuccTime(Date paySuccTime) {
        this.paySuccTime = paySuccTime;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", paymentId=").append(paymentId);
        sb.append(", paymentSn=").append(paymentSn);
        sb.append(", paymentMoney=").append(paymentMoney);
        sb.append(", channelId=").append(channelId);
        sb.append(", currency=").append(currency);
        sb.append(", status=").append(status);
        sb.append(", clientIp=").append(clientIp);
        sb.append(", device=").append(device);
        sb.append(", channelOrderNo=").append(channelOrderNo);
        sb.append(", param1=").append(param1);
        sb.append(", param2=").append(param2);
        sb.append(", paySuccTime=").append(paySuccTime);
        sb.append(", mchId=").append(mchId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}