-- ����(guest01)
-- ��(content),�۾���(name),��¥(nalja)
drop table guest01;
create table guest01(
	content varchar2(1024),
	name varchar2(15),
	nalja date
);
-- dummy data
insert into guest01 values ('�Ϻ�','user1',sysdate-4);
insert into guest01 values ('2��','user2',sysdate-3);
insert into guest01 values ('3������ �۾���','user3',sysdate-3);
insert into guest01 values ('���� ���� 4��','user4',sysdate-1);
select * from guest01 order by nalja desc;