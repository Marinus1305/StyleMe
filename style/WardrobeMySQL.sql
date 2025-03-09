-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema wardrobe
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema wardrobe
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `wardrobe` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `wardrobe` ;

-- -----------------------------------------------------
-- Table `wardrobe`.`colour`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `wardrobe`.`colour` (
  `CoId` INT NOT NULL,
  `colour` VARCHAR(45) NOT NULL,
  `colour_code` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`CoId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `wardrobe`.`item_detail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `wardrobe`.`item_detail` (
  `ItemId` INT NOT NULL AUTO_INCREMENT,
  `ItemDes` VARCHAR(100) NOT NULL,
  `ItemType` VARCHAR(45) NOT NULL,
  `ItemBrand` VARCHAR(100) NOT NULL,
  `Itemcolour` VARCHAR(45) NOT NULL,
  `ItemWear` INT NOT NULL,
  `ItemBuyDate` VARCHAR(45) NOT NULL,
  `ItemPhoto` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`ItemId`),
  INDEX `item Type_idx` (`ItemType` ASC) VISIBLE,
  INDEX `itemcolour_idx` (`Itemcolour` ASC) VISIBLE,
  INDEX `cloth type_idx` (`ItemDes` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 66
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `wardrobe`.`item_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `wardrobe`.`item_type` (
  `Cid` INT NOT NULL AUTO_INCREMENT,
  `cloth_type` VARCHAR(45) NOT NULL,
  `cloth_code` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Cid`),
  INDEX `clothType` (`cloth_type` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `wardrobe`.`outfit_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `wardrobe`.`outfit_type` (
  `Oid` INT NOT NULL AUTO_INCREMENT,
  `Owear` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Oid`),
  INDEX `Owear` (`Owear` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `wardrobe`.`user_detail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `wardrobe`.`user_detail` (
  `Pid` INT NOT NULL AUTO_INCREMENT,
  `Pname` VARCHAR(300) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  `photoName` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`Pid`))
ENGINE = InnoDB
AUTO_INCREMENT = 14
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
