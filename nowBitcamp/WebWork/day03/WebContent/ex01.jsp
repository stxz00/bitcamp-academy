<%@page import="org.apache.catalina.core.AprLifecycleListener"%>
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
	//��� ���尴ü�� �⺻
	ServletRequest req=pageContext.getRequest();
	
	ServletResponse res=pageContext.getResponse();
	//����(session) : ���Ӵ� ������ �����ϰų� ����� ������ �������� ��(�α��� �� �����ϸ� ���� ���� ������ �����ϴ� ��)
	
	//application:�� ���ø����̼ǿ����� ���� ��� ��������
	String path=application.getContextPath(); 
	//���� ��� �ÿ� ���� ���°� �����ؽ�Ʈ�н�
	out.println(path);
	//out : jsp �������� �����ϴ� ����� ����� �� ���Ǵ� ��� ��Ʈ��. ���۸� ���� �����Ƿ� �ӵ��� ���� �������� �ݸ� ������
	//config : jsp �������� ���� �������� ����.
	//page : jsp �������� ������ �ڹ� Ŭ������ ���� ���� ����
	//exception : ������ ���� ���� ���
	out.println("���");
	//������ ���� �±׸� ����־�� �����ѰŰ� �̰� �ҽ��ڵ��� ������ �����
	path=application.getRealPath("imgs/game1.png");
	out.println("<br>" + path);
	
%>	
<img alt="" src="imgs/game1.png">
</body>
</html>