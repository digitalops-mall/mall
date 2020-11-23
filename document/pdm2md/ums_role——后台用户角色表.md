
##### ums_role
##### 后台用户角色表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|name|name|varchar|100||名称||
|description|description|varchar|500||描述||
|admin_count|admin_count|int|||后台用户数量||
|create_time|create_time|datetime|||创建时间||
|status|status|int|1|1|启用状态：0->禁用；1->启用||
|sort|sort|int||0|||
