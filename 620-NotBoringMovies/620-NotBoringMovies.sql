-- Last updated: 11/08/2026, 16:09:17
# Write your MySQL query statement below
select * from cinema c
where c.id % 2=1
and 
c.description != 'boring'
order by c.rating desc;