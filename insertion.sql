CREATE DATABASE IF NOT EXISTS DAO
DEFAULT CHARACTER SET utf8
COLLATE utf8_general_ci;

CREATE TABLE IF NOT EXISTS users
(
    id INT(11) NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (id),
    email VARCHAR(255) NOT NULL UNIQUE,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(60) NOT NULL
    );

INSERT INTO users (email, username, password) VALUES
('','','');

UPDATE users SET
                 email = '', username = '', password = ''
WHERE id = x;

SELECT * FROM users WHERE id = x;

DELETE FROM users WHERE id = x;

SELECT * FROM users;