package com.bit.day07;

import java.util.Scanner;

/*
�л������������α׷�(ver 0.2.0) ���ڿ�
--------------------------------
�ѿ�>3

1.���� 2.�Է� 0.����>1
--------------------------------
�й� | ���� | ���� | ����  |�հ�
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

public class Ex13 {
		static int ID = 0;
		int korean = 0;
		int english = 0;
		int math = 0;
		int count = 0;

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л������������α׷�(ver 0.2.0)");
		System.out.println("--------------------------------");
		System.out.print("�ѿ�>");
		int input = sc.nextInt();
		
		int total = input;
		int[] studentID = new int[total];
		int[] studentKorean = new int[total];
		int[] studentEnglish = new int[total];
		int[] studentMath= new int[total];
		int[] totalPoint= new int[total];
		
		boolean boo2 = false;
		
		
		boolean boo = true;
		while(boo) {
			System.out.print("1.���� 2.�Է� 0.����>");
			input = sc.nextInt();
			if(input == 1) {
				if(boo2 != true) {
					System.out.println("�Է��� ���� �ϼ���");
				}else {
	
					System.out.println("--------------------------------");
					System.out.println("�й� | ���� | ���� | ���� |�հ�");
					System.out.println("--------------------------------");
					
					for(int i = 0; i < total; i++) {
						System.out.println(studentID[i]+"      " +studentKorean[i]+"     "+studentEnglish[i]+"    "+studentMath[i]+"     "+totalPoint[i]);
					}
				}
					
			}else if(input == 2) {
				for(int i = 0; i < total; i++) {
					ID++;
					studentID[i] = ID;
					System.out.println("�й� " + studentID[i] +"���� ������ �Է��ϼ���");
					
					System.out.print("���� > ");
					studentKorean[i] = sc.nextInt();
					while(studentKorean[i] >100 || studentKorean[i] < 0) {
						System.out.println("0~100�� �̳��� �Է��ϼ���");
						System.out.print("���� > ");
						studentKorean[i] = sc.nextInt();
					}
					
					System.out.print("���� > ");
					studentEnglish[i] = sc.nextInt();
					while(studentEnglish[i] >100 || studentEnglish[i] < 0) {
						System.out.println("0~100�� �̳��� �Է��ϼ���");
						System.out.print("���� > ");
						studentEnglish[i] = sc.nextInt();
					}
					
					System.out.print("���� > ");
					studentMath[i] = sc.nextInt();
					while(studentMath[i] >100 || studentMath[i] < 0) {
						System.out.println("0~100�� �̳��� �Է��ϼ���");
						System.out.print("���� > ");
						studentMath[i] = sc.nextInt();
					}
					totalPoint[i] = studentKorean[i] + studentEnglish[i] + studentMath[i];
					if(ID == total) {
						ID = 0;
						boo2 = true;
					}
				}
					
					
				
				
			}else if(input == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				boo = false;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		
		sc.close();
		
	}
}
