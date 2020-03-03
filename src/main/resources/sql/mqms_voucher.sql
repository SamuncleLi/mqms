/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-03-03 09:53:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_voucher
-- ----------------------------
DROP TABLE IF EXISTS `mqms_voucher`;
CREATE TABLE `mqms_voucher` (
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
  `eng_arrange` varchar(255) DEFAULT NULL COMMENT 'eng整理（故障分类）',
  `car_model` varchar(255) DEFAULT NULL COMMENT '车型',
  `eng_type` varchar(255) DEFAULT NULL COMMENT '发动机机型',
  `receive_time` varchar(255) DEFAULT NULL COMMENT '接收区间',
  `claim_compensation` varchar(255) DEFAULT NULL COMMENT '是否算入索赔率统计',
  `production_raw_description` varchar(255) DEFAULT NULL COMMENT '备注1',
  `PDI` varchar(255) DEFAULT NULL COMMENT 'PDI',
  `offline_failure_time` int(11) DEFAULT NULL COMMENT '下线至确认经过月',
  `eng_or_tran` varchar(255) DEFAULT NULL COMMENT '发动机或变速箱',
  `car_series_code` varchar(255) DEFAULT NULL COMMENT '系列号',
  `short_code` varchar(255) DEFAULT NULL COMMENT '短码',
  `fault_code_classification` varchar(255) DEFAULT NULL COMMENT '故障码分类',
  `failure_year` varchar(255) DEFAULT NULL COMMENT '故障年',
  `failure_month` varchar(255) DEFAULT NULL COMMENT '故障月',
  `transmission_short_code` varchar(255) DEFAULT '' COMMENT '变速箱短码',
  `mileage_distribution` varchar(255) DEFAULT NULL COMMENT '里程分布',
  `return_request` varchar(255) DEFAULT NULL COMMENT '是否要求返回',
  `return_date` varchar(255) DEFAULT NULL COMMENT '返回日期',
  `arrive_date` varchar(255) DEFAULT NULL COMMENT '到厂日期',
  `loading_verification` varchar(255) DEFAULT NULL COMMENT '是否装车验证',
  `fault_reconstructioner` varchar(255) DEFAULT NULL COMMENT '故障再现人',
  `loading_date` varchar(255) DEFAULT NULL COMMENT '装车日期',
  `fault_reconstruction` varchar(255) DEFAULT NULL COMMENT '故障是否再现',
  `fault_reconstruction_date` varchar(255) DEFAULT NULL COMMENT '故障再现日期',
  `transfer_date1` varchar(255) DEFAULT NULL COMMENT '移交日期1',
  `responsible1` varchar(255) DEFAULT NULL COMMENT '担当1',
  `transfer_date2` varchar(255) DEFAULT NULL COMMENT '移交日期2',
  `responsible2` varchar(255) DEFAULT NULL COMMENT '担当2',
  `estimate_meeting_date` varchar(255) DEFAULT NULL COMMENT '预计上会时间',
  `submit_report` varchar(255) DEFAULT NULL COMMENT '是否提交报告',
  `reason` varchar(255) DEFAULT NULL COMMENT '原因',
  `countermeasure` varchar(255) DEFAULT NULL COMMENT '对策',
  `report_submit` varchar(255) DEFAULT NULL COMMENT '报告提交日期',
  `claim_indemnity` varchar(255) DEFAULT NULL COMMENT '是否索赔',
  `question_type` varchar(255) DEFAULT NULL COMMENT '问题类型',
  `question_state` varchar(255) DEFAULT NULL COMMENT '状态',
  `responsible_department` varchar(255) DEFAULT NULL COMMENT '责任科室',
  `applier_id` int(11) DEFAULT NULL,
  `applier_name` varchar(255) DEFAULT NULL,
  `apply_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`voucher_id`),
  UNIQUE KEY `voucher_code` (`voucher_code`) USING BTREE
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='vei系统导出表的拓展信息表';
