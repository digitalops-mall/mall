
##### sms_home_advertise
##### 首页轮播广告表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|name|name|varchar|100||||
|type|type|int|1||轮播位置：0->PC首页轮播；1->app首页轮播||
|pic|pic|varchar|500||||
|start_time|start_time|datetime|||||
|end_time|end_time|datetime|||||
|status|status|int|1||上下线状态：0->下线；1->上线||
|click_count|click_count|int|||点击数||
|order_count|order_count|int|||下单数||
|url|url|varchar|500||链接地址||
|note|note|varchar|500||备注||
|sort|sort|int||0|排序||
