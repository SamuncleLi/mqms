/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-03-02 09:04:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_vin_decode
-- ----------------------------
DROP TABLE IF EXISTS `mqms_vin_decode`;
CREATE TABLE `mqms_vin_decode` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vin_short_code` varchar(255) DEFAULT NULL COMMENT '短码',
  `vin_sim_code` varchar(255) DEFAULT NULL COMMENT '简码',
  `vin_eng_type` varchar(255) DEFAULT NULL COMMENT '机型',
  `vin_series` varchar(255) DEFAULT NULL COMMENT '系列号',
  `vin_eng_short_code` varchar(255) DEFAULT NULL COMMENT '机型简码',
  `vin_transm_short_code` varchar(255) DEFAULT NULL,
  `vin_car_short_code` varchar(255) DEFAULT NULL COMMENT '车型简码',
  `vin_car_type` varchar(255) DEFAULT NULL COMMENT '车型',
  `vin_transm_type` varchar(255) DEFAULT NULL COMMENT '变速箱类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8 COMMENT='vin解码表';

-- ----------------------------
-- Records of mqms_vin_decode
-- ----------------------------
INSERT INTO `mqms_vin_decode` VALUES ('1', 'LMGAA', 'AA', '1.3T', 'GS', '131', 'P7', 'A28', 'GS4', '\"AMT (不含AA1A-AM2)');
INSERT INTO `mqms_vin_decode` VALUES ('2', 'T5D (仅AA1A-AM2)\"', 'BK', '2.0L', null, 'G', null, '203', '', '');
INSERT INTO `mqms_vin_decode` VALUES ('3', 'LMGFA', 'FA', '1.3T', 'GS', '131', 'P7', 'A73', 'GA3S', 'AMT');
INSERT INTO `mqms_vin_decode` VALUES ('4', 'LMGAC', 'AC', '1.5T', 'GS', '151', 'P7', 'A28', 'GA6', 'AMT');
INSERT INTO `mqms_vin_decode` VALUES ('5', 'LMGBC', 'BC', '1.5T', 'GS', '151', 'P7', 'A68', 'GS4', 'AMT');
INSERT INTO `mqms_vin_decode` VALUES ('6', 'LMGFE', 'FE', '1.6L', 'G', '161', '', '', '', 'KMT');
INSERT INTO `mqms_vin_decode` VALUES ('7', 'LMGBD', 'BD', '1.6T', 'G', '162', '', '', '', '');
INSERT INTO `mqms_vin_decode` VALUES ('8', 'LMGBF', 'BF', '1.8L', 'G', '181', '', '', '', '');
INSERT INTO `mqms_vin_decode` VALUES ('9', 'LMGBG', 'BG', '1.8TG', 'G', '182', '', '', '', 'DCT');
INSERT INTO `mqms_vin_decode` VALUES ('10', 'LMGDG', 'DG', '1.8TG', 'G', '182', '', '', '', '5AT');
INSERT INTO `mqms_vin_decode` VALUES ('11', 'LMGBH', 'BH', 'AC', 'G', '201', '', '', '', '');
INSERT INTO `mqms_vin_decode` VALUES ('12', 'LMGBK', 'BK', '2.0L', 'G', '203', '', '', '', '');
INSERT INTO `mqms_vin_decode` VALUES ('13', 'LMGDK', 'DK', '2.0L', 'G', '203', '', '', '', 'AMT');
INSERT INTO `mqms_vin_decode` VALUES ('14', 'LMGJS', 'JS', '2.0T', 'G升级', '204', 'P08', 'A30', '', '6AT');
INSERT INTO `mqms_vin_decode` VALUES ('15', 'LMGLS', 'LS', '2.0T', 'G升级', '204', 'P08', '', '6AT', '');
INSERT INTO `mqms_vin_decode` VALUES ('16', 'LMGGN', 'GN', '1.0L', 'AG', 'AG', '', '', '', '');
INSERT INTO `mqms_vin_decode` VALUES ('17', 'LMGHA', 'HA', '1.3T', 'GS', '131', 'P7', 'A5H', 'GS3', '6AT');
INSERT INTO `mqms_vin_decode` VALUES ('18', 'LMGFJ', 'FJ', '1.5ATK', 'GS', '154', 'P7', '', 'GA3S PHEV  插电式混合动力', 'GMC');
INSERT INTO `mqms_vin_decode` VALUES ('19', 'LMGAJ', 'AJ', '1.5ATK', 'GS', '154', 'P7', '', 'GS4 PHEV  插电式混合动力', 'GMC');
INSERT INTO `mqms_vin_decode` VALUES ('20', 'LMGCG', 'CG', '1.8TN', 'G升级', '183', 'P08', '', 'GA8', '6AT');
INSERT INTO `mqms_vin_decode` VALUES ('21', 'LMGLG', 'LG', '1.8TN', 'G升级', '183', 'P08', '', 'GA8', '6AT');
INSERT INTO `mqms_vin_decode` VALUES ('22', 'LMGCS', 'CS', '2.0T', 'G升级', '204', 'P08', '', 'GS8', '6AT');
INSERT INTO `mqms_vin_decode` VALUES ('23', 'LMGHP', 'HP', '纯电动', 'GE3', '纯电动', '', '', '', '');
INSERT INTO `mqms_vin_decode` VALUES ('24', 'LMGEL', 'EL', 'AE', 'G', '185', '', '', '', '');
INSERT INTO `mqms_vin_decode` VALUES ('25', 'LMGHR', 'HR', '1.5NA', 'GS', '152', 'P7', 'A5H', 'GS3', '6AT');
INSERT INTO `mqms_vin_decode` VALUES ('26', 'LMGMS', 'MS', '2.0T', 'G升级', '204', 'P08', '', 'GM8', '6AT');
INSERT INTO `mqms_vin_decode` VALUES ('27', 'LMWFA', 'FA', '1.3T', 'GS', '131', 'P7', 'A16', 'GA4', '4AT');
INSERT INTO `mqms_vin_decode` VALUES ('28', 'LMWFR', 'FR', '1.5NA', 'GS', '152', 'P7', '', 'GA4', '5AT');
INSERT INTO `mqms_vin_decode` VALUES ('29', 'LMWHR', 'HR', '1.5NA', 'GS', '152', 'P7', 'A16', 'GA4', '6AT');
INSERT INTO `mqms_vin_decode` VALUES ('30', 'LMWHA', 'HA', '1.5NA', 'GS', '152', 'P7', 'A5H', 'GS3', '6AT');
INSERT INTO `mqms_vin_decode` VALUES ('31', 'LMWDT', 'DT', '1.5T GDI', '直喷', '153', 'P7', 'A10', 'GS5 新款', '6AT');
INSERT INTO `mqms_vin_decode` VALUES ('32', 'LMWDC', 'DC', '1.5T', 'GS', '151', 'P7', 'A10', 'GS5 新款', '6AT');
INSERT INTO `mqms_vin_decode` VALUES ('33', 'LMGKT', 'KT', '1.5T GDI', '直喷', '153', 'P7', 'A06', 'GM6', '6AT');
INSERT INTO `mqms_vin_decode` VALUES ('34', 'LMGAT', 'AT', '1.5T GDI', '直喷', '153', 'P7', 'A32-6', 'GS4', '');
INSERT INTO `mqms_vin_decode` VALUES ('35', 'LMGJU', 'JU', '2.0T GDI', '直喷', '205', 'P08', 'A3k-C', 'GS8', '');
INSERT INTO `mqms_vin_decode` VALUES ('36', 'LMWHP', 'HP', '纯电动', 'GE3', '纯电动', '', '', '', '');
INSERT INTO `mqms_vin_decode` VALUES ('37', 'LMWHT', 'HT', '1.5TM', '直喷', '156', '', 'A5H-6', 'GS3', '');
INSERT INTO `mqms_vin_decode` VALUES ('38', 'LMGBT', 'BT', '1.5T GDI', '直喷', '153', 'P7', 'A35', 'GA6', '6AT');
INSERT INTO `mqms_vin_decode` VALUES ('39', 'LMGCU', 'CU', '2.0T GDI', '直喷', '205', 'P08', 'A3K-C', 'GS7', '6AT');
INSERT INTO `mqms_vin_decode` VALUES ('40', 'LMGMU', 'MU', '2.0T GDI', '直喷', '205', 'P08', 'A7M-6', 'GM8', '');
INSERT INTO `mqms_vin_decode` VALUES ('41', 'LMGHT', 'HT', '1.5TM', '直喷', '156', '', '', '', '');
INSERT INTO `mqms_vin_decode` VALUES ('42', 'LMGDT', 'DT', '1.5T GDI', '直喷', '153', '', 'A39', '第二代GS4 ', '6AT/T3C');
