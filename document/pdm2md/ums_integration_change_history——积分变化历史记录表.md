
##### ums_integration_change_history
##### 积分变化历史记录表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|member_id|member_id|bigint|||||
|create_time|create_time|datetime|||||
|change_type|change_type|int|1||改变类型：0->增加；1->减少||
|change_count|change_count|int|||积分改变数量||
|operate_man|operate_man|varchar|100||操作人员||
|operate_note|operate_note|varchar|200||操作备注||
|source_type|source_type|int|1||积分来源：0->购物；1->管理员修改||
