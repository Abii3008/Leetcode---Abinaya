-- Last updated: 11/08/2026, 16:09:28
# Write your MySQL query statement below
SELECT id,
CASE
    WHEN p_id IS NULL THEN 'Root'
    WHEN id IN (SELECT DISTINCT p_id FROM Tree) THEN 'Inner'
    ELSE 'Leaf'
END AS type
FROM Tree;