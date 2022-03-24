CREATE DATABASE  IF NOT EXISTS `ecole_primaire` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ecole_primaire`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: ecole_primaire
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `classe`
--

DROP TABLE IF EXISTS `classe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `classe` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nom` varchar(64) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classe`
--

LOCK TABLES `classe` WRITE;
/*!40000 ALTER TABLE `classe` DISABLE KEYS */;
INSERT INTO `classe` VALUES (1,'6° A'),(2,'6° B'),(3,'6° C'),(4,'5 ° A'),(5,'5° B'),(6,'5°C'),(7,'4°A'),(8,'4° B'),(9,'4° C'),(10,'3° A'),(11,'3° B'),(12,'3° F');
/*!40000 ALTER TABLE `classe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eleve`
--

DROP TABLE IF EXISTS `eleve`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `eleve` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nom` varchar(64) NOT NULL,
  `prenom` varchar(64) NOT NULL,
  `classe_fk` int(11) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `eleve_classe_fk_idx` (`classe_fk`),
  CONSTRAINT `eleve_classe_fk` FOREIGN KEY (`classe_fk`) REFERENCES `classe` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eleve`
--

LOCK TABLES `eleve` WRITE;
/*!40000 ALTER TABLE `eleve` DISABLE KEYS */;
INSERT INTO `eleve` VALUES (1,'EMERUSABE','Cyrille',1),(2,'GATORE','Angelo',1),(3,'HABONIMANA','Thomas',1),(4,'HERERIMANA','Olivier',2),(5,'IKAZE','Dylan',2),(6,'ININAHAZWE','Benoit',3),(7,'IRACANYE','Yann',3),(8,'IRAKOZE','Morgane',4),(9,'NSHIMIRIMANA','Yanninck',4),(10,'NIYONGERE','Didier',4),(11,'IRAKOZE','Bob',5),(12,'IRAKIZA','Marie',5),(13,'MUKIZA','Séverine',6),(14,'RUKUNDO','Manuela',6),(15,'NTABIRIHO','Jérôme',6),(16,'MAJAMBERE','Mathieu',7),(17,'NDAGIJIMANA','Cécile',7),(18,'BUBUTE','Armel',7),(19,'NKESHIMANA','Pascal',8),(20,'MUGISHA','Paul',8),(21,'MUNEZERO','Amandine',8),(22,'KARENZO','Bahija',9),(23,'MINANI','Feti',9),(24,'KAMENGE','Erwan',9),(25,'NINTUNZE','Fernand',10),(26,'KWIZERA','Aline',10),(27,'BUKURU','Thérèse',10),(28,'BIRIHO','Gérald',11),(29,'NDUWIMANA','Albert',11),(30,'NIYONGABO','Toufic',11),(31,'NIJIMBERE','Nadia',12),(32,'NDAYISENGA','Valérie',12);
/*!40000 ALTER TABLE `eleve` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `matiere`
--

DROP TABLE IF EXISTS `matiere`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `matiere` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nom` varchar(64) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matiere`
--

LOCK TABLES `matiere` WRITE;
/*!40000 ALTER TABLE `matiere` DISABLE KEYS */;
INSERT INTO `matiere` VALUES (1,'Mathématiques'),(2,'Français'),(3,'Anglais'),(4,'Physique'),(5,'Biologie'),(6,'Sport'),(7,'Chinois2');
/*!40000 ALTER TABLE `matiere` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `professeur`
--

DROP TABLE IF EXISTS `professeur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `professeur` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nom` varchar(64) NOT NULL,
  `prenom` varchar(64) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `professeur`
--

LOCK TABLES `professeur` WRITE;
/*!40000 ALTER TABLE `professeur` DISABLE KEYS */;
INSERT INTO `professeur` VALUES (1,'AKIMANA','Daniel'),(2,'MAMOU','Daniel'),(3,'BUGOFORI','Jacques'),(4,'NTAVYO','Bader'),(5,'N\'GOMA','Jean Marie'),(6,'N\'GOMA','Kernel'),(7,'MUHIRWE','Cassien'),(8,'NDUSHWE','Mark 2'),(10,'NIRAGIRA','FERDINAND'),(11,'Havyarmana','Juvénal');
/*!40000 ALTER TABLE `professeur` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utulisateur`
--

DROP TABLE IF EXISTS `utulisateur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `utulisateur` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `email` varchar(64) NOT NULL,
  `password` varchar(64) NOT NULL,
  `role` varchar(64) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utulisateur`
--

LOCK TABLES `utulisateur` WRITE;
/*!40000 ALTER TABLE `utulisateur` DISABLE KEYS */;
INSERT INTO `utulisateur` VALUES (7,'juve@gmail.com','12345678','eleve');
/*!40000 ALTER TABLE `utulisateur` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-24 11:04:48
