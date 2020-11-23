
##### pms_product_attribute
##### 商品属性参数表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|product_attribute_category_id|product_attribute_category_id|bigint|||||
|name|name|varchar|64||||
|select_type|select_type|int|1||属性选择类型：0->唯一；1->单选；2->多选；对应属性和参数意义不同；||
|input_type|input_type|int|1||属性录入方式：0->手工录入；1->从列表中选取||
|input_list|input_list|varchar|255||可选值列表，以逗号隔开||
|sort|sort|int|||排序字段：最高的可以单独上传图片||
|filter_type|filter_type|int|1||分类筛选样式：1->普通；1->颜色||
|search_type|search_type|int|1||检索类型；0->不需要进行检索；1->关键字检索；2->范围检索||
|related_status|related_status|int|1||相同属性产品是否关联；0->不关联；1->关联||
|hand_add_status|hand_add_status|int|1||是否支持手动新增；0->不支持；1->支持||
|type|type|int|1||属性的类型；0->规格；1->参数||
