package com.bit.exercise2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class Ex03 {
	public static void main(String[] args) {
		String sql = "insert into dept  (deptno, dname ,loc) values (80,'����','�뱸')";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Properties prop = new Properties();
		prop.setProperty("user", "scott");
		prop.setProperty("password", "tiger");
		OracleDriver driver = new OracleDriver();
		Connection conn = null;
		try {
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url,prop);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Insert �Ϸ�");
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