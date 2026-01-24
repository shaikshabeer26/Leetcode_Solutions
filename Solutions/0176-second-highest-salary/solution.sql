/* Write your PL/SQL query statement below */
--select max (salary) as SecondHighestSalary From employee where salary<(select max(salary) from employee;

SELECT MAX(salary) SecondHighestSalary FROM Employee 

WHERE salary<(SELECT MAX(salary) FROM Employee);
