package com.bit.day08;

public class Ex03 {
	public static void main(String[] args) {
		byte su1 = 127; 
		Byte su2 = 1;
		//Byte su3 = new Byte(1); �츮�� ���� ���ڴ� int�̹Ƿ� ������
		Byte su3 = new Byte(su1); 
		Byte su4 = new Byte("1"); 
		// Byte su4 = new Byte("128"); 
		//���ڿ��ε� ����Ʈ ���� ���� ������ ������Ƿ� �ν� ����
		
		System.out.println(su3);
		System.out.println(su4);
		
	}
}
