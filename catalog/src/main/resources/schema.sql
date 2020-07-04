--Creating T_PRODUCT Table
--DROP TABLE IF EXISTS T_PRODUCT;

--CREATE TABLE T_PRODUCT (
  --id VARCHAR(250) NOT NULL PRIMARY KEY,
  --type VARCHAR(250) NOT NULL,
  --name VARCHAR(250) NOT NULL,
  --description VARCHAR(250) NOT NULL
--);

--Creating T_PRODUCT_INVENTORY Table
DROP TABLE IF EXISTS T_PRODUCT_INVENTORY;

CREATE TABLE T_PRODUCT_INVENTORY (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  product_id  VARCHAR(250) NOT NULL,
  quantity  INT,
  min_limit INT,
    CONSTRAINT product_id_fk FOREIGN KEY (product_id) REFERENCES T_PRODUCT (id)
);
