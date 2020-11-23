
##### pms_comment_replay
##### 产品评价回复表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|comment_id|comment_id|bigint|||||
|member_nick_name|member_nick_name|varchar|255||||
|member_icon|member_icon|varchar|255||||
|content|content|varchar|1000||||
|create_time|create_time|datetime|||||
|type|type|int|1||评论人员类型；0->会员；1->管理员||
