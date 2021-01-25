package com.bit.day09;

//����� ���� Exception Ŭ����

class MyErr extends Exception{ 
	//Exception�� ����� -> MyErr ��ü�� ���� �� Exception������!
	MyErr(){
		super("0���� ������"); 
	}
}

public class Ex05 {
	public static void main(String[] args) {
		int su = 0;
		try {
			func01(su);
		}catch(MyErr e) {
			e.printStackTrace();
		}
		System.out.println(su);
	}
	
	public static void func01(int a) throws MyErr {
		int b = 0;
//		Object obj = new Object();
//		throw obj; //������ Exception Ŭ������ �ƴϸ� throw�� �ȵ�
		MyErr obj = new MyErr(); 
		if(a == 0) {throw obj;}
		b = 10/ a;
		System.out.println(10 + " / " + a + " = " + b);
	}
}
