# Write your MySQL query statement below 
select email 
from person
Group by email
Having COUNT(email)>1;