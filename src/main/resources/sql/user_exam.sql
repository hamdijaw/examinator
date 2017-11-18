    ALTER TABLE `examinatordb`.`user_exam`
DROP FOREIGN KEY `exam_id`,
DROP FOREIGN KEY `user_data_id`;
ALTER TABLE `examinatordb`.`user_exam`
CHANGE COLUMN `user_id` `user_id` INT(11) NOT NULL ,
CHANGE COLUMN `exam_id` `exam_id` INT(11) NOT NULL ,
ADD PRIMARY KEY (`user_id`, `exam_id`);
ALTER TABLE `examinatordb`.`user_exam`
ADD CONSTRAINT `exam_id`
  FOREIGN KEY (`exam_id`)
  REFERENCES `examinatordb`.`exam` (`exam_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
ADD CONSTRAINT `user_data_id`
  FOREIGN KEY (`user_id`)
  REFERENCES `examinatordb`.`user_data` (`user_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;


CREATE TABLE `examinatordb`.`user_exam` (
  `user_id` INT NULL,
  `exam_id` INT NULL,
  INDEX `user_id_idx` (`user_id` ASC),
  INDEX `exam_id_idx` (`exam_id` ASC),
  CONSTRAINT `user_data_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `examinatordb`.`user_data` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `exam_id`
    FOREIGN KEY (`exam_id`)
    REFERENCES `examinatordb`.`exam` (`exam_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

    -- ALTER TABLE
    ALTER TABLE `examinatordb`.`user_exam`
    ADD COLUMN `completed` TINYINT(0) NULL DEFAULT 0 AFTER `exam_id`;
