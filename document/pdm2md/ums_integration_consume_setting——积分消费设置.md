
##### ums_integration_consume_setting
##### 积分消费设置
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|deduction_per_amount|deduction_per_amount|int|||每一元需要抵扣的积分数量||
|max_percent_per_order|max_percent_per_order|int|||每笔订单最高抵用百分比||
|use_unit|use_unit|int|||每次使用积分最小单位100||
|coupon_status|coupon_status|int|1||是否可以和优惠券同用；0->不可以；1->可以||
