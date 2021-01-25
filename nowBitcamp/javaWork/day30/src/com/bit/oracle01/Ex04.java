package com.bit.oracle01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class Ex04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("deptno?");
		String dept = sc.nextLine();
		System.out.println("dname?");
		String dname = sc.nextLine();
		System.out.println("loc?");
		String loc = sc.nextLine();
		String sql = "insert into dept(deptno,dname,loc) values (" + dept + ",'" + dname + "','" + loc  +"')";
		
		String url = "jdbc:oracle:thin:@localHost:1521:xe";
		Properties prop = new Properties();
		prop.setProperty("user","scott");
		prop.setProperty("password","tiger");
		OracleDriver driver = new OracleDriver();
		Connection conn = null;
		Statement stmt = null;
		try {
			DriverManager.registerDriver(driver);
			conn =DriverManager.getConnection(url,prop);
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			//�ѹ� �� �����ϸ� �̹� ���� ���� ��� �Ǿ��� ������ ���Ἲ �������� ����ȴٰ� ��
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) {stmt.close();}
				if(conn != null) {conn.close();}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		sc.close();
	}
}
