<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="com.bit.MyOracle,java.sql.*,java.util.ArrayList"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	int num=Integer.parseInt(request.getParameter("num"));
	String sql="select * from bbs04 where num="+num;
	class Bbs04{
		int num,cnt;
		String sub,id,content;
	}
	Bbs04 bean=new Bbs04();
	try{
		Statement stmt=MyOracle.getConnection().createStatement();
		stmt.executeUpdate("update bbs04 set cnt=cnt+1 where num="+num);
		stmt=MyOracle.getConnection().createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		if(rs.next()){
			bean.num=rs.getInt("num");
			bean.sub=rs.getString("sub");
			bean.id=rs.getString("id");
			bean.cnt=rs.getInt("cnt");
			bean.content=rs.getString("content");
		}
		rs.close();
		stmt.close();
	}finally{
		if(MyOracle.getConnection()!=null)MyOracle.getConnection().close();
	}
	
	
%>

	<table width="100%">
		<tr>
			<td><img src="../imgs/blue_logo.png"></td>
			<td width="200">
				<%if(session.getAttribute("loginResult")==null){ %>
				<a href="../join/login.jsp">[�α���]</a>
				<a href="../join/add.jsp">[ȸ������]</a>
			<%}else{ %>	
				<a href="../join/logout.jsp">[�α׾ƿ�]</a>
			<%} %>
			</td>
		</tr>
		<tr>
			<td colspan="2"  align="center">
				<a href="../index.jsp">[HOME]</a>
				<a href="../intro.jsp">[INTRO]</a>
				<a href="list.jsp">[B B S]</a>
				<a href="../guest.list.jsp">[GUEST]</a>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<center>
				<h1>�� ������</h1>
				<form action="insert.jsp" method="post"> 
				<!--����ƮŸ���̶� ���̳ʸ� ������ header�� �÷��� �����Ƿ� ���� ���ڵ� ������ insert.jsp���� ������� -->
					<table width="400">
						<tr>
							<td>�۹�ȣ</td>
							<td><%=bean.num %></td>
							<td>�۾���</td>
							<td><%=bean.id %></td>
							<td>��ȸ��</td>
							<td><%=bean.cnt %></td>
						</tr>
						<tr>
							<td>����</td>
							<td colspan="5"><%=bean.sub %></td>
						</tr>
						<tr>
							<td></td>
							<td colspan="5"><%=bean.content %></td>
						</tr>
						<tr>
						
							<td colspan="6" align="center">
								<a href="#">[�� ��]</a>
								<a href="del.jsp?num=<%=bean.num %>">[�� ��]</a>
							</td>
						</tr>
					</table>
				</form>
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