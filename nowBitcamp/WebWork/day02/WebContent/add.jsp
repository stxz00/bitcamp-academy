<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="0" cellspacing="0"  width="600" align="center">
	<tr>
		<td bgcolor="#000000" colspan="6"><img src="imgs\header.jpg"></td>
	</tr>
	<tr>
		<td align="center" background="imgs\menu.jpg"><img src="imgs\menu.jpg"></td>
		<td align="center" width="100" background="imgs\menu.jpg"><a href="index.jsp">[HOME]</a></td>
		<td align="center" width="100" background="imgs\menu.jpg"><a href="intro.jsp">[INTRO]</a></td>
		<td align="center" width="100" background="imgs\menu.jpg"><a href="list.jsp">[B B S]</a></td>
		<td align="center" width="100" background="imgs\menu.jpg"><a href="guest.jsp">[����]</a></td>
		<td align="center" background="imgs\menu.jpg"><img src="imgs\menu.jpg"></td>
	</tr>
	<tr>
		<td colspan="6">
		<center>
		<h1>BBS Insert Page</h1>
		<form action="insert.jsp">
		<table border="0">
			<tr>
				<td width="100" bgcolor="gray" align="center">����</td>
				<td><input type="text" name="sub" size="47"></td>
			</tr>
			<tr>	
				<td bgcolor="gray" align="center">�۾���</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>	
				<td colspan="2" align="center" ><textarea name="content" cols="60" rows="10"></textarea></td>
			</tr>
			<tr>	
				<td colspan="2" align="center">
					<input type="submit" value="�� ��">
					<input type="reset" value="�� ��">
				</td>
			</tr>
		</table>
		</form>
		</center>		
		</td>
	</tr>
</table>
</body>
</html>