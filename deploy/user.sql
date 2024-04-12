CREATE TABLE users (id INT AUTO_INCREMENT PRIMARY KEY, username VARCHAR(50) NOT NULL,password VARCHAR(50) NOT NULL,email VARCHAR(100) NOT NULL,birthdate DATE, is_active BOOLEAN DEFAULT TRUE );

INSERT INTO zhku_mysql.users (username,password,email,birthdate,is_active) VALUES
('zsy','123456','111111','1990-01-01',1),
('lisi','123456','2222@163.com','1991-02-02',1),
('zhangsan','123456','3333@163.com','1992-03-03',1),
('wangwu','123456','4444@163.com','1993-04-04',1),
('handsome','123456','hahaha@163.com','2000-03-02',1);