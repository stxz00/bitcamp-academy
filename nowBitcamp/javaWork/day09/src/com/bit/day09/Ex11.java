package com.bit.day09;

import java.util.Arrays;

public class Ex11 {
	public static void main(String[] args) {
		// �ζ� ��ȣ ������(0.1.0)
		////////////////////////////////
		// 1~45
		// ���� 6�� ����
		// �ߺ�x
		// sort
		
		System.out.println("�ζ� ��ȣ ������(0.1.0)");
		System.out.println("------------------------");
		int number;
		
		int[] prizeNumber = new int[6];
		int[] myNumber = new int[6];
		int bonusNumber;
		int count = 0;
		boolean bonusprize = false;
		
		while(true) {
			
			for(int i = 0; i < prizeNumber.length; i++) {
				while(true) {
					number = (int)(Math.random()*100);
					if(number >0 && number < 45) {
						break;
					}
				}
				
				for(int j = 0; j <= i; j++) {

					if(number == prizeNumber[j]) {
						while(true) {
							number = (int)(Math.random()*100);
							if(number >0 && number < 45) {
							break;
							}
						}	
						j = 0;
					}
				}
				prizeNumber[i] = number;
			}
			
			for(int i = 0; i < prizeNumber.length; i++) {
				for(int j = 1; j < prizeNumber.length; j++) {
					if(prizeNumber[j-1] > prizeNumber[j]) {
						int a = prizeNumber[j-1];
						int b = prizeNumber[j];
						prizeNumber[j-1] = b;
						prizeNumber[j] = a;
					}
				}
			}
			
			
			while(true) {
				number = (int)(Math.random()*100);
				if(number >0 && number < 45) {
					break;
				}
			}
				
			for(int i = 0; i < prizeNumber.length; i++) {
				if(number == prizeNumber[i]) {
					while(true) {
						number = (int)(Math.random()*100);
						if(number >0 && number < 45) {
							break;
						}
					}
					i = 0;
				}
			}
			bonusNumber = number;	

			
			
			for(int i = 0; i < myNumber.length; i++) {
				while(true) {
					number = (int)(Math.random()*100);
					if(number >0 && number < 45) {
						break;
					}
				}
				
				for(int j = 0; j <= i; j++) {
					if(number == myNumber[j]) {
						while(true) {
							number = (int)(Math.random()*100);
							if(number >0 && number < 45) {
								break;
							}
						}	
						j = 0;
					}
				}
				
				myNumber[i] = number;
			}
			
			for(int i = 0; i < myNumber.length; i++) {
				for(int j = 1; j < myNumber.length; j++) {
					if(myNumber[j-1] > myNumber[j]) {
						int a = myNumber[j-1];
						int b = myNumber[j];
						myNumber[j-1] = b;
						myNumber[j] = a;
					}
				}
			}
			
			break;
		}	
		
		System.out.println("��÷��ȣ");
		
		for(int a : prizeNumber) {
			System.out.print(a + "\t");
		}
		System.out.print("���ʽ� " + bonusNumber + "\n");
		
		System.out.println();
		
		System.out.println("�� ��ȣ");
		
		for(int a : myNumber) {
			System.out.print(a + "\t");
		}
		
		for(int i = 0; i < prizeNumber.length; i++) {
			if(prizeNumber[i] == myNumber[i]) {
				count++;
			}
			if(myNumber[i] == bonusNumber) {
				bonusprize = true;
			}
		}
		System.out.println("\n-------------------------------------------------------------");
		if(count == 6) {
			System.out.println("1� ��÷�Ǽ̽��ϴ�");
		}else if(count == 5 && bonusprize == true) {
			System.out.println("2� ��÷�Ǽ̽��ϴ�");
		}else if(count == 5) {
			System.out.println("3� ��÷�Ǽ̽��ϴ�");
		}else if(count == 4) {
			System.out.println("4� ��÷�Ǽ̽��ϴ�");
		}else if(count == 3) {
			System.out.println("5� ��÷�Ǽ̽��ϴ�");
		}else {
			System.out.println("��÷���� �ʾҽ��ϴ�");
		}
		System.out.println("���� ���� : " + count + " ���ʽ� : " + bonusprize);
		
	}	
}
