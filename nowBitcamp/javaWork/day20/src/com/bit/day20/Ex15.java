package com.bit.day20;

public class Ex15 {
	public static void main(String[] args) {
		System.out.println("start...");
		Long a = System.currentTimeMillis();
		try {
			Thread.sleep(1000); // 1�ʴ� �ݵ�� ������ 1�� �� �ٷ� �����Ѵٴ� ������ ����(�翬��)
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		Long b = System.currentTimeMillis();
		System.out.println((int)(b-a));
		System.out.println("end...");
	}
}
