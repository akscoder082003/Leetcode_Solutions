-- Table: Employee

-- +-------------+---------+
-- | Column Name | Type    |
-- +-------------+---------+
-- | id          | int     |
-- | name        | varchar |
-- | department  | varchar |
-- | managerId   | int     |
-- +-------------+---------+
-- id is the primary key (column with unique values) for this table.
-- Each row of this table indicates the name of an employee, their department, and the id of their manager.
-- If managerId is null, then the employee does not have a manager.
-- No employee will be the manager of themself.

-- Write a solution to find managers with at least five direct reports.

-- Return the result table in any order.

select e1.name from Employee e1 join Employee e2 on e1.id = e2.managerId group by e1.name, e1.id having count(e2.id) >= 5;