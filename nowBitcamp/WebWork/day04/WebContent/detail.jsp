<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%	
	String num=request.getParameter("num");
	String sql="select * from bbs03 where num="+num;
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	String sub=null;
	String name=null;
	String content=null;
	Date nalja=null;
	
	int ref=0,ord=0,lev=0;
	
	try{
		conn=DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		if(rs.next()){
			sub=rs.getString("sub");
			name=rs.getString("name");
			content=rs.getString("name");
			nalja=rs.getDate("nalja");
			ref=rs.getInt("ref");
			ord=rs.getInt("ord");
			lev=rs.getInt("lev");
		}
	}finally{
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
%>
	<h1>�� ������</h1>
	<table width="80%" align="center" cellspacing="0" border="1">
		<tr>
			<td bgcolor="gray" width="100">�۹�ȣ</td>
			<td><%=num %></td>
			<td bgcolor="gray" width="100">�۾���</td>
			<td><%=name %></td>
			<td bgcolor="gray" width="100">��¥</td>
			<td><%=nalja %></td>
		</tr>
		<tr>
			<td bgcolor="gray">����</td>
			<td colspan="5"><%=sub %></td>
		</tr>
		<tr>
			<td bgcolor="gray"></td>
			<td colspan="5"><%=content.replace("\r\n", "<br>") %></td>
		</tr>
		<tr>
			<td colspan="6">
			<a href="#">[�� ��]</a>
			<a href="#">[�� ��]</a>
			<a href="re.jsp?ref=<%=ref %>&ord=<%=ord %>&lev=<%=lev %>">[�� ��]</a>
			</td>
		</tr>
	</table>
</body>
</html>