package com.bit.day12;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex05 {
	public static void main(String[] args) {
		// ������ Ŭ������ ���� ��������
		// �������̽� vector�� ��ӹ���
		// ���Լ���(LIFO)
		//peek ���� pop ���� push �߰�
		
		Stack stack = new Stack();
		stack.push("ù��°");
		stack.push("�ι�°");
		stack.push("����°");
		stack.push("�׹�°");
		System.out.println(stack.search("����°")); //indexOf
	
/*
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
*/
		/*
		try {
			while(true) {
				System.out.println(stack.peek());
				stack.pop();
			}
		}catch(EmptyStackException e) {}
		 */
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		
	}
}
