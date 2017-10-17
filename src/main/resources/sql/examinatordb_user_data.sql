-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: examinatordb
-- ------------------------------------------------------
-- Server version	5.7.7-rc-log


DROP TABLE IF EXISTS `user_data`;
CREATE TABLE `user_data` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `phone` varchar(255) UNIQUE,
  `email` varchar(255) UNIQUE,
  `active` tinyint(1) DEFAULT NULL,
  `entryDate` date DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

insert into user_data (`name`, `phone`, `email`) values ('user-name', '123456789', 'user_1@gmail.com')
