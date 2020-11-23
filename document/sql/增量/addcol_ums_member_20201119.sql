/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/11/19 1:23:13                           */
/*==============================================================*/


alter table mall.ums_member
    add province varchar(64) comment '所属省份';

alter table mall.ums_member
    add country varchar(64) comment '所属国家';

alter table mall.ums_member
    add open_id varchar(64) comment '微信openid';

alter table mall.ums_member
    add union_id varchar(64) comment '微信unionid';