<%@page import="java.sql.*"%>
<%@page import="oracle.jdbc.OracleDriver"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="0" cellspacing="0"  width="600" align="center">
	<tr>
		<td bgcolor="#000000" colspan="6"><img src="imgs\header.jpg"></td>
	</tr>
	<tr>
		<td align="center" background="imgs\menu.jpg"><img src="imgs\menu.jpg"></td>
		<td align="center" width="100" background="imgs\menu.jpg"><a href="index.jsp">[HOME]</a></td>
		<td align="center" width="100" background="imgs\menu.jpg"><a href="intro.jsp">[INTRO]</a></td>
		<td align="center" width="100" background="imgs\menu.jpg"><a href="list.jsp">[B B S]</a></td>
		<td align="center" width="100" background="imgs\menu.jpg"><a href="guest.jsp">[����]</a></td>
		<td align="center" background="imgs\menu.jpg"><img src="imgs\menu.jpg"></td>
	</tr>
	<tr>
		<td colspan="6">
		<center>
		<% 
		String num=request.getParameter("num");
		String sql="select name,nalja,sub,content from bbs01 where num="+num;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
			
		new OracleDriver(); //��ü������ �˾Ƽ� ���ִ� ����ֱ⸸ �ϸ� ��. �������͵� �� �ʿ� ��������
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			conn=DriverManager.getConnection(url,user,password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()){
				%>
				<h1><%=request.getParameter("num") %>���� Detail Page</h1>
				<table border="1" cellspacing="0" width="80%">
					<tr>
						<td width="80" align="center">�۹�ȣ</td>
						<td align="center"><%=num%></td>
						<td width="80" align="center">�۾���</td>
						<td align="center"><%=rs.getString(1) %></td>
						<td width="80" align="center">��¥</td>
						<td align="center"><%=rs.getString(2) %></td>
					</tr>
					<tr>
						<td width="80" align="center">����</td>
						<td colspan="5"><%=rs.getString(3) %></td>
					</tr>
					<tr>
						<td colspan="6"><%=rs.getString(4).replace("\r\n", "<br>") %></td>
					</tr>
					<tr>
						<td colspan="6">
							<a href="#">[�� ��]</a>
							<a href="#">[�� ��]</a>
						</td>
					</tr>
				</table>
				<%
			}
		}finally{
			if(rs!=null){rs.close();}
			if(stmt!=null){stmt.close();}
			if(conn!=null){conn.close();}
		}
		%>
		</center>		
		</td>
	</tr>
</table>
</body>
</html>