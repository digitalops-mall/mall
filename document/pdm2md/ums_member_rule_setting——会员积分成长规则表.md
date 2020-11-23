
##### ums_member_rule_setting
##### 会员积分成长规则表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|continue_sign_day|continue_sign_day|int|||连续签到天数||
|continue_sign_point|continue_sign_point|int|||连续签到赠送数量||
|consume_per_point|consume_per_point|decimal|10||每消费多少元获取1个点||
|low_order_amount|low_order_amount|decimal|10||最低获取点数的订单金额||
|max_point_per_order|max_point_per_order|int|||每笔订单最高获取点数||
|type|type|int|1||类型：0->积分规则；1->成长值规则||
