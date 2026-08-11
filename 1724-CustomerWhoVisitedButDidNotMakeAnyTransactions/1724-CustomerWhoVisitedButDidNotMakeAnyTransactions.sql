-- Last updated: 11/08/2026, 16:04:37
# Write your MySQL query statement below
select v.customer_id , count(*) AS count_no_trans
FROM Visits v
LEFT JOIN Transactions t ON v.visit_id = t.visit_id
WHERE t.transaction_id IS NULL 
GROUP BY v.customer_id;