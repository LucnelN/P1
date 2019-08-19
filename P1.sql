CREATE TABLE USERS (
  UserName varchar2(20) not null, 
  Password varchar2(20) not null, 
  Role varchar2(8) not null
);

CREATE TABLE TICKETS (
UserName varchar2(20) not null,
Ticket_ID number not null,
Amount number not null,
Ticket_Desc varchar2(250) not null,
Type varchar2(10) not null,
Status number not null
);

drop table users;
drop table tickets;

select * from users
select * from tickets

insert into users values('luke', 'hulk', 'MAN' );
insert into users values('lulu', 'dog', 'MAN' );
insert into users values('man', 'man', 'EMP' );
insert into users values('popo', '123', 'EMP' );
commit;
