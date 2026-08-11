-- Last updated: 11/08/2026, 16:09:41
# Write your MySQL query statement below
select class
from Courses group by class having count(student)>=5;