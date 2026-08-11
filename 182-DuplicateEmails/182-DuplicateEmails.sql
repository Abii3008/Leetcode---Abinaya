-- Last updated: 11/08/2026, 16:13:46
# Write your MySQL query statement below
SELECT Email FROM Person GROUP BY Email HAVING COUNT(Email) > 1;

