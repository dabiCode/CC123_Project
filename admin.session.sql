CREATE TABLE users ( id INT PRIMARY KEY NOT NULL,
 username varchar, 
 first_name TEXT, 
 last_name TEXT, 
 email VARCHAR(255) NOT NULL,
 password TEXT
  );
INSERT INTO users (username, first_name, last_name, email, password) 
VALUES ( 'admin', 'admin', 'admin@admin.com', 'admin');

SELECT email, id FROM users;