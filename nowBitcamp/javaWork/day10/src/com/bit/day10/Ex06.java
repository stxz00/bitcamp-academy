package com.bit.day10;

public class Ex06 implements Cloneable {
	public static void main(String[] args) {
		Ex06 me = new Ex06();
		
		try {
			Object obj = me.clone(); 
			System.out.println(obj);
			//���� Object�� Ŭ���� �Ǹ� ��� Ŭ������ ��ü ���簡 �����ϴϱ� ���Ƴ�
			//�׷��� �������̽� Cloneable �� ����ϸ� ��������
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	
	}
}
