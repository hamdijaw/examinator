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
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `question` (
  `question_id` int(11) NOT NULL AUTO_INCREMENT,
  `body` text,
  `createdDate` date DEFAULT NULL,
  `deletedDate` date DEFAULT '9999-12-31',
  `createdBy` varchar(255) NOT NULL DEFAULT 'system',
  `examId` int(11) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `exam_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`question_id`),
  KEY `examId` (`examId`),
  KEY `exam_id` (`exam_id`),
  CONSTRAINT `question_ibfk_1` FOREIGN KEY (`exam_id`) REFERENCES `exam` (`exam_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,'2 + 3 ?',NULL,'9999-12-31','system',NULL,NULL,1),(2,'6 – 4 ?',NULL,'9999-12-31','system',NULL,NULL,1),(3,'12 / 3 ?',NULL,'9999-12-31','system',NULL,NULL,1),(4,'7 X 4 ?',NULL,'9999-12-31','system',NULL,NULL,1),(5,'What is Motion?',NULL,'9999-12-31','system',NULL,NULL,NULL),(6,'What are laws of motion?',NULL,'9999-12-31','system',NULL,NULL,NULL),(7,'What are Newton\'s laws?',NULL,'9999-12-31','system',NULL,NULL,3),(8,'How much is \'g\'',NULL,'9999-12-31','system',NULL,NULL,3),(9,'What is acceleration in uniform velocity?',NULL,'9999-12-31','system',NULL,NULL,3),(10,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,4),(11,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,4),(12,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,5),(13,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,5),(14,'What is 2+2 = ?',NULL,'9999-12-31','system',NULL,NULL,6),(15,'What is 5 X 2 = ?',NULL,'9999-12-31','system',NULL,NULL,6),(16,'What is 2+2 = ?',NULL,'9999-12-31','system',NULL,NULL,7),(17,'What is 5 X 2 = ?',NULL,'9999-12-31','system',NULL,NULL,7);
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
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
