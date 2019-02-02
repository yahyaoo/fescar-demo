/*
Navicat MySQL Data Transfer

Source Server         : 虚拟机
Source Server Version : 80012
Source Host           : 192.168.22.131:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2019-02-02 12:19:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dm_detail
-- ----------------------------
DROP TABLE IF EXISTS `dm_detail`;
CREATE TABLE `dm_detail` (
  `dm_detail_id` int(11) NOT NULL AUTO_INCREMENT,
  `dm_detail_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `dm_detail_gender` tinyint(1) NOT NULL,
  PRIMARY KEY (`dm_detail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of dm_detail
-- ----------------------------
INSERT INTO `dm_detail` VALUES ('1', '宇宏呀', '1');
INSERT INTO `dm_detail` VALUES ('4', '你是猪', '0');

-- ----------------------------
-- Table structure for dm_user
-- ----------------------------
DROP TABLE IF EXISTS `dm_user`;
CREATE TABLE `dm_user` (
  `dm_user_id` int(11) NOT NULL AUTO_INCREMENT,
  `dm_user_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`dm_user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of dm_user
-- ----------------------------
INSERT INTO `dm_user` VALUES ('7', '123456');
INSERT INTO `dm_user` VALUES ('10', '1154065003');
INSERT INTO `dm_user` VALUES ('24', '13408285721');

-- ----------------------------
-- Table structure for undo_log
-- ----------------------------
DROP TABLE IF EXISTS `undo_log`;
CREATE TABLE `undo_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `branch_id` bigint(20) NOT NULL,
  `xid` varchar(100) NOT NULL,
  `rollback_info` longblob NOT NULL,
  `log_status` int(11) NOT NULL,
  `log_created` datetime NOT NULL,
  `log_modified` datetime NOT NULL,
  `ext` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_unionkey` (`xid`,`branch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of undo_log
-- ----------------------------
