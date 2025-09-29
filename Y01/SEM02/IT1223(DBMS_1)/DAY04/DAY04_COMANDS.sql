CREATE TABLE Pet(
 Name VARCHAR(30),
 Owner VARCHAR(30),
 Species VARCHAR(30),
 sex VARCHAR(1),
 date_of_birth DATE,
 death_date DATE
   );
   
LOAD DATA LOCAL INFILE 'C:/Users/2022ict138/Desktop/2022ICT138/Y01/SEM02/SQL/DAY04/datatable#2.txt' INTO TABLE pet;
   
SELECT * FROM pet WHERE Species='Cat' OR Species='Bird';

SELECT * FROM pet WHERE Species='Cat' AND Sex = 'M' OR Species='Dog' AND Sex='F';
 
SELECT Name, date_of_birth FROM pet;
 
SELECT Name,Owner FROM pet;

SELECT Owner FROM pet;

SELECT DISTINCT Owner FROM pet;

SELECT Name,date_of_birth,Species FROM pet WHERE Species='Dog';

SELECT Name,date_of_birth FROM pet ORDER BY date_of_birth;

SELECT Name,date_of_birth FROM pet ORDER BY date_of_birth DESC;

SELECT name,Species,date_of_birth FROM Pet ORDER BY Species,date_of_birth DESC;

SELECT TIMESTAMPDIFF(MONTH,'2001-05-01','2003-02-01'); 

SELECT Name,date_of_birth,CURDATE(),TIMESTAMPDIFF(YEAR,date_of_birth,CURDATE()) AS Age FROM pet ORDER BY Age;

SELECT Name,date_of_birth,TIMESTAMPDIFF(YEAR,date_of_birth,CURDATE()) AS Age FROM pet ORDER BY Age;

SELECT Name,date_of_birth,death_date,TIMESTAMPDIFF(YEAR,death_date,date_of_birth) AS Age FROM pet WHERE death_date IS NOT NULL ORDER BY Age;

SELECT Name,date_of_birth,MONTH(date_of_birth) from pet;

SELECT Name,date_of_birth,MONTH(date_of_birth) AS Month from pet;

SELECT Name,date_of_birth FROM pet WHERE MONTH(date_of_birth) = 5;

SELECT Name,date_of_birth,'THEY CAN CLEBRATE BIRTHDAY IN THE NEXT MONTH' AS CONGRATS FROM pet WHERE MONTH(date_of_birth) > 4;

SELECT Name,date_of_birth FROM pet WHERE MONTH(date_of_birth) = MONTH(DATE_ADD(CURDATE(),INTERVAL 1 MONTH));

