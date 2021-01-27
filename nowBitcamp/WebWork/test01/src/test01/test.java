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
		System.out.println("학생성적관리프로그램(ver 0.8.0)");
		System.out.println("------------------------------------");
		String num = "-1";

		while(true) {
			System.out.print("1.학생목록 2. 학생등록 3.학생정보 4.성적입력 5.성적수정 6.학번삭제 0.종료 \n>");
			num=sc.nextLine();
			if(num.equals("0")) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}else if(num.equals("1")) {
				System.out.println("성적을 입력하지 않은 학번은 조회되지 않습니다.");
				System.out.println("학번\tㅣ이름\tㅣ나이\tㅣ국어\tㅣ영어\tㅣ수학\tㅣ총점\tㅣ평균\tㅣ순위\tㅣ");
				String sql="select A.num,A.name,A.age,B.kor,B.eng,B.math,B.kor+B.eng+B.math,floor((B.kor+B.eng+B.math)/3),"
						+ " dense_rank() over (order by B.kor+B.eng+B.math desc) from stu A inner join grade B on A.num=B.num order by num asc";
				
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					while(rs.next()) {
						System.out.print(rs.getString(1)+"\tㅣ");
						System.out.print(rs.getString(2).substring(0,3)+"ㅣ");
						System.out.print(rs.getString(3)+"\tㅣ");
						System.out.print(rs.getString(4)+"\tㅣ");
						System.out.print(rs.getString(5)+"\tㅣ");
						System.out.print(rs.getString(6)+"\tㅣ");
						System.out.print(rs.getString(7)+"\tㅣ");
						System.out.print(rs.getString(8)+"\tㅣ");
						System.out.print(rs.getString(9)+"\tㅣ");
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
				//학생등록
				String name=new String();
				int age=-1;
				while(true) {
					System.out.print("이름을 입력하세요\n>");
					name=sc.nextLine();
					if(name.isEmpty()|| name.length()>3) {
						System.out.println("이름은 비울 수 없으며 한글 3자까지만 가능합니다");
					}else {break;}
				}
				
				while(true) {
					System.out.print("나이를 입력하세요\n>");
					try {
						age=Integer.parseInt(sc.nextLine());
					}catch (NumberFormatException e) {
						System.out.println("나이는 비울 수 없습니다.");
						continue;
					}
					if(age>80||age<1) {
						System.out.println("1살부터 80살까지만 입력해주세요");
					}else {break;}
				}
				
				String sql="insert into stu (num,name,age) values(stu_seq.nextval,'"+name+"','"+age+"')";
				//System.out.println(sql);
				
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					stmt.executeUpdate(sql);
					
				} catch (SQLException e) {
					System.out.println("잘못된 입력으로 인해 학생 등록이 취소되었습니다.");
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
				//학생정보
				System.out.print("조회할 학번을 입력하세요\n>");
				String stuNum=sc.nextLine();
				String sql="select A.num,A.name,A.age,B.kor,B.eng,B.math,B.kor+B.eng+B.math,floor((B.kor+B.eng+B.math)/3),"
						+ "rank() over (order by B.kor+B.eng+B.math desc) from stu A full join grade B on A.num=B.num where A.num="+stuNum+"order by num asc";
				System.out.println("학번\tㅣ이름\tㅣ나이\tㅣ국어\tㅣ영어\tㅣ수학\tㅣ총점\tㅣ평균\tㅣ");
					
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					if(rs.next()) {
						System.out.print(rs.getString(1)+"\tㅣ");
						System.out.print(rs.getString(2).substring(0,3)+"ㅣ");
						System.out.print(rs.getString(3)+"\tㅣ");
						System.out.print(rs.getString(4)+"\tㅣ");
						System.out.print(rs.getString(5)+"\tㅣ");
						System.out.print(rs.getString(6)+"\tㅣ");
						System.out.print(rs.getString(7)+"\tㅣ");
						System.out.print(rs.getString(8)+"\tㅣ");
						System.out.println();
					}
				} catch (SQLException e) {
					System.out.println("학번이 존재하지 않습니다.");
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
				//성적입력
				System.out.print("성적을 입력할 학번을 입력하세요\n>");
				String stuNum=sc.nextLine();
				
				String sql="select num from stu where num="+stuNum;			
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					if(rs.next()) {
						System.out.println("입력할 학번은 "+rs.getString(1) + "입니다.");
					}
				} catch (SQLException e) {
					System.out.println("입력할 학번이 존재하지 않습니다. 먼저 학생등록을 해주시기 바랍니다.");
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
						System.out.println("이미 성적입력된 학번입니다. 수정하시려면 5번을 입력하세요.");
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
				System.out.print("국어 점수를 입력하세요\n>");
				String kor=sc.nextLine();
				System.out.print("영어 점수를 입력하세요\n>");
				String eng=sc.nextLine();
				System.out.print("수학 점수를 입력하세요\n>");
				String math=sc.nextLine();
				
				sql="insert into grade (num,kor,eng,math) values('"+stuNum+"',"+kor+","+eng+","+math+")";
				
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					stmt.executeUpdate(sql);
					
				} catch (SQLException e) {
					System.out.println("잘못된 입력으로 인해 성적 입력이 취소되었습니다.");
					System.out.println("성적을 잘 입력하였는지 확인하시기 바랍니다.");
					System.out.println("점수는 0~100점 이내로만 입력이 가능합니다.");
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
				//성적수정
				System.out.print("성적을 수정할 학번을 입력하세요\n>");
				String stuNum=sc.nextLine();
				
				String sql="select num from stu where num="+stuNum;		
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					if(rs.next()) {
						System.out.println("입력할 학번은 "+rs.getString(1) + "입니다.");
					}
				} catch (SQLException e) {
					System.out.println("수정할 학번이 존재하지 않습니다. 먼저 학생등록을 해주시기 바랍니다.");
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
						System.out.println("성적이 등록되어 있지 않은 학번입니다. 성적을 입력하시려면 4번을 입력하세요.");
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
				System.out.print("국어 점수를 입력하세요\n>");
				String kor=sc.nextLine();
				System.out.print("영어 점수를 입력하세요\n>");
				String eng=sc.nextLine();
				System.out.print("수학 점수를 입력하세요\n>");
				String math=sc.nextLine();
				
				sql="update grade set kor="+kor+",eng="+eng+",math="+math+" where num='"+stuNum+"'";
				System.out.println(sql);
				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					stmt.executeUpdate(sql);
					
				} catch (SQLException e) {
					System.out.println("잘못된 입력으로 인해 성적 입력이 취소되었습니다.");
					System.out.println("성적을 잘 입력하였는지 확인하시기 바랍니다.");
					System.out.println("점수는 0~100점 이내로만 입력이 가능합니다.");
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
				//학번 삭제
				System.out.print("삭제할 학번을 입력하세요. 입력한 성적도 같이 삭제됩니다\n>");
				String stuNum=sc.nextLine();
				String sql="delete from stu where num="+stuNum;

				try {
					conn=DriverManager.getConnection(url,user,password);
					stmt=conn.createStatement();
					stmt.executeUpdate(sql);
				} catch (SQLException e) {
					System.out.println("존재하지 않는 학번입니다.");
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
