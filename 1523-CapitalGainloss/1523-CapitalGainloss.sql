-- Last updated: 11/08/2026, 16:05:06
# Write your MySQL query statement below
SELECT stock_name,  SUM(IF(operation='buy',-price,price)) as capital_gain_loss
from  Stocks
group by stock_name