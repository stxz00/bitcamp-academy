<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean" class="com.bit.bbs05.dto.Bbs05Dto"></jsp:useBean>
<jsp:setProperty property="*" name="bean"/>

<% 
int result=com.bit.bbs05.dao.Bbs05Dao.updateOne(bean);
if(result>0) response.sendRedirect("detail.jsp?num="+bean.getNum());
else response.sendRedirect("edit.jsp?num="+bean.getNum());
%>
</body>
</html>