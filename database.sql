CREATE SCHEMA `arosechat` DEFAULT CHARACTER SET utf8 ;
CREATE TABLE `arosechat`.`aroise_chat_user` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_name` VARCHAR(45) NOT NULL COMMENT '用户名',
  `user_password` VARCHAR(45) NOT NULL COMMENT '密码',
  `user_nikename` VARCHAR(45) NOT NULL COMMENT '昵称',
  `user_age` INT NULL DEFAULT 0 COMMENT '年龄',
  `user_gender` INT NOT NULL COMMENT '性别',
  `user_individual` VARCHAR(125) NULL DEFAULT '它比较懒，什么都没留下' COMMENT '个性签名',
  `user_qrcode` VARCHAR(45) NOT NULL COMMENT '用户二维码',
  `user_cid` VARCHAR(45) NOT NULL COMMENT 'clientId',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `user_cid_UNIQUE` (`user_cid` ASC),
  UNIQUE INDEX `user_qrcode_UNIQUE` (`user_qrcode` ASC),
  UNIQUE INDEX `user_name_UNIQUE` (`user_name` ASC));
  
  CREATE TABLE `arosechat`.`aroise_chat_message_request` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `chat_send_user_id` INT NOT NULL COMMENT '发送者ID',
  `chat_accept_user_id` INT NOT NULL COMMENT '接收者iD',
  `chat_request_time` VARCHAR(23) NOT NULL COMMENT '请求时间',
  PRIMARY KEY (`id`));
  CREATE TABLE `arosechat`.`aroise_chat_friend` (
  `id` INT NOT NULL,
  `user_id` VARCHAR(45) NOT NULL  COMMENT '添加者ID',
  `friend_id` VARCHAR(45) NOT NULL  COMMENT '朋友ID',
  PRIMARY KEY (`id`));
  CREATE TABLE `aroise_chat_message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `message_sender_user_id` int(11) NOT NULL COMMENT '发送者',
  `message_accept_user_id` int(11) NOT NULL COMMENT '接收者',
  `message` varchar(234) NOT NULL COMMENT '消息',
  `message_sgin_flag` int(11) NOT NULL COMMENT '消息一读状态',
  `create_time` varchar(23) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
