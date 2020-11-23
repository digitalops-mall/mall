
##### ums_member_login_log
##### 会员登录记录
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|member_id|member_id|bigint|||||
|create_time|create_time|datetime|||||
|ip|ip|varchar|64||||
|city|city|varchar|64||||
|login_type|login_type|int|1||登录类型：0->PC；1->android;2->ios;3->小程序||
|province|province|varchar|64||||
