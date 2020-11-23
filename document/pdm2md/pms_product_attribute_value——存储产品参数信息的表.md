
##### pms_product_attribute_value
##### 存储产品参数信息的表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|product_id|product_id|bigint|||||
|product_attribute_id|product_attribute_id|bigint|||||
|value|value|varchar|64||手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开||
