package com.bit.day08;

import java.util.Scanner;


public class Ex161 {
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
	
		int[][]arr1 = new int[100][]; //�ִ� �л� �Է� �� ����
		int[]arr2 = null;
		
		int studentId = 0;
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		while(true) {
			System.out.print("1.���� 2.�Է� 0.���� > ");
			input = sc.nextLine();
			
			if(input.equals("1")) {
				if(studentId == 0) {
					System.out.print(menu);
					System.out.println("���� �Էº��� �Ͻñ� �ٶ��ϴ�");
					continue;
				}
				
				System.out.print(menu);
				
				for(int i = 0; i < studentId; i++) {
					for(int j = 0; j < arr1[i].length; j++) {
						System.out.print(arr1[i][j]+"     ");
						}
					System.out.println();
				}
			}
			
			if(input.equals("2")) {
				if(arr1[99] != null) {
					System.out.println("�� �̻� �߰��� �� �����ϴ�.");
					continue;
				}
				
				studentId++;

				System.out.print(studentId +"�� ����> ");
				kor = sc.nextInt();
				while(kor > 100 && kor < 0) {
					System.out.println("0~100�� �̳��� �Է��ϼ���");
					System.out.print(studentId +"�� ����> ");
					kor = sc.nextInt();
				}
				
				System.out.print(studentId +"�� ����> ");
				eng = sc.nextInt();
				while(eng > 100 && eng < 0) {
					System.out.println("0~100�� �̳��� �Է��ϼ���");
					System.out.print(studentId +"�� ����> ");
					eng = sc.nextInt();
				}
				System.out.print(studentId +"�� ����> ");
				math = sc.nextInt();
				while(math > 100 && math < 0) {
					System.out.println("0~100�� �̳��� �Է��ϼ���");
					System.out.print(studentId +"�� ����> ");
					math = sc.nextInt();
				}
				int sum = kor+eng+math;
				int avg = sum*100/3/100;
				arr2 = new int[]{studentId,kor,eng,math,sum,avg};
				arr1[studentId-1] = arr2;
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
