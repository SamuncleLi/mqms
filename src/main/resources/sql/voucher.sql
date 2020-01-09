/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-01-06 17:15:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for voucher
-- ----------------------------
DROP TABLE IF EXISTS `voucher`;
CREATE TABLE `mqms_voucher` (
  `voucher_id` int(11) NOT NULL AUTO_INCREMENT,
  `voucher_code` varchar(255) DEFAULT NULL COMMENT '单据编号',
  `dealer_code` varchar(255) DEFAULT NULL COMMENT '经销商代码',
  `dealer_name` varchar(255) DEFAULT NULL COMMENT '经销商名称',
  `vei_state` varchar(255) DEFAULT NULL COMMENT 'vei系统状态',
  `update_time` varchar(255) DEFAULT NULL COMMENT '更新时间',
  `maintenance_contract_code` varchar(255) DEFAULT NULL COMMENT '维修合同编码',
  `maintenance_item_code` varchar(255) DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL COMMENT '联系人',
  `phone_no` varchar(255) DEFAULT NULL COMMENT '电话号码',
  `fax` varchar(255) DEFAULT NULL COMMENT '传真',
  `theme` varchar(255) DEFAULT NULL COMMENT '主题',
  `vin_code` varchar(255) NOT NULL COMMENT 'vin码',
  `vehicle_type` varchar(255) DEFAULT NULL COMMENT '车辆类型',
  `egtype_code` varchar(255) DEFAULT NULL COMMENT '发动机号',
  `transmission_type` varchar(255) DEFAULT NULL COMMENT '变速箱类型',
  `mileage` int(11) DEFAULT NULL COMMENT '里程',
  `transmission_code` varchar(255) DEFAULT NULL COMMENT '变速箱号',
  `mtoc` varchar(255) DEFAULT NULL,
  `failure_date` varchar(255) DEFAULT NULL COMMENT '故障日期',
  `failure_location_code` varchar(255) DEFAULT NULL COMMENT '故障部位编号',
  `failure_location_name` varchar(255) DEFAULT NULL COMMENT '故障部位名称',
  `symptom_type_code` varchar(255) DEFAULT NULL COMMENT '症状分类编号',
  `symptom_type_name` varchar(255) DEFAULT NULL COMMENT '症状分类名称',
  `symptom_code` varchar(255) DEFAULT NULL COMMENT '症状编号',
  `symptom_name` varchar(255) DEFAULT NULL COMMENT '症状名称',
  `symptom_content` varchar(255) DEFAULT NULL COMMENT '症状内容',
  `submit_date` varchar(255) DEFAULT NULL COMMENT '提交时间',
  `important_level` varchar(255) DEFAULT NULL COMMENT '重要级别',
  `car_type` varchar(255) DEFAULT NULL COMMENT '车种',
  `diagnostic_result` varchar(255) DEFAULT NULL COMMENT '诊断结果',
  `vei_user_description` varchar(255) DEFAULT NULL COMMENT 'vei系统备注',
  `parts_code` varchar(255) DEFAULT NULL COMMENT '零部件编号',
  `parts_name` varchar(255) DEFAULT NULL,
  `man_cost` decimal(65,0) DEFAULT NULL COMMENT '工时费',
  `material_cost` decimal(65,0) DEFAULT NULL COMMENT '材料费',
  `other_cost` decimal(65,0) DEFAULT NULL COMMENT '其他费用',
  `total_cost` decimal(65,0) DEFAULT NULL COMMENT '总费用',
  `confirmor` varchar(255) DEFAULT NULL COMMENT '确认者',
  `confirm_date` varchar(255) DEFAULT NULL,
  `vei_sys_description` varchar(255) DEFAULT NULL COMMENT 'vei系统备注',
  `license_code` varchar(255) DEFAULT NULL COMMENT '车牌号',
  `service_performance_1` varchar(255) DEFAULT NULL COMMENT '维修作业1',
  `service_performance_2` varchar(255) DEFAULT NULL COMMENT '维修作业2',
  `service_performance_3` varchar(255) DEFAULT NULL COMMENT '维修作业3',
  `model_year` varchar(255) DEFAULT NULL COMMENT '年款',
  `offline_date` varchar(255) DEFAULT NULL COMMENT '下线日期',
  `sales_date` varchar(255) DEFAULT NULL COMMENT '销售日期',
  `eng_arrange` varchar(255) DEFAULT NULL,
  `sales_failure_time` varchar(255) DEFAULT NULL,
  `car_model` varchar(255) DEFAULT NULL,
  `eng_code` varchar(255) DEFAULT NULL,
  `transmission_code_re` varchar(255) DEFAULT NULL,
  `transmission_manufacturer` varchar(255) DEFAULT NULL,
  `receive_time` varchar(255) DEFAULT NULL,
  `claim_compensation` varchar(255) DEFAULT NULL,
  `production_raw_description` varchar(255) DEFAULT NULL,
  `PDI` varchar(255) DEFAULT NULL,
  `offline_failure_time` varchar(255) DEFAULT NULL,
  `transmission_comfirm_time` varchar(255) DEFAULT NULL,
  `eng_settle` varchar(255) DEFAULT NULL,
  `short_code` varchar(255) DEFAULT NULL,
  `fault_code_classification` varchar(255) DEFAULT NULL,
  `transmission_production_data` varchar(255) DEFAULT NULL,
  `failure_year` varchar(255) DEFAULT NULL,
  `failure_month` varchar(255) DEFAULT NULL,
  `transmission_short_code` varchar(255) DEFAULT NULL,
  `mileage_distribution` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`voucher_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;


