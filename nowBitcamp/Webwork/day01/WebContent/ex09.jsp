<%@page import="java.sql.*"%>
<%@page import="oracle.jdbc.driver.OracleDriver"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	String num = request.getParameter("num");
	String name = request.getParameter("name");
	String kor = request.getParameter("kor");
	String eng = request.getParameter("eng");
	String math = request.getParameter("math");
	String sql ="insert into student01 values(";
	sql+=num+",'"+name+"',"+kor+","+eng+","+math+")";
	System.out.println(sql);
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String id="scott";
	String pw="tiger";
	OracleDriver driver = new OracleDriver();
	DriverManager.registerDriver(driver);
	Connection conn =null;
	Statement stmt = null;
	try{
	conn = DriverManager.getConnection(url,id,pw);
	stmt = conn.createStatement();
	stmt.executeUpdate(sql);
	
	}catch(Exception e){
		System.out.println("�߸� �Է���");
	}finally{
		if(stmt!=null){stmt.close();}
		if(conn!=null){conn.close();}
	}
	%>
	<h1>�Է� �Ϸ�</h1>
	<a href="ex07.jsp">����Ʈ�������� �̵�</a>
</body>
</html>