package com.macro.mall.portal.vo;

import com.macro.mall.model.PmsSkuStock;
import com.macro.mall.portal.pojo.ProductAttribute;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ProductDetailInfo implements Serializable {
    public PmsSkuStock pmsSkuStock;
    public List<ProductAttribute> productAttributes;

}
