<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="oracle.jdbc.OracleDriver"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�л� ���� ��ȸ</title>
</head>
<body>
	<h1 align="center">�л� ���� ��ȸǥ</h1>
	<table width="100%" align="center" border="1">
	<tr><td>�й�</td><td>�̸�</td><td>����</td><td>����</td><td>����</td></tr>
	<%
	String sql = "select * from student01 order by num";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "scott";
	String pw = "tiger";
	OracleDriver driver = new OracleDriver();
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	try{
		DriverManager.registerDriver(driver);
		conn = DriverManager.getConnection(url,id,pw);
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			out.println("<tr>");
			for(int i=1; i<6; i++){
				out.print("<td>");
				out.println(rs.getString(i));
				out.print("</td>");
			}
			out.println("</tr>");
		}
		
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		if(rs != null){rs.close();}
		if(stmt != null){stmt.close();}
		if(conn != null){conn.close();}
	}
	%>
	</table><br>
	<a href="my02.jsp">[�Է�]</a><br><br>
	<a href="my04.jsp">[����]</a><br><br>
	<a href="my06.jsp">[����]</a>
	
	
</body>
</html>