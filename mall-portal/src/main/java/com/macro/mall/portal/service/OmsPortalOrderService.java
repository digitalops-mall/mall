package com.macro.mall.portal.service;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.portal.domain.ConfirmOrderResult;
import com.macro.mall.portal.domain.OmsOrderList;
import com.macro.mall.portal.domain.OrderParam;
import com.macro.mall.portal.domain.OrderParamWithCartItem;
import com.macro.mall.portal.vo.AliPayNotifyVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 前台订单管理Service
 * Created by macro on 2018/8/30.
 */
public interface OmsPortalOrderService {
    /**
     * 根据用户购物车信息生成确认单信息
     */
    ConfirmOrderResult generateConfirmOrder();

    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);
    /**
     * 根据选择的购物车商品提交信息生成订单
     */
    @Transactional
    CommonResult generateOrderBySeleted(OrderParam orderParam);
    /**
     * 根据选择的购物车商品提交信息生成订单
     */
    @Transactional
    CommonResult generateOrderBySeletedCartItem(OrderParamWithCartItem orderParam);

    /**
     * 根据订单id获取支付信息
     */
    @Transactional
    CommonResult getOrderPaymentInfo(Long orderId);
    /**
     * 支付成功后的回调
     */
    @Transactional
    CommonResult paySuccess(Long orderId);
    /**
     * 支付成功后的回调
     */
    @Transactional
    CommonResult paySuccessByOrderSn(String orderSn);

    /**
     * 支付成功后的回调
     */
    @Transactional
    CommonResult aliPaySuccess(AliPayNotifyVO aliPayNotifyVO);

    /**
     * 自动取消超时订单
     */
    @Transactional
    CommonResult cancelTimeOutOrder();

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);

    /**
     * 发送延迟消息取消订单
     */
    void sendDelayMessageCancelOrder(Long orderId);

    /**
     * 获取全部订单
     * @return
     * @param status
     */
    List<OmsOrderList> getOrders(String status);
}
