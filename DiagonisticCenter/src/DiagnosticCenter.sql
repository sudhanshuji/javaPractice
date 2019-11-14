create database Diagnostic_DB;
use Diagnostic_DB;


create table Patient(
P_ID int primary key,
Email varchar(20),
Nmae varchar(20) NOT NULL,
Phone varchar(10) NOT NULL,
DOB Date NOT NULL);


create table Test(
T_ID int primary key,
Nmae varchar(30) NOT NULL,
Cost int NOT NULL);


create table Patient_Test(
P_ID int, 
T_ID int,
Date Date NOT NULL,
FOREIGN KEY (P_ID) REFERENCES Patient(P_ID)
FOREIGN KEY (T_ID) REFERENCES Test(T_ID));


insert into Patient
Values (3001,'Ramesh','ramesh@gmail.com','9900012345','1984-12-01'),
       (3002,'Suresh','suresh@gmail.com','9700011111','1990-05-23'),
       (3003,'Mahesh','mahesh@gmail.com','8800883333','1968-10-15'),
       (3004,'Rajesh','rajesh@gmail.com','3675211234','1972-11-03');


insert into Test
Values (1001,'Blood Group',100),
		(1002,'ECG',1350),
		(1003,'HBA1c',1050),
		(1004,'Bone Densitometry',3000),
		(1005,'MRI Scanning',5000);