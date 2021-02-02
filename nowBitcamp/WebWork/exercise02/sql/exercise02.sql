drop table exercise02_guest;
drop table exercise02_user;
drop sequence exercise02_user_seq;
drop sequence exercise02_guest_seq;

create table exercise02_user(
	num number constraint exercise02_user_num_pk primary key,
	id varchar2(15) constraint exercise02_user_id_uk unique not null,
	pw varchar2(18) constraint exercise02_user_pw_nn not null
);

create table exercise02_guest(
	num number constraint exercise02_guest_num_pk primary key,
	id varchar2(15) constraint exercise02_guest_id_nn not null 
	references exercise02_user(id),
	sub varchar2(100) constraint exercise02_guest_sub_nn not null,
	content varchar2(1000) constraint exercise02_guest_content_nn not null,
	nalja date constraint exercise02_guest_nalja_nn not null,
	cnt number default 0 constraint exercise02_guest_cnt_nn not null,
	ref number default 0 constraint exercise02_guest_ref_nn not null,
	ord number default 0 constraint exercise02_guest_ord_nn not null,
	lev number  default 0constraint exercise02_guest_lev_nn not null
);

create sequence exercise02_user_seq;
create sequence exercise02_guest_seq;

insert into exercise02_user values(exercise02_user_seq.nextval,'������','1234');
insert into exercise02_user values(exercise02_user_seq.nextval,'���θ�','1234');
insert into exercise02_user values(exercise02_user_seq.nextval,'���ο�ģ��','1234');
insert into exercise02_user values(exercise02_user_seq.nextval,'���ѷ�','1234');
insert into exercise02_user values(exercise02_user_seq.nextval,'������','1234');

insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���θ�','�������� ��������....','���? ���θ� ġ�� ���´ٱ�???',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ο�ģ��','�ٵ� ������ �����뿩','�̷� �ǰ��� �ִٴ°͵� �����Ͻø� �����ǵ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ѷ�','��ġ����','��Ʈ������ �����ϴ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'������','���� �Ҿ�Ʈ','������ ��հ� ���� �ֽ��ϴ�

����ȣ ������',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���θ�','�������� ��������....','���? ���θ� ġ�� ���´ٱ�???',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ο�ģ��','�ٵ� ������ �����뿩','�̷� �ǰ��� �ִٴ°͵� �����Ͻø� �����ǵ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ѷ�','��ġ����','��Ʈ������ �����ϴ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'������','���� �Ҿ�Ʈ','������ ��հ� ���� �ֽ��ϴ�

����ȣ ������',sysdate,0,0,0,0);insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���θ�','�������� ��������....','���? ���θ� ġ�� ���´ٱ�???',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ο�ģ��','�ٵ� ������ �����뿩','�̷� �ǰ��� �ִٴ°͵� �����Ͻø� �����ǵ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ѷ�','��ġ����','��Ʈ������ �����ϴ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'������','���� �Ҿ�Ʈ','������ ��հ� ���� �ֽ��ϴ�

����ȣ ������',sysdate,0,0,0,0);insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���θ�','�������� ��������....','���? ���θ� ġ�� ���´ٱ�???',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ο�ģ��','�ٵ� ������ �����뿩','�̷� �ǰ��� �ִٴ°͵� �����Ͻø� �����ǵ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ѷ�','��ġ����','��Ʈ������ �����ϴ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'������','���� �Ҿ�Ʈ','������ ��հ� ���� �ֽ��ϴ�

����ȣ ������',sysdate,0,0,0,0);insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���θ�','�������� ��������....','���? ���θ� ġ�� ���´ٱ�???',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ο�ģ��','�ٵ� ������ �����뿩','�̷� �ǰ��� �ִٴ°͵� �����Ͻø� �����ǵ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ѷ�','��ġ����','��Ʈ������ �����ϴ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'������','���� �Ҿ�Ʈ','������ ��հ� ���� �ֽ��ϴ�

����ȣ ������',sysdate,0,0,0,0);insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���θ�','�������� ��������....','���? ���θ� ġ�� ���´ٱ�???',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ο�ģ��','�ٵ� ������ �����뿩','�̷� �ǰ��� �ִٴ°͵� �����Ͻø� �����ǵ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ѷ�','��ġ����','��Ʈ������ �����ϴ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'������','���� �Ҿ�Ʈ','������ ��հ� ���� �ֽ��ϴ�

����ȣ ������',sysdate,0,0,0,0);

insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���θ�','�������� ��������....','���? ���θ� ġ�� ���´ٱ�???',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ο�ģ��','�ٵ� ������ �����뿩','�̷� �ǰ��� �ִٴ°͵� �����Ͻø� �����ǵ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ѷ�','��ġ����','��Ʈ������ �����ϴ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'������','���� �Ҿ�Ʈ','������ ��հ� ���� �ֽ��ϴ�

����ȣ ������',sysdate,0,0,0,0);insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���θ�','�������� ��������....','���? ���θ� ġ�� ���´ٱ�???',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ο�ģ��','�ٵ� ������ �����뿩','�̷� �ǰ��� �ִٴ°͵� �����Ͻø� �����ǵ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ѷ�','��ġ����','��Ʈ������ �����ϴ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'������','���� �Ҿ�Ʈ','������ ��հ� ���� �ֽ��ϴ�

����ȣ ������',sysdate,0,0,0,0);insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���θ�','�������� ��������....','���? ���θ� ġ�� ���´ٱ�???',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ο�ģ��','�ٵ� ������ �����뿩','�̷� �ǰ��� �ִٴ°͵� �����Ͻø� �����ǵ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ѷ�','��ġ����','��Ʈ������ �����ϴ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'������','���� �Ҿ�Ʈ','������ ��հ� ���� �ֽ��ϴ�

����ȣ ������',sysdate,0,0,0,0);insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���θ�','�������� ��������....','���? ���θ� ġ�� ���´ٱ�???',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ο�ģ��','�ٵ� ������ �����뿩','�̷� �ǰ��� �ִٴ°͵� �����Ͻø� �����ǵ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ѷ�','��ġ����','��Ʈ������ �����ϴ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'������','���� �Ҿ�Ʈ','������ ��հ� ���� �ֽ��ϴ�

����ȣ ������',sysdate,0,0,0,0);insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���θ�','�������� ��������....','���? ���θ� ġ�� ���´ٱ�???',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ο�ģ��','�ٵ� ������ �����뿩','�̷� �ǰ��� �ִٴ°͵� �����Ͻø� �����ǵ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ѷ�','��ġ����','��Ʈ������ �����ϴ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'������','���� �Ҿ�Ʈ','������ ��հ� ���� �ֽ��ϴ�

����ȣ ������',sysdate,0,0,0,0);insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���θ�','�������� ��������....','���? ���θ� ġ�� ���´ٱ�???',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ο�ģ��','�ٵ� ������ �����뿩','�̷� �ǰ��� �ִٴ°͵� �����Ͻø� �����ǵ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ѷ�','��ġ����','��Ʈ������ �����ϴ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'������','���� �Ҿ�Ʈ','������ ��հ� ���� �ֽ��ϴ�

����ȣ ������',sysdate,0,0,0,0);insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���θ�','�������� ��������....','���? ���θ� ġ�� ���´ٱ�???',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ο�ģ��','�ٵ� ������ �����뿩','�̷� �ǰ��� �ִٴ°͵� �����Ͻø� �����ǵ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'���ѷ�','��ġ����','��Ʈ������ �����ϴ�',sysdate,0,0,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'������','���� �Ҿ�Ʈ','������ ��հ� ���� �ֽ��ϴ�

����ȣ ������',sysdate,0,0,0,0);




