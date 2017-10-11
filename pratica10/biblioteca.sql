CREATE DATABASE  IF NOT EXISTS `biblioteca` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `biblioteca`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: biblioteca
-- ------------------------------------------------------
-- Server version	5.7.19-log

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
-- Table structure for table `tblemprestimo`
--

DROP TABLE IF EXISTS `tblemprestimo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblemprestimo` (
  `idemprestimo` int(11) NOT NULL AUTO_INCREMENT,
  `idusuario` int(11) DEFAULT NULL,
  `idlivro` int(11) DEFAULT NULL,
  `prazo` int(11) DEFAULT NULL,
  PRIMARY KEY (`idemprestimo`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblemprestimo`
--

LOCK TABLES `tblemprestimo` WRITE;
/*!40000 ALTER TABLE `tblemprestimo` DISABLE KEYS */;
INSERT INTO `tblemprestimo` VALUES (1,1,1,20),(2,1,2,20),(3,3,1,20),(4,4,5,20),(5,4,1,20),(6,2,1,20),(7,5,1,20),(8,3,2,20),(9,2,2,20),(10,1,7,20),(11,1,6,20),(12,2,8,20),(13,3,9,20);
/*!40000 ALTER TABLE `tblemprestimo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbllivro`
--

DROP TABLE IF EXISTS `tbllivro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbllivro` (
  `idlivro` int(11) NOT NULL AUTO_INCREMENT,
  `nome_livro` varchar(45) DEFAULT NULL,
  `isbn` varchar(45) DEFAULT NULL,
  `autor` varchar(45) DEFAULT NULL,
  `editora` varchar(45) DEFAULT NULL,
  `qtd` int(11) DEFAULT NULL,
  `disponiveis` int(11) DEFAULT NULL,
  PRIMARY KEY (`idlivro`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbllivro`
--

LOCK TABLES `tbllivro` WRITE;
/*!40000 ALTER TABLE `tbllivro` DISABLE KEYS */;
INSERT INTO `tbllivro` VALUES (1,'livro 1','1','autor 1','editora A',5,5),(2,'livro 2','2','autor 2','editora B',5,5),(3,'livro 3','3','autor 3','editora C',3,2),(4,'livro 4','4','autor 1','editora B',10,10),(5,'livro 5','5','autor 1','editora C',1,1),(6,'livro 6','6','autor 4','editora C',5,5),(7,'livro 7','7','autor 2','editora B',2,2),(8,'livro 8','8','autor 3','editora A',5,5),(9,'livro 9','9','autor 2','editora A',7,7),(10,'livro 10','10','autor 1','editora D',3,3);
/*!40000 ALTER TABLE `tbllivro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblusuarios`
--

DROP TABLE IF EXISTS `tblusuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblusuarios` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(80) DEFAULT NULL,
  `registro` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblusuarios`
--

LOCK TABLES `tblusuarios` WRITE;
/*!40000 ALTER TABLE `tblusuarios` DISABLE KEYS */;
INSERT INTO `tblusuarios` VALUES (1,'user 1','10'),(2,'user 2','20'),(3,'user 3','30'),(4,'user 4','40'),(5,'user 5','50'),(6,'user 6','60'),(7,'user 7','70');
/*!40000 ALTER TABLE `tblusuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-11  9:52:14
