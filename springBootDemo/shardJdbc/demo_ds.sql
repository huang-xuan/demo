/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80030
 Source Host           : localhost:3306
 Source Schema         : demo_ds

 Target Server Type    : MySQL
 Target Server Version : 80030
 File Encoding         : 65001

 Date: 08/11/2024 15:06:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order_0
-- ----------------------------
DROP TABLE IF EXISTS `order_0`;
CREATE TABLE `order_0` (
  `order_date` date DEFAULT NULL,
  `total_price` decimal(38,2) DEFAULT NULL,
  `customer_id` bigint DEFAULT NULL,
  `order_id` bigint NOT NULL,
  `delivery_address` varchar(255) DEFAULT NULL,
  `order_status` enum('CANCELLED','DELIVERED','PROCESSING','SHIPPED') DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for order_1
-- ----------------------------
DROP TABLE IF EXISTS `order_1`;
CREATE TABLE `order_1` (
  `order_date` date DEFAULT NULL,
  `total_price` decimal(38,2) DEFAULT NULL,
  `customer_id` bigint DEFAULT NULL,
  `order_id` bigint NOT NULL,
  `delivery_address` varchar(255) DEFAULT NULL,
  `order_status` enum('CANCELLED','DELIVERED','PROCESSING','SHIPPED') DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `order_date` date DEFAULT NULL,
  `total_price` decimal(38,2) DEFAULT NULL,
  `customer_id` bigint DEFAULT NULL,
  `order_id` bigint NOT NULL,
  `delivery_address` varchar(255) DEFAULT NULL,
  `order_status` enum('CANCELLED','DELIVERED','PROCESSING','SHIPPED') DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

SET FOREIGN_KEY_CHECKS = 1;
