package com.bit.day18;

//��ϸӽ����� Ŭ�����̸��� ���ٴ� ���� ������ ���ڴٴ� ���� �ƴ� �� �� �� ���ڴٴ� ���̰� �� �� ���� ��ü�� ��ڴٴ� �� �̸��� ���ٺ��� �ִ��� �������� ����� ��

public class Ex06 {
	//�� �ѹ��� ��ü�� ���� ����� ��������
	
	static Inter inn3 = new Inter() {
		public void func02() {
			System.out.println("����ƽŬ����������ϴ��͸�Ŭ����");
		}
	};
	
	Inter inn2 = new Inter() {
		public void func02() {
			System.out.println("�ν��Ͻ�Ŭ����������ϴ��͸�Ŭ����");
			
		}
	};
	public static void main(String[] args) {
		
		Inter in1 = new Inter() { //main �޼ҵ��
			public void func02() {
				System.out.println("����Ŭ����������ϴ��͸�Ŭ����");
			}
		};
	}
	
}

//��, ��ϸӽ� Ŭ������ ��ġ, ���������ڿ� ���� ����ƽ,�ν��Ͻ�,���� ��� ���� �� �� ���� ��ü�� �� ��
