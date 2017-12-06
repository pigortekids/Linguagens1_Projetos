CREATE DATABASE  IF NOT EXISTS `bus_travel` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bus_travel`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: bus_travel
-- ------------------------------------------------------
-- Server version	8.0.3-rc-log

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
-- Table structure for table `tbl_clientes`
--

DROP TABLE IF EXISTS `tbl_clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_clientes` (
  `id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(45) DEFAULT NULL,
  `CPF` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_clientes`
--

LOCK TABLES `tbl_clientes` WRITE;
/*!40000 ALTER TABLE `tbl_clientes` DISABLE KEYS */;
INSERT INTO `tbl_clientes` VALUES (1,'Francisco','111.222.333-4'),(2,'Armando','222.333.444-5'),(3,'Julio','333.444.555-6');
/*!40000 ALTER TABLE `tbl_clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_reserva`
--

DROP TABLE IF EXISTS `tbl_reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_reserva` (
  `id_reserva` int(11) NOT NULL AUTO_INCREMENT,
  `id_trajeto` int(11) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_reserva`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_reserva`
--

LOCK TABLES `tbl_reserva` WRITE;
/*!40000 ALTER TABLE `tbl_reserva` DISABLE KEYS */;
INSERT INTO `tbl_reserva` VALUES (1,1,1),(2,2,1),(3,1,2),(4,1,3),(5,3,3),(6,3,1);
/*!40000 ALTER TABLE `tbl_reserva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_trajetos`
--

DROP TABLE IF EXISTS `tbl_trajetos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_trajetos` (
  `id_trajeto` int(11) NOT NULL AUTO_INCREMENT,
  `cid_origem` varchar(90) DEFAULT NULL,
  `cid_destino` varchar(90) DEFAULT NULL,
  `data` int(11) DEFAULT NULL,
  `assentos_vagos` int(11) DEFAULT NULL,
  `preco` double DEFAULT NULL,
  PRIMARY KEY (`id_trajeto`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_trajetos`
--

LOCK TABLES `tbl_trajetos` WRITE;
/*!40000 ALTER TABLE `tbl_trajetos` DISABLE KEYS */;
INSERT INTO `tbl_trajetos` VALUES (1,'Sao Paulo','Rio de Janeiro',1512554400,40,129),(2,'São Paulo','Campinas',1512574400,38,32),(3,'Blumenau','São Paulo',1512554400,48,177),(4,'São Paulo','Pedregulho',1512574400,32,72.32);
/*!40000 ALTER TABLE `tbl_trajetos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-06  1:36:43
