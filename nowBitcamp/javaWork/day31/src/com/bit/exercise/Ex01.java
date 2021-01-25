package com.bit.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class Ex01 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("�л������������α׷� ver 0.8.0");
		
		String menu = "1.��ȸ 2.�Է� 3.���� 4.���� 0.����\n>>";
		while(true){
			System.out.print(menu);
			int su = sc.nextInt();
			if(su == 0) {
				break;
			}else if(su == 1) {
				System.out.println("----------------------------------------");
				System.out.println("�й�\t�̸�\t����\t����\t����");
				System.out.println("----------------------------------------");
				db("��ȸ");
			}else if(su == 2) {
				db("�߰�");
			}else if(su == 3) {
				db("����");
			}else if(su == 4) {
				db("����");
			}
		}
		
	}
	static void db(String crud) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Properties prop = new Properties();
		prop.setProperty("user", "scott");
		prop.setProperty("password", "tiger");
		OracleDriver driver = new OracleDriver();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = new String();
		try {
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url,prop);
			stmt = conn.createStatement();
			if(crud.equals("��ȸ")) {
				sql = "select * from student01";
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\t");
					System.out.println(rs.getString(5));
				}
				
			}else if(crud.equals("�߰�")) {
				String insert = "insert into student01 values(";
				System.out.print("�й��� �Է��ϼ���\n>>");
				int stuId = sc.nextInt();
				sql += stuId;
				System.out.print("�̸��� �Է��ϼ���\n>>");
				sc.nextLine();
				String name = sc.nextLine();
				sql += ",'" + name + "'";
				System.out.print("���� ������ �Է��ϼ���\n>>");
				int su = sc.nextInt();
				sql += "," + su;
				System.out.print("���� ������ �Է��ϼ���\n>>");
				su = sc.nextInt();
				sql += "," + su;
				System.out.print("���� ������ �Է��ϼ���\n>>");
				su = sc.nextInt();
				sql += "," + su +")";
				
				insert += sql;
				System.out.println(insert);
				stmt.executeUpdate(insert);
				
			}else if(crud.equals("����")){
				String update = "update student01 set num=";
				System.out.print("�й��� �Է��ϼ���\n>>");
				int stuId = sc.nextInt();
				sql += stuId;
				System.out.print("�̸��� �Է��ϼ���\n>>");
				sc.nextLine();
				String name = sc.nextLine();
				sql += ",name='" + name + "'";
				System.out.print("���� ������ �Է��ϼ���\n>>");
				int su = sc.nextInt();
				sql += ",kor=" + su;
				System.out.print("���� ������ �Է��ϼ���\n>>");
				su = sc.nextInt();
				sql += ",eng=" + su;
				System.out.print("���� ������ �Է��ϼ���\n>>");
				su = sc.nextInt();
				sql += ",math=" + su +" ";
				update += sql + "where num=" + stuId;
				System.out.println(update);
				stmt.executeUpdate(update);
			}else if(crud.equals("����")) {
				System.out.print("������ �й��� �Է��ϼ���\n>>");
				int su = sc.nextInt();
				String remove = "delete from student01 num where num=" + su;
				System.out.println(remove);
				stmt.executeUpdate(remove);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {rs.close();}
				if(stmt != null) {stmt.close();}
				if(conn != null) {conn.close();}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
