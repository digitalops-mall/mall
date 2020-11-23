
##### ums_member
##### 会员表
|字段名|字段码|字段类型|长度|默认值|字段描述|是否主键|
|----|----|----|----|----|----|----|
|id|id|bigint||||Y|
|member_level_id|member_level_id|bigint|||||
|username|username|varchar|64||用户名||
|password|password|varchar|64||密码||
|nickname|nickname|varchar|64||昵称||
|phone|phone|varchar|64||手机号码||
|status|status|int|1||帐号启用状态:0->禁用；1->启用||
|create_time|create_time|datetime|||注册时间||
|icon|icon|varchar|500||头像||
|gender|gender|int|1||性别：0->未知；1->男；2->女||
|birthday|birthday|date|||生日||
|city|city|varchar|64||所做城市||
|job|job|varchar|100||职业||
|personalized_signature|personalized_signature|varchar|200||个性签名||
|source_type|source_type|int|1||用户来源||
|integration|integration|int|||积分||
|growth|growth|int|||成长值||
|luckey_count|luckey_count|int|||剩余抽奖次数||
|history_integration|history_integration|int|||历史积分数量||
