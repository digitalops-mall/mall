
##### ums_permission
##### 后台用户权限表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|pid|pid|bigint|||父级权限id||
|name|name|varchar|100||名称||
|value|value|varchar|200||权限值||
|icon|icon|varchar|500||图标||
|type|type|int|1||权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）||
|uri|uri|varchar|200||前端资源路径||
|status|status|int|1||启用状态；0->禁用；1->启用||
|create_time|create_time|datetime|||创建时间||
|sort|sort|int|||排序||
