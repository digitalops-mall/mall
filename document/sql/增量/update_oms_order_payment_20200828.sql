
alter table mall.oms_order_payment
   add channel_id varchar(64) comment '渠道ID';

alter table mall.oms_order_payment
   add currency varchar(64) comment '货币类型';

alter table mall.oms_order_payment
   add status varchar(64) comment '支付状态';

alter table mall.oms_order_payment
   add client_ip varchar(64) comment '客户端IP';

alter table mall.oms_order_payment
   add device varchar(64) comment '设备';

alter table mall.oms_order_payment
   add channel_order_no varchar(64) comment '渠道订单号';

alter table mall.oms_order_payment
   add param1 varchar(64);

alter table mall.oms_order_payment
   add param2 varchar(64);

alter table mall.oms_order_payment
   add pay_succ_time datetime comment '支付成功时间';