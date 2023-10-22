
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
INSERT INTO `applicants` VALUES (1,'Elena','Nidelcu',19,'STUDENT','IT','cv1.pdf',4,'elena.nidelcu@isa.utm.md','060123456'),(2,'Ludmila','Friptu',20,'WORKING','EDUCATION','cv2.pdf',5,'friptu@gmail.com','060234567'),(3,'Nelli','Garbuz',18,'STUDENT','DESIGN','cv3.pdf',6,'nelly@dip.utm.md','060345678'),(4,'Robert','Oppenheimer',40,'WORKING','SPORT_BEAUTY_WELLNESS','cv4.pdf',10,'r.oppy@bomb.com','060456789'),(5,'Sherlock','Holmes',30,'UNEMPLOYED','FOOD','cv5.pdf',11,'holmes@gmail.com','060567890');
/*!40000 ALTER TABLE `applicants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `applications`
--

LOCK TABLES `applications` WRITE;
/*!40000 ALTER TABLE `applications` DISABLE KEYS */;
INSERT INTO `applications` VALUES (1,1,1,'2023-10-10','cv1.pdf','060123456','elena.nidelcu@isa.utm.md'),(2,2,2,'2023-10-11','cv2.pdf','060234567','friptu@gmail.com'),(3,3,3,'2023-10-12','cv3.pdf','060345678','nelly@dip.utm.md'),(4,4,4,'2023-10-13','cv4.pdf','060456789','r.oppy@bomb.com'),(5,5,5,'2023-10-14','cv5.pdf','060567890','holmes@gmail.com');
/*!40000 ALTER TABLE `applications` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `companies`
--

LOCK TABLES `companies` WRITE;
/*!40000 ALTER TABLE `companies` DISABLE KEYS */;
INSERT INTO `companies` VALUES (1,'IUCOSOFT','IT','We work in JAVA','060111111','email@iucosoft.com','img1.jpg'),(2,'ORATORICA','EDUCATION','Courses for learning new languages','060222222','oratorica@gmail.com','img2.jpg'),(3,'DECOR','DESIGN','Design for posters and wallpapers','060333333','mail@decor.md','img3.jpg'),(4,'TKD','SPORT_BEAUTY_WELLNESS','Taekwondo sport club','060444444','sport@tkd.com','img4.jpg'),(5,'Andy\'s Pizza','FOOD','Y\'all know what does our company =-)','060555555','andys.pizza@gmail.com','img5.jpg');
/*!40000 ALTER TABLE `companies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `programmes`
--

LOCK TABLES `programmes` WRITE;
/*!40000 ALTER TABLE `programmes` DISABLE KEYS */;
INSERT INTO `programmes` VALUES (1,'JAVA Developer','IT','2020-03-05','3 months',1,'Develop desktop apps','Know JAVA well','Work remotely','ONLINE',0),(2,'English teacher','EDUCATION','2016-07-09','2 months',2,'Teach children','C1 in English','Hiring after internship','Chisinau',0),(3,'Designer','DESIGN','2023-05-25','6 months',3,'Design personalised posters','Studii la UTM','Working with us','Chisinau',1),(4,'Coach','SPORT_BEAUTY_WELLNESS','2022-08-27','4 months',4,'Coach people','Maestru al Sportului','No benefits','Balti',1),(5,'Cook','FOOD','2021-02-14','5 weeks',5,'Boil eggs','No qualifications','Eat eggs','Cantemir',0);
/*!40000 ALTER TABLE `programmes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `recruiters`
--

LOCK TABLES `recruiters` WRITE;
/*!40000 ALTER TABLE `recruiters` DISABLE KEYS */;
INSERT INTO `recruiters` VALUES (1,'Brad','Pitt',2,4,'brad.pitt@tkd.md'),(2,'Quentin','Tarantino',3,5,'quentin.tarantino@andis.md'),(3,'Iurie','Corobceanu',7,1,'iurie@iucosoft.com'),(4,'Viorel','Bostan',8,2,'viorel.bostan@oratorica.com'),(5,'Hans','Landa',9,3,'hans.landa@decor.md');
/*!40000 ALTER TABLE `recruiters` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'munkatea','pass1','2008-07-04','ADMIN'),(2,'bradpitt','pass2','2020-04-14','RECRUITER'),(3,'qtarantino','pass3','2018-07-03','RECRUITER'),(4,'enidelcu','pass4','2021-12-02','APPLICANT'),(5,'ludmila','pass5','2010-01-31','APPLICANT'),(6,'gnelli','pass6','2017-10-15','APPLICANT'),(7,'iuco','pass7','2023-01-01','RECRUITER'),(8,'vbostan','pass8','2019-04-13','RECRUITER'),(9,'hlanda','pass9','2020-03-11','RECRUITER'),(10,'oppenheimer','pass10','2013-03-27','APPLICANT'),(11,'holmes','pass11','2009-05-31','APPLICANT');
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

-- Dump completed on 2023-10-20 20:16:29
