package com.bit.oracle01;

import java.security.KeyStore.Entry;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

class Lec<K,V>{
	K a;
	V v;
}

public class Ex02 {
	
	public static void main(String[] args) {
		Properties prop = System.getProperties();
		//�ý��ۿ� ���� ������ ������ 
		//properties�� �� �ٸ����� ���� ���� 
		
//		Enumeration<Object> em =prop.elements();
//		while(em.hasMoreElements()) {
//			System.out.println(em.nextElement());
//		}
		
//		Set<java.util.Map.Entry<Object,Object>> set = prop.entrySet();
//		Iterator<java.util.Map.Entry<Object,Object>> ite = set.iterator();
//		while(ite.hasNext()) {
//			java.util.Map.Entry<Object,Object> entry = ite.next();
//			System.out.println(entry.getKey()+">>>"+entry.getValue());
//		}
		//Ű���� �˸� �̷��� ���ص� �ǳ�
		//Ű���� �𸣴� �̷��� �ϴ� ��.
		//��Ʈ���� next�ؼ� getkey�� getvalue�� �� �� ���� �� �ִ°�!
		
		System.out.println(prop.get("java.home"));
		//C:\Program Files\Java\jdk1.8.0_271\jre
		
		//Properties IO�� �ڷᱸ�� Map�� Ư¡�� �� �� ����,
	
	}
}
