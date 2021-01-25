package com.bit.oracle01;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.StatementEvent;

import oracle.jdbc.driver.OracleDriver;

public class Ex01 {
	
	public static void main(String[] args) {
		//jdbc:oracle:<drivertype>:@<database>
		//jdbc:oracle:thin:@myhost:1521:xe
//		String sql = "select deptno, dname from dept where deptno=10";
//		String sql = "select deptno, dname  from dept";
//		String sql = "select ename, job from emp where sal>=3000";
//		String sql = "select deptno, loc from dept";
		String sql = "select deptno,dname,loc from dept";
		String url = "jdbc:oracle:thin:@localHost:1521:xe";
		
		java.util.Properties prop = new Properties();
		//�ܺ� ������ �ڹٽý������� �ε��ϴ� ��, ���� ������� �����Ѵ�, Map �÷���(key,value)���� �����Ѵ�(Hashtable�� ����Ŭ����)
		//���� ���α׷��� ���� ������ �Ķ���͵��� �����ϱ� ���� �ڹ��� ���� ����� �ַ� ����ϴ� ���� Ȯ����
		
		prop.setProperty("user", "scott"); //user�� password�� ������ Ű����!!
		prop.setProperty("password", "tiger");
		
		oracle.jdbc.driver.OracleDriver driver;
		driver = new OracleDriver();
		
		Connection conn = null;
		try {
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url,prop); //������ �ּҿ� ��Ʈ, ���̵�� ��й�ȣ �Է�
//			System.out.println(conn); //��ü�� ��Ҵ��� Ȯ����
			//�̷��� ���� ����Ŭ ���� �Ϸ�
			java.sql.Statement stmt = conn.createStatement();  
			//�ڹٿ� DB���� ���ΰ� ���޿����� ����
			ResultSet rs = stmt.executeQuery(sql);
			//���޹��� ���� ��� Set���� ����(IO�۾����ִ°�)
//			rs.next(); //Ŀ���� �̵�
//			System.out.println(rs.next());
//			System.out.println(rs.getString(1)); //1��°Į��
//			System.out.println(rs.getString(2)); //2��°Į��
//			System.out.println(rs.next());
			
			while(rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.println(rs.getString(3));
			}
			//rs ���� �� ���� �ٽ� ������ �������� rs = stmt.executeQuery(sql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {conn.close();}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
