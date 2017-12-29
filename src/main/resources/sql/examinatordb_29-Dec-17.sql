-- MySQL dump 10.13  Distrib 5.7.7-rc, for Win64 (x86_64)
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
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `answer`
--

LOCK TABLES `answer` WRITE;
/*!40000 ALTER TABLE `answer` DISABLE KEYS */;
INSERT INTO `answer` VALUES (1,'3',0,NULL,'9999-12-31','system',NULL,NULL,1),(2,'4',1,NULL,'9999-12-31','system',NULL,NULL,1),(3,'5',0,NULL,'9999-12-31','system',NULL,NULL,1),(4,'6',0,NULL,'9999-12-31','system',NULL,NULL,1),(5,'2',1,NULL,'9999-12-31','system',NULL,NULL,2),(6,'3',0,NULL,'9999-12-31','system',NULL,NULL,2),(7,'4',0,NULL,'9999-12-31','system',NULL,NULL,2),(8,'5',0,NULL,'9999-12-31','system',NULL,NULL,2),(9,'2',0,NULL,'9999-12-31','system',NULL,NULL,3),(10,'4',1,NULL,'9999-12-31','system',NULL,NULL,3),(11,'6',0,NULL,'9999-12-31','system',NULL,NULL,3),(12,'7',0,NULL,'9999-12-31','system',NULL,NULL,3),(13,'28',1,NULL,'9999-12-31','system',NULL,NULL,4),(14,'29',0,NULL,'9999-12-31','system',NULL,NULL,4),(15,'19',0,NULL,'9999-12-31','system',NULL,NULL,4),(16,'30',0,NULL,'9999-12-31','system',NULL,NULL,4),(17,'Continued Hard Work',0,NULL,'9999-12-31','system',NULL,NULL,12),(18,'Bad',0,NULL,'9999-12-31','system',NULL,NULL,13),(19,'4',1,NULL,'9999-12-31','system',NULL,NULL,14),(20,'5',0,NULL,'9999-12-31','system',NULL,NULL,14),(21,'6',0,NULL,'9999-12-31','system',NULL,NULL,14),(22,'7',0,NULL,'9999-12-31','system',NULL,NULL,14),(23,'11',0,NULL,'9999-12-31','system',NULL,NULL,15),(24,'12',0,NULL,'9999-12-31','system',NULL,NULL,15),(25,'13',0,NULL,'9999-12-31','system',NULL,NULL,15),(26,'10',1,NULL,'9999-12-31','system',NULL,NULL,15),(27,'4',1,NULL,'9999-12-31','system',NULL,NULL,16),(28,'5',0,NULL,'9999-12-31','system',NULL,NULL,16),(29,'6',0,NULL,'9999-12-31','system',NULL,NULL,16),(30,'7',0,NULL,'9999-12-31','system',NULL,NULL,16),(31,'11',0,NULL,'9999-12-31','system',NULL,NULL,17),(32,'12',0,NULL,'9999-12-31','system',NULL,NULL,17),(33,'13',0,NULL,'9999-12-31','system',NULL,NULL,17),(34,'10',1,NULL,'9999-12-31','system',NULL,NULL,17),(35,'Bad',0,NULL,'9999-12-31','system',NULL,NULL,24),(36,'Continued Hard Work',0,NULL,'9999-12-31','system',NULL,NULL,25),(37,'Continued Hard Work',0,NULL,'9999-12-31','system',NULL,NULL,31),(38,'Bad',0,NULL,'9999-12-31','system',NULL,NULL,32),(39,'Continued Hard Work',0,NULL,'9999-12-31','system',NULL,NULL,38),(40,'Bad',0,NULL,'9999-12-31','system',NULL,NULL,39),(41,'Continued Hard Work',0,NULL,'9999-12-31','system',NULL,NULL,45),(42,'Bad',0,NULL,'9999-12-31','system',NULL,NULL,46),(43,'Bad',0,NULL,'9999-12-31','system',NULL,NULL,52),(44,'Continued Hard Work',0,NULL,'9999-12-31','system',NULL,NULL,53),(45,'Continued Hard Work',0,NULL,'9999-12-31','system',NULL,NULL,59),(46,'Bad',0,NULL,'9999-12-31','system',NULL,NULL,60),(47,'Bad',0,NULL,'9999-12-31','system',NULL,NULL,66),(48,'Continued Hard Work',0,NULL,'9999-12-31','system',NULL,NULL,67),(49,'Continued Hard Work',0,NULL,'9999-12-31','system',NULL,NULL,73),(50,'Bad',0,NULL,'9999-12-31','system',NULL,NULL,74),(51,'Continued Hard Work',0,NULL,'9999-12-31','system',NULL,NULL,80),(52,'Bad',0,NULL,'9999-12-31','system',NULL,NULL,81),(53,'Continued Hard Work',0,NULL,'9999-12-31','system',NULL,NULL,87),(54,'Bad',0,NULL,'9999-12-31','system',NULL,NULL,88),(55,'Bad',0,NULL,'9999-12-31','system',NULL,NULL,94),(56,'Continued Hard Work',0,NULL,'9999-12-31','system',NULL,NULL,95),(57,'Pi * r * r ',1,NULL,'9999-12-31','system',NULL,NULL,99),(58,'r * r',0,NULL,'9999-12-31','system',NULL,NULL,99),(59,'None of the above',0,NULL,'9999-12-31','system',NULL,NULL,99),(60,'Pi * r',0,NULL,'9999-12-31','system',NULL,NULL,99),(61,'5',1,NULL,'9999-12-31','system',NULL,NULL,100),(62,'6',0,NULL,'9999-12-31','system',NULL,NULL,100),(63,'7',0,NULL,'9999-12-31','system',NULL,NULL,100),(64,'8',0,NULL,'9999-12-31','system',NULL,NULL,100),(65,'Insulator',0,NULL,'9999-12-31','system',NULL,NULL,101),(66,'Both b & c',0,NULL,'9999-12-31','system',NULL,NULL,101),(67,'Conductor',0,NULL,'9999-12-31','system',NULL,NULL,101),(68,'Good conductor',0,NULL,'9999-12-31','system',NULL,NULL,101),(69,'Liquid Emitting Device',0,NULL,'9999-12-31','system',NULL,NULL,102),(70,'Light Emitting Diode',0,NULL,'9999-12-31','system',NULL,NULL,102),(71,'Light Emitting Device',0,NULL,'9999-12-31','system',NULL,NULL,102),(72,'Light Extra Device',0,NULL,'9999-12-31','system',NULL,NULL,102),(73,'Electrolysis',0,NULL,'9999-12-31','system',NULL,NULL,103),(74,'Both a & c',0,NULL,'9999-12-31','system',NULL,NULL,103),(75,'Electro conducting',0,NULL,'9999-12-31','system',NULL,NULL,103),(76,'Electroplating',0,NULL,'9999-12-31','system',NULL,NULL,103),(77,'Neutral',0,NULL,'9999-12-31','system',NULL,NULL,104),(78,'All of these',0,NULL,'9999-12-31','system',NULL,NULL,104),(79,'Good conductor',0,NULL,'9999-12-31','system',NULL,NULL,104),(80,'Poor conductor',0,NULL,'9999-12-31','system',NULL,NULL,104),(81,'Insulator',0,NULL,'9999-12-31','system',NULL,NULL,105),(82,'All of these',0,NULL,'9999-12-31','system',NULL,NULL,105),(83,'Conductor',0,NULL,'9999-12-31','system',NULL,NULL,105),(84,'Electroplating',0,NULL,'9999-12-31','system',NULL,NULL,105),(85,'Voltage',0,NULL,'9999-12-31','system',NULL,NULL,106),(86,'Leads',0,NULL,'9999-12-31','system',NULL,NULL,106),(87,'None of these',0,NULL,'9999-12-31','system',NULL,NULL,106),(88,'Magnetic field',0,NULL,'9999-12-31','system',NULL,NULL,106),(89,'All of these',0,NULL,'9999-12-31','system',NULL,NULL,107),(90,'Electrolytes',0,NULL,'9999-12-31','system',NULL,NULL,107),(91,'Decomposition',0,NULL,'9999-12-31','system',NULL,NULL,107),(92,'Electroplating',0,NULL,'9999-12-31','system',NULL,NULL,107);
/*!40000 ALTER TABLE `answer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam`
--

DROP TABLE IF EXISTS `exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exam` (
  `exam_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `createdDate` date DEFAULT NULL,
  `deletedDate` date DEFAULT '9999-12-31',
  `createdBy` varchar(255) NOT NULL DEFAULT 'system',
  `created_date` date DEFAULT NULL,
  PRIMARY KEY (`exam_id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam`
--

LOCK TABLES `exam` WRITE;
/*!40000 ALTER TABLE `exam` DISABLE KEYS */;
INSERT INTO `exam` VALUES (1,'Maths – Standard - 2',NULL,'9999-12-31','system',NULL),(2,'Science-9',NULL,'9999-12-31','system',NULL),(3,'Science-1-',NULL,'9999-12-31','system',NULL),(4,'English-10',NULL,'9999-12-31','system',NULL),(5,'English-11',NULL,'9999-12-31','system',NULL),(6,'Test-N',NULL,'9999-12-31','system',NULL),(7,'Test-N',NULL,'9999-12-31','system',NULL),(8,'English-10',NULL,'9999-12-31','system',NULL),(9,'English-10',NULL,'9999-12-31','system',NULL),(10,'English-10',NULL,'9999-12-31','system',NULL),(11,'English-11',NULL,'9999-12-31','system',NULL),(12,'Science-1-',NULL,'9999-12-31','system',NULL),(13,'English-10',NULL,'9999-12-31','system',NULL),(14,'English-11',NULL,'9999-12-31','system',NULL),(15,'Science-1-',NULL,'9999-12-31','system',NULL),(16,'English-10',NULL,'9999-12-31','system',NULL),(17,'English-11',NULL,'9999-12-31','system',NULL),(18,'Science-1-',NULL,'9999-12-31','system',NULL),(19,'English-10',NULL,'9999-12-31','system',NULL),(20,'English-11',NULL,'9999-12-31','system',NULL),(21,'Science-1-',NULL,'9999-12-31','system',NULL),(22,'English-10',NULL,'9999-12-31','system',NULL),(23,'English-11',NULL,'9999-12-31','system',NULL),(24,'Science-1-',NULL,'9999-12-31','system',NULL),(25,'English-10',NULL,'9999-12-31','system',NULL),(26,'English-11',NULL,'9999-12-31','system',NULL),(27,'Science-1-',NULL,'9999-12-31','system',NULL),(28,'English-10',NULL,'9999-12-31','system',NULL),(29,'English-11',NULL,'9999-12-31','system',NULL),(30,'Science-1-',NULL,'9999-12-31','system',NULL),(31,'English-10',NULL,'9999-12-31','system',NULL),(32,'English-11',NULL,'9999-12-31','system',NULL),(33,'Science-1-',NULL,'9999-12-31','system',NULL),(34,'English-10',NULL,'9999-12-31','system',NULL),(35,'English-11',NULL,'9999-12-31','system',NULL),(36,'Science-1-',NULL,'9999-12-31','system',NULL),(37,'English-10',NULL,'9999-12-31','system',NULL),(38,'English-11',NULL,'9999-12-31','system',NULL),(39,'Science-1-',NULL,'9999-12-31','system',NULL),(40,'English-10',NULL,'9999-12-31','system',NULL),(41,'English-11',NULL,'9999-12-31','system',NULL),(42,'Science-1-',NULL,'9999-12-31','system',NULL),(43,'Maths – 9 Class',NULL,'9999-12-31','system',NULL),(45,'13-ChemicalEffectsOfElectricCurrents',NULL,'9999-12-31','system',NULL);
/*!40000 ALTER TABLE `exam` ENABLE KEYS */;
UNLOCK TABLES;

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
  `answer_choice` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `correct_answer` varchar(255) DEFAULT NULL,
  `exam_exam_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`question_id`),
  KEY `examId` (`examId`),
  KEY `exam_id` (`exam_id`),
  CONSTRAINT `question_ibfk_1` FOREIGN KEY (`exam_id`) REFERENCES `exam` (`exam_id`)
) ENGINE=InnoDB AUTO_INCREMENT=108 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,'2 + 3 ?',NULL,'9999-12-31','system',NULL,NULL,1,NULL,NULL,NULL,NULL),(2,'6 – 4 ?',NULL,'9999-12-31','system',NULL,NULL,1,NULL,NULL,NULL,NULL),(3,'12 / 3 ?',NULL,'9999-12-31','system',NULL,NULL,1,NULL,NULL,NULL,NULL),(4,'7 X 4 ?',NULL,'9999-12-31','system',NULL,NULL,1,NULL,NULL,NULL,NULL),(5,'What is Motion?',NULL,'9999-12-31','system',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'What are laws of motion?',NULL,'9999-12-31','system',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,'What are Newton\'s laws?',NULL,'9999-12-31','system',NULL,NULL,3,NULL,NULL,NULL,NULL),(8,'How much is \'g\'',NULL,'9999-12-31','system',NULL,NULL,3,NULL,NULL,NULL,NULL),(9,'What is acceleration in uniform velocity?',NULL,'9999-12-31','system',NULL,NULL,3,NULL,NULL,NULL,NULL),(10,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,4,NULL,NULL,NULL,NULL),(11,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,4,NULL,NULL,NULL,NULL),(12,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,5,NULL,NULL,NULL,NULL),(13,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,5,NULL,NULL,NULL,NULL),(14,'What is 2+2 = ?',NULL,'9999-12-31','system',NULL,NULL,6,NULL,NULL,NULL,NULL),(15,'What is 5 X 2 = ?',NULL,'9999-12-31','system',NULL,NULL,6,NULL,NULL,NULL,NULL),(16,'What is 2+2 = ?',NULL,'9999-12-31','system',NULL,NULL,7,NULL,NULL,NULL,NULL),(17,'What is 5 X 2 = ?',NULL,'9999-12-31','system',NULL,NULL,7,NULL,NULL,NULL,NULL),(18,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,8,NULL,NULL,NULL,NULL),(19,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,8,NULL,NULL,NULL,NULL),(20,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,9,NULL,NULL,NULL,NULL),(21,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,9,NULL,NULL,NULL,NULL),(22,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,10,NULL,NULL,NULL,NULL),(23,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,10,NULL,NULL,NULL,NULL),(24,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,11,NULL,NULL,NULL,NULL),(25,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,11,NULL,NULL,NULL,NULL),(26,'What is acceleration in uniform velocity?',NULL,'9999-12-31','system',NULL,NULL,12,NULL,NULL,NULL,NULL),(27,'What are Newton\'s laws?',NULL,'9999-12-31','system',NULL,NULL,12,NULL,NULL,NULL,NULL),(28,'How much is \'g\'',NULL,'9999-12-31','system',NULL,NULL,12,NULL,NULL,NULL,NULL),(29,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,13,NULL,NULL,NULL,NULL),(30,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,13,NULL,NULL,NULL,NULL),(31,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,14,NULL,NULL,NULL,NULL),(32,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,14,NULL,NULL,NULL,NULL),(33,'What is acceleration in uniform velocity?',NULL,'9999-12-31','system',NULL,NULL,15,NULL,NULL,NULL,NULL),(34,'What are Newton\'s laws?',NULL,'9999-12-31','system',NULL,NULL,15,NULL,NULL,NULL,NULL),(35,'How much is \'g\'',NULL,'9999-12-31','system',NULL,NULL,15,NULL,NULL,NULL,NULL),(36,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,16,NULL,NULL,NULL,NULL),(37,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,16,NULL,NULL,NULL,NULL),(38,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,17,NULL,NULL,NULL,NULL),(39,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,17,NULL,NULL,NULL,NULL),(40,'What are Newton\'s laws?',NULL,'9999-12-31','system',NULL,NULL,18,NULL,NULL,NULL,NULL),(41,'What is acceleration in uniform velocity?',NULL,'9999-12-31','system',NULL,NULL,18,NULL,NULL,NULL,NULL),(42,'How much is \'g\'',NULL,'9999-12-31','system',NULL,NULL,18,NULL,NULL,NULL,NULL),(43,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,19,NULL,NULL,NULL,NULL),(44,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,19,NULL,NULL,NULL,NULL),(45,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,20,NULL,NULL,NULL,NULL),(46,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,20,NULL,NULL,NULL,NULL),(47,'What is acceleration in uniform velocity?',NULL,'9999-12-31','system',NULL,NULL,21,NULL,NULL,NULL,NULL),(48,'What are Newton\'s laws?',NULL,'9999-12-31','system',NULL,NULL,21,NULL,NULL,NULL,NULL),(49,'How much is \'g\'',NULL,'9999-12-31','system',NULL,NULL,21,NULL,NULL,NULL,NULL),(50,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,22,NULL,NULL,NULL,NULL),(51,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,22,NULL,NULL,NULL,NULL),(52,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,23,NULL,NULL,NULL,NULL),(53,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,23,NULL,NULL,NULL,NULL),(54,'How much is \'g\'',NULL,'9999-12-31','system',NULL,NULL,24,NULL,NULL,NULL,NULL),(55,'What are Newton\'s laws?',NULL,'9999-12-31','system',NULL,NULL,24,NULL,NULL,NULL,NULL),(56,'What is acceleration in uniform velocity?',NULL,'9999-12-31','system',NULL,NULL,24,NULL,NULL,NULL,NULL),(57,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,25,NULL,NULL,NULL,NULL),(58,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,25,NULL,NULL,NULL,NULL),(59,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,26,NULL,NULL,NULL,NULL),(60,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,26,NULL,NULL,NULL,NULL),(61,'How much is \'g\'',NULL,'9999-12-31','system',NULL,NULL,27,NULL,NULL,NULL,NULL),(62,'What is acceleration in uniform velocity?',NULL,'9999-12-31','system',NULL,NULL,27,NULL,NULL,NULL,NULL),(63,'What are Newton\'s laws?',NULL,'9999-12-31','system',NULL,NULL,27,NULL,NULL,NULL,NULL),(64,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,28,NULL,NULL,NULL,NULL),(65,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,28,NULL,NULL,NULL,NULL),(66,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,29,NULL,NULL,NULL,NULL),(67,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,29,NULL,NULL,NULL,NULL),(68,'What are Newton\'s laws?',NULL,'9999-12-31','system',NULL,NULL,30,NULL,NULL,NULL,NULL),(69,'What is acceleration in uniform velocity?',NULL,'9999-12-31','system',NULL,NULL,30,NULL,NULL,NULL,NULL),(70,'How much is \'g\'',NULL,'9999-12-31','system',NULL,NULL,30,NULL,NULL,NULL,NULL),(71,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,31,NULL,NULL,NULL,NULL),(72,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,31,NULL,NULL,NULL,NULL),(73,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,32,NULL,NULL,NULL,NULL),(74,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,32,NULL,NULL,NULL,NULL),(75,'What are Newton\'s laws?',NULL,'9999-12-31','system',NULL,NULL,33,NULL,NULL,NULL,NULL),(76,'How much is \'g\'',NULL,'9999-12-31','system',NULL,NULL,33,NULL,NULL,NULL,NULL),(77,'What is acceleration in uniform velocity?',NULL,'9999-12-31','system',NULL,NULL,33,NULL,NULL,NULL,NULL),(78,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,34,NULL,NULL,NULL,NULL),(79,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,34,NULL,NULL,NULL,NULL),(80,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,35,NULL,NULL,NULL,NULL),(81,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,35,NULL,NULL,NULL,NULL),(82,'What are Newton\'s laws?',NULL,'9999-12-31','system',NULL,NULL,36,NULL,NULL,NULL,NULL),(83,'How much is \'g\'',NULL,'9999-12-31','system',NULL,NULL,36,NULL,NULL,NULL,NULL),(84,'What is acceleration in uniform velocity?',NULL,'9999-12-31','system',NULL,NULL,36,NULL,NULL,NULL,NULL),(85,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,37,NULL,NULL,NULL,NULL),(86,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,37,NULL,NULL,NULL,NULL),(87,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,38,NULL,NULL,NULL,NULL),(88,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,38,NULL,NULL,NULL,NULL),(89,'How much is \'g\'',NULL,'9999-12-31','system',NULL,NULL,39,NULL,NULL,NULL,NULL),(90,'What are Newton\'s laws?',NULL,'9999-12-31','system',NULL,NULL,39,NULL,NULL,NULL,NULL),(91,'What is acceleration in uniform velocity?',NULL,'9999-12-31','system',NULL,NULL,39,NULL,NULL,NULL,NULL),(92,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,40,NULL,NULL,NULL,NULL),(93,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,40,NULL,NULL,NULL,NULL),(94,'Antonym of \'Good\'',NULL,'9999-12-31','system',NULL,NULL,41,NULL,NULL,NULL,NULL),(95,'What is the meaning of \'Perseverance\'',NULL,'9999-12-31','system',NULL,NULL,41,NULL,NULL,NULL,NULL),(96,'How much is \'g\'',NULL,'9999-12-31','system',NULL,NULL,42,NULL,NULL,NULL,NULL),(97,'What are Newton\'s laws?',NULL,'9999-12-31','system',NULL,NULL,42,NULL,NULL,NULL,NULL),(98,'What is acceleration in uniform velocity?',NULL,'9999-12-31','system',NULL,NULL,42,NULL,NULL,NULL,NULL),(99,'What is the area of circle?',NULL,'9999-12-31','system',NULL,NULL,43,NULL,NULL,NULL,NULL),(100,'4x - 2 = 3 (x + 1 ) ?',NULL,'9999-12-31','system',NULL,NULL,43,NULL,NULL,NULL,NULL),(101,'The substance which does not allow the current to flow is called',NULL,'9999-12-31','system',NULL,NULL,45,NULL,NULL,NULL,NULL),(102,'LED stands for',NULL,'9999-12-31','system',NULL,NULL,45,NULL,NULL,NULL,NULL),(103,'It is used in the extraction of metals from their ores',NULL,'9999-12-31','system',NULL,NULL,45,NULL,NULL,NULL,NULL),(104,'Distilled water is',NULL,'9999-12-31','system',NULL,NULL,45,NULL,NULL,NULL,NULL),(105,'The material which allows electric current to flow through them easily is called',NULL,'9999-12-31','system',NULL,NULL,45,NULL,NULL,NULL,NULL),(106,'Electric current produces',NULL,'9999-12-31','system',NULL,NULL,45,NULL,NULL,NULL,NULL),(107,'The passage of electric current through a conducting solution causes chemical reaction and is called',NULL,'9999-12-31','system',NULL,NULL,45,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_1`
--

DROP TABLE IF EXISTS `student_1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_1` (
  `student_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_1`
--

LOCK TABLES `student_1` WRITE;
/*!40000 ALTER TABLE `student_1` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subject` (
  `subject_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text,
  `student_id` int(11) NOT NULL,
  PRIMARY KEY (`subject_id`),
  KEY `student_id` (`student_id`),
  CONSTRAINT `subject_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject_1`
--

DROP TABLE IF EXISTS `subject_1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subject_1` (
  `subject_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `student_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject_1`
--

LOCK TABLES `subject_1` WRITE;
/*!40000 ALTER TABLE `subject_1` DISABLE KEYS */;
/*!40000 ALTER TABLE `subject_1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_answer`
--

DROP TABLE IF EXISTS `user_answer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_answer` (
  `user_id` int(11) NOT NULL,
  `exam_id` int(11) NOT NULL,
  `attempt` int(11) NOT NULL,
  `question_id` int(11) NOT NULL,
  `answer` varchar(255) DEFAULT NULL,
  `entryDateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`,`exam_id`,`attempt`,`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_answer`
--

LOCK TABLES `user_answer` WRITE;
/*!40000 ALTER TABLE `user_answer` DISABLE KEYS */;
INSERT INTO `user_answer` VALUES (12,12,0,1,'4444','2017-11-20 12:27:26'),(12,12,1,1,'3333','2017-11-10 17:03:42'),(18,1,0,1,'4','2017-11-13 13:48:06'),(18,1,0,2,'2','2017-11-13 13:45:34'),(18,1,0,3,'4','2017-11-13 13:46:59'),(18,1,0,4,'27','2017-11-13 13:48:31');
/*!40000 ALTER TABLE `user_answer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_data`
--

DROP TABLE IF EXISTS `user_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_data` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  `entryDate` date DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `phone` (`phone`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_data`
--

LOCK TABLES `user_data` WRITE;
/*!40000 ALTER TABLE `user_data` DISABLE KEYS */;
INSERT INTO `user_data` VALUES (18,'user-1','123456789','user_1@gmail.com',NULL,NULL),(19,'user-2','2222','user_2@gmail.com',NULL,NULL);
/*!40000 ALTER TABLE `user_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_entitlement`
--

DROP TABLE IF EXISTS `user_entitlement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_entitlement` (
  `user_id` int(11) NOT NULL,
  `password` varchar(255) NOT NULL,
  `entryDate` date DEFAULT NULL,
  UNIQUE KEY `user_id` (`user_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user_data` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_entitlement`
--

LOCK TABLES `user_entitlement` WRITE;
/*!40000 ALTER TABLE `user_entitlement` DISABLE KEYS */;
INSERT INTO `user_entitlement` VALUES (18,'111',NULL);
/*!40000 ALTER TABLE `user_entitlement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_exam`
--

DROP TABLE IF EXISTS `user_exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_exam` (
  `user_id` int(11) NOT NULL,
  `exam_id` int(11) NOT NULL,
  `completed` tinyint(4) DEFAULT '0',
  `exam_date` datetime DEFAULT NULL,
  `marks` varchar(45) DEFAULT NULL,
  `attempt` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`user_id`,`exam_id`,`attempt`),
  KEY `user_id_idx` (`user_id`),
  KEY `exam_id_idx` (`exam_id`),
  CONSTRAINT `exam_id` FOREIGN KEY (`exam_id`) REFERENCES `exam` (`exam_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `user_data_id` FOREIGN KEY (`user_id`) REFERENCES `user_data` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_exam`
--

LOCK TABLES `user_exam` WRITE;
/*!40000 ALTER TABLE `user_exam` DISABLE KEYS */;
INSERT INTO `user_exam` VALUES (18,1,0,NULL,NULL,0),(18,2,0,'2017-11-08 10:52:44','50',0),(18,3,0,'2017-11-20 12:27:27','73',1),(18,43,0,NULL,NULL,0),(18,45,0,NULL,NULL,0),(19,4,0,NULL,NULL,0);
/*!40000 ALTER TABLE `user_exam` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-29 16:37:55
