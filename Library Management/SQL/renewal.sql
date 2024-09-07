SELECT DATE_ADD(CURDATE(), INTERVAL 1 DAY) AS tomorrow_date;
create table renew(b_id int,u_id int,issue_date date,due_date date,due int,cnt int);
insert into renew values(123,125003261,2023-05-01,2023-05-05,0,0);
insert into renew values(123,125003261,"2023-05-01","2023-05-05",0,0);
insert into renew values(432,125003102,"2023-05-03","2023-05-08",0,0);
select * from renew;

select date_add(curdate(),interval 4 day) as renewal_date;

insert into renew values(111,125003312,"2023-04-30","2023-05-03",0,0);

select * from renew;


