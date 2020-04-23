/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-04-21 13:33:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_eng_and_trans
-- ----------------------------
DROP TABLE IF EXISTS `mqms_eng_and_trans`;
CREATE TABLE `mqms_eng_and_trans` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eng_or_trans` varchar(255) DEFAULT NULL COMMENT '发动机或变速箱',
  `type_detail` varchar(255) DEFAULT NULL COMMENT '详细类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='发动机及变速箱信息表';

-- ----------------------------
-- Records of mqms_eng_and_trans
-- ----------------------------
INSERT INTO `mqms_eng_and_trans` VALUES ('1', '发动机', '151');
INSERT INTO `mqms_eng_and_trans` VALUES ('2', '发动机', '131');
INSERT INTO `mqms_eng_and_trans` VALUES ('3', '变速箱N', 'T3C');
INSERT INTO `mqms_eng_and_trans` VALUES ('4', '变速箱N', 'T5D');
INSERT INTO `mqms_eng_and_trans` VALUES ('5', '变速箱W', '7WDCT');
