INSERT INTO customer(name, email, joined_at) 
select 'bob', 'bob@gmail.com', '2003-04-03 11:03:45'
FROM customer 
LIMIT 2500000;

INSERT INTO customer(name, email, joined_at)
VALUES('pedro', 'pedro@gmail.com', '2003-05-03 11:59:44');

EXPLAIN ANALYZE SELECT * FROM customer WHERE email='pedro@gmail.com';

CREATE INDEX customer_email_idx ON customer(email);

EXPLAIN ANALYZE SELECT * FROM customer WHERE email='pedro@gmail.com';
