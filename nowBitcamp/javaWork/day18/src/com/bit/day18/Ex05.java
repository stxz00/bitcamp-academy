package com.bit.day18;

//��ϸӽ� Ŭ���� 

interface Inter{
	void func02();
}

public class Ex05 {
	//�߻��� Ÿ�� Inner�� ó���� ��е� �� �����Ƿ� �ȵǰ�
	//Ÿ���� Object�� �ϸ� ������ Inner�� ���簡 ��� �ȵǰ�
	//�׷��� �������̽��� ���� ����ع����ٸ� ������
	public static Inter func01() {
		//Inner�� ���ÿ� ����Ǿ��µ� ������ ���� ������ ��ȿ������ ��� ��Ȳ -> �������̽��� Ŭ������ �ƴ����� ������ ������ ����Ŭ�� ������ -> �Լ��� ���������� Ŭ���� ��� ��
		
		//Ŭ�����̸��� �ʿ������ ���ְ� Ŭ������ ������ Ŭ������ ���ְ� ���ø���Ʈ�� �� ������ ���ְ� �� ���ָ� �ᱹ �Ʒ�ó�� �������̽� ���θ� ���� ��
		return new Inter(){
			public void func02() {
				System.out.println("����Ŭ�������");
			}
		};
//		return new Inner();
	}
	
	
	
	
	public static void main(String[] args) {
		Inter inn = func01(); //���������̽� �̸� //�޼����� ���ϰ��� Inter�̹Ƿ�
		inn.func02();
		
		Inter inn2 = new Inter() { // ����Ŭ���� �̸�
			public void func02() {
				System.out.println("����Ŭ�������");
			}
		};
		inn.func02();
		
		Inter inn3 = new Inter() { //����Ŭ���� �̸�, ���� �������̵�
			@Override
			public void func02() { 
				System.out.println("����Ŭ�������");
			}
		};
		inn3.func02();
		//�� �� Ŭ������ ������ Ŭ������ ����. ;ǥ�ÿ� . ���̸� ����
		
		
	}
}
