/* Write your PL/SQL query statement below */
/*select name from employee where id.salary>managerId.salary;*/
SELECT EMP.name AS Employee FROM Employee EMP,Employee MGR
WHERE EMP.managerId=MGR.id AND EMP.salary>MGR.salary

