<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%//������ �鿣�� ������ ����Ʈ���� ����. �鿣��� �����ô����� ������
	//����Ʈ����� ������ ���忡���� day07�� ���ؽ�Ʈ���� �������� ��
		// /���Ͱ� ��Ʈ�̱� ����. �׷��� ������ �̷��� day07 �����ؼ�
			// �����θ� ������. %>
		<%
			String paths=application.getContextPath();
			System.out.println(paths);
			
			String path=request.getParameter("path");
		%>
		<tr>
			<td bgcolor="gray">
				<a href="<%=path %>index.jsp">[HOME]</a>
				<a href="<%=path %>intro.jsp">[INTRO]</a>
				<a href="<%=path %>bbs/list.jsp">[B B S]</a>
				<a href="#.jsp">[LOGIN]</a>
			</td>
		</tr>
		<tr>
			<td>
				<!-- ������� -->
