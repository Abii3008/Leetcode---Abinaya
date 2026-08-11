-- Last updated: 11/08/2026, 16:04:32
# Write your MySQL query statement below
select u.name,sum(t.amount) AS balance
FROM users u
LEFT JOIN transactions t
ON u.account = t.account
group by u.name
having sum(t.amount)>10000