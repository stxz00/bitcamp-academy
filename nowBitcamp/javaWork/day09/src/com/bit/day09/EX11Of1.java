package com.bit.day09;

public class EX11Of1 {
	public static void main(String[] args) {
		// �ζ� ��ȣ ������(0.1.0)
		////////////////////////////////
		// 1~45
		// ���� 6�� ����
		// �ߺ�x
		// sort
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		
		System.out.println("�ζ� ��ȣ ������(0.1.0)");
		System.out.println("------------------------");
		
		System.out.print("������ Ƚ�� : ");
		int lotto = Integer.parseInt(sc.nextLine());
		int money = 0;
		money -= lotto * 1000;
		int number;


		int[] prizeNumber = new int[6];
		int[][] myNumber = new int[lotto][6];
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

			
			for(int k = 0; k < myNumber.length; k++) {
				for(int i = 0; i < myNumber[i].length; i++) {
					while(true) {
						number = (int)(Math.random()*100);
						if(number >0 && number < 45) {
							break;
						}
					}
				
					for(int j = 0; j <= i; j++) {
						if(number == myNumber[k][j]) {
							while(true) {
								number = (int)(Math.random()*100);
								if(number >0 && number < 45) {
									break;
								}
							}	
							j = 0;
						}
					}
					
					myNumber[k][i] = number;
				}
			}	
			for(int k = 0; k < myNumber.length; k++) {
				for(int i = 0; i < myNumber[k].length; i++) {
					for(int j = 1; j < myNumber[k].length; j++) {
						if(myNumber[k][j-1] > myNumber[k][j]) {
							int a = myNumber[k][j-1];
							int b = myNumber[k][j];
							myNumber[k][j-1] = b;
							myNumber[k][j] = a;
						}
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
		
		System.out.println("-------------------------------------------------------------");
		for(int j = 0; j < myNumber.length; j++) {
			for(int i = 0; i < myNumber[j].length; i++) {
				if(prizeNumber[i] == myNumber[j][i]) {
					count++;
				}
				if(myNumber[j][i] == bonusNumber) {
					bonusprize = true;
				}
				System.out.print(myNumber[j][i] + "\t");
			}
			System.out.println();
			System.out.println("���� ���� : " + count + " ���ʽ� : " + bonusprize);
			if(count == 6) {
				System.out.println("1� ��÷�Ǽ̽��ϴ�");
				money += 2000000000;
			}else if(count == 5 && bonusprize == true) {
				System.out.println("2� ��÷�Ǽ̽��ϴ�");
				money += 50000000;
			}else if(count == 5) {
				System.out.println("3� ��÷�Ǽ̽��ϴ�");
				money += 1500000;
			}else if(count == 4) {
				System.out.println("4� ��÷�Ǽ̽��ϴ�");
				money += 50000;
			}else if(count == 3) {
				System.out.println("5� ��÷�Ǽ̽��ϴ�");
				money += 5000;
			}else {
				System.out.println("��÷���� �ʾҽ��ϴ�");
			}
			System.out.println("-------------------------------------------------------------");
			count = 0;
			bonusprize = false;
		}
			System.out.println("�� �� : " + money);
		sc.close();
	}
}
