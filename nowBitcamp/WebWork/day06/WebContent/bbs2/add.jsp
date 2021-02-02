<%@page import="com.bit.util.MyOracle"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%! String path="../"; %>
<%
String method=request.getMethod();
if("POST".equals(method)){
	request.setCharacterEncoding("euc-kr");
	String sub=request.getParameter("sub");
	String name=request.getParameter("name");
	String content=request.getParameter("content");
	String sql="insert into bbs06 (num,sub,name,content,nalja1) "
	+"values (bbs06_seq.nextval,?,?,?,sysdate)";
	System.out.println(sql);
	java.sql.PreparedStatement pstmt=null;
	Connection conn=null;
	try{
		conn=MyOracle.getConnection();
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, sub); //? ������ �ϴ°� ����������Ʈ��Ʈ�� ���ȶ����� �������
		pstmt.setString(2, name); //���� �ڷ����� �̽���ġ���� Ʋ���� �Ͽ� �ڿ������� ������ ��
		pstmt.setString(3, content);
		//pstmt.setDate(4, new java.sql.Date(System.currentTimeMillis())); //sql date�� ��ӹ���
		//pstmt.setDate(4, new java.sql.Date(102,0,1));
		pstmt.executeUpdate();
		
	}finally{
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
	response.sendRedirect("list.jsp");
}
%>
<body>
<%@ include file="../template/header.jspf" %>
<%@ include file="../template/menu3.jspf" %>
	<h1>�Է� ������</h1>
	<form method="post">
		<table width="400" align="center">
			<tr>
				<td>����</td>
				<td><input type="text" name="sub"></td>
			</tr>
			<tr>
				<td>�۾���</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td></td>
				<td><textarea name="content"></textarea> </td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="�� ��">
					<input type="reset" value="�� ��">
				</td>
			</tr>
		</table>
	</form>
<%@ include file="../template/footer.jspf" %>
</body>
</html>