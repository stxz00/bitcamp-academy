package test01;

import java.sql.*;
import java.util.Scanner;
import oracle.jdbc.driver.OracleDriver;

public class test {
	public static void main(String[] args) {
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		new OracleDriver();
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		

		Scanner sc = new Scanner(System.in);
		System.out.println("�л������������α׷�(ver 0.8.0)");
		System.out.println("------------------------------------");
		String num = "-1";

		while(true) {
			System.out.print("1.�л���� 2. �л���� 3.�л����� 4.�����Է� 5.�������� 6.�й����� 0.���� \n>");
			num=sc.nextLine();
			if(num.equals("0")) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}else if(num.equals("1")) {
				System.out.println("������ �Է����� ���� �й��� ��ȸ���� �ʽ��ϴ�.");
				System.out.println("�й�\t���̸�\t�ӳ���\t�ӱ���\t�ӿ���\t�Ӽ���\t������\t�����\t�Ӽ���\t��");
				String sql="select A.num,A.name,A.age,B.kor,B.eng,B.math,B.kor+B.eng+B.math,floor((B.kor+B.eng+B.math)/3),"
						+ " dense_rank() over (order by B.kor+B.eng+B.math desc) from stu A inner join grade B on A.num=B.num order by num asc";
				
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					while(rs.next()) {
						System.out.print(rs.getString(1)+"\t��");
						System.out.print(rs.getString(2).substring(0,3)+"��");
						System.out.print(rs.getString(3)+"\t��");
						System.out.print(rs.getString(4)+"\t��");
						System.out.print(rs.getString(5)+"\t��");
						System.out.print(rs.getString(6)+"\t��");
						System.out.print(rs.getString(7)+"\t��");
						System.out.print(rs.getString(8)+"\t��");
						System.out.print(rs.getString(9)+"\t��");
						System.out.println();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						if(rs!=null) rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}else if(num.equals("2")) {
				//�л����
				String name=new String();
				int age=-1;
				while(true) {
					System.out.print("�̸��� �Է��ϼ���\n>");
					name=sc.nextLine();
					if(name.isEmpty()|| name.length()>3) {
						System.out.println("�̸��� ��� �� ������ �ѱ� 3�ڱ����� �����մϴ�");
					}else {break;}
				}
				
				while(true) {
					System.out.print("���̸� �Է��ϼ���\n>");
					try {
						age=Integer.parseInt(sc.nextLine());
					}catch (NumberFormatException e) {
						System.out.println("���̴� ��� �� �����ϴ�.");
						continue;
					}
					if(age>80||age<1) {
						System.out.println("1����� 80������� �Է����ּ���");
					}else {break;}
				}
				
				String sql="insert into stu (num,name,age) values(stu_seq.nextval,'"+name+"','"+age+"')";
				//System.out.println(sql);
				
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					stmt.executeUpdate(sql);
					
				} catch (SQLException e) {
					System.out.println("�߸��� �Է����� ���� �л� ����� ��ҵǾ����ϴ�.");
				}finally {
					try {
						if(rs!=null) rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}else if(num.equals("3")) {
				//�л�����
				System.out.print("��ȸ�� �й��� �Է��ϼ���\n>");
				String stuNum=sc.nextLine();
				String sql="select A.num,A.name,A.age,B.kor,B.eng,B.math,B.kor+B.eng+B.math,floor((B.kor+B.eng+B.math)/3),"
						+ "rank() over (order by B.kor+B.eng+B.math desc) from stu A full join grade B on A.num=B.num where A.num="+stuNum+"order by num asc";
				System.out.println("�й�\t���̸�\t�ӳ���\t�ӱ���\t�ӿ���\t�Ӽ���\t������\t�����\t��");
					
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					if(rs.next()) {
						System.out.print(rs.getString(1)+"\t��");
						System.out.print(rs.getString(2).substring(0,3)+"��");
						System.out.print(rs.getString(3)+"\t��");
						System.out.print(rs.getString(4)+"\t��");
						System.out.print(rs.getString(5)+"\t��");
						System.out.print(rs.getString(6)+"\t��");
						System.out.print(rs.getString(7)+"\t��");
						System.out.print(rs.getString(8)+"\t��");
						System.out.println();
					}
				} catch (SQLException e) {
					System.out.println("�й��� �������� �ʽ��ϴ�.");
				}finally {
					try {
						if(rs!=null) rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}else if(num.equals("4")) {
				//�����Է�
				System.out.print("������ �Է��� �й��� �Է��ϼ���\n>");
				String stuNum=sc.nextLine();
				
				String sql="select num from stu where num="+stuNum;			
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					if(rs.next()) {
						System.out.println("�Է��� �й��� "+rs.getString(1) + "�Դϴ�.");
					}
				} catch (SQLException e) {
					System.out.println("�Է��� �й��� �������� �ʽ��ϴ�. ���� �л������ ���ֽñ� �ٶ��ϴ�.");
				}finally {
					try {
						if(rs!=null) rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				boolean boo=false;
				sql="select num from grade where num="+stuNum;			
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					if(rs.next()) {
						rs.getString(1);
						System.out.println("�̹� �����Էµ� �й��Դϴ�. �����Ͻ÷��� 5���� �Է��ϼ���.");
						boo=true;
					}
					
				} catch (SQLException e) {
					boo=false;
				}finally {
					try {
						if(rs!=null) rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				if(boo) {
					continue;
				}
				System.out.print("���� ������ �Է��ϼ���\n>");
				String kor=sc.nextLine();
				System.out.print("���� ������ �Է��ϼ���\n>");
				String eng=sc.nextLine();
				System.out.print("���� ������ �Է��ϼ���\n>");
				String math=sc.nextLine();
				
				sql="insert into grade (num,kor,eng,math) values('"+stuNum+"',"+kor+","+eng+","+math+")";
				
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					stmt.executeUpdate(sql);
					
				} catch (SQLException e) {
					System.out.println("�߸��� �Է����� ���� ���� �Է��� ��ҵǾ����ϴ�.");
					System.out.println("������ �� �Է��Ͽ����� Ȯ���Ͻñ� �ٶ��ϴ�.");
					System.out.println("������ 0~100�� �̳��θ� �Է��� �����մϴ�.");
				}finally {
					try {
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}else if(num.equals("5")) {
				//��������
				System.out.print("������ ������ �й��� �Է��ϼ���\n>");
				String stuNum=sc.nextLine();
				
				String sql="select num from stu where num="+stuNum;		
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					if(rs.next()) {
						System.out.println("�Է��� �й��� "+rs.getString(1) + "�Դϴ�.");
					}
				} catch (SQLException e) {
					System.out.println("������ �й��� �������� �ʽ��ϴ�. ���� �л������ ���ֽñ� �ٶ��ϴ�.");
				}finally {
					try {
						if(rs!=null) rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				boolean boo=false;
				sql="select kor from grade where num="+stuNum;			
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					String index=new String();
					if(rs.next()) {
						index=rs.getString(1);
					}
					if(index.isEmpty()) {
						System.out.println("������ ��ϵǾ� ���� ���� �й��Դϴ�. ������ �Է��Ͻ÷��� 4���� �Է��ϼ���.");
						boo=true;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						if(rs!=null) rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				if(boo) {
					continue;
				}
				System.out.print("���� ������ �Է��ϼ���\n>");
				String kor=sc.nextLine();
				System.out.print("���� ������ �Է��ϼ���\n>");
				String eng=sc.nextLine();
				System.out.print("���� ������ �Է��ϼ���\n>");
				String math=sc.nextLine();
				
				sql="update grade set kor="+kor+",eng="+eng+",math="+math+" where num='"+stuNum+"'";
				System.out.println(sql);
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					stmt.executeUpdate(sql);
					
				} catch (SQLException e) {
					System.out.println("�߸��� �Է����� ���� ���� �Է��� ��ҵǾ����ϴ�.");
					System.out.println("������ �� �Է��Ͽ����� Ȯ���Ͻñ� �ٶ��ϴ�.");
					System.out.println("������ 0~100�� �̳��θ� �Է��� �����մϴ�.");
				}finally {
					try {
						if(rs!=null) rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}else if(num.equals("6")) {
				//�й� ����
				System.out.print("������ �й��� �Է��ϼ���. �Է��� ������ ���� �����˴ϴ�\n>");
				String stuNum=sc.nextLine();
				String sql="delete from stu where num="+stuNum;

				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					stmt.executeUpdate(sql);
				} catch (SQLException e) {
					System.out.println("�������� �ʴ� �й��Դϴ�.");
				}finally {
					try {
						if(rs!=null) rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				sql="delete from grade where num="+stuNum;
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					stmt.executeUpdate(sql);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						if(rs!=null) rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}
	}
}
