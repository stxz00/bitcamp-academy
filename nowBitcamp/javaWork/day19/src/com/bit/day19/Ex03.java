package com.bit.day19;

public class Ex03 {
	
	
	static void func02() {
		for(int i = 0; i < 10; i++) {
			if(i != 0) {continue;}//�ݺ����� ����� 
			System.out.println("�ݺ�");
//			break; // ����� �����, ����� Ż��(if�� ����);
			//return;// �޼����� �����
			
		}
		System.out.println("�ݺ�����");
		return;
	}
	
	
	
	static void func01() {
		return;
	}
	
	
	
	public static void main(String[] args) {
		//return�� �޼���3�� ����, �ʏ����� ������ ���ư���, ���ÿ��� �̾Ƴ���
		func01();
		
		return;
	}
}
