<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>result page<%=request.getMethod() %></h1>
	<p>id:<%=request.getParameter("id") %><%//�Ķ������ ���� ������ %></p>
	<p>pw:<%=request.getParameter("pw") %></p>
	<p>ra:<%=request.getParameter("ra") %></p>
	
	<%String[] chs = request.getParameterValues("ch");
	if(chs!=null){
	for(int i=0; i<chs.length; i++){
	%>
	<p>check:<%=chs[i]%></p>
	<%}} %>
	<p>select:<%=request.getParameter("sel") %></p>
	<%
	String ta = request.getParameter("ta");
	ta.replace("\r\n", "<br>");
	System.out.println(ta);
	%>
	<p><%=ta %></p>
	<%
	System.out.println("--------------------------------");
	Enumeration<String> enu= request.getParameterNames(); 
	//��� ������ �� ����(���� ���� ������ �Ȱ�����. ��, �ؽ�Ʈ������� �� ���� ������ ������)
	while(enu.hasMoreElements()){
		System.out.println(enu.nextElement());
	}
	System.out.println("--------------------------------");
	//Map<String,String[]> set = request.getParameterMap(); 
	
	//java.io.Writer out32 = response.getWriter(); �Ⱦ� �������� ��
	//out.print(b) �̰ɷ� �Ǵ�
	out.println();
	%>
</body>
</html>