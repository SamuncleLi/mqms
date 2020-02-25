/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-02-25 20:35:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_tran_production_decode
-- ----------------------------
DROP TABLE IF EXISTS `mqms_tran_production_decode`;
CREATE TABLE `mqms_tran_production_decode` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tran_pro_model` varchar(255) DEFAULT NULL COMMENT '变速箱型号代码',
  `tran_shortCode` varchar(255) DEFAULT NULL COMMENT '变速箱型号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COMMENT='变速箱型号号解码表';

-- ----------------------------
-- Records of mqms_tran_production_decode
-- ----------------------------
INSERT INTO `mqms_tran_production_decode` VALUES ('1', 'DAP89', 'DCT');
INSERT INTO `mqms_tran_production_decode` VALUES ('2', 'CF475', 'DCT');
INSERT INTO `mqms_tran_production_decode` VALUES ('3', 'HAL98', 'DCT');
INSERT INTO `mqms_tran_production_decode` VALUES ('4', 'JA971', 'DCT');
INSERT INTO `mqms_tran_production_decode` VALUES ('5', 'JA203', 'DCT');
INSERT INTO `mqms_tran_production_decode` VALUES ('6', 'JAJ62', '6AT');
INSERT INTO `mqms_tran_production_decode` VALUES ('7', 'FA187', '4AT');
INSERT INTO `mqms_tran_production_decode` VALUES ('8', 'KA006', '6AT');
INSERT INTO `mqms_tran_production_decode` VALUES ('9', 'FAZ01', 'KMT');
INSERT INTO `mqms_tran_production_decode` VALUES ('10', 'FAJ79', 'AMT');
INSERT INTO `mqms_tran_production_decode` VALUES ('11', 'DAZ01', 'AMT');
INSERT INTO `mqms_tran_production_decode` VALUES ('12', 'DAC89', 'AMT');
INSERT INTO `mqms_tran_production_decode` VALUES ('13', 'HAM29', 'AMT');
INSERT INTO `mqms_tran_production_decode` VALUES ('14', 'JAF86', 'AMT');
INSERT INTO `mqms_tran_production_decode` VALUES ('15', 'JA001', 'AMT');
INSERT INTO `mqms_tran_production_decode` VALUES ('16', 'ANF46', 'T5D');
INSERT INTO `mqms_tran_production_decode` VALUES ('17', 'EGE46', 'T5D');
INSERT INTO `mqms_tran_production_decode` VALUES ('18', 'EGF45', 'T3C');
INSERT INTO `mqms_tran_production_decode` VALUES ('19', 'EGG38', 'T3C');
INSERT INTO `mqms_tran_production_decode` VALUES ('20', 'EGH49', 'T3C');
INSERT INTO `mqms_tran_production_decode` VALUES ('21', 'EGL03', 'T3C');
INSERT INTO `mqms_tran_production_decode` VALUES ('22', 'EGB76', 'GMC');
INSERT INTO `mqms_tran_production_decode` VALUES ('23', 'EGN78', '7WDCT');
