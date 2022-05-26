CREATE DATABASE spring_boot;
use spring_boot
CREATE TABLE employees
(
    id         INT AUTO_INCREMENT,
    name       VARCHAR(50),
    surname    VARCHAR(50),
    department VARCHAR(50),
    salary     INT,
    PRIMARY KEY (id)
);