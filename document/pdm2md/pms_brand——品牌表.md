
##### pms_brand
##### 品牌表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|name|name|varchar|64||||
|first_letter|first_letter|varchar|8||首字母||
|sort|sort|int|||||
|factory_status|factory_status|int|1||是否为品牌制造商：0->不是；1->是||
|show_status|show_status|int|1||||
|product_count|product_count|int|||产品数量||
|product_comment_count|product_comment_count|int|||产品评论数量||
|logo|logo|varchar|255||品牌logo||
|big_pic|big_pic|varchar|255||专区大图||
|brand_story|brand_story|text|||品牌故事||
