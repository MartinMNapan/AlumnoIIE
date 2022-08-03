-- MySQL Script generated by MySQL Workbench
-- Tue Aug  2 18:28:55 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema idat_agosto
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema idat_agosto
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `idat_agosto` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `idat_agosto` ;

-- -----------------------------------------------------
-- Table `idat_agosto`.`alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `idat_agosto`.`alumno` (
  `id_alumno` INT NOT NULL AUTO_INCREMENT,
  `apellido` VARCHAR(255) NULL DEFAULT NULL,
  `nombre` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id_alumno`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `idat_agosto`.`aula`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `idat_agosto`.`aula` (
  `id_aula` INT NOT NULL AUTO_INCREMENT,
  `aula` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id_aula`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `idat_agosto`.`detalle_aula`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `idat_agosto`.`detalle_aula` (
  `id_aula` INT NOT NULL,
  `id_alumno` INT NOT NULL,
  UNIQUE INDEX `UK_cv0xt6d7377xahyiidmclhgjv` (`id_aula` ASC) VISIBLE,
  UNIQUE INDEX `UK_n6qyc8qoeh4ihy07wj2qqeh9y` (`id_alumno` ASC) VISIBLE,
  CONSTRAINT `FKbxrojt06aohtt9ssamrjq55ym`
    FOREIGN KEY (`id_aula`)
    REFERENCES `idat_agosto`.`aula` (`id_aula`),
  CONSTRAINT `FKdu9ec43vv6lh2ob7amtmhne1w`
    FOREIGN KEY (`id_alumno`)
    REFERENCES `idat_agosto`.`alumno` (`id_alumno`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;