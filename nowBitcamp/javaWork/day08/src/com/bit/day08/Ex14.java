package com.bit.day08;

public class Ex14 {
	public static void main(String[] args) {
//		int[][] arr1 = new int[3][5];
		int[][] arr1 = new int[][] {
			/*new int[]*/ {1,2,3}   //��������
			,/*new int[]*/ {1,2,3,4,5}
			,/*new int[]*/ {1,2}
		};
//		arr1[1][2] = 1;
		
		for(int i = 0; i < arr1.length; i++) {
			int[] arr2 = arr1[i]; //�ּҰ�
			for(int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[j]); //�� �ּҰ�(�迭)�� �迭��
			}
			System.out.println();
		}
	}
}
