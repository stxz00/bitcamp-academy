<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%//�̰��� �ٷ� ��Ƽ��. import�� �ִ� %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>���尴ü</h1>
	<%
	//������Ʈ : �� �������� �� ������ ������ ��û ���� ���� ����
	//javax.servlet.http.HttpServletRequest req = request;
	String addr = request.getRemoteAddr();
	System.out.println(addr);
	String url = request.getRequestURI(); // url ��ġ
	String ctxt = request.getContextPath(); //������Ʈ ���� ��Ʈ
	String servername = request.getServerName();
	int serverport = request.getServerPort();
	%>
	<p>�� ������ : <%=addr %> <%=url %> <%= ctxt%> <%=servername %> <%=serverport %></p>
	<p><a href="ex04.jsp?id=xyz">link1</a></p>
	<p><a href="ex04.jsp?id=abc&pw=1234">link2</a></p>
	
	<form action="ex04.jsp" method="post">
	<input type="text" name="id" value="abc"><br>
	<input type="password" name="pw"><br>
	<input type="radio" name="ra" value="item1" checked="checked">item1
	<input type="radio" name="ra" value="item2">item2
	<input type="radio" name="ra" value="item3">item3<br>
	<input type="checkbox" name="ch" value="ch1">ch1
	<input type="checkbox" name="ch" value="ch2">ch2
	<input type="checkbox" name="ch" value="ch3">ch3
	<input type="checkbox" name="ch" value="ch4">ch4<br>
	<select name="sel">
		<option value="02">����</option>
		<option value="032">����</option>
		<option value="042">�뱸</option>
		<option value="052">�λ�</option>
		<option value="062">����</option>
	</select><br>
	<select name="lst" size="4">
		<option value="02">����</option>
		<option value="032">����</option>
		<option value="042">�뱸</option>
		<option value="052">�λ�</option>
		<option value="062">����</option>
	</select><br>
	<textarea rows="5" cols="10" name="ta">value���� ���� ��� ���⿡ ���� ��</textarea>
	<input type="submit" value="����">
	<input type="reset" value="���">
	</form>
	<%//������ �ڵ����� ������� method="post" �������ܼ� ����  �̴� ������ head�κп� �����°���!!! method="get"�� ����Ʈ%>
	
</body>
</html>