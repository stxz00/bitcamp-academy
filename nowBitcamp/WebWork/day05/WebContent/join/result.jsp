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
	request.setCharacterEncoding("euc-kr");
	String id=request.getParameter("id");
	id=id.replace("-", "��");
	id=id.replace("\"", "��");
	id=id.replace("\'", "��");
	id=id.replace("<", "��");//������ �⺻ �߿伺.(������ �ϴ��� ��ó�� ����� Ư�����ڷ� �ٲ��ְų�)
	String pw=request.getParameter("pw");
	String sql="select count(*) from user04 where id='"+id+"' and pw='"+pw+"'";
	int result=0;
	try{
		ResultSet rs=MyOracle.getConnection().createStatement().executeQuery(sql);
		if(rs.next()) result=rs.getInt(1);
	}finally{
		if(MyOracle.getConnection()!=null)MyOracle.getConnection().close();
	}
	if(result>0){
		//�α���~~
		session.setAttribute("loginResult", true);
		session.setAttribute("loginID", id);
	}else{
		response.sendRedirect("login.jsp");
	}
	
%>
	<table width="100%">
		<tr>
			<td><img src="../imgs/blue_logo.png"></td>
			<td width="200">
				<%if(session.getAttribute("loginResult")==null){ %>
				<a href="login.jsp">[�α���]</a>
				<a href="add.jsp">[ȸ������]</a>
			<%}else{ %>	
				<a href="logout.jsp">[�α׾ƿ�]</a>
			<%} %>
			</td>
		</tr>
		<tr>
			<td colspan="2"  align="center">
				<a href="../index.jsp">[HOME]</a>
				<a href="../intro.jsp">[INTRO]</a>
				<a href="../bbs/list.jsp">[B B S]</a>
				<a href="../guest/list.jsp">[GUEST]</a>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<center>
				<h1>�α��� ����</h1>
					
				
					
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