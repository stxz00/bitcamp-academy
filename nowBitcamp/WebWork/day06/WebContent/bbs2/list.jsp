<%@page import="com.bit.util.MyOracle"%>
<%@page import="com.bit.bbs06.Bbs06Bean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%! String path="../"; %>
<%@ include file="/template/header.jspf" %>
<%@ include file="/template/menu3.jspf" %>
<h1>�ι�° �Խ��� ����Ʈ</h1>

<table align="center" border="1" cellspacing="0">
	<tr>
		<th>��ȣ</th>
		<th width="50%">����</th>
		<th>�۾���</th>
		<th>��¥</th>
	</tr>
	<%
	java.util.ArrayList<Bbs06Bean> list;
		list=new java.util.ArrayList<Bbs06Bean>();
		String sql="select * from bbs06 where name like ? order by num desc";
		java.sql.PreparedStatement pstmt=null;
		try{
			conn=MyOracle.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,"%");
			rs=pstmt.executeQuery();
			while(rs.next()){
		if(rs.getInt("del")==0){
			Bbs06Bean bean=new Bbs06Bean();
			bean.setNum(rs.getInt("num"));
			bean.setSub(rs.getString("sub"));
			bean.setName(rs.getString("name"));
			bean.setNalja(rs.getDate("nalja1"));
			list.add(bean);
		}
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		// 1.7~ ������ ������ (���� for��)
		// ���׸� �Բ�
		for(Bbs06Bean bean:list){
	%>
	<tr>
		<td><a href="detail.jsp?idx=<%=bean.getNum() %>"><%=bean.getNum() %></a></td>
		<td><a href="detail.jsp?idx=<%=bean.getNum() %>"><%=bean.getSub() %></a></td>
		<td><a href="detail.jsp?idx=<%=bean.getNum() %>"><%=bean.getName() %></a></td>
		<td><a href="detail.jsp?idx=<%=bean.getNum() %>"><%=bean.getNalja() %></a></td>
	</tr>
	<%}
	%>
</table>
<a href="add.jsp">[�� ��]</a>
<%@ include file="/template/footer.jspf" %>
</body>
</html>




