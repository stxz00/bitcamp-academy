package com.bit.day11;

public class Ex04 {
	public static void main(String[] args) {
		// capacity() ���۸� Ȯ���ϴ� �޼���
		// buffer -> +16
		StringBuffer st1 = new StringBuffer();
		StringBuffer st2 = new StringBuffer(10);
		StringBuffer st3 = new StringBuffer("java");
		System.out.println(st1.capacity()); // ����Ʈ ���۴� 16�ΰ� Ȯ��
		
		for(int i = 0; i<16; i++) {
			System.out.println(st1.append("a")); 
		}
		System.out.println(st1.capacity()); // 16 ,16������ ���۷� ������� �� Ȯ��
		System.out.println(st1.append("b")); // 17*2 �� ������ ������ �þ�� �ڿ��Ҹ� �þ
		System.out.println(st1.capacity()); // �������� ����� �ø� ������ ������ �߰��� ������ ����  ������ ���� �ι�� �ø� 
		//����� ���� ���鼭 ó���� �� ���۷��� �����ϸ鼭 �ʱⰪ�� �����
		//�ڡڡڡڹ��۴� �� �� �þ�� �پ���� �����ڡڡڡ�
		// trimToSize() : ������� ���� ���� �� ���۷��� �߶�
		st1.trimToSize();
		System.out.print(st1.capacity()); 
		// ���۷��� ����, �Ǵ� ���� ����� �Ͽ��� �� ���� ��. �ʹ� �����ϸ� String���� ���� ���ϰ� ��
		// ������ �ϰ� �Ǹ� �� �� ��뷮�� �ٲ�Ƿ� �� ������ ��� ���� ���Ͽ� trimToSize()�� ��
//		System.out.println(st2.capacity()); 
//		System.out.println(st3.capacity()); 
	}
}
