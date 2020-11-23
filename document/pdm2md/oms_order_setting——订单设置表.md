
##### oms_order_setting
##### 订单设置表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|flash_order_overtime|flash_order_overtime|int|||秒杀订单超时关闭时间(分)||
|normal_order_overtime|normal_order_overtime|int|||正常订单超时时间(分)||
|confirm_overtime|confirm_overtime|int|||发货后自动确认收货时间（天）||
|finish_overtime|finish_overtime|int|||自动完成交易时间，不能申请售后（天）||
|comment_overtime|comment_overtime|int|||订单完成后自动好评时间（天）||
