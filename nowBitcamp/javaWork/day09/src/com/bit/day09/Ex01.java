package com.bit.day09;

public class Ex01 {
	public static void main(String[] args) {
		// ����ó��
		// ������ ó���ϴ°� �ƴ� ȸ���ϴ� ��!
		
		int[] arr1 = {1,3,5,7};
		
		for(int i = 0; i < 5; i++) {
			try {
			System.out.println(arr1[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				
			}
		}
		// try�� �ϴ� �����ϰ� ������ �߻��ϸ� ĳġ�� ����ó���� ���� ��Ƴ��� �����ڵ尡 ���� ���� ����ó����
		System.out.println("������ �־����� ȸ����");
		System.out.println();
	try {
		int[] arr2 = {1,3,5,7};
		for(int i = 0; i < 5; i++) {
			
			System.out.println(arr1[i]);
			}
		
		System.out.println("������ �־����� ȸ����");
		
		}catch(ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException : �迭�� ������ ���
		}
		// ������ �߻��� ������ System.out.println("������ �־����� ȸ����"); �� �������� ����
		// ũ�Գ� �۰� Ʈ���� ĳġ ������ ������ �ʿ���(������ ���� ����)
	
		
	
	}
}
