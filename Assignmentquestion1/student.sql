create database studentDB;
use studentDB;
create table student(id int primary key , name varchar(50));
insert into student values(1,"abc");
insert into student values(2,"dec");
insert into student values(3,"bcdf");
insert into student values(4,"gef");
select*from student;