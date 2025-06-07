-- 데이터베이스 생성 및 사용
CREATE DATABASE IF NOT EXISTS `temperium`;
USE `temperium`;

-- 기존 테이블 삭제
DROP TABLE IF EXISTS `user`;
DROP TABLE IF EXISTS `tempino`;
DROP TABLE IF EXISTS `tempino_instance`;
DROP TABLE IF EXISTS `growth_log`;

-- User
CREATE TABLE user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP
);

-- Tempino
CREATE TABLE tempino (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30) NOT NULL UNIQUE,
    description TEXT,
    weather_type VARCHAR(20) NOT NULL,
    image_url VARCHAR(255)
);

-- Tempino Instance
CREATE TABLE tempino_instance (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT NOT NULL,
    tempino_id BIGINT NOT NULL,
    nickname VARCHAR(50),
    level INT DEFAULT 1,
    exp INT DEFAULT 0,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES user(id),
    FOREIGN KEY (tempino_id) REFERENCES tempino(id),
    INDEX idx_user_id (user_id)
);

-- Growth Log
CREATE TABLE growth_log (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    tempino_instance_id BIGINT NOT NULL,
    date DATE NOT NULL,
    total_exp INT NOT NULL,
    FOREIGN KEY (tempino_instance_id) REFERENCES tempino_instance(id),
    UNIQUE KEY uk_tempino_instance_date (tempino_instance_id, date),
    INDEX idx_tempino_instance_id (tempino_instance_id)
);
