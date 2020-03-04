/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-03-03 09:53:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_sales_raw
-- ----------------------------
DROP TABLE IF EXISTS `mqms_sales_raw`;
CREATE TABLE `mqms_sales_raw` (
  `sales_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '销售数据id',
  `vin_code` varchar(255) NOT NULL COMMENT 'vin码',
 `sales_car_type` varchar(255) DEFAULT NULL COMMENT '销售系统车型',
  `sales_car_type_detail` varchar(255) DEFAULT NULL COMMENT '车型细分',
  `sales_car_type_cn` varchar(255) DEFAULT NULL COMMENT '车型中文名',
  `dealer_code` varchar(255) DEFAULT NULL COMMENT '经销商编号',
  `dealer_name` varchar(255) DEFAULT NULL COMMENT '经销商名称',
  `produce_date` varchar(255) DEFAULT NULL COMMENT '生产日期',
  `first_pin_date` varchar(255) DEFAULT NULL COMMENT '一次实销日期',
  `second_pin_date` varchar(255) DEFAULT NULL COMMENT '二次实效日期',
     `state` varchar(255) DEFAULT NULL COMMENT '状态',
  `applier_id` int(11) DEFAULT NULL,
  `applier_name` varchar(255) DEFAULT NULL,
  `apply_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sales_id`),
  UNIQUE KEY `vin` (`vin_code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
