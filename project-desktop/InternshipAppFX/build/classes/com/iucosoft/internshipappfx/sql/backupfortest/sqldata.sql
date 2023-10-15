USE `practicatest`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: practica
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Dumping data for table `applicants`
--

LOCK TABLES `applicants` WRITE;
/*!40000 ALTER TABLE `applicants` DISABLE KEYS */;
INSERT INTO `applicants` VALUES (1,'a1','ap1',20,'STUDENT','DESIGN','cvFile1',2,'a@gmail.com','03203985'),(2,'a2','ap2',20,'STUDENT','DESIGN','cvFile2',3,'a@gmail.com','03203985'),(3,'a2','ap2',20,'STUDENT','DESIGN','cvFile2',4,'a@gmail.com','03203985'),(4,'applicant1','surname1',20,'STUDENT','DESIGN','cvFile1',18,'a1@gmail.com','94376-2983'),(5,'applicant2','surname2',20,'UNEMPLOYED','IT','cvFile2',20,'a1@gmail.com','94376-2983');
/*!40000 ALTER TABLE `applicants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `applications`
--

LOCK TABLES `applications` WRITE;
/*!40000 ALTER TABLE `applications` DISABLE KEYS */;
/*!40000 ALTER TABLE `applications` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `companies`
--

LOCK TABLES `companies` WRITE;
/*!40000 ALTER TABLE `companies` DISABLE KEYS */;
INSERT INTO `companies` VALUES (2,'t3','EDUCATION','about3','203984567','c3@gmail.com',NULL),
                            (3,'t2','EDUCATION','about3','203984567','c3@gmail.com',NULL),
                            (4,'comp1','DESIGN','good company','129348765','comp1@example.com',NULL),
                            (11,'comp9','DESIGN','good company','129348765','comp1@example.com',NULL),
                            (12,'comp10','DESIGN','good company','129348765','comp1@example.com',NULL),
                            (13,'comp11','DESIGN','good company','129348765','comp1@example.com',NULL),
                            (14,'comp12','DESIGN','good company','129348765','comp1@example.com',NULL),
                            (15,'comp13','DESIGN','good company','129348765','comp1@example.com',NULL),
                            (16,'company99','DESIGN','lakjsdbva','PHONE_NUMBER','email@gmail.com',NULL),
                            (17,'comp15','DESIGN','good company','129348765','comp1@example.com',NULL),
                            (18,'comp70','DESIGN','kjahrg','PHONE_NUMBER','email@gmail.com',NULL),
                            (19,'company-title1','DESIGN','good company 1','203985723','company1@example.com','img.img');
/*!40000 ALTER TABLE `companies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `programmes`
--

LOCK TABLES `programmes` WRITE;
/*!40000 ALTER TABLE `programmes` DISABLE KEYS */;
/*!40000 ALTER TABLE `programmes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `recruiters`
--

LOCK TABLES `recruiters` WRITE;
/*!40000 ALTER TABLE `recruiters` DISABLE KEYS */;
INSERT INTO `recruiters` VALUES (12,'Vasile','Rotaru',12,14,'vr@example.com'),(13,'Vasile1','Rotaru1',13,15,'vr@example.com'),(14,'Vasile2','Rotaru2',14,17,'vr2@example.com'),(15,'Munteanu','Ecaterina',22,19,'ecaterina@gmail.com');
/*!40000 ALTER TABLE `recruiters` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'username1','password1','2023-12-12',''),(2,'username3','password1','2023-12-12',''),(3,'username2','password2','2023-12-12',''),(4,'username4','password2','2023-12-12',''),(7,'user9','passw5','2023-12-24',''),(9,'user10','passw5','2023-12-24',''),(11,'user11','passw5','2023-12-24',''),(12,'user12','passw5','2023-12-24',''),(13,'user13','passw5','2023-12-24',''),(14,'user14','password6','2023-10-12','RECRUITER'),(18,'user15','p1','2023-10-12','APPLICANT'),(20,'user16','p2','2023-10-12','APPLICANT'),(22,'user17','p3','2023-10-12','RECRUITER');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-13 16:25:20
