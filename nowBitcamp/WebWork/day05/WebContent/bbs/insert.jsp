<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="com.bit.MyOracle,java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%	
	// post ��� �ѱ�ó��
	// 1. �Ź� �ۼ��Ǿ�� ��
	// 2. �Ķ���� �Ľ����� ���ڵ� �Ǿ����
	request.setCharacterEncoding("euc-kr"); //�Ʒ� �޾ƿ��� ���� ���ڵ��� �������! //������ ��ü�� EUC-KR�̹Ƿ� �������� ���ƾ���!
	String sub=request.getParameter("sub");
	String id=request.getParameter("id");
	String content=request.getParameter("content");
	String sql="insert into bbs04 values(bbs04_seq.nextval,'"
			+sub+"','"+id+"',0,'"+content+"')";
	
	try{
		Statement stmt=MyOracle.getConnection().createStatement();
		stmt.executeUpdate(sql);
		stmt.close();
	}finally{
		if(MyOracle.getConnection()!=null)MyOracle.getConnection().close();
	}
	response.sendRedirect("list.jsp");
%>
</body>
</html>