
##### cms_member_report
##### 用户举报表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint|||||
|report_type|report_type|int|1||举报类型：0->商品评价；1->话题内容；2->用户评论||
|report_member_name|report_member_name|varchar|100||举报人||
|create_time|create_time|datetime|||||
|report_object|report_object|varchar|100||||
|report_status|report_status|int|1||举报状态：0->未处理；1->已处理||
|handle_status|handle_status|int|1||处理结果：0->无效；1->有效；2->恶意||
|note|note|varchar|200||||
