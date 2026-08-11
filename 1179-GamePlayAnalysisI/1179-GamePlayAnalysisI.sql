-- Last updated: 11/08/2026, 16:06:16
# Write your MySQL query statement below
select player_id,min(event_date) as first_login 
from Activity 
group by player_id