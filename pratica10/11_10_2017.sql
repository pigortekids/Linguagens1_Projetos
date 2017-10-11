CREATE DATABASE  IF NOT EXISTS `escola` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `escola`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: escola
-- ------------------------------------------------------
-- Server version	5.7.14

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
-- Temporary view structure for view `aluno_orientador`
--

DROP TABLE IF EXISTS `aluno_orientador`;
/*!50001 DROP VIEW IF EXISTS `aluno_orientador`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `aluno_orientador` AS SELECT 
 1 AS `aluno`,
 1 AS `idade`,
 1 AS `orientador`,
 1 AS `area`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `tblaluno`
--

DROP TABLE IF EXISTS `tblaluno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblaluno` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL,
  `ra` varchar(11) DEFAULT NULL,
  `idorientador` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblaluno`
--

LOCK TABLES `tblaluno` WRITE;
/*!40000 ALTER TABLE `tblaluno` DISABLE KEYS */;
INSERT INTO `tblaluno` VALUES (1,'Tiaguinho',30,'06.01431-3',2),(2,'Ramom',60,'0000',1),(3,'Batata',90,'1111',2),(4,'Batatinha',30,'2222',4),(5,'Batete',60,'333',3),(6,'Bititi',90,'44444',1);
/*!40000 ALTER TABLE `tblaluno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblorientador`
--

DROP TABLE IF EXISTS `tblorientador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblorientador` (
  `idorientador` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `area` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idorientador`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblorientador`
--

LOCK TABLES `tblorientador` WRITE;
/*!40000 ALTER TABLE `tblorientador` DISABLE KEYS */;
INSERT INTO `tblorientador` VALUES (1,'Everson','Comp'),(2,'Hugão','Google'),(3,'Furlan','Compiladores'),(4,'Aparecido','Aparecer');
/*!40000 ALTER TABLE `tblorientador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `aluno_orientador`
--

/*!50001 DROP VIEW IF EXISTS `aluno_orientador`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `aluno_orientador` AS select `a`.`nome` AS `aluno`,`a`.`idade` AS `idade`,`o`.`nome` AS `orientador`,`o`.`area` AS `area` from (`tblaluno` `a` join `tblorientador` `o` on((`a`.`idorientador` = `o`.`idorientador`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-11 11:05:39
CREATE DATABASE  IF NOT EXISTS `biblioteca` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `biblioteca`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: biblioteca
-- ------------------------------------------------------
-- Server version	5.7.14

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

-- Dump completed on 2017-10-11 11:05:39
CREATE DATABASE  IF NOT EXISTS `schemaxcola` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `schemaxcola`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: schemaxcola
-- ------------------------------------------------------
-- Server version	5.7.14

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
-- Table structure for table `tb_alugados`
--

DROP TABLE IF EXISTS `tb_alugados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_alugados` (
  `id_aluno` int(11) NOT NULL,
  `id_livro` varchar(45) NOT NULL,
  `prazo` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_alugados`
--

LOCK TABLES `tb_alugados` WRITE;
/*!40000 ALTER TABLE `tb_alugados` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_alugados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_alunos`
--

DROP TABLE IF EXISTS `tb_alunos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_alunos` (
  `id_aluno` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `idade` int(11) NOT NULL,
  `ra` varchar(45) NOT NULL,
  `id_prof` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_aluno`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_alunos`
--

LOCK TABLES `tb_alunos` WRITE;
/*!40000 ALTER TABLE `tb_alunos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_alunos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_livros`
--

DROP TABLE IF EXISTS `tb_livros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_livros` (
  `id_livro` int(11) NOT NULL AUTO_INCREMENT,
  `isbn` varchar(45) NOT NULL,
  `npaginas` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `disponiveis` int(11) NOT NULL,
  PRIMARY KEY (`id_livro`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_livros`
--

LOCK TABLES `tb_livros` WRITE;
/*!40000 ALTER TABLE `tb_livros` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_livros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_professores`
--

DROP TABLE IF EXISTS `tb_professores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_professores` (
  `id_prof` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `idade` int(11) NOT NULL,
  `registro` int(4) DEFAULT NULL,
  PRIMARY KEY (`id_prof`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_professores`
--

LOCK TABLES `tb_professores` WRITE;
/*!40000 ALTER TABLE `tb_professores` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_professores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_usuario`
--

DROP TABLE IF EXISTS `tb_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `registro` varchar(45) NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_usuario`
--

LOCK TABLES `tb_usuario` WRITE;
/*!40000 ALTER TABLE `tb_usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-11 11:05:39
