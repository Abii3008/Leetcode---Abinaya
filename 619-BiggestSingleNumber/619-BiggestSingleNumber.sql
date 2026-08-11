-- Last updated: 11/08/2026, 16:09:22
# Write your MySQL query statement below
select max(num) as num
from (
    select num
    from MyNumbers
    group by num
    having count(num) =1
) as unique_numbers;