package com.bit.day08;
/*
�ֹι�ȣ üũ

123456-1234567
����� 00�� 0���Դϴ�
*/

import java.util.Scanner;

public class MyEx09 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("�ֹι�ȣ üũ��(ver 0.2.0)");
	System.out.println("---------------------------");
	String input;
	
	char[] arr1;
	char[] arr2 = {'0','1','2','3','4','5','6','7','8','9'};
	char[] arr3 = {'��','��','��','��','��','��','��','ĥ','��','��'};


	
	boolean boo = true;
	boolean boo1 = true;
	do {
		System.out.print("�ֹι�ȣ�� �Է��ϼ���\n>");
		 input = sc.nextLine();
		 arr1 = input.toCharArray();
			for(int i = 0; i < arr1.length; i++) {
				for(int j = 0; j < arr3.length; j++) {
					if(arr1[i] == arr3[j]) {
						arr1[i] = arr2[j];
					}
				}
			}

		input = new String(arr1);
		if(input.length() == 14 && input.charAt(6) == '-') {
			
			for(int i = 0; i < arr1.length; i++) {
				if(i !=6) {
					boolean ifDigit = Character.isDigit(arr1[i]);
					if(ifDigit != true) {
						boo1 = false;
					}
				}	
			}
			
			if(boo1) {
				boo = false;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			}
			
		}else {
			System.out.println("�Է������� �ٽ� Ȯ���Ͻñ� �ٶ��ϴ�");
			System.out.println("����)123456-1234567");
			System.out.println("���̻�����-���̻�����ĥ");
		}
		
		
	}while(boo);
	
	char su7 = input.charAt(7);
	int age = 2020 + 1;
	if(su7 <= '2') {
		age -= 1900;
	}else {
		age -= 2000;
	}
	
	String  calculateAge = input.substring(0,2); 
	age = age -(Integer.parseInt(calculateAge));
	
	System.out.println(age);
	
	char manOrWoman = input.charAt(7); 
	
	if(manOrWoman == '1' || manOrWoman == '3') {
		manOrWoman = '��';
		System.out.println("����� " + age + "�� " + manOrWoman + "���Դϴ�.");
	}else if(manOrWoman == '2' || manOrWoman == '4') {
		manOrWoman = '��';
		System.out.println("����� " + age + "�� " + manOrWoman + "���Դϴ�.");
	}
	
	
	sc.close();
	}
}
