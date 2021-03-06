-- sub쿼리
-- select (2) from (1) where (3)
--1.
select * from(select dname||'부서는'||loc as 내용 from dept);
--()안에 것을 테이블로 사용해서 쓰고 있음! 즉 ()가 먼저 수행하고 있음
2.
select dname,(select count(*) from dept) from dept;
select dname,(select depno from dept) from dept; --오류, 다중의 값이 나오니
select dname,(select min(deptno), max(deptno) from dept) from dept;
--오류, 2개 이상의 값이 나오니 분리해서 해야함
select dname,(select min(deptno) from dept),(select max(deptno) from dept) from dept;
--3.
select * from dept where deptno>(select avg(deptno) from dept);
select * from dept where deptno>(select 20 from dual);
select * from dept where deptno in (select distinct deptno from emp);
select * from dept where deptno in (select 10,20 from dual); --오류

--서브쿼리로 copy
create table emp2 as (select empno, ename from emp);
select * from emp2;
delete from emp2;
insert into emp2(select empno,ename from emp);
desc emp2; --not null 즉 primary key는 카피 안됨
desc emp;

create table emp4 as(select * from emp where 0=1); --스키마만 copy
desc emp4;
select * from emp4;

select rownum, deptno,dname,loc from dept;
select * from (select rownum as rn,empno,ename from emp) where rn between 6 and 10;
--rownum은 함수고 무조건 1부터 수행, 호출이 2번인 상황임 서브 안쓰면 안되지만
--서브로 쓰면 이게 테이블로 인식되니 rn이 6~10일때까지 호출할 수 있다 

--view
--특정 컬럼들에 대해 보는 권한만 갖도록 해줌
drop view view_emp;
create view view_emp as (select empno,ename from emp);
select * from view_emp; --테이블이 있는것처럼 만듬

create view view_emp4 as(select empno,ename from emp4);
select * from view_emp4; --변경에 맞춰서 알아서 해줌.
insert into emp4 (empno,ename,sal,hiredate) values(1111,'test',100,sysdate);
--실제로 뷰는 값을 가지고 있는 게 아닌 emp4가 가지고 있는 것
--레코드가 들어올 때마다 그 데이터의 위치에 대한 조합만 가지고 있는 것
--그래서 뷰는 많이 만들어도 용량이 거의 없음

create view view_empdept as (select ename,dname from emp inner join dept using (deptno));
select * from view_empdept;

--번외. 안써도 됨
-- Data Control Language(DCL)

--계정생성
-- create user 계정명 identified by 비번;
-- alter user 계정명 default tablespace 스페이스명;
--            quota 크기 on 스페이스명
--            default tablespce 스페이스명

--테이블 스페이스 생성
--create tablespace 스페이스명 datafile '경로' size 크기;
--create user 계정명 identified by 비번 default tablespace class2;

-- alter user 계정명
--            quota 크기 on 스페이스명;

--권한, 롤 (CONNECT,RESOURCE,DBA)
--grant 권한 to 누구;
--revoke 권한,롤 from 누구;

