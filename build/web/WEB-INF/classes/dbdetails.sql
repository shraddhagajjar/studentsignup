/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  shraddha
 * Created: Jan 23, 2017
 */

DROP DATABASE IF EXISTS student_information;

CREATE DATABASE student_information;

USE student_information;

CREATE TABLE student(
    studentID       INT(11)        NOT NULL   AUTO_INCREMENT,
    emailID          VARCHAR(40)    NOT NULL,
    password         VARCHAR(20)    NOT NULL,
    fname            VARCHAR(100)   NOT NULL,
    address          VARCHAR(100)   NOT NULL,
    city             VARCHAR(20)    NOT NULL,
    state            VARCHAR(20)    NOT NULL,
    country          VARCHAR(20)    NOT NULL,
    zipcode          INT(15)        NOT NULL,
    phoneno          VARCHAR(10)        NOT NULL,         
    confirm     int(1) NOT NULL,
    pendding    int(1) NOT NULL,
    waiting     int(1) NOT NULL,
    
    PRIMARY KEY (studentID)
);
CREATE TABLE student_status(
    statusID    int(11) NOT NULL    AUTO_INCREMENT,
    studentID   int(11) NOT NULL,
    confirm     int(1) NOT NULL,
    pendding    int(1) NOT NULL,
    waiting     int(1) NOT NULL,
    PRIMARY KEY (statusID),
    FOREIGN KEY (studentID)
        REFERENCES  student(studentID)
);

CREATE TABLE admin(
    username varchar(20) NOT NULL,
    password varchar(30) NOT NULL
);

INSERT INTO `student` (`emailID`, `password`, `fname`, `address`, `city`, `state`, `country`, `zipcode`, `phoneno`,`confirm`,`pendding`,`rejected`) VALUES ('shra.gajjar@gmail.com', 'qwer@1234', 'shraddha', 'fremont', 'fremont', 'CA', 'USA', '94536', '1', '0','1','0');

INSERT INTO `admin` (`username`,`password`) VALUES('shraddha','1234@qwer');
