package com.bit.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Ex02 {
	public static void main(String[] args) {
//		ArrayList list1 = new ArrayList();
		LinkedList list1 = new LinkedList();
		//�������� �������δ� �̷������� ������
		//�ڿ��� �����ϴ� Ư���� ��Ȳ�� �� ���
		//�����͸� ���� ���� ����, ����Ʈ�� ���� �� ���� ArrayList�� ����
		list1.add(1111); 
		// Object�� �⺻�ڷ����� ���� �� ������ ����ڽ����� ���� 
		// Integer ������ �ְԵ�
		list1.add("���ڿ�"); // Object�� �� ��
		list1.add('@');
		list1.add(true);
		list1.add(new char[] {'a','b','c'});
		
		System.out.println(list1.add(5555));
		// add�� ����Ÿ���� Boolean �̹Ƿ� true false�� ��ȯ����
		
		list1.set(3, "�߰�");

		
		Object  obj = new Integer(1234);
		Integer i1 = (Integer)obj;
		int i2 = i1; //��ڽ�
		
		for(int i = 0; i < list1.size(); i++) {
			Object ele = list1.get(i);
			System.out.println(ele.toString());
		}
		
		// ���� ����
		ArrayList list2 = new ArrayList(list1);
		//���� ����
//		ArrayList list2 = list1;
		System.out.println("----------------------------");
		list1.add(5555);
		list2.add(list1);
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));	
		}
		System.out.println("----------------------------");
		
		list2.clear(); //�� �� ����
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));	
		}
		System.out.println("----------------------------");
		list2.add("11ss");
		list2.addAll(list1); // ��ü �߰�
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));	
		}
		System.out.println("----------------------------");
		Object obj2 = list1.clone();
		ArrayList list4 = (ArrayList)obj2;
		for(int i = 0; i < list4.size(); i++) {
			System.out.println(list4.get(i));	
		}
		System.out.println("----------------------------");
		System.out.println(list4.contains("�߰�"));
		System.out.println(list4.indexOf("�߰�"));
		System.out.println(list4.indexOf("�߰�53523"));
		System.out.println(list4.isEmpty());
		list4.clear();
		System.out.println(list4.isEmpty());
		
		System.out.println("----------------------------");
		list4 = new ArrayList(list1);
		System.out.println(list4.remove("�߰�")); //add�� �����ϰ� true false ��ȯ
		list4.add(6);
//		list4.remove(6);
//		list4.remove(6); // java.lang.IndexOutOfBoundsException
		//int ���ڸ� �ִ� �� index�� ��ġ�Ƿ� ���� ������ ���. 
		list4.remove(new Integer(6));
		//�̷��� ��ġ�� �� �ּ�ȭ �� �� ����!
		list4.removeAll(list1); // list1�� ��ġ�� �͵��� ��� ����
		for(int i = 0; i < list4.size(); i++) {
			System.out.println(list4.get(i));	
		}
		System.out.println("----------------------------");
		list4.addAll(list1);
		java.util.List list5 = list4.subList(0, 2); // �ε��� 0~2 ���� ����
		for(int i = 0; i < list5.size(); i++) {
			System.out.println(list5.get(i));	
		}
		System.out.println("----------------------------");
		ArrayList list33 = new ArrayList();
		list33.add("1");
		list33.add("2");
		list33.add("3");
		list33.add("4");
		Object[] list6 = list33.toArray();
		System.out.println(Arrays.toString(list6));
		Integer[] list7 = (Integer[])list6;
		String[] list8 = (String[])list6;
//		�ȵ� : Int[] list55 = (Int[])list6;
//		�ȵ� : int[] list8 = new int[] list6; Object�� �ް� �����Ƿ� ����
//		�ȵ� : int[] list8 = (Integer[]) list6;
		
		
		
		
		ArrayList list3 = new ArrayList(4); 
		// ��ó�� �ϰ� �Ǹ� ArrayList(int initialCapacity)
		// �� ���۸� ���ؼ� �� �ѵ������� ����
		// ArrayList�� ���۷��� �������� ������ ��������� ���۷��� ����
		// StringBuffer�� �����ϰ� trimTOSize()��.
		
	}
}
