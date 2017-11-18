INSERT INTO `user_data` VALUES (18,'user-1','123456789','user_1@gmail.com',NULL,NULL);
INSERT INTO `user_data` VALUES (19,'user-2','987654321','user_2@gmail.com',NULL,NULL);
INSERT INTO `user_data` VALUES (20,'misbah','9898989898','misbah@gmail.com',NULL,NULL);

INSERT INTO `user_entitlement` VALUES (18,'111',NULL);
INSERT INTO `user_entitlement` VALUES (19,'111',NULL);
INSERT INTO `user_entitlement` VALUES (20,'111',NULL);

INSERT INTO `exam` VALUES (1,'Maths – Standard - 2',NULL,'9999-12-31','system',NULL),
(2,'Science-9',NULL,'9999-12-31','system',NULL);


INSERT INTO `question` VALUES (1,'2 + 3 ?',NULL,'9999-12-31','system',NULL,NULL,1),
(2,'6 – 4 ?',NULL,'9999-12-31','system',NULL,NULL,1),
(3,'12 / 3 ?',NULL,'9999-12-31','system',NULL,NULL,1),
(4,'7 X 4 ?',NULL,'9999-12-31','system',NULL,NULL,1),
(5,'What are Newton\'s laws?',NULL,'9999-12-31','system',NULL,NULL,2),
(6,'How much is \'g\'',NULL,'9999-12-31','system',NULL,NULL,2),
(7,'What is acceleration in uniform velocity?',NULL,'9999-12-31','system',NULL,NULL,2);

INSERT INTO `answer` VALUES (1,'5',1,NULL,'9999-12-31','system',NULL,NULL,1),
(2,'2',1,NULL,'9999-12-31','system',NULL,NULL,2),
(3,'4',1,NULL,'9999-12-31','system',NULL,NULL,3),
(4,'28',1,NULL,'9999-12-31','system',NULL,NULL,4);

insert into user_exam values (18, 1, 0, null, null, 0);
insert into user_exam values (18, 2, 0, null, null, 0);