/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-02-26 17:15:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_voucher
-- ----------------------------
DROP TABLE IF EXISTS `mqms_voucher`;
CREATE TABLE `mqms_voucher` (
  `voucher_id` int(11) NOT NULL AUTO_INCREMENT,
  `quality_feedback_code` varchar(255) NOT NULL COMMENT '质量反馈单号',
  `voucher_code` varchar(255) DEFAULT NULL COMMENT '索赔单号',
  `dealer_code` varchar(255) DEFAULT NULL COMMENT '经销商代码',
  `dealer_name` varchar(255) DEFAULT NULL COMMENT '经销商名称',
  `dealer_short_name` varchar(255) DEFAULT NULL COMMENT '经销商简称',
  `theme` varchar(255) DEFAULT NULL COMMENT '主题',
  `vin_code` varchar(255) DEFAULT NULL COMMENT 'vin码',
  `vehicle_type` varchar(255) DEFAULT NULL COMMENT '车辆类型',
  `parts_name` varchar(255) DEFAULT NULL COMMENT '零部件名称',
  `first_level_name` varchar(255) DEFAULT NULL COMMENT '一级名称',
  `parts_short_name_spec_pneno` varchar(255) DEFAULT NULL COMMENT '零件简称-具体现象',
  `manufacture_date` varchar(255) DEFAULT NULL COMMENT '生产日期',
  `sales_failure_time` varchar(255) DEFAULT NULL COMMENT '销售至故障经过月',
  `symptom_name` varchar(255) DEFAULT NULL COMMENT '故障描述',
  `symptom_content` varchar(255) DEFAULT NULL COMMENT '诊断过程',
  `man_cost` decimal(65,0) DEFAULT NULL COMMENT '工时费',
  `parts_cost` decimal(65,0) DEFAULT NULL COMMENT '配件金额',
  `parts_manager_cost` decimal(65,0) DEFAULT NULL COMMENT '配件管理费',
  `outgoing_cost` decimal(65,0) DEFAULT NULL COMMENT '外出费用',
  `maintain_cost` decimal(65,0) DEFAULT NULL,
  `other_cost` decimal(65,0) DEFAULT NULL COMMENT '其他费用',
  `total_cost` decimal(65,0) DEFAULT NULL COMMENT '总费用',
  `important_level` varchar(255) DEFAULT NULL COMMENT '重要级别',
  `transmission_type` varchar(255) DEFAULT NULL COMMENT '变速箱类型',
  `new_parts_blinding_num` varchar(255) DEFAULT NULL COMMENT '新件绑定编号',
  `submit_date` varchar(255) DEFAULT NULL COMMENT '提交时间',
  `eng_code` varchar(255) DEFAULT NULL COMMENT '发动机号',
  `eng_manufacture_date` varchar(255) DEFAULT NULL COMMENT '发动机生产日期',
  `transmission_code_re` varchar(255) DEFAULT NULL COMMENT '变速箱号',
  `transmission_manufacturer` varchar(255) DEFAULT NULL COMMENT '变速箱生产日期',
  `eng_arrange` varchar(255) DEFAULT NULL COMMENT 'ENG整理',
  `car_model` varchar(255) DEFAULT NULL COMMENT '车型',
  `receive_time` varchar(255) DEFAULT NULL COMMENT '接收区间',
  `claim_compensation` varchar(255) DEFAULT NULL COMMENT '是否计入索赔',
  `short_code` varchar(255) DEFAULT NULL COMMENT '车型短吗',
  `fault_code_classification` varchar(255) DEFAULT NULL COMMENT '故障码分类',
  PRIMARY KEY (`voucher_id`),
  UNIQUE KEY `quality_feedback_code` (`quality_feedback_code`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mqms_voucher
-- ----------------------------
INSERT INTO `mqms_voucher` VALUES ('1', 'QR2020021700079', 'CLDGDE0202020021700003', 'DGDE020', '佛山市顺德合威汽车销售服务有限公司', '佛山合威', '碳罐电磁阀（排放系统失效）', 'LMWDT1G87K1032031', 'DT2A-0A7', '碳罐控制阀', '电器', '碳罐控制阀-失效', '2019-04-26 00:00:00', '7.0', '碳罐电磁阀（排放系统失效）', '碳罐电磁阀（排放系统失效）', '16', '70', '11', '0', '0', '0', '97', 'C', '', '', '2020-02-17 15:50:14', null, null, null, null, null, null, '2020-02-19~2020-02-27', null, null, null);
INSERT INTO `mqms_voucher` VALUES ('2', 'QR2020021700050', 'CLDHND0102020021700007', 'DHND010', '衡阳市铭仕汽车销售服务有限公司', '衡阳铭仕', '20 AT1 碳罐控制阀 失效', 'LMGAT1G55K1051097', 'AT2A-0A5', '碳罐控制阀', '电器', '碳罐控制阀-失效', '2019-12-04 00:00:00', '1.0', '亮排放系统故障灯', '经试车确认是碳罐控制阀存在故障需更换。', '8', '70', '11', '0', '0', '0', '89', 'C', '', '', '2020-02-17 13:09:14', null, null, null, null, null, null, '2020-02-19~2020-02-27', null, null, null);
INSERT INTO `mqms_voucher` VALUES ('3', 'QR2020021600053', 'CLDGDK0102020021700044', 'DGDK010', '茂名万丰汽车有限公司', '茂名万丰', '19 DT1 碳罐控制阀 泄气', 'LMWDT1G83J1011739', 'DT2A-0A7', '碳罐控制阀', '变速器', '碳罐控制阀-泄气', '2019-01-02 00:00:00', '12.0', '客户到店反映车辆仪表故障灯亮', '经检查，发现车辆的仪表故障灯亮。进一步检查，发现车辆车辆的碳罐控制阀出现泄气现象。', '16', '70', '11', '0', '0', '0', '97', 'C', '', '', '2020-02-17 16:51:08', null, null, null, null, null, null, '2020-02-19~2020-02-27', null, null, null);
INSERT INTO `mqms_voucher` VALUES ('4', 'QR2020021400134', 'CLDYUE0302020021400008', 'DYUE030', '安阳市昊正汽车贸易有限公司', '安阳昊正', '19 DT1 涡轮增压器 作动不良', 'LMWDT1G53K1021405', 'DT2A-0A5', '涡轮增压器', '动力传动', '涡轮增压器-涡轮增压器作动不良', '2019-02-25 00:00:00', '4.0', '车辆踩油门时发动机异响', '每次踩油门时发动机都会产生明显异响，听诊后确定为涡轮增压器产生的异响', '256', '4497', '675', '0', '0', '0', '5428', 'B', '', '', '2020-02-14 16:49:29', null, null, null, null, null, null, '2020-02-12~2020-02-20', null, null, null);
