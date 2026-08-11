-- Last updated: 11/08/2026, 16:04:53
# Write your MySQL query statement below
select sell_date, count( DISTINCT product ) as num_sold ,
    GROUP_CONCAT( DISTINCT product order by product ASC separator ',' ) as products
        FROM Activities GROUP BY sell_date order by sell_date ASC;