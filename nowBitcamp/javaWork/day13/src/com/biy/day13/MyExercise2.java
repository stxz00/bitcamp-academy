package com.biy.day13;

class A<T extends Object>{}
class B<Object>{}

public class MyExercise2 {
	public static void main(String[] args) {
//		A<Object> a = new A<String>(); �̷��� ����ȯ�� �ȵ� Object�� ������ ������
		A<? extends Object> a = new A<String>();
		A<?> aa = new A<String>();
		A<?> aaa;
		aaa = new A<String>();
		
		A<?> aaaa = new A<String>();
		A<Object> ab = (A<Object>)aaaa; //���׸����� ����ȯ �� �̰� ���� ������ �κ��� �� ����
		A<String> ac = (A<String>)aaaa;
		
		A<Object> aba = new A<Object>();
//		A<String> abb = (AString<>)aba; �̷��� ���ϵ� ī�� �Ⱦ� aba�� ����ȯ ������ �Ұ�!
		
		
		B<? extends Object> b = new B<String>();
		B<String> c = new B<String>(); //�ƿ� ó������ String �ع����� ���ϴ� ������ ����. Ex04�� Box<BaseBall> box1 = new Box<BaseBall>();  �� ���� ��.
		
		
		A<? extends Object> o = null;
		A<? extends String> oa = null;
		o = (A<? extends Object>)oa;
		oa = (A<? extends String>)o;  // �̷��� �̷� Ÿ���� ���ϵ�ī�峢���� ����ȯ ����
		
		
		
		// �̷��� ����ȯ�� �����Ӱ� �ϰ� �ʹ� �Ҷ��� ���ϵ�ī�带 ���� �����ϸ� ��.
	}
	
	
}
