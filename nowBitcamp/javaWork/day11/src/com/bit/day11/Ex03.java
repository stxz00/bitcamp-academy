package com.bit.day11;

public class Ex03 {
	public static void main(String[] args) {
		StringBuffer st1 = new StringBuffer("ab");
		StringBuffer st2 = new StringBuffer("cd");
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println("----------------------------");
		System.out.println(st1.append(st2));//(st1 + st2); append �޼ҵ带 ���� ���ϱ�
		System.out.println("----------------------------");
		System.out.println(st1); // ���� st2�� �߰��Ͽ����Ƿ� �ڱ� �ڽ��� �ٲ� abcd�� ����.
		System.out.println(st2);
		//append�� ĳ���� ������, �迭�� Ư�� �ε���, ���� ��� ������
		System.out.println(st1.append(1234));
		System.out.println(st1.append("�߰�"));
		System.out.println(3.14);
		System.out.println("----------------------------");
		// charAt, indexOf, length(), replace(), substring(), toString() ����
		
	}
}
