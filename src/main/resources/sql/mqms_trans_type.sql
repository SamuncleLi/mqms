/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-03-23 13:52:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_trans_type
-- ----------------------------
DROP TABLE IF EXISTS `mqms_trans_type`;
CREATE TABLE `mqms_trans_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `trans_type` varchar(255) DEFAULT NULL COMMENT '变速箱型号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mqms_trans_type
-- ----------------------------
INSERT INTO `mqms_trans_type` VALUES ('1', '7WDCT');
INSERT INTO `mqms_trans_type` VALUES ('2', 'T5D');
INSERT INTO `mqms_trans_type` VALUES ('3', 'GMC');
INSERT INTO `mqms_trans_type` VALUES ('4', 'DCT');
INSERT INTO `mqms_trans_type` VALUES ('5', 'AT');
