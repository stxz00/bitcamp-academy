package com.bit.day20;

public class Ex13 implements Runnable{
	
	public static void main(String[] args) {
//		String name = "main";
		String name = Thread.currentThread().getName(); //���� main �������̴� main�� ���̹��� ���´� 
		System.out.println(name + "thread...");
		

		Thread me = new Thread(new Ex13(),"ù��°"); // ���� ���̹��� �� �� ����
		Thread you = new Thread(new Ex13(),"�ι�°");
		you.setName("�ι�°"); // ���� ���̹� �ټ��� ����
		me.start();
		you.start();
	}
	
	@Override
	public void run() {
		Thread me = Thread.currentThread(); //getName();  new Ex13() ���� ���ڸ� ���� ��� 
		System.out.println(me.getName() + "thread...");
	}
}
