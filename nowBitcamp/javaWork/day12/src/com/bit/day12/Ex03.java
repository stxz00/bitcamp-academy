package com.bit.day12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		
		long before = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++) {
			list1.add("�߰�"+i);
		}
		
		long after = System.currentTimeMillis();
		
		System.out.println(after-before);
		
		LinkedList list2 = new LinkedList();
		
		before = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++) {
			list2.add("�߰�"+i);
		}
		
		after = System.currentTimeMillis();
		
		System.out.println(after-before);
		//�߰��� �ð� ���̰� ������ �ȳ�
		Object temp = null;
		before = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			temp = list1.get(i);
		}
		after = System.currentTimeMillis();
		System.out.println(after-before);
		// ArrayList�� �� ��û ����
		
		
		temp = null;
		before = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			temp = list2.get(i);
		}
		after = System.currentTimeMillis();
		System.out.println(after-before);
		// LinkedList�� ��û �ð��� ������ ����
		
		//�̷��� ArrayList�� ���� ��
		//������ LinkedList�� �ڷ� ǥ���� ���� ť,��ť ��
	}
}
