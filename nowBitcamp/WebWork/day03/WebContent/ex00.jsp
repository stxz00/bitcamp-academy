<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>test page</h1>
	<%
		int a;
		a=1234;
		out.println(a);
		//D:\bitcamp(academy)\nowBitcamp\WebWork\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\day03\org\apache\jsp\index_jsp.java �� ��������
		//���⼭ ���� ���� �� Ȯ���ϰ� �������� ������ �״�� ����ǵ��� ��
		//WEB-INF�� ���� �Ұ����� ���̹Ƿ� ���⿡ �ؽ�Ʈ�� �׷��� ����� �� �ؽ�Ʈ�� ���� �ȵ�
		// http://localhost:8080/day03/index.jsp ���� 8080/���� /�� ��Ʈ, day03�� ���ؽ�Ʈ
		// �츮�� ���� �� ������� : ������Ʈ ��Ŭ��->Export ->WAR file -> ��� ������ �ǴϽ� �ϰ� �װ��� c����̺� ��Ĺ ->���۽��� �״�� �ø��� �˾Ƽ� Ǯ���� �������� �����غ��� ����! ������� ���� WAR���� ���� ���� �Ŀ� ���丮�� ��������
		//�ٸ� ������� localhost:8080/ ���� manager�� ���� WAR���� ���ε� ��Ű�� ��. ���ø����̼ǵ鿡�� ������ ������ �����ϰ� ���Ÿ� ������ ������. ��, ������ ������� ����
		//���� ��Ĺ�� ��ġ�ϸ�� ���׽��� docs manager Root ���� �� ����. �������� �ʹ� ���� ������ ������ �����ع����ϱ� �̸� ����. �׷��� �� ����� ��ȣ��
		// �͸� ���� �޴� �Ǵٸ� ����� day03 cmd���� jar.exe ���� ->cd WebContent->jar cf test2.war WebContent �� �ϸ� �Ǵµ� �׳� ��Ŭ������ ����
		// ���� ��ü��  //D:\bitcamp(academy)\nowBitcamp\WebWork\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\day03\org\apache\jsp\index_jsp.java ���� ��������� ���� ��ü��(���� Ÿ�������� �ʾҴ� �͵�)
		// ���� ��ü���̶� ��ũ��Ʈ�� ������ �� �� �ִ� �������� ���Ѵ�!		
		
		
	%>
</body>
</html>