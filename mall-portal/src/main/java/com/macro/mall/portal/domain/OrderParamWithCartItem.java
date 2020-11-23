package com.macro.mall.portal.domain;

import com.macro.mall.model.OmsCartItem;
import lombok.Data;

import java.util.List;

/**
 * 生成订单时传入的参数
 *
 * @author macro
 * @date 2018/8/30
 */
@Data
public class OrderParamWithCartItem {
    /** 收货地址id */
    private Long memberReceiveAddressId;
    /**优惠券id*/
    private Long couponId;
    /**使用的积分数*/
    private Integer useIntegration;
    /**支付方式*/
    private Integer payType;
    /**选中要购买的购物车商品信息*/
    private List<OmsCartItem> cartItems;

}
