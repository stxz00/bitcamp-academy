<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="com.bit.MyOracle,java.sql.*"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	// ���� ����
	session.invalidate();
	// ���� �Ӽ� ����
	//session.removeAttribute("loginResult");
	// ���� �Ӽ��� ����
	//session.setAttribute("loginResult", null);
%>
	<table width="100%">
		<tr>
			<td><img src="../imgs/blue_logo.png"></td>
			<td width="200">
					<a href="login.jsp">[�α���]</a>
					<a href="add.jsp">[ȸ������]</a>
			</td>
		</tr>
		<tr>
			<td colspan="2"  align="center">
				<a href="../index.jsp">[HOME]</a>
				<a href="../intro.jsp">[INTRO]</a>
				<a href="../bbs/list.jsp">[B B S]</a>
				<a href="../guest.list.jsp">[GUEST]</a>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<center>
				<h1>�α׾ƿ�</h1>
					
				
					
				</center>
			</td>
		</tr>
		<tr>
			<td colspan="2" bgcolor="gray" align="center" height="50%">
			Copyright &copy; ��Ʈķ�� All rights reserved
			</td>
		</tr>
	
	</table>
</body>
</html>