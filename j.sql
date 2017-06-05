create table users
(
	id bigint auto_increment
		primary key,
	creation_time datetime(6) null,
	gender varchar(255) null,
	name varchar(255) null
)
;
