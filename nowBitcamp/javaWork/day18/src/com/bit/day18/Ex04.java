package com.bit.day18;

class Outter04{
	static int su1 = 1111;
	int su2 = 2222;
	
	static void func02(int su5) { //(final int su5)
		//static �ȿ����� static�� ������ �� ����
//		int su5 =5555; // fianl�� ������
		//Outter04���� su5�� ȣ���Ҷ� func04()�� ȣ��Ǿ� 5000�� �Ǿ������ �ƿ� ���� ��ü�� �ٲ�Ƿ� ����� �Ǿ������ ��. �� ����������� ���� �ٲ�ų� ������ ���� �͵��� ����
		//�׷��� �׳� �ƿ� final�� ����� ����
		class Inner04{
			final static int su3 = 3333;
			int su4 =4444; 
			Outter04 z = new Outter04();
			
			public Inner04() {
				System.out.println("create Inner");
				
			}
			
			void func04() {
		//		su5 = 5000;
				int su5 = 1000; //�̷��� �ڱⲨ�ϱ� �����̹Ƿ� ����
				System.out.println("Inner func04()");
				System.out.println("su4 = " + su4);
				System.out.println("su1 = " + su1);
				
				System.out.println("su1 = " + su1);
				System.out.println("su5 = " + su5);
				
			}
		}
		System.out.println(su5);
		Inner04 inn = new Inner04();
		System.out.println(inn.su4);
		inn.func04();
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		Outter04 outt = new Outter04();
		outt.func02(6666);
	}
}
