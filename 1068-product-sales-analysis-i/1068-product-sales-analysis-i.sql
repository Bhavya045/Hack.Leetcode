# Write your MySQL query statement below
select s.year,s.price,p.product_name
from Sales s
left join Product p
on p.product_id=s.product_id