package com.bit.day19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex10 {
	public static void main(String[] args) {
		//�ڷᱸ��(�����Ҵ�) �ڵ����� �þ�� ��
		// List - ����(o), �ߺ�(o)
		// Set	- ����(x), �ߺ�(x)
		// Map	- ����(key�� �̿�)
		
		java.util.List list = new ArrayList();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(1111);
		list.add(4444);
		
		System.out.println(list.get(0));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------------------");
		java.util.Set set = new HashSet();
		set = new TreeSet();
		set.add(1111);
		set.add(2222);
		set.add(3333);
		set.add(1111);
		set.add(4444);
		Iterator ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		Ex10 me = new Ex10();
		System.out.println(me.hashCode());
		
	}
}
