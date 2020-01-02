/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : wms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2019-07-25 17:29:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for wms_spare_parts_order
-- ----------------------------
DROP TABLE IF EXISTS `wms_spare_parts_order`;
CREATE TABLE `wms_spare_parts_order` (
  `spare_parts_order_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '备件订单id',
  `order_id` int(11) DEFAULT NULL COMMENT '订单id',
  `order_code` varchar(255) DEFAULT NULL COMMENT '订单编号',
  `material_code` varchar(255) DEFAULT NULL COMMENT '物料号',
  `material_name` varchar(255) DEFAULT NULL COMMENT '物料名称',
  `material_specs` varchar(255) DEFAULT NULL COMMENT '物料规格',
  `order_material_num` int(11) DEFAULT NULL COMMENT '订购数',
  `production_line` varchar(255) DEFAULT NULL COMMENT '生产线',
  `operation_position_code` varchar(255) DEFAULT NULL COMMENT '工序号',
  `equipment_company` varchar(255) DEFAULT NULL COMMENT '设备厂家',
  `spare_parts_brand` varchar(255) DEFAULT NULL COMMENT '品牌',
  `spare_parts_order_desc` varchar(255) DEFAULT NULL COMMENT '订购说明',
  `spare_parts_emergency` varchar(255) DEFAULT NULL COMMENT '紧急性',
  `spare_parts_order_reason` varchar(255) DEFAULT NULL COMMENT '订购性质',
  PRIMARY KEY (`spare_parts_order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wms_spare_parts_order
-- ----------------------------
