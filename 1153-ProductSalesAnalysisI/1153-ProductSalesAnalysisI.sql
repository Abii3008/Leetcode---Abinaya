-- Last updated: 11/08/2026, 16:06:31
# Write your MySQL query statement below
select product_name,year,price
from Sales
left join product
on sales.product_id = product.product_id;