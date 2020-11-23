
##### ums_menu
##### 后台菜单表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|parent_id|parent_id|bigint|||父级ID||
|create_time|create_time|datetime|||创建时间||
|title|title|varchar|100||菜单名称||
|level|level|int|4||菜单级数||
|sort|sort|int|4||菜单排序||
|name|name|varchar|100||前端名称||
|icon|icon|varchar|200||前端图标||
|hidden|hidden|int|1||前端隐藏||
