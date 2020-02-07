/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-02-07 10:42:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_sales_point
-- ----------------------------
DROP TABLE IF EXISTS `mqms_sales_point`;
CREATE TABLE `mqms_sales_point` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sales_point_code` varchar(255) DEFAULT NULL COMMENT '销售点代码',
  `sales_point_area` varchar(255) DEFAULT NULL COMMENT '销售区域',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='销售点区域解析表';

-- ----------------------------
-- Records of mqms_sales_point
-- ----------------------------
