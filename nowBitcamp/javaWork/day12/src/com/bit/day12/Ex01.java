package com.bit.day12;

import java.util.ArrayList;

//�ڷᱸ�� : �ڷḦ �����ϴ� ��
//�ּ����� �ڷᱸ�� : ���� (���� ���� ���� �����ϴ� �� �ƴ϶� �ڷᱸ����� ������ ����)
//�迭 : �ڷᱸ��
//��� �͵��� �˰� �ִ� �ڷ���� �����ؼ� ����ȭ �Ѱ��� 
//��������(����O),��������(����X)
//�������� : �ߺ� ����, �������� : �ߺ� ����, �Ұ��� �� ��
//�������� : ����� �ִ� �� List, ���� �� : stack, queue ��
//�������� : ������� �� ���� �� ����. �����ϱ� ���ؼ� �ߺ��� ������� ���� -> �ߺ��� �˻縦 ���� �ڷḦ �ְ� ������ ����.

public class Ex01 {
	public static void main(String[] args) {
		// �÷��� �����ӿ�ũ - �����Ҵ� �ڷᱸ��
		// ����o, �����o - �����ڷᱸ��

		java.util.ArrayList list = new ArrayList();
		list.add("ù��°");
		list.add("�ټ���°");
		list.add("�ι�°");
		list.add("����°");
		list.add("�׹�°");
		
		
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.get(1));
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println("-------------------");
		list.set(1, "5��°");
		System.out.println("-------------------");
		list.remove(1);
		System.out.println("-------------------");
		for(int i = 0; i < 4; i++) {
			System.out.println(list.get(i));
		}
		/*
		 * ������� ������ ������ ������ ���ϴ� ��� �ҷ����� �� ������
		for(int i = 0; i < 4; i+=2) {
			System.out.println(list.get(i));
		}
		*/
	}
}
