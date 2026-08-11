-- Last updated: 11/08/2026, 16:10:00
# Write your MySQL query statement below
Select m.name
from employee as e
inner join employee as m
on e.managerId=m.id
group by e.managerId 
having count(e.id)>=5
