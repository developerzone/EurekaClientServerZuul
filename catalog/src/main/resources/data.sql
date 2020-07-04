--Inserting into USER Table
--INSERT INTO
--	T_PRODUCT (id, type,name,description)
--VALUES
 -- 	('BOOK_1', 'BOOK','Book1','Book1 Description'),
 -- 	('BOOK_2', 'BOOK','Book2','Book2 Description'),
  --	('BOOK_3', 'BOOK','Book3','Book3 Description'),
  --	('BOOK_4', 'BOOK','Book4','Book4 Description'),
  --	('BOOK_5', 'BOOK','Book5','Book5 Description');

  INSERT INTO
    T_PRODUCT_INVENTORY (id, product_id,quantity,min_limit)
  VALUES
    (1, 'BOOK_1',2000,50),
   	(2, 'BOOK_2',1000,50),
    (3, 'BOOK_3',1400,50),
    (4, 'BOOK_4',1200,50),
   (5, 'BOOK_5',1800,50);