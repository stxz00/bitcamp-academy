package com.bit.day12;

import java.util.LinkedList;

public class Ex06 {
	public static void main(String[] args) {
		//deque
		//���� �� ���� �ƿ� ����
		java.util.Deque que = new LinkedList();
		//LinkedList�� Deque�� ��ӹ���
		//Queue�� Stack�� ���ÿ� �����(�߰��� ���� ���� ����)
		//addFirst(e) addLast(e) / offerFirst(e) offerLast(e)
		//removeFirst() removeLast() / pollFirst() pollLast()
		//getFirst() getLast() / getLast() peekLast()
		
		
		//Queue
		que.offerFirst(1111);
		que.offerFirst(2222);
		que.offerFirst(3333);
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		System.out.println("-----------------");
		que.offerLast(1111);
		que.offerLast(2222);
		que.offerLast(3333);
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println("-----------------");
		System.out.println("-----------------");
		// Stack
		que.offerFirst(1111);
		que.offerFirst(2222);
		que.offerFirst(3333);
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println("-----------------");
		que.offerLast(1111);
		que.offerLast(2222);
		que.offerLast(3333);
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());	
	}
}
