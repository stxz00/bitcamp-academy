package com.bit.day20;
//Runnable
public class Ex11 implements Runnable{
	
	
	public static void main(String[] args) {
		System.out.println("main start...");
		Ex11 me = new Ex11(); // ������ ���� �����
		Thread thr1 = new Thread(me); // �����尡 ������ ���� �����ڷ� ����
		Thread thr2 = new Thread(me);
		thr1.start(); // ������� ���� �ھ�� ���� �ְ� �����ϵ��� ������
		thr2.start(); // ������ ������� start�� ������ ����� ��.
		System.out.println("main end...");
		
	}
	
	
	@Override
	public void run() {
		System.out.println("work..."); //�� �� ����Ʈ
		
	}

}
