-- 创建数据库
CREATE DATABASE seckill;

-- 使用数据库
use seckill;
-- 创建秒杀库存表
CREATE TABLE sekill(
	`seckill_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
	`name`  VARCHAR(120) NOT NULL  COMMENT '商品名称',
	`number` INT NOT NULL COMMENT '库存数量',
	`start_time` TIMESTAMP NOT NULL COMMENT '秒杀开始时间',
	`end_time` TIMESTAMP NOT NULL COMMENT '秒杀技术时间',
	`create_time` TIMESTAMP NOT NULL COMMENT '创建时间',
	PRIMARY KEY (seckill_id),
	KEY idx_start_time(start_time),
	KEY idx_end_time(end_time),
	key idx_create_time(create_time)

) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';

-- 初始化一些数据
insert INTO seckill(name,number,start_time,end_time)
VALUES
	('100元秒杀小米5',500,'2016-05-18 00:00:00','2015-05-19 00:00:00'),
	('200元秒杀Smartisan',400,'2016-05-18 00:00:00','2015-05-19 00:00:00'),
	('300元秒杀魅族Pro6',300,'2016-05-18 00:00:00','2015-05-19 00:00:00'),
	('400元秒杀iPhone6s',100,'2016-05-18 00:00:00','2015-05-19 00:00:00');

-- 秒杀成功明细表
-- 用户登录认证相关的信息

create table success_killed(
	`seckill_id` bigint not null comment '秒杀商品id',
	`user_phone` bigint not null comment '用户手机号',
	`state` TINYINT not null DEFAULT -1 COMMENT '状态标示：-1：无效 0：成功，1：已付款，2：已发货',
	`create_time` TIMESTAMP NOT NULL COMMENT '创建时间',
  PRIMARY KEY(seckill_id,user_phone),/*联合主键*/
  KEY idx_create_time(create_time)
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表';





















