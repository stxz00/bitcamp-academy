<%@page import="com.bit.bbs05.dao.Bbs05Dao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean" class="com.bit.bbs05.dto.Bbs05Dto" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="bean"/>
<%
//<jsp:setProperty property="sub" name="bean"/>
//<jsp:setProperty property="id" name="bean"/>
//<jsp:setProperty property="content" name="bean"/>
//<jsp:setProperty property="num" name="bean"/>

//<jsp:setProperty property="num" name="bean" value="1234"/> <- �ڵ����� Integer.parseInt ���� ����!
//������ ������Ʈ �޾ƾ��ϳ� ���� �� �� �� ������Ƽ ���
//Bbs05Dto bean=new Bbs05Dto(); �̴�.
//bean.setSub(request.getParameter("sub")); <-setProperty�� ����. name�� ��ü �̸�, property�� �� �ڷ��� �̸� value�� ���ε� ������ ��
System.out.println(bean.getSub());
System.out.println(bean.getId());
System.out.println(bean.getContent());
System.out.println(bean.getNum());
System.out.println(bean);

%>

<%
	Bbs05Dao.inertOne(bean.getSub(), bean.getContent(), bean.getId());

%>



<jsp:forward page="list.jsp"></jsp:forward>

</body>
</html>