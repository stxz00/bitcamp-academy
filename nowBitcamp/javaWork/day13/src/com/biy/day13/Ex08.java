package com.biy.day13;

import java.util.Scanner;

class Node{
	void func() {
		System.out.println("��� ����...");
	}
	
	
}

class Ex88{
	//�̱��� ���� ��ü�� �ϳ��� ��� �ϴ� ��(����� �پ��� private�� static�� �� �̿�
	private static Scanner sc;
	
	private Ex88() {}
	static Scanner getScanner() {
		if(sc == null) {sc = new Scanner(System.in);}
		return sc;
	}
}


public class Ex08 {
	
	public static String input() {
		return Ex88.getScanner().nextLine();
	}
	

	
	public static void main(String[] args) {
		System.out.print("ù��° �Է�>");
		System.out.println("�Է��Ͻ� ������ " + input());
		System.out.print("�ι�° �Է�>");
		System.out.println("�Է��Ͻ� ������ " + input());
		System.out.print("����° �Է�>");
		System.out.println("�Է��Ͻ� ������ " + input());
		/*
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		*/
	}
}
