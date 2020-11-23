/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/4/3 22:06:03                            */
/*==============================================================*/


alter table mall.ums_member_receive_address
   add province_code varchar(10) comment '省份代码';

alter table mall.ums_member_receive_address
   add region_code varchar(10) comment '区代码';

alter table mall.ums_member_receive_address
   add city_code varchar(10) comment '城市代码';

alter table mall.ums_member_receive_address
   add ext1 varchar(100) comment '扩展属性';

