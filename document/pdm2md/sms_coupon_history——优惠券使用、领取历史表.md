
##### sms_coupon_history
##### 优惠券使用、领取历史表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|coupon_id|coupon_id|bigint|||||
|member_id|member_id|bigint|||||
|order_id|order_id|bigint|||订单id||
|coupon_code|coupon_code|varchar|64||||
|member_nickname|member_nickname|varchar|64||领取人昵称||
|get_type|get_type|int|1||获取类型：0->后台赠送；1->主动获取||
|create_time|create_time|datetime|||||
|use_status|use_status|int|1||使用状态：0->未使用；1->已使用；2->已过期||
|use_time|use_time|datetime|||使用时间||
|order_sn|order_sn|varchar|100||订单号码||
