/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-03-03 09:52:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_production
-- ----------------------------
DROP TABLE IF EXISTS `mqms_production`;
CREATE TABLE `mqms_production` (
  `production_id` int(11) NOT NULL AUTO_INCREMENT,
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
  `short_code` varchar(255) DEFAULT NULL COMMENT '短码',
  `eng_type` varchar(255) DEFAULT NULL COMMENT '发动机机型',
  `serial_code` varchar(255) DEFAULT NULL COMMENT '系列',
  `districtName` varchar(255) DEFAULT NULL COMMENT '区域',
  `production_year` varchar(255) DEFAULT NULL COMMENT '生产年',
  `production_month` varchar(255) DEFAULT NULL COMMENT '生产月',
  `transmission_short_code` varchar(255) DEFAULT NULL COMMENT '变速箱短码',
  `transmission_simple_code` varchar(255) DEFAULT NULL COMMENT '变速箱简码',
  `transmission_type` varchar(255) DEFAULT NULL COMMENT '变速箱类型',
  `car_short_code` varchar(255) DEFAULT NULL COMMENT '车型简码',
  `car_model` varchar(255) DEFAULT NULL COMMENT '车型',
  `car_simple_code` varchar(255) DEFAULT NULL COMMENT '内部车型代号',
  `applier_id` int(11) DEFAULT NULL COMMENT 'UserID',
  `applier_name` varchar(255) DEFAULT NULL COMMENT '上传人',
  `apply_time` varchar(255) DEFAULT NULL COMMENT '上传时间',
  PRIMARY KEY (`production_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
