/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-02-07 10:41:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_eng_type
-- ----------------------------
DROP TABLE IF EXISTS `mqms_eng_type`;
CREATE TABLE `mqms_eng_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eng_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mqms_eng_type
-- ----------------------------
INSERT INTO `mqms_eng_type` VALUES ('1', '131');
INSERT INTO `mqms_eng_type` VALUES ('3', '151');
INSERT INTO `mqms_eng_type` VALUES ('5', '161');
INSERT INTO `mqms_eng_type` VALUES ('6', '162');
INSERT INTO `mqms_eng_type` VALUES ('7', '181');
INSERT INTO `mqms_eng_type` VALUES ('8', '182');
INSERT INTO `mqms_eng_type` VALUES ('10', '201');
INSERT INTO `mqms_eng_type` VALUES ('11', '203');
INSERT INTO `mqms_eng_type` VALUES ('13', '204');
INSERT INTO `mqms_eng_type` VALUES ('15', 'AG');
INSERT INTO `mqms_eng_type` VALUES ('17', '154');
INSERT INTO `mqms_eng_type` VALUES ('19', '183');
INSERT INTO `mqms_eng_type` VALUES ('22', '纯电动');
INSERT INTO `mqms_eng_type` VALUES ('23', '185');
INSERT INTO `mqms_eng_type` VALUES ('24', '152');
INSERT INTO `mqms_eng_type` VALUES ('30', '153');
INSERT INTO `mqms_eng_type` VALUES ('34', '205');
INSERT INTO `mqms_eng_type` VALUES ('36', '156');
