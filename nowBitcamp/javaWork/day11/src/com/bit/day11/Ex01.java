package com.bit.day11;
// �ڷᱸ��
public class Ex01 {
	public static void main(String[] args) {
		// String �� ���ڿ�
		// StringBuffer, StringBuilder �� ������, �׳� ������ ����,�Ҿ��� ����
		String st1 = "���ڿ�";
		String st2 = new String(st1);
		//st1�� ����� ���� ����, st2�� ���߿� ����� ����
		StringBuffer st3 = new StringBuffer(st1);
		StringBuilder st4 = new StringBuilder(st1); //������ �̷��Ը� ���� �� ����
//		StringBuffer st5 = "���ڿ�"; //��� ������ �ٸ��� st1�� 
//		StringBuffer st6 = new String(st1); //String Ŭ������ ��ӹ޴°� �ƴ� Object�� ��ӹޱ� ����
		
		System.out.println(st3);
		System.out.println(st4);
//		System.out.println(st3 + st3);
//		System.out.println(st4 + st4);
//		System.out.println(st3 + st4);
		//���ϴ� �� ���� String Ŭ������ ������ �Ȱ��� ���ڿ� Ŭ������������ �޼��常 ��밡����.(�Ϲ� ��ü��� �����ϸ� ��)
		
	}
}
