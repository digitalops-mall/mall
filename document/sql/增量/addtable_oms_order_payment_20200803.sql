
DROP TABLE IF EXISTS `oms_order_payment`;
CREATE TABLE `oms_order_payment` (
    `id`                   bigint not null auto_increment,
    `order_id`             bigint comment '订单id',
    `order_sn`             varchar(64) comment '订单编号',
    `payment_id`           bigint comment '支付单id',
    `payment_sn`           varchar(64) comment '支付单编号',
    `payment_money`        decimal(10,2) comment '支付金额',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='订单支付信息';

ALTER TABLE `mall`.`oms_order_payment`
CHANGE COLUMN `payment_id` `payment_id` VARCHAR(64) NULL DEFAULT NULL,
ADD COLUMN `mch_id` VARCHAR(64) NULL AFTER `pay_succ_time`;