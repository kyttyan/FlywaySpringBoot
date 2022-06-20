use Apex;
ALTER TABLE `Apex`.`consultants` ADD COLUMN `phone` VARCHAR(45) NULL AFTER `name`;

CREATE TABLE `Apex`.`consultants2` (
  `idConsultants` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `lastName` VARCHAR(45) NOT NULL,
  `age` INT NOT NULL,
  `clientId` INT NULL DEFAULT NULL,
  PRIMARY KEY (`idConsultants`));

INSERT INTO `Apex`.`clients` VALUES (1, "contact@ibm.com", "IBM");
INSERT INTO `Apex`.`clients` VALUES (2, "contact@microsoft.com", "Microsoft");
INSERT INTO `Apex`.`clients` VALUES (3, "contact@walmart.com", "Walmart");
