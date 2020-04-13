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
  `transmission_code` varchar(255) DEFAULT NULL COMMENT '变速箱号',
  `eng_arrange` varchar(255) DEFAULT NULL COMMENT 'eng整理（故障分类）',
  `car_model` varchar(255) DEFAULT NULL COMMENT '车型',
  `eng_type` varchar(255) DEFAULT NULL COMMENT '发动机机型',
  `end_series` varchar(255) DEFAULT NULL COMMENT '发动机系列',
  `transmission_type_re` varchar(255) DEFAULT NULL COMMENT '变速箱机型',
  `tran_type_detail` varchar(255) DEFAULT NULL COMMENT '变速箱机型（详细）',
  `transmission_manufacturer` varchar(255) DEFAULT NULL COMMENT '变速箱生产厂家',
  `receive_time` varchar(255) DEFAULT NULL COMMENT '接收区间',
  `claim_compensation` varchar(255) DEFAULT NULL COMMENT '是否算入索赔率统计',
  `production_raw_description` varchar(255) DEFAULT NULL COMMENT '备注1',
  `PDI` varchar(255) DEFAULT NULL COMMENT 'PDI',
  `offline_failure_time` int(11) DEFAULT NULL COMMENT '下线至确认经过月',
  `transmission_comfirm_time` varchar(255) DEFAULT NULL COMMENT '变速箱生产至确认经过月',
  `eng_or_tran` varchar(255) DEFAULT NULL COMMENT '发动机或变速箱',
  `short_code` varchar(255) DEFAULT NULL COMMENT '短码',
  `fault_code_classification` varchar(255) DEFAULT NULL COMMENT '故障码分类',
  `transmission_production_data` varchar(255) DEFAULT NULL COMMENT '变速箱生产日期',
  `failure_year` varchar(255) DEFAULT NULL COMMENT '故障年',
  `failure_month` varchar(255) DEFAULT NULL COMMENT '故障月',
  `transmission_short_code` varchar(255) DEFAULT '' COMMENT '变速箱短码',
  `mileage_distribution` varchar(255) DEFAULT NULL COMMENT '里程分布',
  `claim_type` varchar(225) DEFAULT NULL COMMENT '索赔类型',
  `claim_compete` varchar(255) DEFAULT NULL COMMENT '是否完成索赔',
  `express_delivery` varchar(255) DEFAULT NULL COMMENT '是否快递',
  `track_beginer` varchar(255) DEFAULT NULL COMMENT '开启不良追踪者',
  `track_begin_time` varchar(255) DEFAULT NULL COMMENT '不良追踪开启时间',
  `delivery_person` varchar(255) DEFAULT NULL COMMENT '快递负责人',
  `delivery_deadline` varchar(255) DEFAULT NULL COMMENT '快递确认时间',
  `delivery_received_date` varchar(255) DEFAULT NULL COMMENT '快递到达时间',
  `failure_track_id` int(11) DEFAULT NULL COMMENT '不良追踪ID',
  `applier_id` int(11) DEFAULT NULL COMMENT 'UserID',
  `applier_name` varchar(255) DEFAULT NULL COMMENT '上传人',
  `apply_time` varchar(255) DEFAULT NULL COMMENT '上传时间',
  PRIMARY KEY (`voucher_id`),
  UNIQUE KEY `voucher_code` (`voucher_code`) USING BTREE,
  KEY `engType` (`eng_type`) USING BTREE,
  KEY `transType` (`tran_type_detail`) USING BTREE
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='vei系统导出表的拓展信息表';




