package com.bit.day08;

import java.util.Scanner;


public class Ex162 {
	
	static int totalStudentCount = 0;
	
	Ex162(){
		totalStudentCount++;
		studentId = totalStudentCount;
	}
	int studentId = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	int sum = kor + eng + math;
	int avg = sum*100/3/100;

	
	String table(){
		return (studentId + "     " + kor + "     " + eng + "     " + math + "     " +  sum + "     " + avg);
	}
	
	
	public static void main(String[] args) {
		String title = "�л������������α׷�(ver 0.2.0)";
		System.out.println(title);
		
		for(int i = 0; i < title.length(); i++) {
			System.out.print('-');
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		String input = null;
		
		String menu = "---------------------------------------\n�й�| ���� | ���� | ���� | �հ� | ��� |\n---------------------------------------\n"; 
		
		Ex162[] totalStudent = new Ex162[100]; //�ִ� �л� �Է� �� ����

		int count = 0;
		
		while(true) {
			System.out.print("1.���� 2.�Է� 0.���� > ");
			input = sc.nextLine();
			
			if(input.equals("1")) {
				
				if(totalStudentCount == 0) {
					System.out.print(menu);
					System.out.println("���� �Էº��� �Ͻñ� �ٶ��ϴ�");
					continue;
				}
				
				System.out.print(menu);
				
				for(int i = 0; i < count; i++) {
					System.out.println(totalStudent[i].table());
				}
				
			}
				
			
			if(input.equals("2")) {
				
				if(totalStudent[99] != null) {
					System.out.println("�� �̻� �߰��� �� �����ϴ�.");
					continue;
				}
				count++;
				Ex162 student = new Ex162();
				System.out.print(student.studentId +"�� ����> ");
				student.kor = sc.nextInt();
				while(student.kor > 100 || student.kor < 0) {
					System.out.println("0~100�� �̳��� �Է��ϼ���");
					System.out.print(student.studentId +"�� ����> ");
					student.kor = sc.nextInt();
				}
				
				System.out.print(student.studentId +"�� ����> ");
				student.eng = sc.nextInt();
				while(student.eng > 100 || student.eng < 0) {
					System.out.println("0~100�� �̳��� �Է��ϼ���");
					System.out.print(student.studentId +"�� ����> ");
					student.eng = sc.nextInt();
				}
				System.out.print(student.studentId +"�� ����> ");
				student.math = sc.nextInt();
				while(student.math > 100 || student.math < 0) {
					System.out.println("0~100�� �̳��� �Է��ϼ���");
					System.out.print(student.studentId +"�� ����> ");
					student.math = sc.nextInt();
				}
				totalStudent[count-1] = student;
				
				
				sc.nextLine();
			}
			
			if(input.equals("0")) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}
			
		}
		
		sc.close();
		
		
	}
}
