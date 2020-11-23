
##### ums_member_level
##### 会员等级表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|name|name|varchar|100||||
|growth_point|growth_point|int|||||
|default_status|default_status|int|1||是否为默认等级：0->不是；1->是||
|free_freight_point|free_freight_point|decimal|10||免运费标准||
|comment_growth_point|comment_growth_point|int|||每次评价获取的成长值||
|priviledge_free_freight|priviledge_free_freight|int|1||是否有免邮特权||
|priviledge_sign_in|priviledge_sign_in|int|1||是否有签到特权||
|priviledge_comment|priviledge_comment|int|1||是否有评论获奖励特权||
|priviledge_promotion|priviledge_promotion|int|1||是否有专享活动特权||
|priviledge_member_price|priviledge_member_price|int|1||是否有会员价格特权||
|priviledge_birthday|priviledge_birthday|int|1||是否有生日特权||
|note|note|varchar|200||||
