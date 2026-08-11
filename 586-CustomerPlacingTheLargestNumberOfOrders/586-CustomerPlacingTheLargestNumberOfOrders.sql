-- Last updated: 11/08/2026, 16:09:47
# Write your MySQL query statement belowSELECT customer_number
SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(*) DESC
LIMIT 1;