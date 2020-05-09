/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-03-03 09:53:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_production_raw
-- ----------------------------
DROP TABLE IF EXISTS `mqms_production_raw`;
CREATE TABLE `mqms_production_raw` (
`production_id` int(11) NOT NULL AUTO_INCREMENT,'生产数据ID',
  `factory_code` varchar(255) DEFAULT NULL COMMENT '工厂',
  `production_batch` varchar(255) DEFAULT NULL COMMENT '生产批次',
  `vin` varchar(255) DEFAULT NULL COMMENT 'vin码',
  `mtoc` varchar(255) DEFAULT NULL COMMENT 'mtoc',
  `station_code` varchar(255) DEFAULT NULL COMMENT '站点',
  `pass_time` varchar(255) DEFAULT NULL COMMENT '通过时间',
  `car_model_code` varchar(255) DEFAULT NULL COMMENT '生产车型',
  `car_model_name` varchar(255) DEFAULT NULL COMMENT '生产车型名称',
  `production_worktime` varchar(255) DEFAULT NULL COMMENT '工作日',
  `egtype_code` varchar(255) DEFAULT NULL COMMENT '发动机号',
  `transmission_code` varchar(255) DEFAULT NULL COMMENT '变速箱号',
  `car_level` varchar(255) DEFAULT NULL COMMENT '车辆等级',
  `period` varchar(255) DEFAULT NULL COMMENT '阶段',
  `car_type` varchar(255) DEFAULT NULL COMMENT '车辆类型',
  `export_country` varchar(255) DEFAULT NULL COMMENT '出口国家',
  `applier_id` int(11) DEFAULT NULL COMMENT 'UserID',
  `applier_name` varchar(255) DEFAULT NULL COMMENT '上传人',
  `apply_time` varchar(255) DEFAULT NULL COMMENT '上传时间',
  PRIMARY KEY (`production_id`)
  UNIQUE KEY `VIN码` (`vin`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
