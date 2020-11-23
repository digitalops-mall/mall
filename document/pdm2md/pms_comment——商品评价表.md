
##### pms_comment
##### 商品评价表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|product_id|product_id|bigint|||||
|member_nick_name|member_nick_name|varchar|255||||
|product_name|product_name|varchar|255||||
|star|star|int|3||评价星数：0->5||
|member_ip|member_ip|varchar|64||评价的ip||
|create_time|create_time|datetime|||||
|show_status|show_status|int|1||||
|product_attribute|product_attribute|varchar|255||购买时的商品属性||
|collect_couont|collect_couont|int|||||
|read_count|read_count|int|||||
|content|content|text|||||
|pics|pics|varchar|1000||上传图片地址，以逗号隔开||
|member_icon|member_icon|varchar|255||评论用户头像||
|replay_count|replay_count|int|||||
