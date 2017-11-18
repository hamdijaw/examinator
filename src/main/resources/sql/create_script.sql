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
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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

DROP TABLE IF EXISTS `user_answer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `examinatordb`.`user_answer` (
  `user_id` INT NOT NULL,
  `exam_id` INT NOT NULL,
  `attempt` INT NOT NULL,
  `question_id` INT NOT NULL,
  `answer` VARCHAR(255) NULL,
  `entryDateTime` DATETIME NULL,
  PRIMARY KEY (`user_id`, `exam_id`, `attempt`, `question_id`));


ALTER TABLE `examinatordb`.`user_answer`
CHANGE COLUMN `entryDate` `entryDate` DATETIME NULL DEFAULT NULL ;
ALTER TABLE `examinatordb`.`user_answer`
CHANGE COLUMN `entryDate` `entry_date` DATETIME NULL DEFAULT NULL ;

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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
 -- KEY `examId` (`examId`),
  KEY `exam_id` (`exam_id`),
  CONSTRAINT `question_ibfk_1` FOREIGN KEY (`exam_id`) REFERENCES `exam` (`exam_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `user_exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_exam` (
  `user_id` int(11) NOT NULL,
  `exam_id` int(11) NOT NULL,
  `completed` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`user_id`,`exam_id`),
  KEY `user_id_idx` (`user_id`),
  KEY `exam_id_idx` (`exam_id`),
  CONSTRAINT `exam_id` FOREIGN KEY (`exam_id`) REFERENCES `exam` (`exam_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `user_data_id` FOREIGN KEY (`user_id`) REFERENCES `user_data` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

ALTER TABLE `examinatordb`.`user_exam`
ADD COLUMN `exam_date` DATETIME NULL AFTER `completed`,
ADD COLUMN `marks` VARCHAR(45) NULL AFTER `exam_date`;

ALTER TABLE `examinatordb`.`user_exam`
ADD COLUMN `attempt` INT NULL DEFAULT 0 AFTER `marks`;

ALTER TABLE `examinatordb`.`user_exam`
CHANGE COLUMN `attempt` `attempt` INT(11) NOT NULL DEFAULT '0' ,
DROP PRIMARY KEY,
ADD PRIMARY KEY (`user_id`, `exam_id`, `attempt`);