package com.bit.day18;

import com.bit.day18.Outter03.Inner03;

class Outter03{
	static int su1 = 1111;
	int su2 = 2222;
	
	public Outter03() {
		System.out.println("create Outter03");
	}
	
	static void func01() {
		System.out.println("func01()");
		System.out.println(Inner03.su3);
		Outter03 outt = new Outter03();
		Inner03 inn = null;
		inn = outt.new Inner03(); //static�� ��ü�� ��� �Ͱ� ������� static ������ ���Ƿ� �츮�� ���� Outter ��ü�� ���� ����
	}
	
	void func02() {
		System.out.println("func02()");
		Inner03 inn = null;
		inn = new Inner03(); //non-static�� ��ü�� ���������� �̹� Outter03�� ��ü�� �����߸� �����ϹǷ� �Ǵ� ��
	}
	
	class Inner03{
		// �ν��Ͻ� Ŭ������ ���ο� satic ���������ڸ� ���� �� ����
		// ��! ���� �� ���� ���(���������)�� ���� -> Ŭ���������� �ø��Ƿ�
//		static int su3 = 3333;
		final static int su3 = 3333;
		int su4 = 4444;
		
		public Inner03() {
			System.out.println("create Inner03()");
		}
		
//		static void func03() {}
		
		void func04() {
			System.out.println("func04()");
			System.out.println(su3);
			System.out.println(su4);
			System.out.println(su1);
			System.out.println(su2);
			func01();
			func02();
		}
	}
}


public class Ex03 {
	public static void main(String[] args) {
		
		System.out.println(Outter03.Inner03.su3); //����ϱ� �翬�� ���� ����
		
		//����ƽ Ŭ������ �ƴϹǷ� ���� ���� �Ұ���(�߻����غ��� Ŭ�����ϱ� �翬�ϴ�)
		
		Outter03.func01();
		System.out.println("------------------------");
		Outter03 outt = new Outter03();
		outt.func02();
		Outter03.Inner03 inn = null;
		inn =  outt.new Inner03(); //�ƿ��� ���� ��ü�� ���� ��ü�� ���� ����
		
		System.out.println(inn.su4);
		inn.func04();
		
	}
}
