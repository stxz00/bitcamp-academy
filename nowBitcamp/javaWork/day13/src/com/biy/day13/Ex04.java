package com.biy.day13;


class Ball{
	void play() {
		System.out.println("���� �������ϴ�");
	}
}

class BaseBall extends Ball{
	String color = "���";
	void play() {
		System.out.println(color + " �߱����� ������ ��ϴ�");
	}
}

class Bowling extends Ball{
	String color = "��Ȳ��";
	void play() {
		System.out.print("���� ���� " + color +" ����");
		super.play();
	}
}

// T �ܿ� �ٸ� ���� �ᵵ ��.
// �Ϲ������� T,E,K,V...
class Box<T>{ //T���� ���ϸ� �׳� Object
	
	T ball;
	
	void push(T myBall){
		ball = myBall;
	}
	
	T pull(){
		return ball;
	}
}

public class Ex04 {
	public static void main(String[] args) {
		BaseBall ball1 = new BaseBall();
		Bowling ball2 =new Bowling();
//		ball.color = "������";
		
		Box<Ball> box = new Box<Ball>(); // T�� ������ ���⼭ ����
		box.push(ball1); // ���׸��� ��ӹ��� Ŭ���� ���� �� ����
		
		Ball myball = box.pull(); // ĳ������ �ʿ���� ��
//		System.out.println("�� ���� " + myball.color + "�Դϴ�");
		myball.play();
		
		Box<BaseBall> box1 = new Box<BaseBall>();
		box1.push(ball1);
		// Box�� Ÿ�Ժ����� ��ü�̰� �� ��ü�� BaseBAll �����Ͽ����Ƿ� box1.push(T myBall)���� ���� �� �ִ� T, �� BaseBall�� ��ü ball1�� ��� �� �� �ִ�.
	}
}
