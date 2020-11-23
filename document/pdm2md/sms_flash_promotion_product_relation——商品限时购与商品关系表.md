
##### sms_flash_promotion_product_relation
##### 商品限时购与商品关系表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint|||编号|Y|
|flash_promotion_id|flash_promotion_id|bigint|||||
|flash_promotion_session_id|flash_promotion_session_id|bigint|||编号||
|product_id|product_id|bigint|||||
|flash_promotion_price|flash_promotion_price|decimal|10||限时购价格||
|flash_promotion_count|flash_promotion_count|int|||限时购数量||
|flash_promotion_limit|flash_promotion_limit|int|||每人限购数量||
|sort|sort|int|||排序||
