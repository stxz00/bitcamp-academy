package com.biy.day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex02 implements Comparable<Ex02>{
	int su;
	
	public Ex02(int su){
		this.su = su;
	}
	public static void main(String[] args) {
		Set<Ex02> set = new TreeSet<Ex02>();
		
		set.add(new Ex02(1111));
		set.add(new Ex02(2222));
		set.add(new Ex02(3333));
		set.add(new Ex02(4444));
		
//		set.add("ù��°");
//		set.add("�ι�°");
//		set.add("����°");
//		set.add("����°");
//		set.add(1111);

		
		Iterator<Ex02> ite = set.iterator();
		while(ite.hasNext()) {
			Ex02 ele = ite.next();
			System.out.println(ele.su);
		}
	}

	@Override
	public int compareTo(Ex02 o) {
		
		return this.su - o.su; // ����, ��� �ǰ� 0�̸� �ߺ�
	}
}
