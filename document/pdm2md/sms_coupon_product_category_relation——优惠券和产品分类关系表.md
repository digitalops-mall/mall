
##### sms_coupon_product_category_relation
##### 优惠券和产品分类关系表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|coupon_id|coupon_id|bigint|||||
|product_category_id|product_category_id|bigint|||||
|product_category_name|product_category_name|varchar|200||产品分类名称||
|parent_category_name|parent_category_name|varchar|200||父分类名称||
