package com.bit.day11;

public class Ex05 {
	public static void main(String[] args) {
		// CRUD
		StringBuffer msg = new StringBuffer("abcd");
		
		System.out.println(msg.append("efg"));
		System.out.println(msg.insert(4, "ADD")); // �߰��� ���� ���� ��ġ ����
		// msg = abcdADDefg
		System.out.println(msg.replace(4,7,"EDIT")); //4��°���� 7��°������ EDIT���� ��ü
		// msg = abcdEDITefg
		System.out.println(msg.delete(4, 8));
		// msg = abcdefg
		System.out.println(msg.length());

		msg.reverse(); //������ ������
		System.out.println(msg);

		char[] a = new char[7];
		msg.getChars(0, 7, a, 0);
		
		System.out.println(a);
		
		// ó���� String�� ���ٰ� StringBuffer�� ����� �� ����ϸ� ��
	}
}
