-- �Խ���(bbs01)
-- �۹�ȣ(num), ����(sub), �۾���(name), ��¥(nalja), ����(content)
drop table bbs01;
create table bbs01(
	num number,
	sub varchar2(30),
	name varchar2(15),
	nalja date,
	content varchar2(2000)
);
insert into bbs01 values(1,'�������','user1',sysdate,' �ù�');
insert into bbs01 values(2,'�������','user2',sysdate,' �ù�');
insert into bbs01 values(3,'�������','user3',sysdate,' �ù�');
insert into bbs01 values(4,'�������','user4',sysdate,' �ù�');
insert into bbs01 values(5,'�������','user5',sysdate,' �ù�');
select * from bbs01 order by num desc;

