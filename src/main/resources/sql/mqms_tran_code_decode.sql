/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : mqms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2020-02-07 10:43:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mqms_tran_code_decode
-- ----------------------------
DROP TABLE IF EXISTS `mqms_tran_code_decode`;
CREATE TABLE `mqms_tran_code_decode` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tran_code_type` varchar(255) DEFAULT NULL COMMENT '变速箱号解码类型',
  `tran_code_source` varchar(255) DEFAULT NULL COMMENT '变速箱号原码',
  `tran_code_result` varchar(255) DEFAULT NULL COMMENT '变速箱号解码结果',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='变速箱号解码表';

-- ----------------------------
-- Records of mqms_tran_code_decode
-- ----------------------------
