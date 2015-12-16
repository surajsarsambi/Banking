CREATE DATABASE  IF NOT EXISTS `bankingdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bankingdb`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: bankingdb
-- ------------------------------------------------------
-- Server version	5.6.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `balancesheet`
--

DROP TABLE IF EXISTS `balancesheet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `balancesheet` (
  `Id` int(100) NOT NULL AUTO_INCREMENT,
  `Date` varchar(15) DEFAULT NULL,
  `AccountNumber` int(11) NOT NULL,
  `Mode` varchar(10) DEFAULT NULL,
  `Deposit` int(11) DEFAULT NULL,
  `Debit` int(11) DEFAULT NULL,
  `Balance` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `balancesheet`
--

LOCK TABLES `balancesheet` WRITE;
/*!40000 ALTER TABLE `balancesheet` DISABLE KEYS */;
/*!40000 ALTER TABLE `balancesheet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chequedetails`
--

DROP TABLE IF EXISTS `chequedetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chequedetails` (
  `AccountNumber` int(11) NOT NULL,
  `ChequeNumber` varchar(80) NOT NULL,
  `Amount` int(11) DEFAULT NULL,
  `Date` varchar(45) DEFAULT NULL,
  `BankName` varchar(45) DEFAULT NULL,
  `SenderAccountNumber` int(11) DEFAULT NULL,
  PRIMARY KEY (`ChequeNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chequedetails`
--

LOCK TABLES `chequedetails` WRITE;
/*!40000 ALTER TABLE `chequedetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `chequedetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customerinfo`
--

DROP TABLE IF EXISTS `customerinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customerinfo` (
  `AccountNumber` int(11) NOT NULL,
  `Name` varchar(80) NOT NULL,
  `PhoneNumber` varchar(20) DEFAULT NULL,
  `DOB` varchar(15) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `District` varchar(30) DEFAULT NULL,
  `State` varchar(20) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `MaritalStatus` varchar(10) DEFAULT NULL,
  `MotherName` varchar(80) DEFAULT NULL,
  `FatherName` varchar(80) DEFAULT NULL,
  `Balance` int(11) DEFAULT NULL,
  `Image` mediumblob,
  `DateOfAccountCreation` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`AccountNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customerinfo`
--

LOCK TABLES `customerinfo` WRITE;
/*!40000 ALTER TABLE `customerinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `customerinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `draft`
--

DROP TABLE IF EXISTS `draft`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `draft` (
  `DraftNumber` int(11) NOT NULL,
  `AccountNumber` int(11) NOT NULL,
  `InFavourOf` varchar(100) DEFAULT NULL,
  `Date` varchar(15) DEFAULT NULL,
  `Amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`DraftNumber`,`AccountNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `draft`
--

LOCK TABLES `draft` WRITE;
/*!40000 ALTER TABLE `draft` DISABLE KEYS */;
/*!40000 ALTER TABLE `draft` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fixeddeposit`
--

DROP TABLE IF EXISTS `fixeddeposit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fixeddeposit` (
  `FDNumber` int(11) NOT NULL,
  `AccountNumber` int(11) NOT NULL,
  `Mode` varchar(10) DEFAULT NULL,
  `Amount` int(11) DEFAULT NULL,
  `Period` int(11) DEFAULT NULL,
  `Interest` int(11) DEFAULT NULL,
  `Date` varchar(15) DEFAULT NULL,
  `TotalAmount` int(11) DEFAULT NULL,
  PRIMARY KEY (`FDNumber`,`AccountNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fixeddeposit`
--

LOCK TABLES `fixeddeposit` WRITE;
/*!40000 ALTER TABLE `fixeddeposit` DISABLE KEYS */;
/*!40000 ALTER TABLE `fixeddeposit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `ID` int(11) NOT NULL,
  `Username` varchar(80) NOT NULL,
  `Password` varchar(80) NOT NULL,
  `Access` varchar(80) NOT NULL,
  PRIMARY KEY (`ID`,`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `misc`
--

DROP TABLE IF EXISTS `misc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `misc` (
  `ID` int(11) NOT NULL,
  `State` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `misc`
--

LOCK TABLES `misc` WRITE;
/*!40000 ALTER TABLE `misc` DISABLE KEYS */;
INSERT INTO `misc` VALUES (1,'Uttar Pradesh'),(2,'Maharashtra'),(3,'Bihar'),(4,'West Bengal'),(5,'Madhya Pradesh'),(6,'Tamil Nadu'),(7,'Rajasthan'),(8,'Karnataka'),(9,'Gujarat'),(10,'Andhra Pradesh'),(11,'Odisha'),(12,'Telangana'),(13,'Kerala'),(14,'Jharkhand'),(15,'Assam'),(16,'Punjab'),(17,'Chhattisgarh'),(18,'Haryana'),(19,'Jammu and Kashmir'),(20,'Uttarakhand'),(21,'Himachal Pradesh'),(22,'Tripura'),(23,'Meghalaya'),(24,'Manipur'),(25,'Nagaland'),(26,'Goa'),(27,'Arunachal Pradesh'),(28,'Mizoram'),(29,'Sikkim'),(30,'Delhi'),(31,'Puducherry'),(32,'Chandigarh'),(33,'Andaman and Nicobar Islands'),(34,'Dadra and Nagar Haveli'),(35,'Daman and Diu'),(36,'Lakshadweep');
/*!40000 ALTER TABLE `misc` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-03-04 15:38:52
