package com.bit.day08;

public class Ex10 {
	public static void func01() {
		for(int i = 0; i < 10; i++) {
			if(i == 5) {return;} 
			// �޼ҵ� stack�������� value���� ��ȯ 
			// 5�϶� ���ÿ������� �޼��尡 �Ⱦ����� �����°���
			System.out.println("return " + i); 
		}
		System.out.println("return end"); //�׷��� �̰͸����� ��¾ȵ�
	}
	public static void func02() {
		for(int i = 0; i < 10; i++) {
			if(i == 5) {break;} 
			// break - switch, for, while, do~while ������ Ż�� �� �� ����� �ȵ�
			System.out.println("break " + i);
		}
		System.out.println("break end");
	}
	public static void func03() {
		// continue - �ݺ��������� ����
		for(int i = 0; i < 10; i++) {
			if(i == 5 || i == 9) {continue;}
			System.out.println("continue " + i);
		}
		System.out.println("continue end");
	}
	public static void main(String[] args) {
		func01();
		func02();
		func03();
		//System.exit(0); 
		//�����ڵ�, ���� �Ⱦ� (0 : ��������, 1 �̻�, 0 �̸� : ���� ����)
		//��� �ڹٿ����� ��� ����ǵ�(���� ���ڰ� ����) �������
		//������ �ü�� ����� ������ �ǹ̰� ������ 
		//retrun; �� ����ϴ� �� ����
	}
}
