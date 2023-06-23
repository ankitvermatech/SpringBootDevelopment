DROP TABLE IF EXISTS Course;
DROP TABLE IF EXISTS user_details;
drop table if exists posts;

create table Course(
id bigint not null,
name varchar2(255) not null,
author varchar2(255) not null,
primary key(id)
);

create table posts (id integer not null, user_id integer, description varchar(255), primary key (id));

create table user_details (birth_date date, id integer not null, name varchar(255), primary key (id));

