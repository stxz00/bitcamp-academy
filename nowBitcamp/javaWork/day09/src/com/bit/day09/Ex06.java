package com.bit.day09;
//����ó���� �Բ� ���� ��
public class Ex06 {
	
	public static void func(int a) throws ArithmeticException{
		
		// ~jdk 1.7
		try {
			int su = 10/a;
			if(a == 0) {return;} 
			//������ return�ϸ� �������ϴµ� finally�� �ݵ�� �����
			System.out.println(su);
//		}catch(ArithmeticException e) {
//			System.out.println(0);
		}finally {
			System.out.println("�ݵ�� ������");
		}
		
		//������ try catch finally ���� 1.8���ʹ� try finally�ε� ��
}
	
	public static void main(String[] args) {
		try {
			func(0);
		}catch(ArithmeticException e){
			System.out.println("����ó����"); 
			//���� ĳġ ArithmeticException e �ϸ� 
			//�̹� ����ó�������Ƿ� ���� �ȵ�
		}
		
		
	}
}
