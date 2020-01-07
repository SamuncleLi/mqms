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
CREATE TABLE `production` (
  `production_id` int(11) NOT NULL AUTO_INCREMENT,
  `factory_code` varchar(255) DEFAULT NULL,
  `production_batch` varchar(255) DEFAULT NULL,
  `vin` varchar(255) DEFAULT NULL,
  `mtoc` varchar(255) DEFAULT NULL,
  `station_code` varchar(255) DEFAULT NULL,
  `pass_time` varchar(255) DEFAULT NULL,
  `car_model_code` varchar(255) DEFAULT NULL COMMENT '生产车型',
  `car_model_name` varchar(255) DEFAULT NULL,
  `production_worktime` varchar(255) DEFAULT NULL,
  `egtype_code` varchar(255) DEFAULT NULL COMMENT '发动机号',
  `transmission_code` varchar(255) DEFAULT NULL,
  `car_level` varchar(255) DEFAULT NULL COMMENT '车辆等级',
  `period` varchar(255) DEFAULT NULL COMMENT '阶段',
  `car_type` varchar(255) DEFAULT NULL,
  `export_country` varchar(255) DEFAULT NULL,
  `short_code` varchar(255) DEFAULT NULL,
  `eng_code` varchar(255) DEFAULT NULL,
  `serial_code` varchar(255) DEFAULT NULL,
  `districtName` varchar(255) DEFAULT NULL,
  `sales_year` varchar(255) DEFAULT NULL,
  `sales_month` varchar(255) DEFAULT NULL,
  `transmission_short_code` varchar(255) DEFAULT NULL,
  `transmission_simple_code` varchar(255) DEFAULT NULL,
  `transmission_type` varchar(255) DEFAULT NULL,
  `car_short_code` varchar(255) DEFAULT NULL,
  `car_type_code` varchar(255) DEFAULT NULL,
  `car_simple_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`production_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;




