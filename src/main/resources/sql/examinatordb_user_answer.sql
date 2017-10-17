-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: examinatordb
-- ------------------------------------------------------
-- Server version	5.7.7-rc-log


DROP TABLE IF EXISTS `user_answer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_answer` (
  `user_id` int(11) NOT NULL,
  `exam_id` int(11) NOT NULL,
  `question_id` int(11) NOT NULL,
  `answer` varchar(255) NOT NULL,
  `entryDate` date DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

insert into `user_answer` (`user_id`, `exam_id`, `question_id`, `answer`) values (18, 1, 1, 'Answer-1');
insert into `user_answer` (`user_id`, `exam_id`, `question_id`, `answer`) values (18, 1, 2, 'Answer-2');