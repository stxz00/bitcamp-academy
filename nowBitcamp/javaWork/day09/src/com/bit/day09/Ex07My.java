package com.bit.day09;
//
/*
 * �ֹι�ȣ üũ
 * 123456-1234567
 * 
 * 
 * 
 * 
 * 
 * 
 */


public class Ex07My {
	public static void main(String[] args) {
		int age = 0;
		char gender = '-';
		String input = null;
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		boolean boo = false;
		
		do{
			System.out.print("�ֹι�ȣ�� �Է����ּ���\n>");
			input = sc.nextLine();
			String[] s1 = input.split("-");
			String[] s2 = input.split("");
			
			if(s2[6].equals("-") == false) {
				System.out.println("7��° �ڸ��� - ǥ���Ͻñ� �ٶ��ϴ�");
				continue;
			}
			
			try {
				Integer.parseInt(s1[0]);
				Integer.parseInt(s1[1]);
				
				String[] s3 = new String[14];
				s3[13] = s2[13]; // 14�ڸ� �̳��� �ε�������
				for(int i = 0; i < s2.length; i++) {
					s3[i] = s2[i]; // 14�ڸ� �ʰ� �� �ε��� ����
				}
			}catch(NumberFormatException e){
				System.out.println("���� �ܴ̿� �Է��� �� �����ϴ�");
				continue;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("14�ڸ� ������ �Է��ϼ���");
				continue;
			}
				break;
		}while(true);
			
		age = 2020-(1900+Integer.parseInt(input.substring(0,2))-1);
		if(input.charAt(7) >= '3') {
			age -= 100;
		}			
		if(input.charAt(7) == '1' || input.charAt(7) == '3'){
			gender = '��';
		}else {
			gender = '��';
		}
		System.out.println("����� " + age + "�� " + gender + "�� �Դϴ�");
		sc.close();
	}
}
