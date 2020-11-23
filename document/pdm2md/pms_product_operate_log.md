
##### pms_product_operate_log
##### null
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|product_id|product_id|bigint|||||
|price_old|price_old|decimal|10||||
|price_new|price_new|decimal|10||||
|sale_price_old|sale_price_old|decimal|10||||
|sale_price_new|sale_price_new|decimal|10||||
|gift_point_old|gift_point_old|int|||赠送的积分||
|gift_point_new|gift_point_new|int|||||
|use_point_limit_old|use_point_limit_old|int|||||
|use_point_limit_new|use_point_limit_new|int|||||
|operate_man|operate_man|varchar|64||操作人||
|create_time|create_time|datetime|||||
