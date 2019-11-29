/*
Navicat MySQL Data Transfer

Source Server         : kk阿里云
Source Server Version : 50728
Source Host           : 39.97.255.134:3306
Source Database       : testkk

Target Server Type    : MYSQL
Target Server Version : 50728
File Encoding         : 65001

Date: 2019-11-29 21:05:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `function`
-- ----------------------------
DROP TABLE IF EXISTS `function`;
CREATE TABLE `function` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `pid` int(11) DEFAULT NULL,
  `pattern` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `discription` varchar(255) DEFAULT NULL,
  `type` tinyint(4) DEFAULT NULL COMMENT '类型 1菜单 2按钮',
  `sortnum` int(11) DEFAULT NULL,
  `del_flag` tinyint(4) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of function
-- ----------------------------
INSERT INTO `function` VALUES ('1', '0', 'system', null, 'fa-cog', '系统设置', '这是系统设置', '1', '1', '2', '2019-11-29 19:47:22');
INSERT INTO `function` VALUES ('2', '1', 'user', null, null, '用户', null, null, '1', '2', null);
INSERT INTO `function` VALUES ('3', '1', 'role', null, null, '角色', null, null, '2', '2', null);
INSERT INTO `function` VALUES ('4', '1', 'function', null, null, '权限', null, null, '3', '2', null);
INSERT INTO `function` VALUES ('5', '0', 'content', null, 'fa-futbol-o', '内容管理', null, null, '2', '2', null);
INSERT INTO `function` VALUES ('6', '5', 'information', null, null, '资讯', null, null, '1', '2', null);

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `pattern` varchar(255) DEFAULT NULL,
  `del_flag` tinyint(4) DEFAULT NULL,
  `sortnum` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role_type` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `delete_flag` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '111', '698d51a19d8a121ce581499d7b701668', null, '2019-11-29 19:42:38', '2');
