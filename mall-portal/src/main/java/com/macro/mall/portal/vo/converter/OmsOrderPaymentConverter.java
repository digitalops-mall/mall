package com.macro.mall.portal.vo.converter;

import com.macro.mall.model.OmsOrderPayment;
import com.macro.mall.portal.vo.AliPayNotifyVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel="spring")
public interface OmsOrderPaymentConverter {

    @Mappings({
            @Mapping(source = "payOrderId", target = "paymentId"),
            @Mapping(source = "mchOrderNo", target = "orderId"),
            @Mapping(target = "paySuccTime", expression = "java(new java.util.Date(java.lang.Long.valueOf(aliPayNotifyVO.getPaySuccTime())))"),
            @Mapping(source = "amount", target = "paymentMoney"),
            @Mapping(source = "subject", target = "orderSn"),
    })
    OmsOrderPayment aliPayNotifyVO2OmsOrderPayment(AliPayNotifyVO aliPayNotifyVO);
}