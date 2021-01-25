package com.bit.day10;

// �θ� Ŭ������ ����ϰ� ���� ���� �� �߻�Ŭ���� ����
abstract class Machine01{
	void on() {
		System.out.println("����on");
	}
	void off() {
		System.out.println("����off");
	}
	abstract void work(); // �޼��� ������ �ο�
}

class Tv01 extends Machine01{
	void work() {
		System.out.println("ȭ���� �����Ѵ�");
	}
}

class Radio01 extends Machine01{
	void work() {
		System.out.println("�Ҹ��� �����Ѵ�");
	}
}

class Audio01 extends Machine01{

	@Override //������̼�, �ش� �޼��尡 ���� ��� ����� �ƴϸ� ������
	void work() {
		
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		
	
	Machine01 machine = new Tv01();
	machine.on();
	machine.off();
	machine.work();
	
	}

}
