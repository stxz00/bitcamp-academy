<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%> 
<%@ page import="oracle.jdbc.driver.OracleDriver,java.sql.*" %>
<%//add�Խ�Ʈ���� �Խ�Ʈ���� �ҷ����µ� Ÿ���� Ʋ�������� �������ϱ� �� ����Ʈ Ÿ�� ���� Ȯ��!%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="0" cellspacing="0" width="600" align="center">
	<tr>
		<td bgcolor="#000000" colspan="6"><img src="D:\bitcamp(�п�����)\nowBitcamp\WebWork\day02\imgs\header.jpg"></td>
	</tr>
	<tr>
		<td align="center" background="D:\bitcamp(�п�����)\nowBitcamp\WebWork\day02\imgs\menu.jpg"><img src="D:\bitcamp(�п�����)\nowBitcamp\WebWork\day02\imgs\menu.jpg"></td>
		<td align="center" width="100" background="D:\bitcamp(�п�����)\nowBitcamp\WebWork\day02\imgs\menu.jpg"><a href="index.jsp">[HOME]</a></td>
		<td align="center" width="100" background="D:\bitcamp(�п�����)\nowBitcamp\WebWork\day02\imgs\menu.jpg"><a href="intro.jsp">[INTRO]</a></td>
		<td align="center" width="100" background="D:\bitcamp(�п�����)\nowBitcamp\WebWork\day02\imgs\menu.jpg"><a href="list.jsp">[B B S]</a></td>
		<td align="center" width="100" background="D:\bitcamp(�п�����)\nowBitcamp\WebWork\day02\imgs\menu.jpg"><a href="guest.jsp">[����]</a></td>
		<td align="center" background="D:\bitcamp(�п�����)\nowBitcamp\WebWork\day02\imgs\menu.jpg"><img src="D:\bitcamp(�п�����)\nowBitcamp\WebWork\day02\imgs\menu.jpg"></td>
	</tr>
	<tr>
		<td colspan="6">
		<h1>����</h1>
		<table border="1" cellspacing="0" width="80%" align="center">
<%
String sql="select content,name from guest01 order by nalja desc";
String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="scott";
String password="tiger";

OracleDriver driver=new OracleDriver();

Connection conn=null;
Statement stmt=null;
ResultSet rs=null;
try{
	DriverManager.registerDriver(driver);
	conn=DriverManager.getConnection(url, user, password);
	stmt=conn.createStatement();
	rs=stmt.executeQuery(sql);
	while(rs.next()){
%>		
			<tr>
				<td><%=rs.getString(1) %></td>
				<td width="100"><%=rs.getString(2) %></td>
			</tr>
<%
	}
}finally{
	if(rs!=null)rs.close();
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}
%>
		</table>
	<center>	
		<form action="addguest.jsp">
			�۾���:
			<input type="text" name="name" size="5">
			<input type="text" name="content" size="45">
			<input type="submit" value="�Է�">
		</form>
	</center>		
		</td>
	</tr>
</table>
</body>
</html>
