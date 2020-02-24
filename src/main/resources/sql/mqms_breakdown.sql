/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-02-07 10:41:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_breakdown
-- ----------------------------
DROP TABLE IF EXISTS `mqms_breakdown`;
CREATE TABLE  `mqms_breakdown` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parts_code` varchar(255) DEFAULT NULL,
  `parts_name` varchar(255) DEFAULT NULL,
  `breakdown_code` varchar(255) DEFAULT NULL,
  `breakdown_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='故障分类表';

-- ----------------------------
-- Records of mqms_breakdown
-- ----------------------------
