<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>��ȸ ������</h1>
	<a href="add.jsp">[�� ��]</a>
	<table align="center" cellspacing="0" border="0" width="80%">
		<tr>
			<th style="color:white" width="100" bgcolor="#999999" align="center">�۹�ȣ</th>
			<th style="color:white" bgcolor="#999999" align="center">����</th>
			<th style="color:white" width="100" bgcolor="#999999" align="center">�۾���</th>
			<th style="color:white" width="100" bgcolor="#999999" align="center">��¥</th>
		</tr>
<% 
		String sql="select rownum as rn, num,name,nalja,sub,content,ref,ord,lev from (select num,name,nalja,sub,content,ref,ord,lev from exercise01 order by ref desc, lev asc)";
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		String driver="oracle.jdbc.driver.OracleDriver";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				String tab="";
				for(int i=0; i<rs.getInt("lev"); i++){
					tab+="&nbsp;&nbsp;";
				}
				if(!tab.isEmpty())tab+="��";
				
%>
			<tr>
				<td align="center" width="100"><%=rs.getString("rn") %></td>
				<td><a href="detail.jsp?num=<%=rs.getString("num") %>"><%=tab+rs.getString("sub") %></a></td>
				<td align="center" width="100"><%=rs.getString("name") %></td>
				<td align="center" width="100"><%=rs.getDate("nalja") %></td>
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
</body>
</html>