/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-02-25 20:34:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_tran_manufactures_decode
-- ----------------------------
DROP TABLE IF EXISTS `mqms_tran_manufactures_decode`;
CREATE TABLE `mqms_tran_manufactures_decode` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tran_manufacture_model` varchar(255) DEFAULT NULL COMMENT '变速箱厂家代码',
  `tran_manufacture` varchar(255) DEFAULT NULL COMMENT '变速箱厂家',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='变速箱厂家解码表';

-- ----------------------------
-- Records of mqms_tran_manufactures_decode
-- ----------------------------
INSERT INTO `mqms_tran_manufactures_decode` VALUES ('1', 'WJ101', '日本爱信');
INSERT INTO `mqms_tran_manufactures_decode` VALUES ('2', 'VD163', '杭维柯');
INSERT INTO `mqms_tran_manufactures_decode` VALUES ('3', 'VZ210', '格特拉特');
INSERT INTO `mqms_tran_manufactures_decode` VALUES ('4', 'VB105', '唐山爱信');
INSERT INTO `mqms_tran_manufactures_decode` VALUES ('5', '00000', '自制');
