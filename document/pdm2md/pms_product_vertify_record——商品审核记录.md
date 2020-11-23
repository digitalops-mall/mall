
##### pms_product_vertify_record
##### 商品审核记录
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|product_id|product_id|bigint|||||
|create_time|create_time|datetime|||||
|vertify_man|vertify_man|varchar|64||审核人||
|status|status|int|1||审核后的状态：0->未通过；2->已通过||
|detail|detail|varchar|255||反馈详情||
