
##### oms_order_payment
##### 订单支付信息
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|order_id|order_id|bigint|||订单id||
|order_sn|order_sn|varchar|64||订单编号||
|payment_id|payment_id|bigint|||支付单id||
|payment_sn|payment_sn|varchar|64||支付单编号||
|payment_money|payment_money|decimal|10||支付金额||
|channel_id|channel_id|varchar|64||渠道ID||
|currency|currency|varchar|64||货币类型||
|status|status|varchar|64||支付状态||
|client_ip|client_ip|varchar|64||客户端IP||
|device|device|varchar|64||设备||
|channel_order_no|channel_order_no|varchar|64||渠道订单号||
|param1|param1|varchar|64||||
|param2|param2|varchar|64||||
|pay_succ_time|pay_succ_time|datetime|||支付成功时间||
