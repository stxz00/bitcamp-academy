package com.bit.day19;

class Lec04{
	int su;
	public Lec04(int a) {
		su = a;
	}
}


public class Ex04 extends Lec04{
	int su = 1234;
	
	public Ex04() {//����x
//		System.out.println("su = " + this.su);
		this(1234,1111); //this�� ù���ο� ���� ������ ��������
	}
	

	public Ex04(int a) {
		//��ü����
//		super();
//		Object obj = super;
		super(1111);
		System.out.println("su = " + a);
	}
	
	
	public Ex04(int b, int a) {
		//��ü����
//		super();
		super(2222);
		System.out.println("su = " + a);
	}
	
	void func01() {
		int su = 1111;
		System.out.println("func01() : " + this.su);
		
	}
	
	public static void main(String[] args) {
		//super & this
		//main�� static�̴� this�� super �ȵ�
		
		Ex04 me = new Ex04();
		Ex04 me2 = new Ex04();
		System.out.println("main() : " + me.su);
		me.func01();
		
	}
}
