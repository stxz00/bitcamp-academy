package com.bit.day19;

abstract class Machine01{
	void on() {System.out.println("�Ѵ�");}
	void off() {System.out.println("����");}
	void work() {}
}

class Tv01 extends Machine01 {
	void work() {System.out.println("����� �����ִ�");}
}


class Radio01 extends Machine01 {
	void work() {System.out.println("����� ����ش�");}
}


public class Ex06 {
	
	public static void main(String[] args) {
		Machine01 machine = new Radio01() {}; //������
		machine.on();
		machine.work();
		machine.off();
		
		
		int input = 1;
		if(input ==1) {
			machine = new Tv01();
			machine.on();
			machine.work();
			machine.off();
		}
		
	}
}
