-- ����(guest01)
-- ��(content),�۾���(name),��¥(nalja)

drop table guest;
create table guest(
	content varchar2(1024),
	name varchar2(15),
	nalja date
);

insert into guest (content,name,nalja) values('����1','�̸�1',sysdate);
insert into guest (content,name,nalja) values('����2','�̸�2',sysdate);
insert into guest (content,name,nalja) values('����3','�̸�3',sysdate);
insert into guest (content,name,nalja) values('����4','�̸�4',sysdate);
insert into guest (content,name,nalja) values('����5','�̸�5',sysdate);

select content, name, nalja from guest;