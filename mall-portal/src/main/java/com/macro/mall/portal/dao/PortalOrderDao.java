package com.macro.mall.portal.dao;

import com.macro.mall.model.OmsOrder;
import com.macro.mall.model.OmsOrderItem;
import com.macro.mall.model.OmsOrderPayment;
import com.macro.mall.portal.domain.OmsOrderDetail;
import com.macro.mall.portal.domain.OmsOrderList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 前台订单自定义Dao
 * Created by macro on 2018/9/4.
 */
public interface PortalOrderDao {
    /**
     * 获取订单及下单商品详情
     */
    OmsOrderDetail getDetail(@Param("orderId") Long orderId);

    /**
     * 获取订单及下单商品详情
     */
    OmsOrderDetail getDetailByOrderSn(@Param("orderSn") String orderSn);

    /**
     * 修改 pms_sku_stock表的锁定库存及真实库存
     */
    int updateSkuStock(@Param("itemList") List<OmsOrderItem> orderItemList);

    /**
     * 获取超时订单
     * @param minute 超时时间（分）
     */
    List<OmsOrderDetail> getTimeOutOrders(@Param("minute") Integer minute);

    /**
     * 批量修改订单状态
     */
    int updateOrderStatus(@Param("ids") List<Long> ids,@Param("status") Integer status);

    /**
     * 解除取消订单的库存锁定
     */
    int releaseSkuStockLock(@Param("itemList") List<OmsOrderItem> orderItemList);

    /**
     * 更新支付订单信息
     * @param orderPayment
     * @return
     */
    int updateOrderPayment(@Param("orderPayment")OmsOrderPayment orderPayment);
    /**
     * 更新支付订单信息
     * @param orderPayment
     * @return
     */
    int updateOrderPaymentByOrderSn(@Param("orderPayment")OmsOrderPayment orderPayment);

    /**
     * 更新支付订单信息
     * @param order
     * @return
     */
    int updateOrderByOrderSnSelective(@Param("order") OmsOrder order);

    /**
     * 获取订单详情列表
     * @param memberId
     * @return
     */
    List<OmsOrderList> getOrderList(@Param("memberId") Integer memberId,@Param("status") Integer status);



}
