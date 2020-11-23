package com.macro.mall.portal.dao;

import com.macro.mall.model.OmsCartItem;
import com.macro.mall.model.OmsOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单商品信息自定义Dao
 * Created by macro on 2018/9/3.
 */
public interface PortalOrderItemDao {

    int insertList(@Param("list") List<OmsOrderItem> list);


    /**
     * 根据ids获取购物车列表
     * @param ids
     * @return
     */
    List<OmsCartItem> getOmsCartItemsByIds(@Param("ids")List<String> ids);
}
