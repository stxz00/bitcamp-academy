package com.bit.day10;

//Class Class Ŭ������ ������ ��� �ִ� Ŭ���� Ŭ����

public class Ex10 {
		int su = 1234;
	public static void main(String[] args) {
		
	
		Object obj = new Object();
		Class clz = obj.getClass(); //Ŭ������ �ּҰ� ����
		System.out.println(clz.getName()); //���ڿ� ���� ��ġ java.lang.Object
		System.out.println(obj);
		System.out.println(obj.hashCode());
		System.out.println(Integer.toHexString(obj.hashCode()));
		
		//toString() ���� getClass().getName() + '@' + Integer.Integer.toHexString(obj.hashCode());
		Ex10 me = new Ex10();
		System.out.println(me.su);
		String data = "com.bit.day10.Test08"; //�ּ�
		try {
			Class clzz = Class.forName(data); //getname�� �ݴ�� data Ŭ������ �ҷ���
			Object obj2 = clzz.newInstance();
			Test08 you = (Test08)obj2; 
			//������ ������ Ŭ������ ���� ��ü�� ����� ����(new Ex10���̵� �����)
			System.out.println(you.test);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Class cls = com.bit.etc10.Ex01.class;
		
		
	}
}
