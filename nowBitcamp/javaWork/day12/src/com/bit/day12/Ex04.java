package com.bit.day12;

import java.util.LinkedList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
//		List list = new LinkedList();
//		list.poll(); //�������̽��� �ȵǵ��� ���Ƴ� 
		
		//ť�� ���Լ���, ���� ���� �갡 ���� ������(ex)��ȭ����, ������ ��������)
		
		java.util.Queue que = new LinkedList();
		
		// ���� ����ڵ��� ť�� �����ߴٰ�(���) ������ ���� ���ӽ�Ŵ
		// insert , remove, element �� 3�� �޼��常 ����(���� �� ��Ī�� offer, poll, peek �̾��µ� ��Ī ������)
		que.offer("1��°");
		que.offer("2��°");
		que.offer("3��°");
		que.offer("4��°");
		
		/*
		System.out.println(que.peek()); 
		que.poll(); //������ ���� ���� ���� ����
		System.out.println(que.peek()); 
		que.poll();
		System.out.println(que.peek()); 
		que.poll();
		System.out.println(que.peek()); 
		que.poll();
		 */
/*
		while(que.peek() != null) {
			System.out.println(que.poll());
		}
*/
		while(true) {
			if(que.peek() == null) {break;}
			System.out.println(que.poll());
		}
		
		
		
	}
}
