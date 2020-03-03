/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-03-03 09:53:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_voucher_raw
-- ----------------------------
DROP TABLE IF EXISTS `mqms_voucher_raw`;
CREATE TABLE `mqms_voucher_raw` (
 `voucher_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '系统id号',
  `voucher_code` varchar(255) NOT NULL COMMENT '单据编号',
  `claim_code` varchar(255) DEFAULT NULL COMMENT '索赔单号',
  `dealer_code` varchar(255) DEFAULT NULL COMMENT '经销商代码',
  `dealer_name` varchar(255) DEFAULT NULL COMMENT '经销商名称',
  `dealer_short_name` varchar(255) DEFAULT NULL COMMENT '经销商简称',
  `theme` varchar(255) DEFAULT NULL COMMENT '主题',
  `vin_code` varchar(255) DEFAULT NULL COMMENT 'vin',
  `vehicle_type` varchar(255) DEFAULT NULL COMMENT '车型',
  `production_code` varchar(255) DEFAULT NULL COMMENT '产品编号',
  `parts_code` varchar(255) DEFAULT NULL COMMENT '零部件编号',
  `parts_name` varchar(255) DEFAULT NULL COMMENT '零部件名称',
  `division_level_1` varchar(255) DEFAULT NULL COMMENT '一级名称',
  `division_level_2` varchar(255) DEFAULT NULL COMMENT '二级名称',
  `division_level_3` varchar(255) DEFAULT NULL COMMENT '三级名称',
  `parts_and_symptom` varchar(255) DEFAULT NULL COMMENT '零件简称-具体现象',
  `offline_date` varchar(255) DEFAULT NULL COMMENT '生产日期',
  `sales_date` varchar(255) DEFAULT NULL COMMENT '销售日期',
  `failure_date` varchar(255) DEFAULT NULL COMMENT '故障日期',
  `mileage` int(11) DEFAULT NULL COMMENT '里程',
  `confirm_date` varchar(255) DEFAULT NULL COMMENT '确认时间',
  `warehousing_date` varchar(255) DEFAULT NULL COMMENT '车辆出库时间',
  `transport_date` varchar(255) DEFAULT NULL COMMENT '车辆发运时间',
  `shop_arrival_date` varchar(255) DEFAULT NULL COMMENT '车辆到店时间',
  `sales_failure_time` int(11) DEFAULT NULL COMMENT '销售至故障经过月',
  `failure_desc` varchar(255) DEFAULT NULL COMMENT '故障描述',
  `diagnostic_result` varchar(2000) DEFAULT NULL COMMENT '诊断过程',
  `man_cost` decimal(65,2) DEFAULT NULL COMMENT '工时金额',
  `material_cost` decimal(65,2) DEFAULT NULL COMMENT '配件金额',
  `material_management_cost` decimal(65,2) DEFAULT NULL COMMENT '配件管理费用',
  `go_out_cost` decimal(65,2) DEFAULT NULL COMMENT '外出费用',
  `maintaining_cost` decimal(65,2) DEFAULT NULL COMMENT '保养费用',
  `other_cost` decimal(65,2) DEFAULT NULL COMMENT '其他费用',
  `total_cost` decimal(65,2) DEFAULT NULL COMMENT '总费用',
  `important_level` varchar(255) DEFAULT NULL COMMENT '重要度',
  `transmission_type` varchar(255) DEFAULT NULL COMMENT '变速箱类型',
  `new_parts_bond` varchar(255) DEFAULT NULL COMMENT '新件绑定号',
  `submit_date` varchar(255) DEFAULT NULL COMMENT '提交时间',
  `egtype_code` varchar(255) DEFAULT NULL COMMENT '发动机号',
  `eng_production_date` varchar(255) DEFAULT NULL COMMENT '发动机生产日期',
  `transmission_code` varchar(255) DEFAULT NULL COMMENT '变速箱号',
  `transmission_production_date` varchar(255) DEFAULT NULL COMMENT '变速箱生产日期',
  `applier_id` int(11) DEFAULT NULL,
  `applier_name` varchar(255) DEFAULT NULL,
  `apply_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`voucher_id`),
  UNIQUE KEY `voucher_code` (`voucher_code`) USING BTREE
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;
