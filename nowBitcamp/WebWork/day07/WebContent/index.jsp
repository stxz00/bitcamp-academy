<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>list</title>
<%//<jsp: �� �׼��±� �ڹ��ڵ�ó�� �۵��� 
//�±� �ݴ� ���̿� ������ element �� ���� ������ ����(�����̽��ٵ�)
//jsp:include������ �ڹ��ڵ� ���� ������ �� ������
//index�� include���� ���� ������ �Ǵµ� ��������� ��~�Ʒ��� ���� ����
//�� �츮�� ��� ������������ �����!(�����ϵǸ� ��Ƶ״ٰ� ������� ���  %>
</head>
<body>
<jsp:include page="template/header.jsp"><jsp:param value="./" name="path"/></jsp:include>
<jsp:include page="template/menu.jsp"><jsp:param value="./" name="path"/></jsp:include>
<img alt="" src="imgs/index.jpg">
<jsp:include page="template/footer.jsp"><jsp:param value="./" name="path"/></jsp:include>		
				
</body>
</html>