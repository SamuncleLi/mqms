/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-04-01 15:04:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_market_bulletin
-- ----------------------------
DROP TABLE IF EXISTS `mqms_market_bulletin`;
CREATE TABLE `mqms_market_bulletin` (
  `market_bulletin_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '通报id',
  `failure_date` varchar(255) DEFAULT NULL COMMENT '故障时间',
  `vin_code` varchar(255) DEFAULT NULL COMMENT 'VIN码',
  `short_code` varchar(255) DEFAULT NULL COMMENT '短码',
  `trans_category` varchar(255) DEFAULT NULL COMMENT '变速箱类别',
  `eng_code` varchar(255) DEFAULT NULL COMMENT '发动机号',
  `car_model` varchar(255) DEFAULT NULL COMMENT '车型',
  `eng_type` varchar(255) DEFAULT NULL COMMENT '发动机类型',
  `trans_type` varchar(255) DEFAULT NULL COMMENT '变速箱类型',
  `manufacture_date` varchar(255) DEFAULT NULL COMMENT '生产日期',
  `infor_source` varchar(255) DEFAULT NULL COMMENT '信息来源',
  `sales_date` varchar(255) DEFAULT NULL COMMENT '销售日期',
  `parts_name` varchar(255) DEFAULT NULL COMMENT '零件名称',
  `theme` varchar(255) DEFAULT NULL COMMENT '主题',
  `countermeasure_state` varchar(255) DEFAULT NULL COMMENT '对策状态',
  `dealer_name` varchar(255) DEFAULT NULL COMMENT '店名',
  `mileage` int(11) DEFAULT NULL COMMENT '里程',
  `failure_desc` varchar(255) DEFAULT NULL COMMENT '问诊内容',
  `diagnostic_result` varchar(2000) DEFAULT NULL COMMENT '诊断结果',
  `maintenance_record` varchar(2000) DEFAULT NULL COMMENT '维修保养履历',
  `analytical_progress` varchar(2000) DEFAULT NULL COMMENT '解析及进展',
  `controversy_with_ST` varchar(255) DEFAULT NULL COMMENT '是否与ST存在争议',
  `settle_scheme` varchar(2000) DEFAULT NULL COMMENT '处理方案',
  `claim_form` varchar(255) DEFAULT NULL COMMENT '索赔形式',
  `processing_scheme_ST` varchar(255) DEFAULT NULL COMMENT 'ST处理方案',
  `return_progress` varchar(255) DEFAULT NULL COMMENT '返回进度',
  `return_mode` varchar(255) DEFAULT NULL COMMENT '返回方式',
  `delivery_received_date` varchar(255) DEFAULT NULL COMMENT '快递到达时间',
  `applier_id` int(255) DEFAULT NULL COMMENT 'UserID',
  `applier_name` varchar(255) DEFAULT NULL COMMENT '上传人',
  `apply_time` varchar(255) DEFAULT NULL COMMENT '上传时间',
  PRIMARY KEY (`market_bulletin_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;



-- ----------------------------
-- Records of mqms_market_bulletin
-- ----------------------------
