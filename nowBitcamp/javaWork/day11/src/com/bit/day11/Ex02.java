package com.bit.day11;

public class Ex02 {
	public static void main(String[] args) {
		StringBuffer st1 = new StringBuffer(); //����Ʈ�� �Ǿ��ִ°� Ȯ��
		System.out.println(st1); //���鹮�ڿ��� �ִ°� Ȯ��
		
		StringBuffer st2 = new StringBuffer("���ڿ�"); //���ڿ��� ��ü�� ����
		System.out.println(st2); 
		
		// replace(CharSequance target, CharSequence replacement)
		// CharSequance�� �������̽� String Ŭ������ �� �������̽��� ��ӹ���(�Ʒ��� ��ӹ޴°͵���)
		//All Known Implementing Classes:
		//CharBuffer, Segment, String, StringBuffer, StringBuilder
		StringBuffer st3 = new StringBuffer(st2);
		// CharSequance�� ��ӹ޴� ��� �͵��� ���� �� �ֱ� ������ st2�� ���� �� ����
		
		StringBuffer st4 = new StringBuffer(10);
		System.out.println(st4);
		// StringBuffer�� String�� �Ѱ踦 �غ��ϱ� ����.(���۷��� ����)
		// StringBuffer�� String�� �������� StringBuffer�� �ڱ� �ڽ��� �ٲ�� ��! (�����ΰ� �����Ҵ� -> ����� �ڱⰡ �ø�)
		// String�� ��� ���ο� ��ü�� ����� ���� ������ �޸� �Ҹ��� ����Ƿ� 
		// String �� abc�� �־����� �׸�ŭ�� ������ ������ ǥ��, �߰�, �ٲ𶧸��� ���ο� ��ü�� ����
		// StringBuffer�� �־��� ���ڿ� �ܿ� �߰� ������ ���� ���� ����(���۰���)�� �� ����. ���к��� ��ü ������ ����(String�� 10�ڸ� StringBuffer�� �� �̻��� ������ �������´ٴ� ��)
		// �Ӻ���� ������ ������ ������ ��Ȳ��
			
	}
}
