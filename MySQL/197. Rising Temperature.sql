-- Table: Weather

-- +---------------+---------+
-- | Column Name   | Type    |
-- +---------------+---------+
-- | id            | int     |
-- | recordDate    | date    |
-- | temperature   | int     |
-- +---------------+---------+
-- id is the column with unique values for this table.
-- This table contains information about the temperature on a certain day.

-- Write a solution to find all dates' Id with higher temperatures compared to its previous dates (yesterday).

select w1.id from Weather w1, Weather w2 where datediff(w1.recordDate, w2.recordDate) = 1 and w1.temperature > w2.temperature;