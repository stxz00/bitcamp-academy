package com.bit.day19;

	//�߻�Ŭ���� - �߻�޼��带 0���̻� ���� Ŭ����
	// ���� : �ݵ�� ����� ���� ���
abstract class Lec05{
	
	public Lec05() {
		
	}
	
//	abstract void func01();
	void func02() {
		System.out.println("�߻�Ŭ������ ������ �޼���");
	}
	
	abstract void func03();
}

class Lec55 extends Lec05{

	@Override
	void func03() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex05 {
	
	public static void main(String[] args) {
		Lec55 lec = new Lec55();
		
		Lec05 lec1 = new Lec05() {

			@Override
			void func03() {
				System.out.println();
			}
		};
	}
}
