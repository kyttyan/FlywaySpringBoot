CREATE TABLE `Apex`.`consultants` (
  `idConsultants` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `lastName` VARCHAR(45) NOT NULL,
  `age` INT NOT NULL,
  `clientId` INT NULL DEFAULT NULL,
  PRIMARY KEY (`idConsultants`));

