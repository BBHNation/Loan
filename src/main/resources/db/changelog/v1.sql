--liquibase formatted sql

--changeset reservation:1
CREATE TABLE SYSTEM_LOG
(
    ID  BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    LOG VARCHAR(128) NOT NULL COMMENT 'system log'
);