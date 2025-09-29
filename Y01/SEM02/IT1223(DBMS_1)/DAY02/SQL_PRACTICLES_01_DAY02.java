CREATE TABLE Customer(
Customer_ID INT,
Name VARCHAR(30),
Email VARCHAR(30),
Phone
FROM  VARCHAR(15),
Registered_Date DATE,
cancel_Date DATE
);





CREATE TABLE CoustomerCopy1 As
SELECT Customer_ID,Email,Phone
FROM Customer;

CREATE TABLE WITH AUTO NUMBER/INCREMENT

CREATE TABLE customer01(
Customer_ID INT KEY AUTO_INCREMENT,
Name VARCHAR(30),
Email VARCHAR(30),
Phone VARCHAR(15),
Registered_Date DATE,
cancel_Date DATE
);

DELETE ALL RECODES FROM A TABLE WITHOUT DELETING THE TABLE

	TRUNCATE TABLE Customer;

	DELETE FROM customer01;
	
DELETE A SPECIFIC RECODE FROM A TABLE
	DELETE FROM customer01;
	
EDITING EXISTING TABLES;
	ALTER TABLE customer ADD Nick_Name VARCHAR(10);
	
	ALTER TABLE customer DROP COLUMN Nick_Name;
	
	ALTER TABLE Customer MODIFY COLUM Nick_Name VARCHAR(30);

ADD DATA TO THE TABLES
	INSERT INTO customer (Customer_Id,Name,Email,Phone,Registered_Date,cancel_Date) 
	VALUES(101,'Alice Ocean','alice@yahoo.com','+94-562-8564-452','2024-03-19','2026-03-09'),
	(102,'Jane Doe','Jane@yahoo.com','+94-785-852-452','2024-02-19','2025-02-09'),
	(103,'Jason Statheam','jason@yahoo.com','+94-855-4556','2024-01-19','2025-01-09');
	
SHOW ALL THE DATA FROM A TABLE; 
SELECT	* FROM customer;

ALTER TABLE customer MODIFY COLUMN email VARCHAR(30) NOT NULL;

CREATE TABLE Student(
ST_ID INT,
Name VARCHAR(30),
Email VARCHAR(30),
Phone VARCHAR(15),
Registered_Date DATE,
cancel_Date DATE
);

VALUES(1,'fluffy',fluffy@gmail.com,9876543210,'1993-02-04','1993-02-04') , (1,'fluffy',fluffy@gmail.com,9876543210,'1993-02-04','1993-02-04')


LOAD DATE LOCAT INFILE 'C:/Users/2022ict138/Desktop/2022ICT138/Y01/SEM02/SQL_ASSINGMNET_02_DAY02_ST_TABLE.txt' INTO TABLE Student;