<%@page import="java.sql.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>����-Ʈ�Դ�</title>
<% System.out.println(session.getAttribute("loginResult")); %>
</head>
<% 
	class Al{
		int num,cont,ref,ord,lev;
		String id,sub,content;
		java.util.Date nalja;
	}

	int total=0;
	int p=1;
	try{
		p=Integer.parseInt(request.getParameter("p"));
	}catch(NumberFormatException e){}
	
	String key=request.getParameter("key");
	String word=request.getParameter("word");
	if(key==null)key="sub";
	if(word==null)word="";
	
	String sql="select * from exercise02_guest "
			+"where "+key+" like '%"+word+"%' "
			+"and num between (select max(num)-("+(p-1)+"*14)-13 from "
			+"exercise02_guest) and (select max(num)-"+"("+(p-1)+"*14) from "
			+"exercise02_guest) order by num desc";
	System.out.println(sql);
	java.util.ArrayList<Al> list=new ArrayList<Al>();
	ArrayList<Al> ranklist= new ArrayList<Al>();
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	String driver="oracle.jdbc.driver.OracleDriver";
	Class.forName(driver);
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	try{
		conn=DriverManager.getConnection(url,user,password);
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()){
			Al al = new Al();
			al.num=rs.getInt("num");
			al.sub=rs.getString("sub");
			al.id=rs.getString("id");
			al.nalja=rs.getDate("nalja");
			list.add(al);
		}
		rs.close();
		pstmt.close();
		sql="select count(*) from exercise02_guest";
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		if(rs.next())total=rs.getInt(1);
		System.out.println(total);
		rs.close();
		pstmt.close();
		
		sql="select * from exercise02_guest order by cnt desc, num desc";
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		int a=0;
		while(rs.next()){
			a++;
			Al al = new Al();
			al.num=rs.getInt("num");
			al.sub=rs.getString("sub");
			al.id=rs.getString("id");
			al.nalja=rs.getDate("nalja");
			ranklist.add(al);
			if(a==3)break;
		}
	}finally{
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}

%>

<body bgcolor="#FFFAFA">
	<table width="1120" border="0" cellspacing="12" align="center">
		<tr>
			<td align="left">
				<form action="https://tgd.kr/">
					<input type="image" src="imgs/logo_new.png">
				</form>	
			</td>
			
			<td align="right" width="900">
				
				<form action="#.jsp">
					<% 
					if(session.getAttribute("loginResult")==null){
						%>
						<a href="login.jsp" style="color:gray">[�α���]</a>
					 <% 
					}else{
					%>
						<a href="logout.jsp" style="color:gray">[�α׾ƿ�]</a>
					<%
					}
					%>
					 <a href="logadd.jsp" style="color:gray">[ȸ������]</a> 
					<input width="300" type="text" name="content" value="Ʈ�Դ� �˻�" style="color:gray">
					<input width="17" type="image" name="" src="imgs/doc.png">
				</form>
			</td>
		</tr>
		<tr>
			<td colspan="2" width="100%">
				<img alt="" src="imgs/top.png" width="100%">
			</td>
		</tr>
	</table>
	<br>
	<table width="1100" align="center">
		<tr>
			<td width="300">
			<table border="0" cellspacing="0" bordercolor="#FFFAFA">
				<tr>
				 <th bgcolor="#6600CG" width="100%" height="30" style="color:white" width="99%"> &nbsp;&nbsp;<img alt="" src="imgs/one.png"> Ʈ�Դ� ��ü �޴�&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/A.png"> ��ü �� ����</td>
				</tr>
				
				<tr>
					<td bgcolor="#E6E6FA" height="2"></td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/B.png"> ��Ʈ���� �Խ���</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/C.png"> Ŀ�´�Ƽ</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/H.png"> ��Ŭ��</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/link.png"> Ʈ�Դ� ��ŷ</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/link.png"> ���Ӵ�ȸ</td>
				</tr>
				
				<tr>
					<td bgcolor="#E6E6FA" height="2"></td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/P.png"> ���ȫ��</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/U.png"> ���α���</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/Q.png"> Q&A</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/T.png"> ��� TIP</td>
				</tr>
				
				<tr>
					<td bgcolor="#E6E6FA" height="2"></td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/N.png"> ��������</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/E.png"> �̺�Ʈ</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/S.png"> ����/�Ű�</td>
				</tr>
				
				<tr>
					<td bgcolor="white" ><img alt="" src="imgs/gwanggo.png" width="100%"></td>
				</tr>
				
			</table>
			</td>
			<td  bgcolor="white" align="left" valign="top" width="1200">
				<table width="98%" height="90%" align="center">
					<tr>
						<td align="left" width="6000" height="50" style="font-size: 25px;">
						<a href="index.jsp" style="text-decoration:none">����</a>
						<img alt="" src="imgs/rank.png">
						<img alt="" src="imgs/human.png">
						</td>
						<td rowspan="3" align="right">
						<img alt="" src="imgs/ral.png" width="50%" align="middle">
						</td>
					</tr>
					<tr>
						<td bgcolor="#F5F5F5" >
						</td>
					</tr>
					<tr>
						<td style="color:#191970">
						<img alt="" src="imgs/star.png"> ���ã�� (2,034) 
						<img alt="" src="imgs/trop.png"> <a href="https://ranking.tgd.kr/" style="text-decoration:none">��ŷ</a>
						<img alt="" src="imgs/info.png"> <a href="https://tgd.kr/s/aba4647/profile" style="text-decoration:none">�Ұ�</a>
						<img alt="" src="imgs/icon.png"> <a href="https://www.twitch.tv/aba4647" style="text-decoration:none">ä��</a>
						<img alt="" src="imgs/sce.png"> <a href="https://tgd.kr/s/aba4647/schedule" style="text-decoration:none">������</a>
						<img alt="" src="imgs/gal.png"> <a href="https://tgd.kr/s/aba4647?gallery=1" style="text-decoration:none">������</a>
						<img alt="" src="imgs/clip.png"> <a href="https://tgd.kr/clips?streamer_id=29654002" style="text-decoration:none">Ŭ��</a>
						</td>
					</tr>
					
					<tr>
						<td bgcolor="gray" colspan="3" width="500">
						<img alt="" src="imgs/gwanggo2.png" width="100%">
						</td>
					</tr>
					<tr>
					<td height="35" bgcolor="#F5F5F5" style="font-size:13px;">&nbsp;<strong style="font-size:9pt;">����</strong>&nbsp;<img alt="" src="imgs/gong.png">&nbsp;���ΰԽ����Դϴ�.
						</td>
						<td align="center" width="900" bgcolor="#F5F5F5" style="font-size:13px; color: #4B0082"><img alt="" src="imgs/geder.png"> <strong>Ʈ�Դ�</strong>
						</td>
						<td align="center" width="600" bgcolor="#F5F5F5" style="font-size:13px; color: #4B0082"><strong>20/19/18</strong>
						</td>
					</tr>
					
					<%
						for(int i=0; i<ranklist.size(); i++){	
							Al al=ranklist.get(i);
					%>
					<tr>
						<td height="35" bgcolor="#E6E6FA" style="font-size:13px;">&nbsp;<strong style="font-size:9pt;">�α�</strong>&nbsp;<img alt="" src="imgs/star2.png">&nbsp;<a href="detail/?num=<%=al.num %>" style="text-decoration: none; color: #000000" ><%=al.sub %></a>
						</td>
						<td align="center" width="900" bgcolor="#E6E6FA" style="font-size:13px; color: #4B0082"><strong><%=al.id %></strong>
						</td>
						<td align="center" width="600" bgcolor="#E6E6FA" style="font-size:13px; color: #4B0082"><strong><%=al.nalja %></strong>
						</td>
					</tr>
					<% 
						}
					%>
				<%
					for(int i=0; i<list.size(); i++){
						Al al=list.get(i);
				%>
						<tr>
							<td height="35" style="font-size:13px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img alt="" src="imgs/qq.png">&nbsp;<a href="detail/?num=<%=al.num %>" style="text-decoration: none; color: #000000" ><%=al.sub %></a>
							</td>
							<td align="center" width="900" style="font-size:13px; color: #4B0082"><strong><%=al.id %></strong>
							</td>
							<td align="center" width="600" style="font-size:13px; color: #4B0082"><strong><%=al.nalja %></strong>
							</td>
						</tr>
				<%
					}
				%>
					<tr>
						<td height="25" width="300" colspan="3" style="font-size: 20px;">
						<form action="add.jsp" >
							<img alt="" src="imgs/famous.png">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<%
						int end=p;
						int start=(p-1)/5*5;
						System.out.println("start="+start);
						if(total%14==0){
							System.out.println("���� 0");
							end=total/14;
						}else{
							System.out.println("���� 0�ƴ�");
							end=(total/14)+1;
							System.out.println(end);
						}
						
						if(start+5<end){
							end=start+5;
						}
						if(p>5){
						%>
							<a href="index.jsp?p=<%=start %>">[��]</a>
						<% 	
						}
						for(int i=start; i<end; i++){
							if(p!=i+1){
						%>
							<a href="index.jsp?p=<%=i+1 %>">[<%=i+1 %>]</a>
						<%
							}else{
								out.println("["+p+"]");
							}
						}
						if(start+5<total/14+1){
						%>
							<a href="index.jsp?p=<%=end+1 %>">[��]</a>
						<% 
						}
						%>

							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="image" src="imgs/gl.png">
						</form>
						</td>
					</tr>
					<tr>
						<td align="center"  width="300" colspan="2" style="font-size: 15px;">
							<form style="float:left;margin:0;" >
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<select name="key" style="font-size: 17px;">
									<option value="sub">����
									<option value="id">�г���
								</select>
								<input type="text" width="700" style="font-size: 17px;" name="word" value="�˻���">
								<input type="image" src="imgs/ww.png" align="bottom" value="submit" name="submit" >
							</form>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<center>
		<p>&copy; 2017-2021 Ʈ�Դ�</p>
		<p>�̿��� | ����������޹�ħ | ���� ä�� �� | ������ | ������</p>
		<p>Ʈ�Դ��� Twitch���� ��ϴ� ����Ʈ�� �ƴմϴ�.</p>
		<p>����Ϲ������� ��ȯ�ϱ�</p>
	
	
	</center>
	
	
</body>
</html>