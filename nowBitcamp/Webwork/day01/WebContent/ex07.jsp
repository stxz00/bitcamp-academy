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
	<h1>�л����� ����Ʈ</h1>
	<table border="1" width="500" align="center">
		<tr>
			<td>�й�</td>
			<td>�̸�</td>
			<td>����</td>
			<td>����</td>
			<td>����</td>
		</tr>
		<% 
		String sql ="select * from student01";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String id="scott";
		String pw="tiger";
		OracleDriver driver = new OracleDriver();
		DriverManager.registerDriver(driver);
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			conn = DriverManager.getConnection(url,id,pw);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				%>
				<tr>
					<td><%=rs.getString(1) %></td>
					<td><%=rs.getString(2) %></td>
					<td><%=rs.getString(3) %></td>
					<td><%=rs.getString(4) %></td>
					<td><%=rs.getString(5) %></td>
				</tr>
				
				<%
			}
		}catch(Exception e){
			//catch�� ���ּ� ������ ��ü � �ȵǰ� ����
			//catch�ְ� �ؼ� �����κи� ����ϰ� ������ �������� ����
			System.out.println("�����־���");
		}finally{
			if(rs != null){rs.close();}
			if(stmt != null){stmt.close();}
			if(conn != null){conn.close();}
		}
		%>
	</table>
	<a href="ex08.jsp">[�Է�]</a>
	
</body>
</html>