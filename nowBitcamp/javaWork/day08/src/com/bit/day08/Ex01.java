package com.bit.day08;

public class Ex01 {
	//����Ŭ����
	// �⺻�ڷ����� ��üŸ��
	// boxing(����) : �⺻�ڷ��� -> ��üȭ
	// unboxing(����) : ��üŸ�� -> �⺻�ڷ���
	// �ʿ信 ���� �ڵ����� �ڽ̰� ��ڽ��� �̷����
	
	public static void func01(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		func01(new Ex01());
		func01("abcd");
		func01(new int[] {1,3,5,7});
		//��� ���������̱� ������ ����
		func01(1234); //int �ڷ����ε� ���� -> wrappaer Ŭ���� ����(�ڽ�) ����Ҷ� ��ڽ�
		
	}
}
