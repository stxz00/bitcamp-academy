package com.bit.day09;

import java.util.Scanner;

public class Ex16Of3 {
	public static void main(String[] args) {
		String title = "�л������������α׷�(ver 0.2.0)";
		System.out.println(title);
		
		for(int i = 0; i < title.length(); i++) {
			System.out.print('-');
		}
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		String input = null;
		
		String menu = "---------------------------------------\n�й�| ���� | ���� | ���� | �հ� | ��� |\n---------------------------------------\n"; 
	
		 
		int[][]arr1 = null; 
		int[]arr2 = null; // arr1 �� �Է¿�
		int[][]arr3 = null; // arr1 ����, �����
		
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
					for(int j = 0; j < arr3[i].length; j++) {
						System.out.print(arr3[i][j]+"     ");
						}
					System.out.println();
				}
			}else if(input.equals("2")) {
				
				studentId++;
/////////////////////////////������ ������� ī��//////////////////////		
				arr1 = new int[studentId][6];
				if(studentId != 1) {
					for(int i = 0; i < studentId-1; i++) {
						System.arraycopy(arr3[i], 0, arr1[i], 0, arr3[i].length);
					}
				}
//////////////////////////////////////////////////////////////////////				

				System.out.print(studentId +"�� ����> ");
				kor = Integer.parseInt(sc.nextLine());
				while(kor > 100 || kor < 0) {
					System.out.println("0~100�� �̳��� �Է��ϼ���");
					System.out.print(studentId +"�� ����> ");
					kor = Integer.parseInt(sc.nextLine());
				}
				
				System.out.print(studentId +"�� ����> ");
				eng = Integer.parseInt(sc.nextLine());
				while(eng > 100 || eng < 0) {
					System.out.println("0~100�� �̳��� �Է��ϼ���");
					System.out.print(studentId +"�� ����> ");
					eng = Integer.parseInt(sc.nextLine());
				}
				System.out.print(studentId +"�� ����> ");
				math = Integer.parseInt(sc.nextLine());
				while(math > 100 || math < 0) {
					System.out.println("0~100�� �̳��� �Է��ϼ���");
					System.out.print(studentId +"�� ����> ");
					math = Integer.parseInt(sc.nextLine());
				}
				System.out.println("���ڷθ� �Է��ϼ���");
					
				
				int sum = kor+eng+math;
				int avg = sum*100/3/100;
				arr2 = new int[]{studentId,kor,eng,math,sum,avg};
				
				arr1[studentId-1] = arr2;
//////////////////////////////////////////////////////////////////////				
				arr3 = arr1.clone(); //����
//////////////////////////////////////////////////////////////////////				
			}else if(input.equals("0")) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}else {
				System.out.println("�ùٸ� ��ȣ�� �Է¹ٶ��ϴ�");
			}
		}
		sc.close();	
	}

}



	