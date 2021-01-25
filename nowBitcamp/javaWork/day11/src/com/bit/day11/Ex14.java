	package com.bit.day11;
	
	
	
	class MyLinked{
		
		class Node{
			Node nxt;
			int val;
			
		}
		
		Node start;
		int cnt;
		
		void add(int su) {
			cnt++;
			Node node = new Node();
			node.val = su;
			if(cnt == 1) {
				start = node;
			}else {
				Node temp = start;
				while(true) {
					if(temp.nxt == null) {break;}
					temp = temp.nxt;
				}
				temp.nxt = node;
			}
			
			
			// 1.
	//		cnt++;
	//		Node node = new Node();
	//		node.val =su;
	//		start = node;
			// 2.
	//		cnt++;
	//		Node node = new Node();
	//		node.val = su; 
	//		start.nxt = node;
			// 3.
	//		cnt++;
	//		Node node = new Node();
	//		node.val = su;
	//		start.nxt.nxt = node;
	//		// 3.
	//		cnt++;
	//		Node node = new Node();
	//		node.val = su;
	//		start.nxt.nxt.nxt = node;
			
		}
		
		int size() {
			return cnt;
		}
		
		int get(int idx) {
			// 0 -> start.val
			// 1 -> start.nxt.val
			// 2 -> start.nxt.nxt.val
			Node temp = start;
			for(int i = 0; i < idx; i++) {
				temp = temp.nxt;
			}
			return temp.val;
		}
	}
	
	public class Ex14 {
		public static void main(String[] args) {
		//	java.util.LinkedList list = new java.util.LinkedList();
			MyLinked list = new MyLinked();
			list.add(1111);
			list.add(2222);
			list.add(3333);
			list.add(4444);
			list.add(5555);
			
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		}
	}
	
	//Array������ �� ����, Linked�� �ϴ� ��ü ��� �ּҰ��� null�� ���� ��ü�� ��� ��. �Է�, ����, ���� ����
	//�������� �������δ� Array�̳� �Է� ���� ���� �� �������� ��鿡���� Linked�� ����
	
	//�л����� �������α׷�