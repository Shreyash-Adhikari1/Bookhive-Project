/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  97798
 * Created: Aug 18, 2024
 */

CREATE USER 'Library'@'localhost' Identified by 'Library';
Grant all Privileges on *.* to 'Library'@'localhost';

create database libraryy;
use libraryy;
create table user(USER_ID varchar(255) primary key,PASSWORD varchar(255)); 
CREATE TABLE IF NOT EXISTS customers (
                     id INT AUTO_INCREMENT PRIMARY KEY, 
                     name VARCHAR(100) NOT NULL, 
                     address VARCHAR(255), 
                     gender ENUM('Male', 'Female', 'Other'), 
                     contact VARCHAR(20), 
                     email VARCHAR(100));
