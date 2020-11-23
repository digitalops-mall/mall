package com.macro.mall.portal.domain;

import com.macro.mall.model.OmsOrder;
import com.macro.mall.model.OmsOrderItem;
import com.macro.mall.model.PmsProduct;
import lombok.Data;

import java.util.List;

/**
 * 包含订单商品信息的订单详情
 * Created by macro on 2018/9/4.
 */
@Data
public class OmsOrderList extends OmsOrderDetail {
    private List<PmsProduct> products;
}
