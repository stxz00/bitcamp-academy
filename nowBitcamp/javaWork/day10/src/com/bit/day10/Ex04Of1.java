package com.bit.day10;

public class Ex04Of1 {
	
	//�ָ�����
	// 1+2 -> 3
	// 5-2 -> 3 
	// 2*6 -> 6
	// 5/2 -> 2.5
	
	public static void main(String[] args) {
		
		
		int a,b;
		
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		
		a = Integer.parseInt(sc.nextLine());
		b = Integer.parseInt(sc.nextLine());
		
		Number c = func01(a, b);

		System.out.println("a = "+ a + ", b = " + b + "�� �� c = " + c);
		sc.close();
	}
	
	
	public static Number func01(int a, int b) {
		Number su = null;
		
		if(a < b) {
			//���ϱ�, ���ϱ�
			if(b % a == 0 && a != 1) {
				su = b;
			}else {
				su = a+b;
			}
			
		}else {
			//����, ������
			if(a % b != 0 && b != 1) {
				su = 1.0 * a/b;
			}else {
				su = a-b;
			}
		}

		return su;
	}

	

	
}
