package com.bit.day07;

// 상속은 단 하나의 부모 클래스만 상속 가능.
// 상속 불가 클래스 -> final class
final class Ex105 extends /* java.lang.Object   */{
	public void func01(){
		System.out.println("func01 run...");
	}

}



public class Ex05 extends Ex105{   //final로 인해 상속이 불가능
	
	public static void main(String[] args){
		Ex05 me = new Ex05();
		me.func01();
		System.out.println(me);
		System.out.println(me.toString());
		// 참조변수는 값이 없으므로 주소값을 가지고 오게 함 -> .toString()
		// Ex05가 toString을 정의하지 않았는데 되고 있는 이유 -> java.lang.Object를 상속받고 있기 때문
		// 클래스가 다중인데 상속은 부모 하나만 되는데 가능한 것? -> 자동으로 하나의 클래스에만 상속받게 함
		
	}
}