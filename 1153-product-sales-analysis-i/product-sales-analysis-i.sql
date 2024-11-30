# Write your MySQL query statement below
SELECT product.product_name,sales.year,sales.price FROM SALES LEFT JOIN Product 
ON
sales.product_id=product.product_id
