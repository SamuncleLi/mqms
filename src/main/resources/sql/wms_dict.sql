/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : wms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2019-07-25 17:28:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for wms_dict
-- ----------------------------
DROP TABLE IF EXISTS `wms_dict`;
CREATE TABLE `wms_dict` (
  `dict_id` int(11) NOT NULL AUTO_INCREMENT,
  `dict_type_1` varchar(255) DEFAULT NULL COMMENT '字典类型1（对应combobox的最高层级）',
  `dict_type_2` varchar(255) DEFAULT NULL COMMENT '字典类型2（对应combobox的次高层级）',
  `dict_value` varchar(255) DEFAULT NULL COMMENT ' 字典项的值（对应combobox的value）',
  `dict_text` varchar(255) DEFAULT NULL COMMENT '字典项的含义（对应combobox中的text）',
  `dict_desc_1` varchar(255) DEFAULT NULL COMMENT '字典项的最高层级的描述',
  `dict_desc_2` varchar(255) DEFAULT NULL COMMENT '字典项的次高层级的描述',
  `dict_state` varchar(10) DEFAULT NULL COMMENT '字典项的状态（是否废止）',
  `dict_icon` varchar(255) DEFAULT NULL COMMENT '字典项的图标',
  `dict_can_modify` varchar(10) DEFAULT NULL COMMENT '字典项是否允许修改',
  `dict_default` varchar(10) DEFAULT NULL COMMENT '字典项是否是默认值',
  PRIMARY KEY (`dict_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wms_dict
-- ----------------------------
INSERT INTO `wms_dict` VALUES ('1', 'dictType1', null, 'canModify', '是否允许修改', null, null, null, null, null, null);
INSERT INTO `wms_dict` VALUES ('2', 'dictType1', null, 'default', '是否设为默认值', null, null, null, null, null, null);
INSERT INTO `wms_dict` VALUES ('3', 'canModify', null, 'Yes', '是', null, null, null, null, null, null);
INSERT INTO `wms_dict` VALUES ('4', 'managementType', null, 'spare_parts', '备件', '管理类型', null, null, null, 'no', null);
INSERT INTO `wms_dict` VALUES ('5', 'managementType', '', 'knife', '刀具', '管理类型', null, null, null, 'no', null);
INSERT INTO `wms_dict` VALUES ('6', 'managementType', '', 'goods', '普通资材', '管理类型', null, null, null, null, null);
INSERT INTO `wms_dict` VALUES ('7', 'sparePartsOrderReason', null, '定期更换', '定期更换', '订购性质', null, null, null, null, null);
INSERT INTO `wms_dict` VALUES ('8', 'sparePartsOrderReason', null, '老化消耗', '老化消耗', '订购性质', null, null, null, null, null);
INSERT INTO `wms_dict` VALUES ('9', 'sparePartsOrderReason', null, '补充库存', '补充库存', '订购性质', null, null, null, null, null);
INSERT INTO `wms_dict` VALUES ('10', 'sparePartsOrderReason', null, '异常损坏', '异常损坏', '订购性质', null, null, null, null, null);
INSERT INTO `wms_dict` VALUES ('11', 'sparePartsOrderReason', null, '改造改善', '改造改善', '订购性质', null, null, null, null, null);
INSERT INTO `wms_dict` VALUES ('12', 'sparePartsEmergency', null, '特急备件', '特急备件', '紧急性', null, null, null, null, null);
INSERT INTO `wms_dict` VALUES ('13', 'sparePartsEmergency', null, '加急备件', '加急备件', '紧急性', null, null, null, null, null);
INSERT INTO `wms_dict` VALUES ('14', 'sparePartsEmergency', null, '一般备件', '一般备件', '紧急性', null, null, null, null, null);
