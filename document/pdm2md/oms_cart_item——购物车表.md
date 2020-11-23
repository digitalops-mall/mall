
##### oms_cart_item
##### 购物车表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|product_id|product_id|bigint|||||
|product_sku_id|product_sku_id|bigint|||||
|member_id|member_id|bigint|||||
|quantity|quantity|int|||购买数量||
|price|price|decimal|10||添加到购物车的价格||
|sp1|sp1|varchar|200||销售属性1||
|sp2|sp2|varchar|200||销售属性2||
|sp3|sp3|varchar|200||销售属性3||
|product_pic|product_pic|varchar|1000||商品主图||
|product_name|product_name|varchar|500||商品名称||
|product_brand|product_brand|varchar|200||||
|product_sn|product_sn|varchar|200||||
|product_sub_title|product_sub_title|varchar|500||商品副标题（卖点）||
|product_sku_code|product_sku_code|varchar|200||商品sku条码||
|member_nickname|member_nickname|varchar|500||会员昵称||
|create_date|create_date|datetime|||创建时间||
|modify_date|modify_date|datetime|||修改时间||
|delete_status|delete_status|int|1|0|是否删除||
|product_category_id|product_category_id|bigint|||商品的分类||
|product_attr|product_attr|varchar|500||商品销售属性:[{"key":"颜色","value":"银色"},{"key":"容量","value":"4G"}]||
