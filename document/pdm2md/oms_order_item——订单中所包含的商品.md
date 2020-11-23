
##### oms_order_item
##### 订单中所包含的商品
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|order_id|order_id|bigint|||订单id||
|order_sn|order_sn|varchar|64||订单编号||
|product_id|product_id|bigint|||||
|product_pic|product_pic|varchar|500||||
|product_name|product_name|varchar|200||||
|product_brand|product_brand|varchar|200||||
|product_sn|product_sn|varchar|64||||
|product_price|product_price|decimal|10||销售价格||
|product_quantity|product_quantity|int|||购买数量||
|product_sku_id|product_sku_id|bigint|||商品sku编号||
|product_sku_code|product_sku_code|varchar|50||商品sku条码||
|product_category_id|product_category_id|bigint|||商品分类id||
|sp1|sp1|varchar|100||商品的销售属性||
|sp2|sp2|varchar|100||||
|sp3|sp3|varchar|100||||
|promotion_name|promotion_name|varchar|200||商品促销名称||
|promotion_amount|promotion_amount|decimal|10||商品促销分解金额||
|coupon_amount|coupon_amount|decimal|10||优惠券优惠分解金额||
|integration_amount|integration_amount|decimal|10||积分优惠分解金额||
|real_amount|real_amount|decimal|10||该商品经过优惠后的分解金额||
|gift_integration|gift_integration|int||0|商品赠送积分||
|gift_growth|gift_growth|int||0|商品赠送成长值||
|product_attr|product_attr|varchar|500||商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]||
