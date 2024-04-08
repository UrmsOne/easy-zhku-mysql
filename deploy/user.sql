CREATE TABLE user (     id INT AUTO_INCREMENT PRIMARY KEY,     username VARCHAR(50) NOT NULL,     email VARCHAR(100) NOT NULL,     birthdate DATE,     is_active BOOLEAN DEFAULT TRUE );
