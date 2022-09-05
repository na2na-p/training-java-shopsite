DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
    id INT AUTO_INCREMENT PRIMARY KEY,
    login VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL
);
INSERT INTO customer VALUES (null, 'ayukawa', 'SweetfishRiver1');
INSERT INTO customer VALUES (null, 'samejima', 'SharkIsland2');
INSERT INTO customer VALUES (null, 'wanibuchi', 'CrocodileChasm3');
INSERT INTO customer VALUES (null, 'ebihara', 'ShrimpField4');
INSERT INTO customer VALUES (null, 'kanie', 'CrubBay5');
INSERT INTO customer VALUES (null, 'user', 'password');

DROP TABLE IF EXISTS purchase;
CREATE TABLE purchase (
    id INT AUTO_INCREMENT PRIMARY KEY,
    product_id INT NOT NULL,
    product_name VARCHAR(100) NOT NULL,
    product_price int NOT NULL,
    product_count int NOT NULL,
    customer_name VARCHAR(100) NOT NULL,
    customer_address VARCHAR(100) NOT NULL
);

DROP TABLE IF EXISTS product;
CREATE TABLE product (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price INT NOT NULL
);
INSERT INTO product VALUES (null, 'まぐろ', 100);
INSERT INTO product VALUES (null, 'サーモン', 100);
INSERT INTO product VALUES (null, 'えび', 100);
INSERT INTO product VALUES (null, 'いか', 100);
INSERT INTO product VALUES (null, 'えんがわ', 100);
INSERT INTO product VALUES (null, 'あなご', 100);
INSERT INTO product VALUES (null, 'たまご', 100);
INSERT INTO product VALUES (null, 'ほたて', 100);
INSERT INTO product VALUES (null, '赤貝', 100);
INSERT INTO product VALUES (null, 'つぶ貝', 100);
INSERT INTO product VALUES (null, 'サラダ軍艦', 150);
INSERT INTO product VALUES (null, 'ねぎとろ軍艦', 150);
INSERT INTO product VALUES (null, 'ねぎとろ巻', 150);
INSERT INTO product VALUES (null, 'アボガド巻', 150);
INSERT INTO product VALUES (null, 'トロ', 200);
INSERT INTO product VALUES (null, 'いくら', 200);
INSERT INTO product VALUES (null, 'うに', 200);