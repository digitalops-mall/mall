
##### sms_flash_promotion_session
##### 限时购场次表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint|||编号|Y|
|name|name|varchar|200||场次名称||
|start_time|start_time|time|||每日开始时间||
|end_time|end_time|time|||每日结束时间||
|status|status|int|1||启用状态：0->不启用；1->启用||
|create_time|create_time|datetime|||创建时间||
