
##### oms_order_operate_history
##### 订单操作历史记录
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|order_id|order_id|bigint|||订单id||
|operate_man|operate_man|varchar|100||操作人：用户；系统；后台管理员||
|create_time|create_time|datetime|||操作时间||
|order_status|order_status|int|1||订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单||
|note|note|varchar|500||备注||
