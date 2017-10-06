CREATE TABLE `exam` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `createdDate` date DEFAULT NULL,
  `deletedDate` date DEFAULT '9999-12-31',
  `createdBy` varchar(255) NOT NULL DEFAULT 'system',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

CREATE TABLE `question` (
  `id` int NOT NULL AUTO_INCREMENT,
  `body` text DEFAULT NULL,
  `createdDate` date DEFAULT NULL,
  `deletedDate` date DEFAULT '9999-12-31',
  `createdBy` varchar(255) NOT NULL DEFAULT 'system',
  `examId` int,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`examId`) REFERENCES `exam` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

CREATE TABLE `answer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `body` text DEFAULT NULL,
  `isCorrect` boolean not null DEFAULT 0,
  `createdDate` date DEFAULT NULL,
  `deletedDate` date DEFAULT '9999-12-31',
  `createdBy` varchar(255) NOT NULL DEFAULT 'system',
  `questionId` int,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`questionId`) REFERENCES `question` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;