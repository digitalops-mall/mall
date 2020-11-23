
##### pms_sku_stock
##### sku的库存
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|product_id|product_id|bigint|||||
|sku_code|sku_code|varchar|64||sku编码||
|price|price|decimal|10||||
|stock|stock|int||0|库存||
|low_stock|low_stock|int|||预警库存||
|sp1|sp1|varchar|64||销售属性1||
|sp2|sp2|varchar|64||||
|sp3|sp3|varchar|64||||
|pic|pic|varchar|255||展示图片||
|sale|sale|int|||销量||
|promotion_price|promotion_price|decimal|10||单品促销价格||
|lock_stock|lock_stock|int||0|锁定库存||
