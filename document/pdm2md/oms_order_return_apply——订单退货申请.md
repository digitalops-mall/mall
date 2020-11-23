
##### oms_order_return_apply
##### 订单退货申请
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|order_id|order_id|bigint|||订单id||
|company_address_id|company_address_id|bigint|||收货地址表id||
|product_id|product_id|bigint|||退货商品id||
|order_sn|order_sn|varchar|64||订单编号||
|create_time|create_time|datetime|||申请时间||
|member_username|member_username|varchar|64||会员用户名||
|return_amount|return_amount|decimal|10||退款金额||
|return_name|return_name|varchar|100||退货人姓名||
|return_phone|return_phone|varchar|100||退货人电话||
|status|status|int|1||申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝||
|handle_time|handle_time|datetime|||处理时间||
|product_pic|product_pic|varchar|500||商品图片||
|product_name|product_name|varchar|200||商品名称||
|product_brand|product_brand|varchar|200||商品品牌||
|product_attr|product_attr|varchar|500||商品销售属性：颜色：红色；尺码：xl;||
|product_count|product_count|int|||退货数量||
|product_price|product_price|decimal|10||商品单价||
|product_real_price|product_real_price|decimal|10||商品实际支付单价||
|reason|reason|varchar|200||原因||
|description|description|varchar|500||描述||
|proof_pics|proof_pics|varchar|1000||凭证图片，以逗号隔开||
|handle_note|handle_note|varchar|500||处理备注||
|handle_man|handle_man|varchar|100||处理人员||
|receive_man|receive_man|varchar|100||收货人||
|receive_time|receive_time|datetime|||收货时间||
|receive_note|receive_note|varchar|500||收货备注||
