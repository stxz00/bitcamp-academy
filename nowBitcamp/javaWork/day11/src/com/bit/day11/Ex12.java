package com.bit.day11;

import java.util.Scanner;

class Student{
	int num,kor,eng,math;
}

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = "�л��������� ���α׷�(ver 0.4.1)";
		String menu = "1.���� 2.�Է� 3.���� 4.���� 0.����>";
		String table = "-----------------------------------------------";
		table += "\n�й�\t����\t����\t����";
		table += "\n-----------------------------------------------";
		System.out.println(title);
	
		System.out.print("�ѿ�>");
		int input = sc.nextInt();
		Student[] data = new Student[input];
/*		for(int i = 0; i < data.length; i++) {
			data[i] = new Student();
		}
*/		
		while(true) {
			System.out.print(menu);
			input = sc.nextInt();
			if(input == 0) {break;}
			if(input == 1) {
				System.out.println(table);
				
				for(int i = 0; i < data.length; i++) {
					Student stu = data[i];
					if(stu == null) {continue;}
					System.out.println(stu.num + "\t"+stu.kor + "\t"+stu.eng + "\t"+stu.math); 
				}
			}
			if(input == 2) {
				Student stu = new Student();
				System.out.print("�й�> ");
				int num = sc.nextInt();
				
				try{
					data[num-1] = stu;
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("�������� �ʴ� �й��Դϴ�");
					continue;	
				}
				stu.num = num;
				System.out.print("����>");
				stu.kor = sc.nextInt();
				System.out.print("����>");
				stu.eng = sc.nextInt();
				System.out.print("����>");
				stu.math = sc.nextInt();
				data[num-1] = stu;
				
			}
			if(input == 3) {
				Student stu = new Student();
				System.out.print("������ �й�> ");
				int num = sc.nextInt();
				
				try{
					data[num-1] = stu;
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("�������� �ʴ� �й��Դϴ�");
					continue;	
				}
				stu.num = num;
				System.out.print("����>");
				stu.kor = sc.nextInt();
				System.out.print("����>");
				stu.eng = sc.nextInt();
				System.out.print("����>");
				stu.math = sc.nextInt();
				data[num-1] = stu;
			}
			if(input == 4) {
				Student stu = new Student();
				System.out.print("������ �й�> ");
				int num = sc.nextInt();
				try{
					data[num-1] = stu;
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("�������� �ʴ� �й��Դϴ�");
					continue;	
				}
				data[num-1] = null;
			}
			
		}
		System.out.println("�̿����ּż� �����մϴ�");
		sc.close();
	}
}
