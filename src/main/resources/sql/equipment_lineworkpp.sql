/*
Navicat MySQL Data Transfer

Source Server         : 172.18.138.253
Source Server Version : 50722
Source Host           : 172.18.138.253:3306
Source Database       : sgopdb

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-08-02 17:35:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for equipment_lineworkpp
-- ----------------------------
DROP TABLE IF EXISTS `equipment_lineworkpp`;
CREATE TABLE `equipment_lineworkpp` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Line` varchar(50) DEFAULT NULL,
  `Target_pp` float DEFAULT NULL,
  `kind` varchar(30) DEFAULT NULL,
  `display` char(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equipment_lineworkpp
-- ----------------------------
INSERT INTO `equipment_lineworkpp` VALUES ('1', '缸体一线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('2', '缸体二线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('3', '缸体三线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('4', '缸盖一线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('5', '缸盖二线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('6', '缸盖三线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('7', '曲轴一线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('8', '曲轴二线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('9', '凸轮轴一线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('10', '连杆一线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('11', '装配一线', '95', '装配', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('12', '装配二线', '97', '装配', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('13', '缸盖分装一线GS', '95', '装配', null);
INSERT INTO `equipment_lineworkpp` VALUES ('14', '缸盖分装一线G', '95', '装配', null);
INSERT INTO `equipment_lineworkpp` VALUES ('15', '缸体分装一线', '95', '装配', null);
INSERT INTO `equipment_lineworkpp` VALUES ('16', '缸体分装二线', '95', '装配', null);
INSERT INTO `equipment_lineworkpp` VALUES ('17', '点火台一线', '95', '装配', null);
INSERT INTO `equipment_lineworkpp` VALUES ('18', '点火台二线', '95', '装配', null);
INSERT INTO `equipment_lineworkpp` VALUES ('19', '缸盖分装二线', '95', '装配', null);
INSERT INTO `equipment_lineworkpp` VALUES ('20', 'GMC一线', '95', '装配', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('21', 'MT一线', '95', '装配', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('22', '离壳一线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('23', '变壳一线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('24', '上阀板一线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('25', '下阀板一线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('26', '曲轴三线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('27', '连杆二线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('28', '缸体四线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('29', '缸盖四线', '85', '机加', '1');
INSERT INTO `equipment_lineworkpp` VALUES ('30', null, null, null, '1');
