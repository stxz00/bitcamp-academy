-- sub����
-- select (2) from (1) where (3)
--1.
select * from(select dname||'�μ���'||loc as ���� from dept);
--()�ȿ� ���� ���̺�� ����ؼ� ���� ����! �� ()�� ���� �����ϰ� ����
2.
select dname,(select count(*) from dept) from dept;
select dname,(select depno from dept) from dept; --����, ������ ���� ������
select dname,(select min(deptno), max(deptno) from dept) from dept;
--����, 2�� �̻��� ���� ������ �и��ؼ� �ؾ���
select dname,(select min(deptno) from dept),(select max(deptno) from dept) from dept;
--3.
select * from dept where deptno>(select avg(deptno) from dept);
select * from dept where deptno>(select 20 from dual);
select * from dept where deptno in (select distinct deptno from emp);
select * from dept where deptno in (select 10,20 from dual); --����

--���������� copy
create table emp2 as (select empno, ename from emp);
select * from emp2;
delete from emp2;
insert into emp2(select empno,ename from emp);
desc emp2; --not null �� primary key�� ī�� �ȵ�
desc emp;

create table emp4 as(select * from emp where 0=1); --��Ű���� copy
desc emp4;
select * from emp4;

select rownum, deptno,dname,loc from dept;
select * from (select rownum as rn,empno,ename from emp) where rn between 6 and 10;
--rownum�� �Լ��� ������ 1���� ����, ȣ���� 2���� ��Ȳ�� ���� �Ⱦ��� �ȵ�����
--����� ���� �̰� ���̺�� �νĵǴ� rn�� 6~10�϶����� ȣ���� �� �ִ� 

--view
--Ư�� �÷��鿡 ���� ���� ���Ѹ� ������ ����
drop view view_emp;
create view view_emp as (select empno,ename from emp);
select * from view_emp; --���̺��� �ִ°�ó�� ����

create view view_emp4 as(select empno,ename from emp4);
select * from view_emp4; --���濡 ���缭 �˾Ƽ� ����.
insert into emp4 (empno,ename,sal,hiredate) values(1111,'test',100,sysdate);
--������ ��� ���� ������ �ִ� �� �ƴ� emp4�� ������ �ִ� ��
--���ڵ尡 ���� ������ �� �������� ��ġ�� ���� ���ո� ������ �ִ� ��
--�׷��� ��� ���� ���� �뷮�� ���� ����

create view view_empdept as (select ename,dname from emp inner join dept using (deptno));
select * from view_empdept;

--����. �Ƚᵵ ��
-- Data Control Language(DCL)

--��������
-- create user ������ identified by ���;
-- alter user ������ default tablespace �����̽���;
--            quota ũ�� on �����̽���
--            default tablespce �����̽���

--���̺� �����̽� ����
--create tablespace �����̽��� datafile '���' size ũ��;
--create user ������ identified by ��� default tablespace class2;

-- alter user ������
--            quota ũ�� on �����̽���;

--����, �� (CONNECT,RESOURCE,DBA)
--grant ���� to ����;
--revoke ����,�� from ����;

