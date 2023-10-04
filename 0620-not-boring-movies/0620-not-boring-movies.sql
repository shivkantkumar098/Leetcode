# Write your MySQL query statement below
select *from cinema where id %2!=0 and description <> 'boring'order by rating desc;


# subquery
# SELECT *
# FROM cinema
# WHERE id IN (
#     SELECT id
#     FROM cinema
#     WHERE id % 2 != 0 AND description <> 'boring'
# )
# ORDER BY rating DESC;
