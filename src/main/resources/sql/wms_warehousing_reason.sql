/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : wms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2019-07-25 17:29:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for wms_warehousing_reason
-- ----------------------------
DROP TABLE IF EXISTS `wms_warehousing_reason`;
CREATE TABLE `wms_warehousing_reason` (
  `warehousing_reason_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `warehousing_reason_code` varchar(255) DEFAULT '' COMMENT '调整原因',
  `warehousing_reason_description` varchar(255) DEFAULT '' COMMENT '调整原因描述',
  PRIMARY KEY (`warehousing_reason_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wms_warehousing_reason
-- ----------------------------
