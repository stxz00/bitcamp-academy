<%@page import="com.bit.bbs05.dao.Bbs05Dao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../template/header.jsp">
	<jsp:param value="../" name="path"/>
</jsp:include>
<jsp:include page="../template/menu.jsp">
	<jsp:param value="../" name="path"/>
</jsp:include>
<jsp:useBean id="bean" class="com.bit.bbs05.dto.Bbs05Dto" scope="page"></jsp:useBean>
<jsp:setProperty property="num" name="bean"/>
<%
//scope= ������ ������Ʈ ���� ���ø����̼�. 
//����� �±��� ������ ����Ŭ.
//���� ���� �������� ���� �Ȱ��� ��ü(�ּ�)�� ���� �ٸ� �������� �ٸ�
//�� ����� �ڵ�� ������ ��ü�� ���� �ʰ� ���ǽ������� �Ȱ��� ��ü�� ����ϰڴٴ� ��
//���ø����̼ǽ������� �ٸ� �������� �����ص� ���� ��ü ���!
//���ø����̼��� ��Ĺ������ �������� ������ ������ ������������
//�׷��� �� �ο��� ������ ��ü�� ����ϰ� ��.
//������ ���������� ��ü�� �ٲ�.
//����Ʈ�� ������ ������
//�̸� �״�� �������� �ϳ�. �׷��� �������� ��� ������ ���ο� ��ü ����.
//������Ʈ�������� �������� ������ ���̿� ��������.
//���������� ���� ���������� ����. ������Ʈ�� ���ŵǱ� ��������
//�� ������Ʈ �ϰ� �������� �ϱ� ���� ������! �̷��� �����带 ���� �ش� �������� �Ѿ�� ���´� �ƴϹǷ� ������Ʈ�� ��!
//getproperty�� �� ����Ǿ� �ִ� bean ���� �������� �ϴ� bean ���尪�� �ȳ���

bean=Bbs05Dao.selectOne(bean.getNum());
%>
	<table width="400" align="center" border="1" cellspacing="0">
		<tr>
			<td>�۹�ȣ</td>
			<td><%=bean.getNum() %></td>
			<td>�۾���</td>
			<td><%=bean.getId() %></td>
			<td>��¥</td>
			<td><%=bean.getNalja() %></td>
		</tr>
		<tr>
			<td>����</td>
			<td colspan="5"><%=bean.getSub() %></td>
			
		</tr>
		<tr>
			<td>����</td>
			<td colspan="5"><%=bean.getContent() %></td>
		</tr>
		<tr>
			<td colspan="6">
				<a href="edit.jsp?num=<%=bean.getNum() %>">[�� ��]</a>
				<a href="#">[�� ��]</a>
			</td>
		</tr>
		
	
	</table>
<jsp:include page="../template/footer.jsp">
	<jsp:param value="../" name="path"/>
</jsp:include>
</body>
</html>