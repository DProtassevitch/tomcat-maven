CREATE DATABASE users;

GRANT ALL PRIVILEGES
ON users.*
TO 'root'@'localhost'
IDENTIFIED BY 'root'
WITH GRANT OPTION;

GRANT ALL PRIVILEGES
ON users.*
TO 'root'@'%'
IDENTIFIED BY 'root'
WITH GRANT OPTION;

USE users;
create table users
(
  id int auto_increment
    primary key,
  name varchar(50) not null,
  gender varchar(10) not null,
  creation_time timestamp default CURRENT_TIMESTAMP not null,
  constraint name
  unique (name)
)
;
INSERT INTO users (id, name, gender, creation_time)
VALUES ('1', 'Lora', 'FEMALE', '2017-06-02 11:30:12');