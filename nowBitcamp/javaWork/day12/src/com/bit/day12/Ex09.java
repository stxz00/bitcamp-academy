package com.bit.day12;

import java.util.HashSet;
import java.util.Iterator;

public class Ex09 {
	public static void main(String[] args) {
		java.util.Set set1 = new HashSet();
		//����x �ߺ�x
		set1.add(1111);
		set1.add(2222);
		set1.add(3333);
		set1.add(4444);
		set1.add(5555);
		//������ ������ ������ �� ��� = vector
		
		Iterator ite = set1.iterator(); //������ ����
		while(ite.hasNext()) { //������ �ִ��� boolean 
			System.out.println(ite.next());
		}
		// ���Ŀ� �ٽ� next�� �����Ű�� Ŀ���� ������ ���� �̹� �������Ƿ� �ȵ�.
		// �׷��� �ٽ� set1�� ������ ���� �ʹٸ� ���ο� Iterator�� ���� �ؾ���
		// ���� : set�� ������ �ƴ� Iterator�� ���� �ѰŴ� set�� ������ �ʾҴٴ� �� �� ����. �翬������ ite = obj �� �ߴ� �ص� ������ �ʴٴ� ��
		
		System.out.println(set1.add(5555)); //�߰� �ȵȴٰ� false 
		//�����ϰ� ������ �� ������ �ؽ��ڵ� �������� ���ĵǴ� ��ǻ�� �� �ٽ� �������� �ʴ� �� ��� �����ص� �Ȱ��� ������ ����
		System.out.println("--------------------");
		Iterator ite2 = set1.iterator(); //������ ����
		while(ite2.hasNext()) { //������ �ִ��� boolean 
			Object obj = ite2.next();
			System.out.println(obj);
		}
		System.out.println("--------------------");
		ite = set1.iterator(); //�ٽ� set1�� �ҷ������� ��.
		while(ite.hasNext()) {
			System.out.println(ite2.next());
		}
		
		
	}
}
