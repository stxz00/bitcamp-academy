package com.bit.day08;

public class Ex15 {
		int su1;
		int su2;
		String msg;
		
		public void sum() {
			System.out.println(su1 + su2);
		}
		
	public static void main(String[] args) {
		Ex15 me = new Ex15();
		me.su1 = 1111;
		me.su2 = 1000;
		me.msg = "aaaa";
		Ex15 you = new Ex15();
		you.su1 = 2222;
		you.su2 = 2000;
		you.msg = "bbbb";
		String[] arr1 = new String[3];
		Ex15[] arr2 = new Ex15[3]; //��ü �迭
		
		arr2[0] = me;
		arr2[1] = new Ex15();
		arr2[2] = new Ex15();
		arr2[2] = you;
		System.out.println();
		for(int i = 0; i< arr2.length; i++) {
			System.out.println(arr2[i].su1);
			System.out.println(arr2[i].su2);
			System.out.println(arr2[i].msg);
			System.out.println(arr2[i].msg);
			arr2[i].sum();
			System.out.println();
		}
		// ���߹迭�� ���� ����. 
		// ���� : ���߹迭�� 1������ �ڷ����� ����, ��ü�迭�� �������
		// ������ ���߹迭�� ����(���ǵ�, �޸�)�� ������ ����
		// ��ü�迭 = �ڹٹ迭 �̶�� ��
		
	}
}
