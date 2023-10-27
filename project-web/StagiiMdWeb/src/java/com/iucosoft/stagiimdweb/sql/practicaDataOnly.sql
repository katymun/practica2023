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
INSERT INTO `companies` VALUES (1,'IUCOSOFT','IT','We work in JAVA','060111111','email@iucosoft.com','img1.jpg'),(2,'ORATORICA','EDUCATION','Courses for learning new languages','060222222','oratorica@gmail.com','img2.jpg'),(3,'DECOR','DESIGN','Design for posters and wallpapers','060333333','mail@decor.md','img3.jpg'),(4,'TKD','SPORT_BEAUTY_WELLNESS','Taekwondo sport club','060444444','sport@tkd.com','img4.jpg'),(5,'Andy\'s Pizza','FOOD','Y\'all know what does our company =-)','060555555','andys.pizza@gmail.com','img5.jpg'),(6,'Farmacia Felicia','MEDICINE','Just a pharmacy','060666666','felicia@gmail.com','img6.jpg'),(7,'Endava','IT','We work closely with you to understand your challenges, the demands the market is making on your organisation and design, build, operate and support.','060777777','endava@gmail.com','img7.jpg'),(8,'Orange','IT','Conectează Fibră + TV Acasă și primești un Televizor Smart cadou sau 1200 lei reducere la factură.','060888888','orange@gmail.com','img8.jpg'),(9,'Home Italy','DESIGN','Companie de design interior','060999999','home.italy@gmail.com','img9.jpg'),(10,'Atmosfera Design Studio','DESIGN','The mission of our company is to create spaces with a unique design combined with modern technology. ','060000000','ads@gmail.com','img10.jpg'),(11,'Purple','MARKETING','Hello! Suntem Purple - agenție de digital marketing în','068000000','purple@gmail.com','img11.jpg'),(12,'Identi','MARKETING','Originally founded in the United Kingdom, identi is a performance marketing company which helps its partners acquire, engage and convert users through large-scale digital marketing campaigns.','068111111','identy@gmail.com','img12.jpg'),(13,'Sitra','MANAGEMENT','SITRA GROUP is an international transport company with more than half a century of success delivering foodstuff all over Europe.','068222222','sitra@gmail.com','img13.jpg'),(14,'Sales Management Association','MANAGEMENT','Here you can find all types of management','068333333','sma@gmail.com','img14.jpg'),(15,'KUB.MD','MARKETING','KUB.MD se ocupă cu comercializarea angro și cu amănuntul a unei game largi (peste cinsprezece mii de articole) de accesorii, căști și dispozitive pentru o varietate de gadget-uri moderne.','068444444','kub@gmail.com','img15.jpg'),(16,'Mantis','MANAGEMENT','Agentia de recrutare \"Mantis\" a fost deschisa la Chisinau in anul 2010 la solicitarea clientilor paginii web Rabota.md, care aveau nevoie de serviciile de recrutare si selectie de personal.','068555555','mantis@gmail.com','img16.jpg');
/*!40000 ALTER TABLE `companies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `programmes`
--

LOCK TABLES `programmes` WRITE;
/*!40000 ALTER TABLE `programmes` DISABLE KEYS */;
INSERT INTO `programmes` VALUES (1,'JAVA Developer','IT','2020-03-05','3 months',1,'Develop desktop apps','Know JAVA well','Work remotely','ONLINE',0),
(2,'English teacher','EDUCATION','2016-07-09','2 months',2,'Teach children','C1 in English','Hiring after internship','Chisinau',0),
(3,'Designer','DESIGN','2023-05-25','6 months',3,'Design personalised posters','Studii la UTM','Working with us','Chisinau',1),
(4,'Coach','SPORT_BEAUTY_WELLNESS','2022-08-27','4 months',4,'Coach people','Maestru al Sportului','No benefits','Balti',1),
(5,'Cook','FOOD','2021-02-14','5 weeks',5,'Boil eggs','No qualifications','Eat eggs','Cantemir',0),
(6,'Manager Dezvoltare Vanzari','MANAGEMENT','2024-01-01','2 months',16,'Accelerarea creșterii vânzărilor și a profitului','No qualifications','Salariu atractiv + KPI','Chisinau',0),
(7,'Key Account Sales Manager','MANAGEMENT','2024-02-20','6 months',16,'Vânzarea produselor și serviciilor financiare ale companiei','University','Grafic de lucru flexibil','REMOTE',0),(8,'Account Manager','MANAGEMENT','2023-12-02','7 days',14,'Trebuie sa fii manager la contabilitate','No qualifications','No benefits, don\'t work here','Comrat',1),(9,'Manager de vânzări','MANAGEMENT','2023-12-31','6 weeks',13,'Trebuie doar sa te faci ca lucrezi','No qualifications','Nimeni nu va striga la tine (speram)','Truseni',0),(10,'Data Scientist','IT','2024-12-02','5 months',7,'Analyze raw data: assessing quality, cleansing, structuring for downstream processing','Bachelor\'s degree','Performance bonus programs','Chisinau',1),(11,'.NET Developer','IT','2024-03-27','1 year',7,'You will be working directly with us with all the benefits of an international experience with all the professional growth potentialities that it brings.','A LOOOT OF EXPERIENCEEE','Parking place','Chisinau',1),(12,'Front End Developer','IT','2023-12-18','3 months',8,'Will work with business analysts to determine acceptance tests.','Minimum 2+ years experience in Software Development','EU Travel opportunities','Causeni',0),(13,'Designer graphic','DESIGN','2024-05-12','3 months',9,'Crearea de conținut vizual pentru conturile de pe rețelele sociale','Portfolio','Oficiu modern situat pe str. Lev Tolstoi 3/1','ONLINE',1),(14,'Designer','DESIGN','2023-12-09','8 weeks',9,'URAAA, no duties','Studii superioare','Bon de masă','ONLINE',1),(15,'Presentation Designer','DESIGN','2024-01-02','8 weeks',10,'Create visually appealing, meaningful and contextual presentations','Studii superioare in Design','Benefits','REMOTE',0),(16,'Asistent Specialist Marketing','MARKETING','2025-04-12','1000 years',15,'Asistenta in administrarea Site-lui, si a paginii TikTok/Instagram','Studii finalizate sau in curs','Lucru Part-time','Soroca',0),(17,'Specialist Comunicare Marketing','MARKETING','2024-07-21','3 months',12,'Scriere de articole de marketing, slogane de publicitate și texte promoționale cu scopul promovării strategiilor și produselor Companiei','Studii superioare','Sediu în centrul orașului Chișinău','Chisinau',0),(18,'Sef Secția marketing','MARKETING','2024-10-25','1 month',11,'Lansarea produslui nou, plan de marketing','Studii superioare (finanțe, marketing)','Salariu competitiv','Cahul',0);
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

-- Dump completed on 2023-10-25 22:08:38
