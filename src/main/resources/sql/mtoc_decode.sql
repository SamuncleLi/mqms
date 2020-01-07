/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-01-06 17:14:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mtoc_decode
-- ----------------------------
DROP TABLE IF EXISTS `mtoc_decode`;
CREATE TABLE `mtoc_decode` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mtoc_type` varchar(255) DEFAULT NULL COMMENT '解码类型',
  `mtoc_source` varchar(255) DEFAULT NULL COMMENT 'mtoc原码',
  `mtoc_result` varchar(255) DEFAULT NULL COMMENT 'mtoc解码结果',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='mtoc解码表';
