package com.bit.day19;

public class Ex08 {
	public void func01(){
		System.out.println("�θ��� ���");
	}

	public static void main(String[] args) {
		//������
		Ex08 me = new Ex08();
		Object me2 = new Ex08(); 
		//�θ��� Ÿ�����ε� �ڱ� Ÿ�����ε� ���� �� �ִ� ��(���,�������̽�����)
		
		Ex08 me3 = new Ex08() {
			@Override
			public void func01() {
				System.out.println("�ڽ��� ���");
			}
		};
		me3.func01();
	}
}
