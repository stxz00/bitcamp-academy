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
<jsp:useBean id="bean" class="com.bit.bbs05.dto.Bbs05Dto"></jsp:useBean>
<jsp:setProperty property="num" name="bean"/>
<%
bean=Bbs05Dao.selectOne(bean.getNum());
%>
<h1>���� ������</h1>
<form action="update.jsp">
	<table width="400" align="center">
		<tr>
			<td>�۹�ȣ</td>
			<td><input type="text" name="num" value="<%=bean.getNum() %>" readonly="readonly"></td>
			<%//disabled="disabled"�� �Ķ���͵� �ȳѾ %>
			<td>�۾���</td>
			<td><%=bean.getId() %></td>
			<td>��¥</td>
			<td><%=bean.getNalja() %></td>
		</tr>
		<tr>
			<td>����</td>
			<td colspan="5"><input type="text" name="sub" value="<%=bean.getSub()%>"></td>
		</tr>
		<tr>
			<td>����</td>
			<td colspan="5"><textarea name="content"><%=bean.getContent() %></textarea></td>
		</tr>
		<tr>
			<td colspan="6">
				<input type="submit" value="�� ��">
				<input type="reset" value="�ʱ�ȭ">
			</td>
		</tr>
	</table>
</form>
<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>

