package com.biy.day13;
/*
class Node{
	void func() {
		System.out.println("��� ����...");
	}
}
*/
class Temlate{
	// static T newInstance(T node2) { Ŭ������ ����ƽ�� ���� ��ü�� �Ⱦ��� �Ǵϱ� ���׸��� �ȵ�
	static <T>Box<T> newInstance(T ball) {
	//���׸� �޼���
	//�޼����� ����ο� ���׸� Ÿ���� ����� ��
	//Box<T>Ÿ������ �����Ұǵ� ����ο� Ÿ�Ժ����� �������ν� Box<T>�� ���� Ÿ������ ���ؼ� �����Ұ��� Ȯ���� ���� ����
		
		Box<T> box = new Box<>();
		box.push(ball);
		return box;
	}
	//����Ÿ���� ���׸��� �پ��� �� �ڽ��� Ÿ���� ���׸�������
}

public class Ex09 {
	public static void main(String[] args) {
		BaseBall ball = new BaseBall();
		
		Box<BaseBall> box = Temlate.newInstance(ball);
//		Box<BaseBall> box = Temlate.<BaseBall>newInstance(ball); �� ���׸� ��������
		box.pull().play();
	}
}
