/* Write your PL/SQL query statemene * from person where not email=i*
delete p1 from person1, person2
delete p1 
from Person p1, Person p2
where p1.Email = p2.Email 
and p1.id>p2.Id;*/
/* Write your PL/SQL query statement below *
DELETE FROM Person 
WHERE id IN (
    SELECT a.id
    FROM (
        SELECT id, email,
               ROW_NUMBER() OVER (PARTITION BY email ORDER BY id) AS rn
        FROM Person
    ) a
    WHERE a.rn > 1
);*/
delete from person p where p.id not in (select min(id) from person group by email);

