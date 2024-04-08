CREATE TABLE user (id INT AUTO_INCREMENT PRIMARY KEY, username VARCHAR(50) NOT NULL,email VARCHAR(100) NOT NULL,birthdate DATE, is_active BOOLEAN DEFAULT TRUE );

INSERT INTO zhku_mysql.users (username,email,birthdate,is_active) VALUES
('zsy','111111','1990-01-01',1),
('lisi','2222@163.com','1991-02-02',1),
('zhangsan','3333@163.com','1992-03-03',1),
('wangwu','4444@163.com','1993-04-04',1),
('handsome','hahaha@163.com','2000-03-02',1);