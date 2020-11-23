
##### ums_member_statistics_info
##### 会员统计信息
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|member_id|member_id|bigint|||||
|consume_amount|consume_amount|decimal|10||累计消费金额||
|order_count|order_count|int|||订单数量||
|coupon_count|coupon_count|int|||优惠券数量||
|comment_count|comment_count|int|||评价数||
|return_order_count|return_order_count|int|||退货数量||
|login_count|login_count|int|||登录次数||
|attend_count|attend_count|int|||关注数量||
|fans_count|fans_count|int|||粉丝数量||
|collect_product_count|collect_product_count|int|||||
|collect_subject_count|collect_subject_count|int|||||
|collect_topic_count|collect_topic_count|int|||||
|collect_comment_count|collect_comment_count|int|||||
|invite_friend_count|invite_friend_count|int|||||
|recent_order_time|recent_order_time|datetime|||最后一次下订单时间||
