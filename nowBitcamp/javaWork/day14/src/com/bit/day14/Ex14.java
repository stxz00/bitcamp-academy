package com.bit.day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		// �л������������α׷�(ver 0.6.0)
		
		Scanner sc = new Scanner(System.in);
		
		File file = new File("grade.txt");
		
		try {
			InputStream is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		String title = "�л������������α׷�(ver 0.6.0)";
		System.out.println(title);
		byte[] by = new byte[title.length()];
		
		for(int i = 0; i < by.length; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		String table = "--------------------------------------\n�й�\t|����\t|����\t| ����\t| �հ�\n--------------------------------------";
		int input = 0;
		
		String students = new String();
		int cnt = 0;
		
		while(true) {
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.���� \n>");
			input = Integer.parseInt(sc.nextLine());
			if(input == 0) {break;}
			if(input == 1) {
				System.out.println(table);
				System.out.println(students);
			}
			if(input == 2) {

				System.out.print("�й�> ");
				int num = Integer.parseInt(sc.nextLine());
				students  = students + num + "\t";
				System.out.print("���� > ");
				int kor = Integer.parseInt(sc.nextLine());
				students  = students + kor + "\t";
				System.out.print("���� > ");
				int eng = Integer.parseInt(sc.nextLine());
				students  = students + eng + "\t";
				System.out.print("���� > ");
				int math = Integer.parseInt(sc.nextLine());
				students  = students + math + "\t";
				
				int sum = kor + eng + math;
				students  = students + sum + "\n";

			}
			if(input == 3) {
				System.out.print("������ �й�> ");
				String num1 = sc.nextLine();
				int s = students.indexOf("\t");
				
				System.out.println(s);
				
			}
			if(input == 4) {
				
			}

		}
		System.out.println("�̿����ּż� �����մϴ�");
		
		
		sc.close();
		
	}
}
