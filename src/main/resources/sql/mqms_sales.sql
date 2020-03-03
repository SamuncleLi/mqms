/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-03-03 09:53:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_sales
-- ----------------------------
DROP TABLE IF EXISTS `mqms_sales`;
CREATE TABLE `mqms_sales` (
  `sales_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '销售数据id',
  `vin_code` varchar(255) DEFAULT NULL COMMENT 'vin码',
  `sales_car_type` varchar(255) DEFAULT NULL COMMENT '销售系统车型',
  `sales_state` varchar(255) DEFAULT NULL COMMENT '销售系统状态',
  `dealer_code` varchar(255) DEFAULT NULL COMMENT '经销商编号',
  `dealer_name` varchar(255) DEFAULT NULL COMMENT '经销商名称',
  `produce_date` varchar(255) DEFAULT NULL COMMENT '生产日期',
  `first_pin_date` varchar(255) DEFAULT NULL COMMENT '一次实销日期',
  `second_pin_date` varchar(255) DEFAULT NULL COMMENT '二次实销日期',
  `mtoc` varchar(255) DEFAULT NULL COMMENT 'MTOC',
  `car_type` varchar(255) DEFAULT NULL COMMENT '车型',
  `transmission_code` varchar(255) DEFAULT NULL COMMENT '变速箱号',
  `factory_code` varchar(255) DEFAULT NULL COMMENT '工厂简码',
  `factory_area` varchar(255) DEFAULT NULL COMMENT '工厂地区',
  `eng_short_code` varchar(255) DEFAULT NULL COMMENT '发动机短码',
  `eng_type` varchar(255) DEFAULT NULL COMMENT '发动机类型',
  `eng_series` varchar(255) DEFAULT NULL COMMENT '发动机系列',
  `sales_area` varchar(255) DEFAULT NULL COMMENT '销售区域',
  `sales_year` varchar(255) DEFAULT NULL COMMENT '销售年',
  `sales_month` varchar(255) DEFAULT NULL COMMENT '销售月',
  `tran_short_code` varchar(255) DEFAULT NULL COMMENT '变速箱短码',
  `tran_type` varchar(255) DEFAULT NULL COMMENT '变速箱类型',
  `tran_series` varchar(255) DEFAULT NULL COMMENT '变速箱系列',
  `car_short_code` varchar(255) DEFAULT NULL COMMENT '车辆短码',
  `car_model` varchar(255) DEFAULT NULL COMMENT '车型',
  `car_model_code` varchar(255) DEFAULT NULL COMMENT '内部车型代号',
  `applier_id` int(11) DEFAULT NULL,
  `applier_name` varchar(255) DEFAULT NULL,
  `apply_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sales_id`)
) ENGINE=InnoDB AUTO_INCREMENT=153 DEFAULT CHARSET=utf8;
