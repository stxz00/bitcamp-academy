package com.biy.day13;

import java.util.ArrayList;



public class Ex06 {

	public static void main(String[] args) {
		// 1.7~ �� ���׸� ��������
		ArrayList<Integer> list = new ArrayList<>();
		/*
		ArrayList<Integer>();
		list = new ArrayList();
		
		*/
		list.add(1111);
		list.add(2222);
//		list.add("");
		
		//������ �� : �Ʒ�ó�� �տ� ���׸��� ���� �ʰ� �ڿ� ���� ���� ������ ������ ������ ����ó�� �ƹ��ų� �� ������
		
		ArrayList list2;
		list2 = new ArrayList<Integer>();
		list2.add(3333);
		list2.add("test");
		
		ArrayList<?> list3 = new ArrayList<>(); //<?> : ���ϵ�ī��, ���� ��� ���� �𸣴� ���߿� �����ϰڴٴ� �� �׳� ?�� ���� Object�� �ٸ����� �̴� <? extends Object>�� ����
//		list3.add(3333);
		// ���ϵ�ī��� �޼��忡�� �����
		
		
		
	}


}
