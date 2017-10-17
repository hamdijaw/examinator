-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: examinatordb
-- ------------------------------------------------------
-- Server version	5.7.7-rc-log


DROP TABLE IF EXISTS `user_entitlement`;
CREATE TABLE `user_entitlement` (
  `user_id` int(11) NOT NULL UNIQUE,
  `password` varchar(255) NOT NULL,
  `entryDate` date DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

insert into user_entitlement (`user_id`, `password`) values (18, '111')
