package com.bit.day10;

class Test07{
	void func() {}
}

class Test08{
	static Test07 test = new Test07();

}

public class Ex08 {
	public static void main(String[] args) {
		Test08.test.func();
		System.out.println(); // ���� ������ ��
		// January 1, 1970�� ���� �󸶳� ��������
		// 1/1001�� ������ ����ð��� ����
		Long su = System.currentTimeMillis();
		System.out.println(su);
		System.out.println(Long.MAX_VALUE);
		Long su2 = System.nanoTime();
		System.out.println(su2);
		

		Ex08[] me = new Ex08[10000000];
		Long before = System.currentTimeMillis();
		for(int i = 0; i< 10000000; i++) {
			me[i] = new Ex08();
		}
		Long after = System.currentTimeMillis();
		System.out.println(after-before);
	}
}
