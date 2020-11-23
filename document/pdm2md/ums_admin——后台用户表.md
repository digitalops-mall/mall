
##### ums_admin
##### 后台用户表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|username|username|varchar|64||用户名||
|password|password|varchar|64||密码||
|icon|icon|varchar|500||头像||
|email|email|varchar|100||邮箱||
|nick_name|nick_name|varchar|200||昵称||
|note|note|varchar|500||备注信息||
|create_time|create_time|datetime|||创建时间||
|login_time|login_time|datetime|||最后登录时间||
|status|status|int|1|1|帐号启用状态：0->禁用；1->启用||
