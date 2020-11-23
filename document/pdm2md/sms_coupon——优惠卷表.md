
##### sms_coupon
##### 优惠卷表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|type|type|int|1||优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券||
|name|name|varchar|100||||
|platform|platform|int|1||使用平台：0->全部；1->移动；2->PC||
|count|count|int|||数量||
|amount|amount|decimal|10||金额||
|per_limit|per_limit|int|||每人限领张数||
|min_point|min_point|decimal|10||使用门槛；0表示无门槛||
|start_time|start_time|datetime|||||
|end_time|end_time|datetime|||||
|use_type|use_type|int|1||使用类型：0->全场通用；1->指定分类；2->指定商品||
|note|note|varchar|200||备注||
|publish_count|publish_count|int|||发行数量||
|use_count|use_count|int|||已使用数量||
|receive_count|receive_count|int|||领取数量||
|enable_time|enable_time|datetime|||可以领取的日期||
|code|code|varchar|64||优惠码||
|member_level|member_level|int|1||可领取的会员类型：0->无限时||
