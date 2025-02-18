# Write your MySQL query statement below
select Employee.name,Bonus.bonus from Employee left Join Bonus on Employee.empid=bonus.empid Where bonus<1000 or bonus is null;