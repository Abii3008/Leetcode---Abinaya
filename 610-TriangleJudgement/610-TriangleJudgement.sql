-- Last updated: 11/08/2026, 16:09:25
# Write your MySQL query statement below
select *, if(x+y>z and y+z>x and x+z>y, "Yes" , "No") as triangle from triangle