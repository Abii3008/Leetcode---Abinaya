-- Last updated: 11/08/2026, 16:09:10
# Write your MySQL query statement below
update salary set sex =
case sex 
when 'm' then 'f' else 'm'
end;