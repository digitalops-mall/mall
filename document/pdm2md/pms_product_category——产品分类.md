
##### pms_product_category
##### 产品分类
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|parent_id|parent_id|bigint|||上机分类的编号：0表示一级分类||
|name|name|varchar|64||||
|level|level|int|1||分类级别：0->1级；1->2级||
|product_count|product_count|int|||||
|product_unit|product_unit|varchar|64||||
|nav_status|nav_status|int|1||是否显示在导航栏：0->不显示；1->显示||
|show_status|show_status|int|1||显示状态：0->不显示；1->显示||
|sort|sort|int|||||
|icon|icon|varchar|255||图标||
|keywords|keywords|varchar|255||||
|description|description|text|||描述||
