-- Table: Prices
-- +---------------+---------+
-- | Column Name   | Type    |
-- +---------------+---------+
-- | product_id    | int     |
-- | start_date    | date    |
-- | end_date      | date    |
-- | price         | int     |
-- +---------------+---------+
-- (product_id, start_date, end_date) is the primary key (combination of columns with unique values) for this table.
-- Each row of this table indicates the price of the product_id in the period from start_date to end_date.
-- For each product_id there will be no two overlapping periods. That means there will be no two intersecting periods for the same product_id.

-- Table: UnitsSold
-- +---------------+---------+
-- | Column Name   | Type    |
-- +---------------+---------+
-- | product_id    | int     |
-- | purchase_date | date    |
-- | units         | int     |
-- +---------------+---------+
-- This table may contain duplicate rows.
-- Each row of this table indicates the date, units, and product_id of each product sold. 

-- Write a solution to find the average selling price for each product. average_price should be rounded to 2 decimal places.
-- Return the result table in any order.

select Prices.product_id, 
ifnull(round(sum(Prices.price*UnitsSold.units)/sum(UnitsSold.units), 2), 0) as average_price 
from Prices left join UnitsSold 
on Prices.product_id = UnitsSold.product_id 
and UnitsSold.purchase_date between Prices.start_date and Prices.end_date 
group by Prices.product_id;