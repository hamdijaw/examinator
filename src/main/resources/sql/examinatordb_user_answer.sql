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
-- Table structure for table `user_answer`
--

CREATE TABLE `examinatordb`.`user_answer` (
  `user_id` INT NOT NULL,
  `exam_id` INT NOT NULL,
  `attempt` INT NOT NULL,
  `question_id` INT NOT NULL,
  `answer` VARCHAR(255) NULL,
  `entryDateTime` DATETIME NULL,
  PRIMARY KEY (`user_id`, `exam_id`, `attempt`, `question_id`));


DROP TABLE IF EXISTS `user_answer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_answer` (
  `user_id` int(11) NOT NULL,
  `exam_id` int(11) NOT NULL,
  `question_id` int(11) NOT NULL,
  `answer` varchar(255) NOT NULL,
  `entryDate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_answer`
--

-- 10-Nov-2017
CREATE TABLE `examinatordb`.`user_answer` (
  `user_id` INT NOT NULL,
  `exam_id` INT NOT NULL,
  `attempt` INT NOT NULL,
  `question_id` INT NOT NULL,
  `answer` VARCHAR(255) NULL,
  PRIMARY KEY (`user_id`, `exam_id`, `attempt`, `question_id`));

  ALTER TABLE `examinatordb`.`user_answer`
  ADD COLUMN `entryDateTime` DATETIME NULL AFTER `answer`;

-------------------------------------------------------
LOCK TABLES `user_answer` WRITE;
/*!40000 ALTER TABLE `user_answer` DISABLE KEYS */;
INSERT INTO `user_answer` VALUES (18,1,1,'Answer-1',NULL),(18,1,2,'Answer-2',NULL),(12,12,1,'1111111',NULL),(12,12,1,'1111111',NULL),(18,1,4,'28',NULL),(18,1,4,'1',NULL),(18,1,4,'4',NULL),(18,1,4,'5',NULL),(18,1,4,'28',NULL),(18,1,4,'1',NULL),(18,1,4,'5',NULL),(18,1,4,'4',NULL),(18,1,4,'78',NULL),(18,1,4,'4',NULL),(18,1,4,'two',NULL),(18,1,4,'5',NULL),(18,1,1,'five',NULL),(18,1,4,'twenty eight',NULL),(18,1,2,'two',NULL),(18,1,1,'five',NULL),(18,1,4,'2-8',NULL),(18,1,2,'2222',NULL),(18,1,2,'2222',NULL),(18,1,2,'2222',NULL),(18,1,1,'555',NULL),(18,1,2,'2222',NULL),(18,1,2,'2222',NULL),(18,1,2,'2222',NULL),(18,1,1,'5555',NULL),(18,1,3,'4',NULL),(18,1,2,'2222',NULL),(18,1,2,'2222',NULL),(18,1,2,'2',NULL),(18,1,1,'1',NULL),(18,1,1,'112',NULL),(18,1,4,'111',NULL),(18,1,2,'2222',NULL),(18,1,3,'5555',NULL),(18,1,2,'2222',NULL),(18,1,4,'111',NULL),(18,1,2,'2222',NULL),(18,1,3,'5555',NULL),(18,1,2,'2222',NULL),(18,1,4,'111',NULL),(18,1,2,'2222',NULL),(18,1,3,'5555',NULL),(18,1,3,'5555',NULL),(18,1,2,'2222',NULL),(18,1,4,'111',NULL),(18,1,2,'2222',NULL),(18,1,3,'5555',NULL),(18,1,3,'5555',NULL),(18,1,2,'2222',NULL),(18,1,4,'111',NULL),(18,1,2,'2222',NULL),(18,1,3,'5555',NULL),(18,1,3,'5555',NULL),(18,1,2,'2222',NULL),(18,1,4,'111',NULL),(18,1,2,'2222',NULL),(18,1,3,'5555',NULL),(18,1,3,'5555',NULL),(18,1,2,'2222',NULL),(18,1,4,'111',NULL),(18,1,2,'2222',NULL),(18,1,3,'5555',NULL),(18,1,4,'28',NULL),(18,1,3,'444',NULL),(18,1,2,'11',NULL),(18,1,3,'',NULL);
/*!40000 ALTER TABLE `user_answer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


ALTER TABLE `examinatordb`.`user_answer`
CHANGE COLUMN `entryDate` `entryDate` DATETIME NULL DEFAULT NULL ;
ALTER TABLE `examinatordb`.`user_answer`
CHANGE COLUMN `entryDate` `entry_date` DATETIME NULL DEFAULT NULL ;


-- Dump completed on 2017-11-06 11:19:59
