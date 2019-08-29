# Inserting values into the customer table
INSERT INTO customers VALUES (0001,'Michael','087-108-3465', 'Michael.Kay@gmail.com', '192 Shanowen Fermoy Co.Cork');
INSERT INTO customers VALUES (0002,'John','087-345-2980', 'John.Hennesey@gmail.com', '129 Grange Milltown Co.Kerry');
INSERT INTO customers VALUES (0003, 'Kate','085-890-2584', 'Kate.May@gmail.com', '154 Kildinan Blackrock Co.Dublin');
INSERT INTO customers VALUES (0004, 'Ben', '085-564-0789', 'Ben.Travis@gmail.com', '143 Beaufort Mahon Co.Kilkenny');
INSERT INTO customers VALUES (0005, 'Sam', '086-976-6845', 'Sam.Smith@gmail.com', '168 Oakfield Kenmare Co.Carlow');
INSERT INTO customers VALUES (0006, 'Peter','086-286-9812', 'Peter44@live.com', '183 Brooksfield Marthon Co.Limerick ');
INSERT INTO customers VALUES (0007, 'Anthony', '087-109-7839', 'Anthony99@live.com', '187 Mayfield Rathmines Co.Galway');
INSERT INTO customers VALUES (0008, 'James', '085-390-6487', 'James23@live.com', '145 Winevile Clonakilty Co.Roscommon');
INSERT INTO customers VALUES (0009, 'Brian', '086-247-3740', 'Brian76@live.com', '15 James Street Co.Tralee');
INSERT INTO customers VALUES (0010, 'Ciara', '087-493-6812', 'Ciara89@live.com', '28 Patrick Street Co.Waterford');


# Inserting values into the orders table
INSERT INTO orders VALUES(0001,'Michael','12-01-18',0001);
INSERT INTO orders VALUES(0002,'John','17-02-18', 0002);
INSERT INTO orders VALUES(0003,'Kate','21-03-18', 0003);
INSERT INTO orders VALUES(0004,'Ben','10-04-18', 0004);
INSERT INTO orders VALUES(0005,'Sam','28-05-18', 0005);
INSERT INTO orders VALUES(0006,'Peter','25-06-18', 0006);
INSERT INTO orders VALUES(0007,'Anthony','09-07-18', 0007);
INSERT INTO orders VALUES(0008,'James','01-08-18', 0008);
INSERT INTO orders VALUES(0009,'Brian','15-09-18',0009);
INSERT INTO orders VALUES(0010,'Ciara','19-10-18',0010);

#Inserting values into the products table
INSERT INTO products VALUES(0001,'Reeses','Contains Peanuts',1.12);
INSERT INTO products VALUES(0002,'Donut','Gluten Free', 2.00);
INSERT INTO products VALUES(0003,'Diet Coke','Contains Artificial Sweeteners',2.50);
INSERT INTO products VALUES(0004,'Pringles','A Potato and Wheat Based Snack',2.15);
INSERT INTO products VALUES(0005,'Chicken Sandwich','2 Sandwiches inside each pack',3.50);
INSERT INTO products VALUES(0006,'Porridge','Contains Cinnamon',2.50);
INSERT INTO products VALUES(0007,'A Dozen Eggs','Freshly Farmed Eggs',2.70);
INSERT INTO products VALUES(0008,'Low Fat Milk','Keep Refrigerated',2.20);
INSERT INTO products VALUES(0009,'Pacracetamol','12 Tablets in Each Packet',1.50);
INSERT INTO products VALUES(0010,'Ice Cream','Contains Vanilla Extract',2.30);

#Inserting values into suppliers table
INSERT INTO suppliers VALUES (0001,'Marcus','086-175-2472', 'Marcus.Davis@gmail.com', 'Army Surplus Warehouse Co.Cork');
INSERT INTO suppliers VALUES (0002,'Jamie','086-924-7105', 'Jamie.Nicholas@gmail.com', 'Silver Bullet Warehouse Ltd Co.Dublin');
INSERT INTO suppliers VALUES (0003, 'Mary','085-874-1037', 'Mary.Carver@gmail.com', 'Arnotts Warehouse Co.kildare');
INSERT INTO suppliers VALUES (0004, 'Henry', '085-143-7642', 'Henry.Forrest@gmail.com', 'Musgraves Warehouse Co.Galway');
INSERT INTO suppliers VALUES (0005, 'Paul', '089-481-9476', 'Paul.Barlow@gmail.com', 'Kerrygold Warehouse Co.Carlow');
INSERT INTO suppliers VALUES (0006, 'Chantelle','089-379-4039', 'Chantelle18@live.com', 'Bakersfield Warehouse Co.Kerry ');
INSERT INTO suppliers VALUES (0007, 'David', '087-504-2644', 'David07@live.com', 'Crooksvile Warehouse Co.Limerick');
INSERT INTO suppliers VALUES (0008, 'Jose', '087-390-6487', 'Jose66@live.com', 'Bluebell Warehouse Co.Clare');
INSERT INTO suppliers VALUES (0009, 'Liam', '085-467-1920', 'Liam23@live.com', 'Drakelands Warehouse Co.Kilkenny');
INSERT INTO suppliers VALUES (0010, 'Daniel', '086-673-4972', 'Daniel40@live.com', 'Dunmore Warehouse Co.Sligo');

#Inserting values into OrdersProducts tables
INSERT INTO ordersproducts VALUES (0003,0001,0001);
INSERT INTO ordersproducts VALUES (0002,0002,0002);
INSERT INTO ordersproducts VALUES (0005,0003,0003);
INSERT INTO ordersproducts VALUES (0001,0004,0004);
INSERT INTO ordersproducts VALUES (0004,0005,0005);
INSERT INTO ordersproducts VALUES (0002,0006,0006);
INSERT INTO ordersproducts VALUES (0006,0007,0007);
INSERT INTO ordersproducts VALUES (0003,0008,0008);
INSERT INTO ordersproducts VALUES (0010,0009,0009);
INSERT INTO ordersproducts VALUES (0007,0010,0010);

#Inserting values into ProductsSuppliers tables
INSERT INTO productssuppliers VALUES (0001,0001);
INSERT INTO productssuppliers VALUES (0002,0002);
INSERT INTO productssuppliers VALUES (0003,0003);
INSERT INTO productssuppliers VALUES (0004,0004);
INSERT INTO productssuppliers VALUES (0005,0005);
INSERT INTO productssuppliers VALUES (0006,0006);
INSERT INTO productssuppliers VALUES (0007,0007);
INSERT INTO productssuppliers VALUES (0008,0008);
INSERT INTO productssuppliers VALUES (0009,0009);
INSERT INTO productssuppliers VALUES (0010,0010);

