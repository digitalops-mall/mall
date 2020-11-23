
##### cms_subject
##### 专题表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|category_id|category_id|bigint|||||
|title|title|varchar|100||||
|pic|pic|varchar|500||专题主图||
|product_count|product_count|int|||关联产品数量||
|recommend_status|recommend_status|int|1||||
|create_time|create_time|datetime|||||
|collect_count|collect_count|int|||||
|read_count|read_count|int|||||
|comment_count|comment_count|int|||||
|album_pics|album_pics|varchar|1000||画册图片用逗号分割||
|description|description|varchar|1000||||
|show_status|show_status|int|1||显示状态：0->不显示；1->显示||
|content|content|text|||||
|forward_count|forward_count|int|||转发数||
|category_name|category_name|varchar|200||专题分类名称||
