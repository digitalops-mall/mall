
##### ums_member_receive_address
##### 会员收货地址表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|member_id|member_id|bigint|||||
|name|name|varchar|100||收货人名称||
|phone_number|phone_number|varchar|64||||
|default_status|default_status|int|1||是否为默认||
|post_code|post_code|varchar|100||邮政编码||
|province|province|varchar|100||省份/直辖市||
|city|city|varchar|100||城市||
|region|region|varchar|100||区||
|detail_address|detail_address|varchar|128||详细地址(街道)||
|province_code|province_code|varchar|10||省份代码||
|region_code|region_code|varchar|10||区代码||
|city_code|city_code|varchar|10||城市代码||
|ext1|ext1|varchar|100||扩展属性||
