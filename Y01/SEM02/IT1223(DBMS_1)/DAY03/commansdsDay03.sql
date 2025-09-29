CREATE TABLE fasstudents(
	fname VARCHAR(30),
	lamne VARCHAR(30),
	address VARCHAR(50),
	sex VARCHAR(10),
	dbdate DATE,
	course VARCHAR(15),
	tphone VARCHAR(15)
	);
	
	
ALTER TABLE fasstudents ADD COLUMN NICno VARCHAR(12);

ALTER TABLE fasstudents MODIFY COLUMN tphone VARCHAR(10);

LOAD DATA LOCAL INFILE 'C:Users/2022ict138/Desktop/2022ICT138/Y01/SEM02/DATA01.TXT' INTO TABLE customer02;
LOAD DATA LOCAL INFILE 'E:/All Subjects/UOV BSc ICT/Y01/SEM02/_Archive/TempCloud/DBMS/SQL_DAY_01/DAY02/SQL_ASSINGMNET_02_DAY02_ST_TABLE.txt' INTO TABLE customer02;


/*Update Query*/

UPDATE customer01 SET Email = 'alice@yahoo.com' WHERE Name='Jane Doe';

UPDATE customer01 SET cancel_Date='2000-05-07' WHERE Registered_Date>'2023-01-01';

SELECT * FROM pet WHERE name ='bowser';

SELECT * FROM pet WHERE Species = 'Dog';

SELECT * FROM pet WHERE date_of_birth >= '1998-01-01';

SELECT * FROM pet 
WHERE  Species = 'Dog' AND sex = 'F';

LOAD DATA LOCAL INFILE 'C:/Users/2022ict138/Desktop/2022ICT138/Y01/SEM02/DBMS/DAY03/datatable#2.txt' INTO TABLE pet;

SELECT what TO SELECT
FROM where

SELECT * FROM pet
WHERE  Species = 'Sname' or Species = 'Bird';

