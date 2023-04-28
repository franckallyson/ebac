/* Extrair a quantidade de clientes cadastrados */
SELECT COUNT(customer_id) as Quantity FROM customer;

/* Extrair quais clientes não efetuaram nenhuma compra */
SELECT DISTINCT customer.name AS Name FROM customer JOIN customer_order WHERE customer.customer_id NOT IN (SELECT customer_order.customer_id FROM customer_order);

/* Extrair qual o produto mais vendido */
SELECT MAX(product.name) AS Name FROM product Join order_item USING(product_id);
