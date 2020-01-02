/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : wms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2019-07-25 17:29:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for wms_warehousing
-- ----------------------------
DROP TABLE IF EXISTS `wms_warehousing`;
CREATE TABLE `wms_warehousing` (
  `warehousing_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '调整订单Id',
  `warehousing_code` varchar(255) DEFAULT '' COMMENT '调整订单Id',
  `warehousing_line_code` varchar(255) DEFAULT '' COMMENT '调整订单号行号',
  `warehousing_reason_code` varchar(255) DEFAULT '' COMMENT '调整原因',
  `warehousing_reason_description` varchar(255) DEFAULT NULL COMMENT '调整原因描述',
  `warehousing_affairs_date` varchar(255) DEFAULT '' COMMENT '事务处理日期',
  `material_code` varchar(255) DEFAULT '' COMMENT '物料编号',
  `material_name` varchar(255) DEFAULT '' COMMENT '物料名称',
  `material_unit` varchar(255) DEFAULT '' COMMENT '单位',
  `warehousing_batch` varchar(255) DEFAULT '' COMMENT '批次',
  `warehousing_serie` varchar(255) DEFAULT '' COMMENT '序列号',
  `warehouse_code` varchar(255) DEFAULT '' COMMENT '序列号',
  `warehousing_affairs_symbol` varchar(255) DEFAULT '' COMMENT '事务处理标识',
  `warehousing_num` int(11) DEFAULT NULL COMMENT '数量',
  `warehousing_head_text` varchar(255) DEFAULT '' COMMENT '头文本',
  `warehousing_line_text` varchar(255) DEFAULT '' COMMENT '行文本',
  `warehousing_initial_user_id` int(11) DEFAULT NULL COMMENT '申请人',
  `warehousing_initial_time` varchar(255) DEFAULT '' COMMENT '申请时间',
  `warehousing_initial_state` varchar(255) DEFAULT '' COMMENT '申请状态',
  PRIMARY KEY (`warehousing_id`),
  UNIQUE KEY `调整订单号-行号` (`warehousing_code`,`warehousing_line_code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wms_warehousing
-- ----------------------------
