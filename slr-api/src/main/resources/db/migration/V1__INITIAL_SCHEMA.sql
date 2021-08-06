-- MySQL dump 10.13  Distrib 5.7.20, for Linux (x86_64)
--
-- Host: localhost    Database: slr
-- ------------------------------------------------------
-- Server version	5.7.20

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
                        `id` bigint(20) NOT NULL AUTO_INCREMENT,
                        `code` varchar(45) NOT NULL,
                        `name` varchar(45) DEFAULT NULL,
                        PRIMARY KEY (`id`),
                        UNIQUE KEY `code_UNIQUE` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'ADMIN','ROLE_ADMIN');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
                        `id` bigint(20) NOT NULL AUTO_INCREMENT,
                        `code` varchar(45) NOT NULL,
                        `name` varchar(45) DEFAULT NULL,
                        `password` varchar(256) DEFAULT NULL,
                        `enabled` tinyint(4) DEFAULT NULL,
                        `expired_date` datetime DEFAULT NULL,
                        `credentials_expired_date` datetime DEFAULT NULL,
                        `account_non_locked` tinyint(4) DEFAULT NULL,
                        `login_status` tinyint(4) DEFAULT NULL,
                        `last_login` datetime DEFAULT NULL,
                        PRIMARY KEY (`id`),
                        UNIQUE KEY `code_UNIQUE` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;


--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','admin one','$2a$10$.hmsOoiCsIdnHdaTMZwtYOrMPuTpfgDcDoGykKZ7203Flv4M1gyXm',1,'2025-12-11 11:01:36','2025-12-11 11:01:36',1,1,'2019-01-08 05:34:29');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `link_user_role`
--

DROP TABLE IF EXISTS `link_user_role`;
CREATE TABLE `link_user_role` (
                                  `user_id` bigint(20) NOT NULL DEFAULT '0',
                                  `role_id` bigint(20) NOT NULL DEFAULT '0',
                                  PRIMARY KEY (`user_id`,`role_id`),
                                  KEY `fk_link_user_user_idx` (`role_id`),
                                  CONSTRAINT `cs_link_user_role` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
                                  CONSTRAINT `cs_link_user_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


LOCK TABLES `link_user_role` WRITE;
/*!40000 ALTER TABLE `link_user_role` DISABLE KEYS */;
INSERT INTO `link_user_role` VALUES (1,1);
/*!40000 ALTER TABLE `link_user_role` ENABLE KEYS */;
UNLOCK TABLES;

-- Dump completed on 2019-01-08 12:58:22