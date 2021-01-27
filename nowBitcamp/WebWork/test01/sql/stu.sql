
drop table stu;
drop table grade;
drop sequence stu_seq;
drop sequence grade_seq;

--�л� ���� : �й�(�ڵ��ο�,21001����) �̸�(�ѱ�3����) ����(1~80)
create table stu(
	num number constraint stu_num_pk primary key check (num>21000),
	name varchar2(9) constraint stu_name_nn not null,
	age number(3) constraint stu_num_ck check (age between 1 and 80) not null
);


--���� : �й�, ����, ����, ����
create table grade(
	num number constraint grade_num_pk primary key check (num>21000),
	kor number(3) constraint grade_kor_ck check (kor between 0 and 100) not null,
	eng number(3) constraint grade_eng_ck check (eng between 0 and 100) not null,
	math number(3) constraint grade_math_ck check (math between 0 and 100) not null
);

create sequence stu_seq start with 21001 minvalue 21001 maxvalue 21999;
create sequence grade_seq start with 21001 minvalue 21001 maxvalue 21999;

insert into stu (num,name,age) values(stu_seq.nextval,'���س�','28');

insert into grade (num,kor,eng,math) values(grade_seq.nextval,100,100,100);




select * from stu;
select * from grade;


