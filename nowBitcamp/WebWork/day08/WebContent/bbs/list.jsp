<%@page import="java.sql.ResultSet"%>
<%@page import="oracle.jdbc.OracleTypes"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>�Խ���</h1>
<table width="800" align="center">
	<tr>
		<th>��ȣ</th>
		<th>����</th>
		<th>�۾���</th>
		<th>��¥</th>
	</tr>
	<% 
	/*
	create procedure bbs05_list(cur out sys_refcursor)
	is
	begin
	open cur for select * from bbs05 order by num;
	end;
	/
	*/
	
	String sql="select * from bbs05 order by num desc";
	String driver=request.getParameter("driver");
	String url=request.getParameter("url");
	String user=request.getParameter("user");
	String password=request.getParameter("password");
	java.sql.Connection conn=null;
	java.sql.CallableStatement cstmt=null;
	java.sql.ResultSet rs=null;
	try{
		Class.forName(driver);
		conn=java.sql.DriverManager.getConnection(url,user,password);
		cstmt=conn.prepareCall("{call bbs05_list(?)}");
		cstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
		cstmt.execute();
		rs=(java.sql.ResultSet)cstmt.getObject(1);
		while(rs.next()){
	%>
	<tr>
		<td><a href="./?p=detail&num=<%=rs.getInt("num") %>"><%=rs.getInt("num") %></a></td>
		<td><a href="./?p=detail&num=<%=rs.getInt("num") %>"><%=rs.getString("sub") %></a></td>
		<td><a href="./?p=detail&num=<%=rs.getInt("num") %>"><%=rs.getString("id") %></a></td>
		<td><a href="./?p=detail&num=<%=rs.getInt("num") %>"><%=rs.getDate("nalja") %></a></td>
	</tr>
	<% 
		}
	}finally{
		if(rs!=null)rs.close();
		if(cstmt!=null)cstmt.close();
		if(conn!=null)conn.close();
	}
	%>
</table>
<a href="./?p=add">[�� ��]</a>
</body>
</html>