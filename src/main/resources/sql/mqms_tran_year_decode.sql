/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-02-25 20:35:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_tran_year_decode
-- ----------------------------
DROP TABLE IF EXISTS `mqms_tran_year_decode`;
CREATE TABLE `mqms_tran_year_decode` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tran_pro_year_code` varchar(255) DEFAULT NULL COMMENT '变速箱年份代码',
  `tran_pro_year` varchar(255) DEFAULT NULL COMMENT '变速箱生产年份',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='变速箱年份解码表';

-- ----------------------------
-- Records of mqms_tran_year_decode
-- ----------------------------
INSERT INTO `mqms_tran_year_decode` VALUES ('1', 'A', '2009');
INSERT INTO `mqms_tran_year_decode` VALUES ('2', 'B', '2010');
INSERT INTO `mqms_tran_year_decode` VALUES ('3', 'C', '2011');
INSERT INTO `mqms_tran_year_decode` VALUES ('4', 'D', '2012');
INSERT INTO `mqms_tran_year_decode` VALUES ('5', 'E', '2013');
INSERT INTO `mqms_tran_year_decode` VALUES ('6', 'F', '2014');
INSERT INTO `mqms_tran_year_decode` VALUES ('7', 'G', '2015');
INSERT INTO `mqms_tran_year_decode` VALUES ('8', 'H', '2016');
INSERT INTO `mqms_tran_year_decode` VALUES ('9', 'I', '2017');
INSERT INTO `mqms_tran_year_decode` VALUES ('10', 'J', '2018');
INSERT INTO `mqms_tran_year_decode` VALUES ('11', 'K', '2019');
INSERT INTO `mqms_tran_year_decode` VALUES ('12', 'L', '2020');
INSERT INTO `mqms_tran_year_decode` VALUES ('13', 'M', '2021');
INSERT INTO `mqms_tran_year_decode` VALUES ('14', 'N', '2022');
INSERT INTO `mqms_tran_year_decode` VALUES ('15', 'O', '2023');
INSERT INTO `mqms_tran_year_decode` VALUES ('16', 'P', '2024');
INSERT INTO `mqms_tran_year_decode` VALUES ('17', 'Q', '2025');
INSERT INTO `mqms_tran_year_decode` VALUES ('18', 'R', '2026');
INSERT INTO `mqms_tran_year_decode` VALUES ('19', 'S', '2027');
INSERT INTO `mqms_tran_year_decode` VALUES ('20', 'T', '2028');
INSERT INTO `mqms_tran_year_decode` VALUES ('21', 'U', '2029');
INSERT INTO `mqms_tran_year_decode` VALUES ('22', 'V', '2030');
INSERT INTO `mqms_tran_year_decode` VALUES ('23', 'W', '2031');
INSERT INTO `mqms_tran_year_decode` VALUES ('24', 'X', '2032');
INSERT INTO `mqms_tran_year_decode` VALUES ('25', 'Y', '2033');
INSERT INTO `mqms_tran_year_decode` VALUES ('26', 'Z', '2034');
