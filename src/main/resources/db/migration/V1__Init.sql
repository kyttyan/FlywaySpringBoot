CREATE SCHEMA `Apex` ;

CREATE TABLE `Apex`.`Clients` (
  `idClients` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idClients`));
