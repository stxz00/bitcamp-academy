package com.bit.day08;

import java.util.Scanner;

/*
�л������������α׷�(ver 0.2.0) ���߹迭�̳� ��ü�迭��
--------------------------------
�ѿ�>3 

1.���� 2.�Է� 0.����>1
--------------------------------
�й� | ���� | ���� | ���� |�հ�
--------------------------------


1.���� 2.�Է� 0.����>2
1�� ����>90
1�� ����>80
1�� ����>70

1.���� 2. �Է� 0.����>1
--------------------------------
�й� | ���� | ���� | ����  |�հ�
--------------------------------
1      90    80      70		000


*/
public class Ex16 {
		
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
		
		int students = 0;
		
		int studentId = 0;
		
		System.out.print("�ѿ�> ");
		input = sc.nextLine();
		
		students = Integer.parseInt(input);
		
		int[][]arr1 = new int[students][]; 
		
		
		
		
		while(true) {
			System.out.print("1.���� 2.�Է� 0.���� > ");
			input = sc.nextLine();
			
			if(input.equals("1")) {
				
				if(studentId == 0) {
					System.out.println("���� �Էº��� �Ͻñ� �ٶ��ϴ�");
					continue;
				}
				
				System.out.print(menu);
				
				for(int i = 0; i < arr1.length; i++) {
					for(int j = 0; j < arr1[i].length; j++) {
						System.out.print(arr1[i][j]+"     ");
						}
					System.out.println();
				}
				
			}
			
			if(input.equals("2")) {
				studentId++;
				if(students+1 == studentId) {
					System.out.println("�ѿ� ��� �Է��ϼ̽��ϴ�");
					continue;
				}
				System.out.print(studentId +"�� ����> ");
				int kor = sc.nextInt();
				System.out.print(studentId +"�� ����> ");
				int eng = sc.nextInt();
				System.out.print(studentId +"�� ����> ");
				int math = sc.nextInt();
				int sum = kor+eng+math;
				int avg = sum*100/3/100;
				int[]arr2 = {studentId,kor,eng,math,sum,avg};
				arr1[studentId-1] = arr2;
				sc.nextLine();
			}
			
			if(input.equals("0")) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}
			
		}
		
	}
}