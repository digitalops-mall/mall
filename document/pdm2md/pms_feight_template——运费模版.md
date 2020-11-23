
##### pms_feight_template
##### 运费模版
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|name|name|varchar|64||||
|charge_type|charge_type|int|1||计费类型:0->按重量；1->按件数||
|first_weight|first_weight|decimal|10||首重kg||
|first_fee|first_fee|decimal|10||首费（元）||
|continue_weight|continue_weight|decimal|10||||
|continme_fee|continme_fee|decimal|10||||
|dest|dest|varchar|255||目的地（省、市）||
