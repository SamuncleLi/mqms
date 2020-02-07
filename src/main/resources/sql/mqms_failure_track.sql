/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-02-07 10:42:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_failure_track
-- ----------------------------
DROP TABLE IF EXISTS `mqms_failure_track`;
CREATE TABLE `mqms_failure_track` (
  `failure_track_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `voucher_code` varchar(255) DEFAULT NULL COMMENT '单据编号',
  PRIMARY KEY (`failure_track_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
