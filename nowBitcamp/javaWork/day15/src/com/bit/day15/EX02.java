package com.bit.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
//		InputStream inn = System.in;
		
//		java.util.Scanner sc;
		//java.util�� ������ �ִ� �ڹ� ����� �����ϰ� �� �� �ֵ��� ����� �����ϴ� �͵��� ����
//		sc = new Scanner(inn);
		//�ֿܼ��� ���� ������ �о���̴� InputStream�� ���ڷ� �޴� ��
		
//		String msg = sc.nextLine();
		//���� InputStream�� �޸� �о���̴� ������ �� ���� ��, ���� \r\n�� ���� ������ ȭ���� ����� �ִ°�
//		System.out.println(msg);
		
//		msg = sc.next();
//		System.out.println(msg);
		// next�� ������ �ƴ����� ������ ���� , ���� �� �ű������ ���
		
		
		
		File file = new File("test01.txt");
		InputStream inn;
		
		
		try {
			inn = new FileInputStream(file);
			java.util.Scanner sc;
			sc = new Scanner(inn);
			//�ֿܼ��� �Է¹޴°� �ƴ� ������ �Է¹޴°�(����)
//			sc = new Scanner(file); �ص� �� 
			String msg = sc.nextLine();
			System.out.println(msg);
			msg = sc.nextLine();
			System.out.println(msg);
			msg = sc.nextLine();
			System.out.println(msg);
			msg = sc.nextLine();
			System.out.println(msg);
			msg = sc.nextLine();
			System.out.println(msg);
			msg = sc.nextLine();
			System.out.println(msg);
			// �� 1���྿ �Է¹ް� ���
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String test = "ABCD\nEFG\n1235\n";
		java.util.Scanner sc;
		sc = new Scanner(test);
		//�̷��Ե� �翬�� ��
		String msg1 = sc.nextLine();
		System.out.println(msg1);
		msg1 = sc.nextLine();
		System.out.println(msg1);
		msg1 = sc.nextLine();
		System.out.println(msg1);
		
	}
}
