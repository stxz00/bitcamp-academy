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
<h1>����Ʈ ������</h1>
<table width="80%" align="center" border="1" cellspacing="0">
	<tr>
		<th>��ȣ</th>
		<th>����</th>
		<th>�̸�</th>
		<th>��¥</th>
	</tr>
	<%
	java.util.ArrayList<com.bit.bbs05.dto.Bbs05Dto> list=com.bit.bbs05.dao.Bbs05Dao.selectAll();
	for(com.bit.bbs05.dto.Bbs05Dto bean:list){
	%>
	<tr>
		<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getNum() %></a></td>
		<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getSub() %></a></td>
		<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getId() %></a></td>
		<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getNalja() %></a></td>
	</tr>
	<%} %>
</table>
<a href="add.jsp">[�� ��]</a>
<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>
