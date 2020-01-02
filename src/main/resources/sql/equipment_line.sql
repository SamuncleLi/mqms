/*
Navicat MySQL Data Transfer

Source Server         : 172.18.138.253
Source Server Version : 50722
Source Host           : 172.18.138.253:3306
Source Database       : sgopdb

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-08-02 17:35:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for equipment_line
-- ----------------------------
DROP TABLE IF EXISTS `equipment_line`;
CREATE TABLE `equipment_line` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `department_ID` varchar(50) DEFAULT NULL,
  `Line` varchar(50) DEFAULT NULL,
  `Target_pp` float DEFAULT NULL,
  `kind` varchar(30) DEFAULT NULL,
  `display` char(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equipment_line
-- ----------------------------
INSERT INTO `equipment_line` VALUES ('1', '发动机加工科', '缸体一线', '85', '发动机机加缸体', '1');
INSERT INTO `equipment_line` VALUES ('2', '发动机加工科', '缸体二线', '85', '发动机机加缸体', '2');
INSERT INTO `equipment_line` VALUES ('3', '发动机加工科', '缸体三线', '85', '发动机机加缸体', '3');
INSERT INTO `equipment_line` VALUES ('4', '发动机加工科', '缸体四线', '85', '发动机机加缸体', '1');
INSERT INTO `equipment_line` VALUES ('5', '发动机加工科', '缸盖一线', '85', '发动机机加缸盖', '1');
INSERT INTO `equipment_line` VALUES ('6', '发动机加工科', '缸盖二线', '85', '发动机机加缸盖', '1');
INSERT INTO `equipment_line` VALUES ('7', '发动机加工科', '缸盖三线', '85', '发动机机加缸盖', '1');
INSERT INTO `equipment_line` VALUES ('8', '发动机加工科', '缸盖四线', '85', '发动机机加缸盖', '1');
INSERT INTO `equipment_line` VALUES ('9', '发动机加工科', '曲轴一线', '85', '发动机机加曲轴', '1');
INSERT INTO `equipment_line` VALUES ('10', '发动机加工科', '曲轴二线', '85', '发动机机加曲轴', '1');
INSERT INTO `equipment_line` VALUES ('11', '发动机加工科', '曲轴三线', '85', '发动机机加曲轴', '1');
INSERT INTO `equipment_line` VALUES ('12', '发动机加工科', '凸轮轴一线', '85', '发动机机加凸轮', '1');
INSERT INTO `equipment_line` VALUES ('13', '发动机加工科', '连杆一线', '85', '发动机机加连杆', '1');
INSERT INTO `equipment_line` VALUES ('14', '发动机加工科', '连杆二线', '85', '发动机机加连杆', '1');
INSERT INTO `equipment_line` VALUES ('15', '发动机装配科', '装配一线', '95', '发动机装配', '1');
INSERT INTO `equipment_line` VALUES ('16', '发动机装配科', '装配二线', '97', '发动机装配', '1');
INSERT INTO `equipment_line` VALUES ('17', '发动机装配科', '装配三线', '85', '发动机装配', '1');
INSERT INTO `equipment_line` VALUES ('18', '发动机装配科', '缸盖分装一线GS', '95', '发动机缸盖分装', '1');
INSERT INTO `equipment_line` VALUES ('19', '发动机装配科', '缸盖分装一线G', '95', '发动机缸盖分装', '1');
INSERT INTO `equipment_line` VALUES ('20', '发动机装配科', '缸盖分装二线', '95', '发动机缸盖分装', '1');
INSERT INTO `equipment_line` VALUES ('21', '发动机装配科', '缸体分装一线', '95', '发动机缸体分装', '1');
INSERT INTO `equipment_line` VALUES ('22', '发动机装配科', '缸体分装二线', '95', '发动机缸体分装', '1');
INSERT INTO `equipment_line` VALUES ('23', '发动机装配科', '点火台一线', '95', '发动机点火台', '1');
INSERT INTO `equipment_line` VALUES ('24', '发动机装配科', '点火台二线', '95', '发动机点火台', '1');
INSERT INTO `equipment_line` VALUES ('25', '变速箱机械科', 'GMC一线', '95', '变速箱装配', '1');
INSERT INTO `equipment_line` VALUES ('26', '变速箱机械科', 'MT一线', '95', '变速箱装配', '1');
INSERT INTO `equipment_line` VALUES ('27', '变速箱机械科', '离壳一线', '85', '变速箱机加壳体', '1');
INSERT INTO `equipment_line` VALUES ('28', '变速箱机械科', '变壳一线', '85', '变速箱机加壳体', '1');
INSERT INTO `equipment_line` VALUES ('29', '变速箱机械科', '上阀体一线', '85', '变速箱机加阀体', '1');
INSERT INTO `equipment_line` VALUES ('30', '变速箱机械科', '下阀体一线', '85', '变速箱机加阀体', '1');
