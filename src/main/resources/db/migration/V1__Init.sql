CREATE DATABASE IF NOT EXISTS `Apex` ;

CREATE TABLE `Apex`.`clients` (
  `idClients` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idClients`));
