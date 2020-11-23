
##### pms_product_ladder
##### 产品阶梯价格表(只针对同商品)
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|product_id|product_id|bigint|||||
|count|count|int|||满足的商品数量||
|discount|discount|decimal|10||折扣||
|price|price|decimal|10||折后价格||
