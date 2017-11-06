-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: examinatordb
-- ------------------------------------------------------
-- Server version	5.7.7-rc-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `answer`
--

DROP TABLE IF EXISTS `answer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `answer` (
  `answer_id` int(11) NOT NULL AUTO_INCREMENT,
  `body` text,
  `is_correct` tinyint(1) NOT NULL DEFAULT '0',
  `createdDate` date DEFAULT NULL,
  `deletedDate` date DEFAULT '9999-12-31',
  `createdBy` varchar(255) NOT NULL DEFAULT 'system',
  `questionId` int(11) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `question_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`answer_id`),
  KEY `questionId` (`questionId`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `answer`
--

LOCK TABLES `answer` WRITE;
/*!40000 ALTER TABLE `answer` DISABLE KEYS */;
INSERT INTO `answer` VALUES (1,'3',0,NULL,'9999-12-31','system',NULL,NULL,1),(2,'4',1,NULL,'9999-12-31','system',NULL,NULL,1),(3,'5',0,NULL,'9999-12-31','system',NULL,NULL,1),(4,'6',0,NULL,'9999-12-31','system',NULL,NULL,1),(5,'2',1,NULL,'9999-12-31','system',NULL,NULL,2),(6,'3',0,NULL,'9999-12-31','system',NULL,NULL,2),(7,'4',0,NULL,'9999-12-31','system',NULL,NULL,2),(8,'5',0,NULL,'9999-12-31','system',NULL,NULL,2),(9,'2',0,NULL,'9999-12-31','system',NULL,NULL,3),(10,'4',1,NULL,'9999-12-31','system',NULL,NULL,3),(11,'6',0,NULL,'9999-12-31','system',NULL,NULL,3),(12,'7',0,NULL,'9999-12-31','system',NULL,NULL,3),(13,'28',1,NULL,'9999-12-31','system',NULL,NULL,4),(14,'29',0,NULL,'9999-12-31','system',NULL,NULL,4),(15,'19',0,NULL,'9999-12-31','system',NULL,NULL,4),(16,'30',0,NULL,'9999-12-31','system',NULL,NULL,4),(17,'Continued Hard Work',0,NULL,'9999-12-31','system',NULL,NULL,12),(18,'Bad',0,NULL,'9999-12-31','system',NULL,NULL,13),(19,'4',1,NULL,'9999-12-31','system',NULL,NULL,14),(20,'5',0,NULL,'9999-12-31','system',NULL,NULL,14),(21,'6',0,NULL,'9999-12-31','system',NULL,NULL,14),(22,'7',0,NULL,'9999-12-31','system',NULL,NULL,14),(23,'11',0,NULL,'9999-12-31','system',NULL,NULL,15),(24,'12',0,NULL,'9999-12-31','system',NULL,NULL,15),(25,'13',0,NULL,'9999-12-31','system',NULL,NULL,15),(26,'10',1,NULL,'9999-12-31','system',NULL,NULL,15),(27,'4',1,NULL,'9999-12-31','system',NULL,NULL,16),(28,'5',0,NULL,'9999-12-31','system',NULL,NULL,16),(29,'6',0,NULL,'9999-12-31','system',NULL,NULL,16),(30,'7',0,NULL,'9999-12-31','system',NULL,NULL,16),(31,'11',0,NULL,'9999-12-31','system',NULL,NULL,17),(32,'12',0,NULL,'9999-12-31','system',NULL,NULL,17),(33,'13',0,NULL,'9999-12-31','system',NULL,NULL,17),(34,'10',1,NULL,'9999-12-31','system',NULL,NULL,17);
/*!40000 ALTER TABLE `answer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-06 11:19:59
