package com.bit.day18;

class Outter02{
	
	 
	static class Inner02{
		//����ƽ Ŭ������ �ȿ� ���� �� ���� ����� ������ ����
		// ���� ������ ���� Ŭ����
		static int su3 = 3333;
		int su4 = 4444;
		
		Inner02(){
			System.out.println("create Inner..");
		}
		
		static void func03() {
			Inner02 me = new Inner02();
			System.out.println(me.su4); //�� Ŭ���� ���� �޼����̹Ƿ� ���� ����̾�׷����� �����غ��� ����ƽ�� �� ū ���ְ� su4�� Inner02�� �����̴ϱ� �����ҷ��� ��ü ��� �ؾ���
			System.out.println("inner static func03()..");
			System.out.println(su1);
			System.out.println(su3);
			Outter02 outt = new Outter02();
			System.out.println(outt.su2); // �翬�ϰ� ����ƽ �ƴϸ� ��ü���� �� ����
			func01();
			outt.func02();
		}
		void func04() {
			System.out.println("inner func04()..");
			System.out.println(su1);
			System.out.println(su4);
			func01();
			Outter02 outt = new Outter02();
			System.out.println(outt.su2);
			outt.func02();
		}
		
		
	}

	static int su1 = 1111;
	int su2 = 2222;
	
	public Outter02() {
		System.out.println("create Outter...");
	}
	
	static void func01() {
		System.out.println("Outter static func01..");
		Inner02 inn = new Inner02();
		System.out.print(inn.su4);
	}
	void func02() {
		System.out.println("Outter non-static func02()..");
		Inner02 inn = new Inner02();
		System.out.print(inn.su4);
	}
}

	


public class Ex02 {
	
	
	public static void main(String[] args) {
		Outter02.Inner02 inner = new Outter02.Inner02();
		
		Outter02.Inner02.func03();
		System.out.println(Outter02.Inner02.su3);
		System.out.println(inner.su4);
		inner.func04();
	}
}
