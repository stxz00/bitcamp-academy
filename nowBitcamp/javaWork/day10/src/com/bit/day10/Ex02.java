package com.bit.day10;

//�߻�Ŭ����
// �߻�޼��� 0�� �̻� ���� Ŭ����
// ����� ���� ����϶�
abstract class  Test02{
	int su = 1111;
	public Test02() {
		
	}
	public void func01() {}
	//�߻�޼��� - �޼��� ����(o), ����(x);
	public abstract void  func02();
	public abstract void  func03();
}

public class Ex02 extends Test02{
	
	@Override
	public void func02() {
		
		
	}

	@Override
	public void func03() {
		
		
	}
	public static void main(String[] args) {
		// Test02 test = new Test02(); 
		// �߻�Ŭ������ ��ü ���� �Ұ��� ���� �Ͽ����Ƿ�
		// �߻�޼��尡 0������ �ȵ�
	}


}
