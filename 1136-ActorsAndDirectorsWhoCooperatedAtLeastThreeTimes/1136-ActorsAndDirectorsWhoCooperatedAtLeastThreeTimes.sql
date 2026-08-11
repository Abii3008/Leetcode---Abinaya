-- Last updated: 11/08/2026, 16:06:32
# Write your MySQL query statement below
select actor_id,director_id
from ActorDirector 
group by actor_id,director_id
having count(*) >= 3;