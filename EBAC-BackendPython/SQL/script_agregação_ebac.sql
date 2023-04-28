/* DML */

INSERT INTO product
VALUES(1, 'Arroz', 20.99, 'Kg'),
	(2, 'Feijão', 15.99, 'Kg'),
    (3, 'Ovo', 24.99, 'Cx');
    
INSERT INTO storage
VALUES(1, 2, 40, '2003-08-30'),
	(2, 3, 20, '2003-05-20'),
    (3, 1, 30, '2003-05-21'),
    (4, 3, 45, '2003-05-22'),
    (5, 2, 33, '2003-05-23'),
    (6, 1, 87, '2003-05-24'),
    (7, 2, 21, '2003-05-25'),
    (8, 3, 55, '2003-05-26'),
    (9, 1, 67, '2003-05-27'),
    (10, 3, 44, '2003-05-28');
    
/* AGREGAÇÃO */

SELECT product.product_name AS Name, SUM(storage.storage_quantity) AS Quantity
FROM product JOIN storage ON product_id = storage_fk_product_id
GROUP BY Name 
ORDER BY Quantity DESC;