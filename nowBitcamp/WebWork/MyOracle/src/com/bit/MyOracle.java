package com.bit;

import java.sql.*;

public class MyOracle {
	private static Connection conn=null;
	
	private MyOracle(){}
	
	public static Connection getConnection() {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
	
		try {
			if(conn==null || conn.isClosed()) {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	
//	public static void main(String[] args) {
//		System.out.println(getConnection());
//		try {
//			getConnection().close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
