drop table bbs;
create table bbs(
	num number,
	sub varchar2(30),
	name varchar2(15),
	nalja date,
	content varchar2(2000)
);

insert into bbs (num, sub, name, nalja, content) values(1,'�������1','�̸�1',sysdate,'����1');
insert into bbs (num, sub, name, nalja, content) values(2,'�������2','�̸�2',sysdate,'����2');
insert into bbs (num, sub, name, nalja, content) values(3,'�������3','�̸�3',sysdate,'����3');
insert into bbs (num, sub, name, nalja, content) values(4,'�������4','�̸�4',sysdate,'����4');
insert into bbs (num, sub, name, nalja, content) values(5,'�������5','�̸�5',sysdate,'����5');

select num, sub, name, nalja, content from bbs order by num desc; 