package com.biy.stu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class Ex03 {
	public static void main(String[] args) {
		Map<String,Integer> data = new TreeMap<String,Integer>();
		String title = "�л������������α׷�(ver 0.5.0)";
		System.out.println(title);
		byte[] by = title.getBytes();
		for(int i = 0; i < by.length; i++) { //����Ʈ������ �ѱ� �� ���� ����
			System.out.print('-');
		}
		System.out.println();
		String header = "--------------------------------------";
		header += "\n�й�\t����\t����\t����\n";
		header += "--------------------------------------";
		String menu = "1.���� 2. �Է� 3. ���� 4.���� 0.����\n>";
		
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true) {
			System.out.print(menu);
			input = sc.nextInt();
			if(input == 0) {break;}
			if(input == 1) {
				System.out.println(header);
				
				Set<String> keys = data.keySet();
				Iterator<String> ite = keys.iterator();
				while(ite.hasNext()) {
					int kor = data.get(ite.next());
					int math = data.get(ite.next());
					int eng = data.get(ite.next());
					int num = data.get(ite.next());
					System.out.println(num + "\t" + kor +"\t" + eng +"\t"+ math);
				}
				
				
				/*
				for(int i = 0; i < data.size()/4; i++) {
					int num = data.get(i+1+"�й�");
					int kor = data.get(i+1+"����");
					int eng = data.get(i+1+"����");
					int math = data.get(i+1+"����");
					System.out.println(num + "\t" + kor +"\t" + eng +"\t"+ math);
				}
				*/
			
			}
			if(input == 2) {
				System.out.print("�й�>");
				int num = sc.nextInt();
				if(data.get(num + "�й�") != null) {
					System.out.println("�ߺ��� �й��Դϴ�");
					continue;
				}
				System.out.print("����>");
				int kor = sc.nextInt();
				System.out.print("����>");
				int eng = sc.nextInt();
				System.out.print("����>");
				int math = sc.nextInt();
				data.put(num+"�й�", num);
				data.put(num+"����", kor);
				data.put(num+"����", eng);
				data.put(num+"����", math);
			
			}
			if(input == 3) {
				System.out.print("������ �й�>");
				int num = sc.nextInt();
				if(data.get(num + "�й�") == null) {
					System.out.println("�������� �ʴ� �й��Դϴ�");
					continue;
				}
				System.out.print("����>");
				int kor = sc.nextInt();
				System.out.print("����>");
				int eng = sc.nextInt();
				System.out.print("����>");
				int math = sc.nextInt();
				
				data.put(num+"�й�", num);
				data.put(num+"����", kor);
				data.put(num+"����", eng);
				data.put(num+"����", math);	
				
			}
			if(input == 4) {
				System.out.print("������ �й�>");
				int num = sc.nextInt();
				if(data.get(num + "�й�") == null) {
					System.out.println("�������� �ʴ� �й��Դϴ�");
					continue;
				}
				data.remove(num + "�й�");
				data.remove(num+"����");
				data.remove(num+"����");
				data.remove(num+"����");	
			}
		}

		sc.close();
	}
}