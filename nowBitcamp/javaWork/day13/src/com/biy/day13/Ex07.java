package com.biy.day13;

// api �����ؼ�

import java.util.ArrayList;
import java.util.List;

class Box03<T extends Number>{ //Number�� ��� �޴� �͵鸸 ������ ����
	T su;
	void set(T su) {
		this.su = su;
	}
	T get() {
		return su;
	}
	
	// <? super(extends) Object> ��ȣ���� ��ü�� ���ΰ� ������ �θ�(�ڽ�)�� ����ϴ� �͸� �ǵ��� ���� 
	void func(java.util.List<? extends Number> list) {

	}
}

public class Ex07 {
	public static void main(String[] args) {
		Box03<Number> box = new Box03<>(); 
		box.set(2222);
//		System.out.println(box.get()+1);
//		Number�� ��ü�ϱ� �׳� �����ϸ� �ȵǹǷ� intValue()�޼��� �� ���
		System.out.println(box.get().intValue()+1);
		List<Integer> list = new ArrayList<>();
		box.func(list);
		
		Box03<Integer> box1 = new Box03<>(); 
		box1.set(2222);
		System.out.println(box1.get() + 35353);

	}
}
