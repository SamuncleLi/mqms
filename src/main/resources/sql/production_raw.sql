/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-01-06 17:15:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for production_raw
-- ----------------------------
DROP TABLE IF EXISTS `production_raw`;
CREATE TABLE `production_raw` (
  `production_id` int(11) DEFAULT NULL,
  `production_code` varchar(255) DEFAULT NULL,
  `factory_code` varchar(255) DEFAULT NULL,
  `production_batch` varchar(255) DEFAULT NULL,
  `vin` varchar(255) DEFAULT NULL,
  `mtoc` varchar(255) DEFAULT NULL,
  `station_code` varchar(255) DEFAULT NULL,
  `pass_time` varchar(255) DEFAULT NULL,
  `car_model_code` varchar(255) DEFAULT NULL COMMENT '生产车型',
  `car_model_name` varchar(255) DEFAULT NULL,
  `skylight` varchar(255) DEFAULT NULL COMMENT '天窗',
  `outside_color` varchar(255) DEFAULT NULL COMMENT '外色',
  `production_date` varchar(255) DEFAULT NULL COMMENT '工作日',
  `production_worktime` varchar(255) DEFAULT NULL,
  `egtype_code` varchar(255) DEFAULT NULL COMMENT '发动机号',
  `transmission_code` varchar(255) DEFAULT NULL COMMENT '变速箱号',
  `car_level` varchar(255) DEFAULT NULL COMMENT '车辆等级',
  `period` varchar(255) DEFAULT NULL COMMENT '阶段',
  `tran_short_code` varchar(255) DEFAULT NULL,
  `key_code` varchar(255) DEFAULT NULL,
  `car_type` varchar(255) DEFAULT NULL,
  `locked` varchar(255) DEFAULT NULL,
  `production_lock` varchar(255) DEFAULT NULL,
  `sales_lock` varchar(255) DEFAULT NULL,
  `production_description` varchar(255) DEFAULT NULL,
  `export_batch` varchar(255) DEFAULT NULL,
  `export_country` varchar(255) DEFAULT NULL,
  `extra_period` varchar(255) DEFAULT NULL,
  `extra_time` varchar(255) DEFAULT NULL,
  `extra_key_code` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
