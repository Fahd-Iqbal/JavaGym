-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: javagym
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dailyworkout`
--

DROP TABLE IF EXISTS `dailyworkout`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dailyworkout` (
  `dailyWorkoutId` int(11) NOT NULL AUTO_INCREMENT,
  `day` int(11) NOT NULL,
  `BodypartBack` varchar(45) DEFAULT NULL,
  `BodypartChest` varchar(45) DEFAULT NULL,
  `BodypartTriceps` varchar(45) DEFAULT NULL,
  `BodypartLegs` varchar(45) DEFAULT NULL,
  `BodypartBiceps` varchar(45) DEFAULT NULL,
  `BodypartCore` varchar(45) DEFAULT NULL,
  `BodypartShoulders` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`dailyWorkoutId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dailyworkout`
--

LOCK TABLES `dailyworkout` WRITE;
/*!40000 ALTER TABLE `dailyworkout` DISABLE KEYS */;
INSERT INTO `dailyworkout` VALUES (1,0,'BACK001,BACK002,BACK004',NULL,NULL,NULL,'Bicep001,Bicep004',NULL,NULL),(2,0,'BACK003,BACK005,BACK006',NULL,NULL,NULL,'Bicep002,Bicep003',NULL,NULL),(3,1,'Chest001,Chest003,Chest005',NULL,NULL,NULL,'Tricept002',NULL,NULL);
/*!40000 ALTER TABLE `dailyworkout` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-26 22:42:29
