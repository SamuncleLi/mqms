/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50628
Source Host           : 127.0.0.1:3306
Source Database       : wms

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2019-08-07 13:22:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for wms_order_checker
-- ----------------------------
DROP TABLE IF EXISTS `wms_order_checker`;
CREATE TABLE `wms_order_checker` (
  `order_checker_id` int(11) NOT NULL AUTO_INCREMENT,
  `financial_center_code` varchar(255) DEFAULT NULL,
  `order_checker_level_id` int(11) DEFAULT NULL,
  `order_checker_level_name` varchar(255) DEFAULT NULL,
  `order_checker_level_desc` varchar(255) DEFAULT NULL,
  `order_checker_user_id` varchar(255) DEFAULT NULL,
  `order_checker_user_name` varchar(255) DEFAULT NULL,
  `order_checker_user_no` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_checker_id`)
) ENGINE=InnoDB AUTO_INCREMENT=304 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wms_order_checker
-- ----------------------------
INSERT INTO `wms_order_checker` VALUES ('1', '4110C', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('2', '4111C', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('3', '4112S', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('4', '4113S', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('5', '4120C', '1', 'kzcbjgly', '科资材备件管理员', '170', '邹伟林', null);
INSERT INTO `wms_order_checker` VALUES ('6', '4130C', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('7', '4210S', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('8', '4211S', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('9', '4212S', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('10', '4215S', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('11', '4217S', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('12', '4220S', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('13', '4230S', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('14', '4240S', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('15', '4290S', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('16', '4330C', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('17', '4331A', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('18', '4332A', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('19', '4333A', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('20', '4335A', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('21', '4336A', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('22', '4334A', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('23', '4337A', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('24', '4338A', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('25', '4339A', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('26', '4390C', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('27', '4393A', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('28', '4395A', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('29', '4340S', '1', 'kzcbjgly', '科资材备件管理员', '388', '梁悦成', null);
INSERT INTO `wms_order_checker` VALUES ('30', '4391A', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('31', '4392A', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('32', '4394A', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('33', '4396A', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('34', '4397A', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('35', '433AA', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('36', '433DA', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('37', '433BA', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('38', '433CA', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('39', '433EA', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('40', '433FA', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('41', '433GA', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('42', '433HA', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('43', '4330S', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('44', '4410S', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('45', '4420S', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('46', '4430S', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('47', '4440S', '1', 'kzcbjgly', '科资材备件管理员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('48', '4110C', '2', 'kysy', '科预算员', '1813', '刘静怡', null);
INSERT INTO `wms_order_checker` VALUES ('49', '4111C', '2', 'kysy', '科预算员', '1813', '刘静怡', null);
INSERT INTO `wms_order_checker` VALUES ('50', '4112S', '2', 'kysy', '科预算员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('51', '4113S', '2', 'kysy', '科预算员', '1813', '刘静怡', null);
INSERT INTO `wms_order_checker` VALUES ('52', '4120C', '2', 'kysy', '科预算员', '92', '何金航', null);
INSERT INTO `wms_order_checker` VALUES ('53', '4130C', '2', 'kysy', '科预算员', '2203', '罗青云', null);
INSERT INTO `wms_order_checker` VALUES ('54', '4210S', '2', 'kysy', '科预算员', '2714', '杨金鹏', null);
INSERT INTO `wms_order_checker` VALUES ('55', '4211S', '2', 'kysy', '科预算员', '2714', '杨金鹏', null);
INSERT INTO `wms_order_checker` VALUES ('56', '4212S', '2', 'kysy', '科预算员', '2714', '杨金鹏', null);
INSERT INTO `wms_order_checker` VALUES ('57', '4215S', '2', 'kysy', '科预算员', '2714', '杨金鹏', null);
INSERT INTO `wms_order_checker` VALUES ('58', '4217S', '2', 'kysy', '科预算员', '2714', '杨金鹏', null);
INSERT INTO `wms_order_checker` VALUES ('59', '4220S', '2', 'kysy', '科预算员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('60', '4230S', '2', 'kysy', '科预算员', '3275', '黄伟鸿', null);
INSERT INTO `wms_order_checker` VALUES ('61', '4240S', '2', 'kysy', '科预算员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('62', '4290S', '2', 'kysy', '科预算员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('63', '4330C', '2', 'kysy', '科预算员', '2836', '池圳锟', null);
INSERT INTO `wms_order_checker` VALUES ('64', '4331A', '2', 'kysy', '科预算员', '2836', '池圳锟', null);
INSERT INTO `wms_order_checker` VALUES ('65', '4332A', '2', 'kysy', '科预算员', '2836', '池圳锟', null);
INSERT INTO `wms_order_checker` VALUES ('66', '4333A', '2', 'kysy', '科预算员', '2836', '池圳锟', null);
INSERT INTO `wms_order_checker` VALUES ('67', '4335A', '2', 'kysy', '科预算员', '2836', '池圳锟', null);
INSERT INTO `wms_order_checker` VALUES ('68', '4336A', '2', 'kysy', '科预算员', '2836', '池圳锟', null);
INSERT INTO `wms_order_checker` VALUES ('69', '4334A', '2', 'kysy', '科预算员', '2234', '孙华靖', null);
INSERT INTO `wms_order_checker` VALUES ('70', '4337A', '2', 'kysy', '科预算员', '2836', '池圳锟', null);
INSERT INTO `wms_order_checker` VALUES ('71', '4338A', '2', 'kysy', '科预算员', '2836', '池圳锟', null);
INSERT INTO `wms_order_checker` VALUES ('72', '4339A', '2', 'kysy', '科预算员', '2836', '池圳锟', null);
INSERT INTO `wms_order_checker` VALUES ('73', '4390C', '2', 'kysy', '科预算员', '3531', '沈爱国', null);
INSERT INTO `wms_order_checker` VALUES ('74', '4393A', '2', 'kysy', '科预算员', '3583', '马积兵', null);
INSERT INTO `wms_order_checker` VALUES ('75', '4395A', '2', 'kysy', '科预算员', '3531', '沈爱国', null);
INSERT INTO `wms_order_checker` VALUES ('76', '4340S', '2', 'kysy', '科预算员', '562', '任志鹏', null);
INSERT INTO `wms_order_checker` VALUES ('77', '4391A', '2', 'kysy', '科预算员', '3531', '沈爱国', null);
INSERT INTO `wms_order_checker` VALUES ('78', '4392A', '2', 'kysy', '科预算员', '3531', '沈爱国', null);
INSERT INTO `wms_order_checker` VALUES ('79', '4394A', '2', 'kysy', '科预算员', '3583', '马积兵', null);
INSERT INTO `wms_order_checker` VALUES ('80', '4396A', '2', 'kysy', '科预算员', '3583', '马积兵', null);
INSERT INTO `wms_order_checker` VALUES ('81', '4397A', '2', 'kysy', '科预算员', '3583', '马积兵', null);
INSERT INTO `wms_order_checker` VALUES ('82', '433AA', '2', 'kysy', '科预算员', '2234', '孙华靖', null);
INSERT INTO `wms_order_checker` VALUES ('83', '433DA', '2', 'kysy', '科预算员', '2234', '孙华靖', null);
INSERT INTO `wms_order_checker` VALUES ('84', '433BA', '2', 'kysy', '科预算员', '2836', '池圳锟', null);
INSERT INTO `wms_order_checker` VALUES ('85', '433CA', '2', 'kysy', '科预算员', '2836', '池圳锟', null);
INSERT INTO `wms_order_checker` VALUES ('86', '433EA', '2', 'kysy', '科预算员', '2836', '池圳锟', null);
INSERT INTO `wms_order_checker` VALUES ('87', '433FA', '2', 'kysy', '科预算员', '2836', '池圳锟', null);
INSERT INTO `wms_order_checker` VALUES ('88', '433GA', '2', 'kysy', '科预算员', '2836', '池圳锟', null);
INSERT INTO `wms_order_checker` VALUES ('89', '433HA', '2', 'kysy', '科预算员', '2836', '池圳锟', null);
INSERT INTO `wms_order_checker` VALUES ('90', '4330S', '2', 'kysy', '科预算员', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('91', '4410S', '2', 'kysy', '科预算员', '3457', '张美祥', null);
INSERT INTO `wms_order_checker` VALUES ('92', '4420S', '2', 'kysy', '科预算员', '3313', '陈维', null);
INSERT INTO `wms_order_checker` VALUES ('93', '4430S', '2', 'kysy', '科预算员', '92', '何金航', null);
INSERT INTO `wms_order_checker` VALUES ('94', '4440S', '2', 'kysy', '科预算员', '92', '何金航', null);
INSERT INTO `wms_order_checker` VALUES ('95', '4110C', '3', 'xz', '系长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('96', '4111C', '3', 'xz', '系长', '1812', '慕容秧秧', null);
INSERT INTO `wms_order_checker` VALUES ('97', '4112S', '3', 'xz', '系长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('98', '4113S', '3', 'xz', '系长', '1815', '林建星', null);
INSERT INTO `wms_order_checker` VALUES ('99', '4120C', '3', 'xz', '系长', '140', '范月新', null);
INSERT INTO `wms_order_checker` VALUES ('100', '4130C', '3', 'xz', '系长', '2205', '许静霞', null);
INSERT INTO `wms_order_checker` VALUES ('101', '4210S', '3', 'xz', '系长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('102', '4211S', '3', 'xz', '系长', '2718', '陈远超', null);
INSERT INTO `wms_order_checker` VALUES ('103', '4212S', '3', 'xz', '系长', '2713', '吴永辉', null);
INSERT INTO `wms_order_checker` VALUES ('104', '4215S', '3', 'xz', '系长', '2711', '黎潮波', null);
INSERT INTO `wms_order_checker` VALUES ('105', '4217S', '3', 'xz', '系长', '2711', '/', null);
INSERT INTO `wms_order_checker` VALUES ('106', '4220S', '3', 'xz', '系长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('107', '4230S', '3', 'xz', '系长', '3268', '潘先君', null);
INSERT INTO `wms_order_checker` VALUES ('108', '4240S', '3', 'xz', '系长', '3268', '/', null);
INSERT INTO `wms_order_checker` VALUES ('109', '4290S', '3', 'xz', '系长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('110', '4330C', '3', 'xz', '系长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('111', '4331A', '3', 'xz', '系长', '2807', '张彬科', null);
INSERT INTO `wms_order_checker` VALUES ('112', '4332A', '3', 'xz', '系长', '2807', '张彬科', null);
INSERT INTO `wms_order_checker` VALUES ('113', '4333A', '3', 'xz', '系长', '2807', '张彬科', null);
INSERT INTO `wms_order_checker` VALUES ('114', '4335A', '3', 'xz', '系长', '2807', '张彬科', null);
INSERT INTO `wms_order_checker` VALUES ('115', '4336A', '3', 'xz', '系长', '2807', '张彬科', null);
INSERT INTO `wms_order_checker` VALUES ('116', '4334A', '3', 'xz', '系长', '2219', '李飞雄', null);
INSERT INTO `wms_order_checker` VALUES ('117', '4337A', '3', 'xz', '系长', '2807', '张彬科', null);
INSERT INTO `wms_order_checker` VALUES ('118', '4338A', '3', 'xz', '系长', '2807', '张彬科', null);
INSERT INTO `wms_order_checker` VALUES ('119', '4339A', '3', 'xz', '系长', '2807', '张彬科', null);
INSERT INTO `wms_order_checker` VALUES ('120', '4390C', '3', 'xz', '系长', '3340', '郭伟林', null);
INSERT INTO `wms_order_checker` VALUES ('121', '4393A', '3', 'xz', '系长', '3340', '郭伟林', null);
INSERT INTO `wms_order_checker` VALUES ('122', '4395A', '3', 'xz', '系长', '3340', '郭伟林', null);
INSERT INTO `wms_order_checker` VALUES ('123', '4340S', '3', 'xz', '系长', '215', '古贵彬', null);
INSERT INTO `wms_order_checker` VALUES ('124', '4391A', '3', 'xz', '系长', '3340', '郭伟林', null);
INSERT INTO `wms_order_checker` VALUES ('125', '4392A', '3', 'xz', '系长', '3340', '郭伟林', null);
INSERT INTO `wms_order_checker` VALUES ('126', '4394A', '3', 'xz', '系长', '3340', '郭伟林', null);
INSERT INTO `wms_order_checker` VALUES ('127', '4396A', '3', 'xz', '系长', '3340', '郭伟林', null);
INSERT INTO `wms_order_checker` VALUES ('128', '4397A', '3', 'xz', '系长', '3340', '郭伟林', null);
INSERT INTO `wms_order_checker` VALUES ('129', '433AA', '3', 'xz', '系长', '2219', '李飞雄', null);
INSERT INTO `wms_order_checker` VALUES ('130', '433DA', '3', 'xz', '系长', '2219', '李飞雄', null);
INSERT INTO `wms_order_checker` VALUES ('131', '433BA', '3', 'xz', '系长', '2807', '张彬科', null);
INSERT INTO `wms_order_checker` VALUES ('132', '433CA', '3', 'xz', '系长', '2807', '张彬科', null);
INSERT INTO `wms_order_checker` VALUES ('133', '433EA', '3', 'xz', '系长', '2807', '张彬科', null);
INSERT INTO `wms_order_checker` VALUES ('134', '433FA', '3', 'xz', '系长', '2807', '张彬科', null);
INSERT INTO `wms_order_checker` VALUES ('135', '433GA', '3', 'xz', '系长', '2807', '张彬科', null);
INSERT INTO `wms_order_checker` VALUES ('136', '433HA', '3', 'xz', '系长', '2807', '张彬科', null);
INSERT INTO `wms_order_checker` VALUES ('137', '4330S', '3', 'xz', '系长', '2807', '/', null);
INSERT INTO `wms_order_checker` VALUES ('138', '4410S', '3', 'xz', '系长', '3445', '陈剑书', null);
INSERT INTO `wms_order_checker` VALUES ('139', '4420S', '3', 'xz', '系长', '3445', '/', null);
INSERT INTO `wms_order_checker` VALUES ('140', '4430S', '3', 'xz', '系长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('141', '4440S', '3', 'xz', '系长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('142', '4110C', '4', 'kz', '科长', '1809', '李佳茵', null);
INSERT INTO `wms_order_checker` VALUES ('143', '4111C', '4', 'kz', '科长', '1809', '李佳茵', null);
INSERT INTO `wms_order_checker` VALUES ('144', '4112S', '4', 'kz', '科长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('145', '4113S', '4', 'kz', '科长', '1810', '杨华军', null);
INSERT INTO `wms_order_checker` VALUES ('146', '4120C', '4', 'kz', '科长', '113', '柳文超', null);
INSERT INTO `wms_order_checker` VALUES ('147', '4130C', '4', 'kz', '科长', '2204', '阮圣雄', null);
INSERT INTO `wms_order_checker` VALUES ('148', '4210S', '4', 'kz', '科长', '2710', '王明辉', null);
INSERT INTO `wms_order_checker` VALUES ('149', '4211S', '4', 'kz', '科长', '2710', '王明辉', null);
INSERT INTO `wms_order_checker` VALUES ('150', '4212S', '4', 'kz', '科长', '2710', '王明辉', null);
INSERT INTO `wms_order_checker` VALUES ('151', '4215S', '4', 'kz', '科长', '2710', '王明辉', null);
INSERT INTO `wms_order_checker` VALUES ('152', '4217S', '4', 'kz', '科长', '2710', '王明辉', null);
INSERT INTO `wms_order_checker` VALUES ('153', '4220S', '4', 'kz', '科长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('154', '4230S', '4', 'kz', '科长', '3266', '李祖艺', null);
INSERT INTO `wms_order_checker` VALUES ('155', '4240S', '4', 'kz', '科长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('156', '4290S', '4', 'kz', '科长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('157', '4330C', '4', 'kz', '科长', '2804', '邓明利', null);
INSERT INTO `wms_order_checker` VALUES ('158', '4331A', '4', 'kz', '科长', '2804', '邓明利', null);
INSERT INTO `wms_order_checker` VALUES ('159', '4332A', '4', 'kz', '科长', '2804', '邓明利', null);
INSERT INTO `wms_order_checker` VALUES ('160', '4333A', '4', 'kz', '科长', '2804', '邓明利', null);
INSERT INTO `wms_order_checker` VALUES ('161', '4335A', '4', 'kz', '科长', '2804', '邓明利', null);
INSERT INTO `wms_order_checker` VALUES ('162', '4336A', '4', 'kz', '科长', '2804', '邓明利', null);
INSERT INTO `wms_order_checker` VALUES ('163', '4334A', '4', 'kz', '科长', '2217', '吴勤', null);
INSERT INTO `wms_order_checker` VALUES ('164', '4337A', '4', 'kz', '科长', '2804', '邓明利', null);
INSERT INTO `wms_order_checker` VALUES ('165', '4338A', '4', 'kz', '科长', '2804', '邓明利', null);
INSERT INTO `wms_order_checker` VALUES ('166', '4339A', '4', 'kz', '科长', '2804', '邓明利', null);
INSERT INTO `wms_order_checker` VALUES ('167', '4390C', '4', 'kz', '科长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('168', '4393A', '4', 'kz', '科长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('169', '4395A', '4', 'kz', '科长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('170', '4340S', '4', 'kz', '科长', '177', '林尚芳', null);
INSERT INTO `wms_order_checker` VALUES ('171', '4391A', '4', 'kz', '科长', '2717', '孔令奇', null);
INSERT INTO `wms_order_checker` VALUES ('172', '4392A', '4', 'kz', '科长', '2717', '孔令奇', null);
INSERT INTO `wms_order_checker` VALUES ('173', '4394A', '4', 'kz', '科长', '2717', '孔令奇', null);
INSERT INTO `wms_order_checker` VALUES ('174', '4396A', '4', 'kz', '科长', '2717', '孔令奇', null);
INSERT INTO `wms_order_checker` VALUES ('175', '4397A', '4', 'kz', '科长', '2717', '孔令奇', null);
INSERT INTO `wms_order_checker` VALUES ('176', '433AA', '4', 'kz', '科长', '2217', '吴勤', null);
INSERT INTO `wms_order_checker` VALUES ('177', '433DA', '4', 'kz', '科长', '2217', '吴勤', null);
INSERT INTO `wms_order_checker` VALUES ('178', '433BA', '4', 'kz', '科长', '2804', '邓明利', null);
INSERT INTO `wms_order_checker` VALUES ('179', '433CA', '4', 'kz', '科长', '2804', '邓明利', null);
INSERT INTO `wms_order_checker` VALUES ('180', '433EA', '4', 'kz', '科长', '2804', '邓明利', null);
INSERT INTO `wms_order_checker` VALUES ('181', '433FA', '4', 'kz', '科长', '2804', '邓明利', null);
INSERT INTO `wms_order_checker` VALUES ('182', '433GA', '4', 'kz', '科长', '2804', '邓明利', null);
INSERT INTO `wms_order_checker` VALUES ('183', '433HA', '4', 'kz', '科长', '2804', '邓明利', null);
INSERT INTO `wms_order_checker` VALUES ('184', '4330S', '4', 'kz', '科长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('185', '4410S', '4', 'kz', '科长', '3442', '周文波', null);
INSERT INTO `wms_order_checker` VALUES ('186', '4420S', '4', 'kz', '科长', '3303', '王玉珠', null);
INSERT INTO `wms_order_checker` VALUES ('187', '4430S', '4', 'kz', '科长', '113', '柳文超', null);
INSERT INTO `wms_order_checker` VALUES ('188', '4440S', '4', 'kz', '科长', '113', '柳文超', null);
INSERT INTO `wms_order_checker` VALUES ('189', '4430S', '2', 'kysy', '科预算员', '1737', '黄怡青', '');
INSERT INTO `wms_order_checker` VALUES ('190', '4440S', '2', 'kysy', '科预算员', '1737', '黄怡青', '');
INSERT INTO `wms_order_checker` VALUES ('191', '4120C', '2', 'kysy', '科预算员', '1737', '黄怡青', '');
INSERT INTO `wms_order_checker` VALUES ('192', '4330C', '4', 'kz', '科长', '2217', '吴勤', '');
INSERT INTO `wms_order_checker` VALUES ('193', '4230S', '4', 'kz', '科长', '3267', '许华光', '');
INSERT INTO `wms_order_checker` VALUES ('194', '433DA', '3', 'xz', '系长', '2218', '欧文巧', '');
INSERT INTO `wms_order_checker` VALUES ('195', '433BA', '3', 'xz', '系长', '2218', '欧文巧', '');
INSERT INTO `wms_order_checker` VALUES ('196', '4337A', '3', 'xz', '系长', '2218', '欧文巧', '');
INSERT INTO `wms_order_checker` VALUES ('197', '4391A', '3', 'xz', '系长', '183', '王家平', '');
INSERT INTO `wms_order_checker` VALUES ('198', '4130C', '2', 'kysy', '科预算员', '2209', '顾健文', '');
INSERT INTO `wms_order_checker` VALUES ('199', '4113S', '3', 'xz', '系长', '1819', '古俊昌', '');
INSERT INTO `wms_order_checker` VALUES ('200', '4217S', '3', 'xz', '系长', '2720', '陈华', '');
INSERT INTO `wms_order_checker` VALUES ('201', '4110C', '5', 'bz', '部长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('202', '4111C', '5', 'bz', '部长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('203', '4112S', '5', 'bz', '部长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('204', '4113S', '5', 'bz', '部长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('205', '4120C', '5', 'bz', '部长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('206', '4130C', '5', 'bz', '部长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('207', '4210S', '5', 'bz', '部长', '1808', '夏承睿', null);
INSERT INTO `wms_order_checker` VALUES ('208', '4211S', '5', 'bz', '部长', '1808', '夏承睿', null);
INSERT INTO `wms_order_checker` VALUES ('209', '4212S', '5', 'bz', '部长', '1808', '夏承睿', null);
INSERT INTO `wms_order_checker` VALUES ('210', '4215S', '5', 'bz', '部长', '1808', '夏承睿', null);
INSERT INTO `wms_order_checker` VALUES ('211', '4217S', '5', 'bz', '部长', '1808', '夏承睿', null);
INSERT INTO `wms_order_checker` VALUES ('212', '4220S', '5', 'bz', '部长', '1808', '夏承睿', null);
INSERT INTO `wms_order_checker` VALUES ('213', '4230S', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('214', '4240S', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('215', '4290S', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('216', '4330C', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('217', '4331A', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('218', '4332A', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('219', '4333A', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('220', '4335A', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('221', '4336A', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('222', '4334A', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('223', '4337A', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('224', '4338A', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('225', '4339A', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('226', '4390C', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('227', '4393A', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('228', '4395A', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('229', '4340S', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('230', '4391A', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('231', '4392A', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('232', '4394A', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('233', '4396A', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('234', '4397A', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('235', '433AA', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('236', '433DA', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('237', '433BA', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('238', '433CA', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('239', '433EA', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('240', '433FA', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('241', '433GA', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('242', '433HA', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('243', '4330S', '5', 'bz', '部长', '3339', '周和波', null);
INSERT INTO `wms_order_checker` VALUES ('244', '4410S', '5', 'bz', '部长', '1806', '伍岳林', null);
INSERT INTO `wms_order_checker` VALUES ('245', '4420S', '5', 'bz', '部长', '1806', '伍岳林', null);
INSERT INTO `wms_order_checker` VALUES ('246', '4430S', '5', 'bz', '部长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('247', '4440S', '5', 'bz', '部长', '/', '/', null);
INSERT INTO `wms_order_checker` VALUES ('248', '4110C', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('249', '4111C', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('250', '4112S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('251', '4113S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('252', '4120C', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('253', '4130C', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('254', '4210S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('255', '4211S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('256', '4212S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('257', '4215S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('258', '4217S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('259', '4220S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('260', '4230S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('261', '4240S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('262', '4290S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('263', '4330C', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('264', '4331A', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('265', '4332A', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('266', '4333A', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('267', '4335A', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('268', '4336A', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('269', '4334A', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('270', '4337A', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('271', '4338A', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('272', '4339A', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('273', '4390C', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('274', '4393A', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('275', '4395A', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('276', '4340S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('277', '4391A', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('278', '4392A', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('279', '4394A', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('280', '4396A', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('281', '4397A', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('282', '433AA', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('288', '433DA', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('289', '433BA', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('290', '433CA', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('291', '433EA', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('292', '433FA', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('293', '433GA', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('294', '433HA', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('295', '4330S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('296', '4410S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('297', '4420S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('298', '4430S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
INSERT INTO `wms_order_checker` VALUES ('299', '4440S', '6', 'zj', '总监/总助/本部长', '1805', '唐新和', null);
