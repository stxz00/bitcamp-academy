<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date,java.util.*"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- html �ּ� -->
	<h1>jsp page test</h1>
	<% //������ʹ� �ڹ� ��� ��� ����
	//html File�� jsp File�� �������� jsp�� �̷��� �ڹ� ����� �����Ѱ���
	//�ּ��ۼ�
	//Date date = new Date();
	//System.out.println(date);
	//main�̶�� �����ϸ� �� �׷��� �޼ҵ尡 ���⼭ �ȵǴ°�
	int a = 1234;
	for(int i = 0; i <10; i++){
	%>
		<p>���<%=i+1 %><%=a %></p> 
		<%//�̷��� %=�ϸ� �������� i+1�� ��µ�!
			//�̰� �ٷ� ǥ������!(out.print)
		%>
	<% 
	
	}
	//Ŭ���̾�Ʈ�� ���ο� �������� �������� �������� ���Ӱ� ��û�ؼ� ���ø����̼� ����->�����ͺ��̽�->���ø����̼Ǽ���->������->���������� ����
	//�ڹ��� �ڵ�� ���� ��������  ����� ��
	//�������� ���ö����� �����ͺ��̽��� ���Ͽ� ���ؾ��� ���� �־�� �Ѵٸ� �ڹٸ� �̿��ؼ� �������� ���� �ٵ� �ٷ� ������, �ڹٿ��� ��û�ؼ� �� ���� ���ø����̼� ����(��Ĺ, ���� �츮 ��Ĺ�� �������� ���ø����̼� ������ �� �� ���յǾ�����!)���� jsp�� ���Ͽ� ���������� �ൿ�� �����ְ� �������� �̰� �������� ����(��, �������� IO�� -> �ҽ��� ���� �ڹ��� �������� ������!) �׷��� �ڹٴ� ���ø����̼ǰ� �����ͺ��̽������� ������~ 
	// �ڹٴ� ��ü ������, ó�� ������ ��ü�� ��û�� ������ ��ü�� ���� �ϴ°� ��, ���Ӱ� �� �ʿ� ��� ó������ Ŭ�������� �ް� ������ ����� ������ ������ ��� �����ؼ� ������ ���ϰ� �ſ� ����.
	// ��ü�� ������ ����������� ��������.
	// jsp�� ��ũ��Ʈ ���.
	// html�� ���������� ���, jsp�� �ڹپ���ε� jsp�� ���������� ó�� ���ΰ�ħ���� �� �ڵ����� �ٲ���. �̴� ���ø����̼� ����(�ͽ�(was)�����̳�)���� �ڹ��ʿ��� ����� �� �˾Ƽ� �ڵ����� ó������(���ø����̼� �������� ��, �ҽ����� ����� �����ϵ� �ϴ�)
	
	%>
	<%!
	int a;
	class test{};
	%>
	
</body>
</html>
