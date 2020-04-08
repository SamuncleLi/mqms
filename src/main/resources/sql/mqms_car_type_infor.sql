/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-04-08 15:54:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_car_type_infor
-- ----------------------------
DROP TABLE IF EXISTS `mqms_car_type_infor`;
CREATE TABLE `mqms_car_type_infor` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `car_type` varchar(255) DEFAULT NULL COMMENT '车型',
  `manufacture_date` varchar(255) DEFAULT NULL COMMENT '生产起始',
  `specific_type` varchar(255) DEFAULT NULL COMMENT '车型改进信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mqms_car_type_infor
-- ----------------------------
INSERT INTO `mqms_car_type_infor` VALUES ('1', 'GS4', '2017-01', ' 预警机远程控制');
INSERT INTO `mqms_car_type_infor` VALUES ('2', 'GS4', '2018-01', ' 相控阵雷达加装');
INSERT INTO `mqms_car_type_infor` VALUES ('3', 'GS4', '2018-06', ' 全面饱和打击系统');
INSERT INTO `mqms_car_type_infor` VALUES ('4', 'GS4', '2019-01', ' 核动力冷却系统改进');
INSERT INTO `mqms_car_type_infor` VALUES ('5', 'GS4', '2020-03', ' 自动反导升级');
INSERT INTO `mqms_car_type_infor` VALUES ('6', 'GS5', '2018-05', ' 防核辐射加强版');
