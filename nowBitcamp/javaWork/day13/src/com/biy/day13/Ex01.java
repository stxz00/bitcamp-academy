package com.biy.day13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		// ���׸�(1.5~)-������ ����
		// �⺻�ڷ���x
		// ���� �ּ�ȭ(Ÿ�� ������), �ڵ� ����ȭ(����ȯ ����, Ÿ��üũ)
		ArrayList<String> list = new ArrayList<String>();
//		ArrayList<Object> list = new ArrayList<Object>();
//		<Object>�� ���� �Ẹ�� �ٶ� <Number> <comparable>
//		����ϴ� ������ �ҽ� �ڵ带 �����ϴ� �Ͱ� ����
		
		//< >���� �������� ������ �ΰ� ��
//		list.add(1111);
//		list.add(2222);
//		list.add(3333);
//		list.add(4444);
//		list.add(3.14);
//		list.add('@');
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		list.add("dddd");
		
		
//		for(int i = 0; i < list.size(); i++) {
//		//  <>���� �� int ele = (int)list.get(i) Ŭ���� ĳ��Ʈ ���� ����
//		//  �����ڰ� �ǵ��� ���� �ȵǰ� ������ ���׸��� ���� ������ ��
//			Object ele = list.get(i);
//			System.out.println(ele);
//		}
		
		for(int i = 0; i < list.size(); i++) {
		//���׸��� ���� ������ �� ������ ���� ����ĳ������ ���� ����!(�ʿ�X��)
			System.out.println(list.get(i));
		}
			
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1111);
		list2.add(2222);
		list2.add(3333);
		list2.add(4444);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list2.get(i));
		}
		
	}
}
