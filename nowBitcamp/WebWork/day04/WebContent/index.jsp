<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>����Ʈ������</h1>
	<a href="add.jsp">[�� ��]</a>
	<table width="80%" align="center">
		<tr>
			<th width="80">�۹�ȣ</th>
			<th>����</th>
			<th width="100">�۾���</th>
			<th width="100">��¥</th>
		</tr>
		<%@ page import="java.sql.*"%>
		<% 
			String sql="select * from bbs03 order by ref desc,ord asc";
			String driver="oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="tiger";
			Connection conn=null;
			Statement stmt=null;
			ResultSet rs=null;
			//int su=9;
			try{
				Class.forName(driver);
				conn=DriverManager.getConnection(url,user,password);
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				while(rs.next()){
					out.println("<tr>");
					//out.println("<td bgcolor=\"#"+su+su+su+su+su+su+"\">"+rs.getInt("num")+"</td>");
					out.println("<td><a href=\"detail.jsp?num="+rs.getInt("num")
					+"\">"+rs.getInt("num")+"</a></td>");
					String tab="";
					for(int i=0; i<rs.getInt("lev"); i++){
						tab+="&nbsp;&nbsp;";
					}
					if(!tab.isEmpty()) tab+="��";
					out.println("<td>"+tab+rs.getString("sub")+"</td>");
					out.println("<td>"+rs.getString("name")+"</td>");
					out.println("<td>"+rs.getDate("nalja")+"</td>");
					out.println("</tr>");
					//if(su!=0)su--;
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