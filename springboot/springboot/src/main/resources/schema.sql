create table course
(
   name varchar(255) not null,
    rollno bigint not null,
   loc varchar(255) not null,
   primary key(rollno)
);
insert into course values('Datta',2,'RakeshPaul');