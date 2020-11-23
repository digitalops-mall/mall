
##### oms_company_address
##### 公司收发货地址表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|address_name|address_name|varchar|200||地址名称||
|send_status|send_status|int|1||默认发货地址：0->否；1->是||
|receive_status|receive_status|int|1||是否默认收货地址：0->否；1->是||
|name|name|varchar|64||收发货人姓名||
|phone|phone|varchar|64||收货人电话||
|province|province|varchar|64||省/直辖市||
|city|city|varchar|64||市||
|region|region|varchar|64||区||
|detail_address|detail_address|varchar|200||详细地址||
