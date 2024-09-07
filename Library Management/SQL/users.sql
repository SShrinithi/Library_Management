use urlib;
create table users(u_id int PRIMARY KEY,user_name varchar(50),phno int,email varchar(50),bks_taken int default 0,fine float default 0,pwd varchar(10));
desc users;
alter table users modify phno long ;
desc users;
select * from users;
select * from users;
select count(*) from users where u_id=125003261 and pwd="romi"; 




