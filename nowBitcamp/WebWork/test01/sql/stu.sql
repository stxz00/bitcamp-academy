
drop table stu;
drop table grade;
drop sequence stu_seq;
drop sequence grade_seq;

--학생 정보 : 학번(자동부여,21001부터) 이름(한글3글자) 나이(1~80)
create table stu(
	num number constraint stu_num_pk primary key check (num>21000),
	name varchar2(9) constraint stu_name_nn not null,
	age number(3) constraint stu_num_ck check (age between 1 and 80) not null
);


--성적 : 학번, 국어, 영어, 수학
create table grade(
	num number constraint grade_num_pk primary key check (num>21000),
	kor number(3) constraint grade_kor_ck check (kor between 0 and 100) not null,
	eng number(3) constraint grade_eng_ck check (eng between 0 and 100) not null,
	math number(3) constraint grade_math_ck check (math between 0 and 100) not null
);

create sequence stu_seq start with 21001 minvalue 21001 maxvalue 21999;
create sequence grade_seq start with 21001 minvalue 21001 maxvalue 21999;

insert into stu (num,name,age) values(stu_seq.nextval,'이해남','28');

insert into grade (num,kor,eng,math) values(grade_seq.nextval,100,100,100);




select * from stu;
select * from grade;


