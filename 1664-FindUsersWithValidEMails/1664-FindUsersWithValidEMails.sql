-- Last updated: 11/08/2026, 16:04:42
# Write your MySQL query statement below
SELECT user_id,name,mail
FROM users Where mail REGEXP '^[a-z A-Z][a-z A-Z 0-9 _.-]*@leetcode\\.com$'
AND mail like BINARY '%@leetcode.com';