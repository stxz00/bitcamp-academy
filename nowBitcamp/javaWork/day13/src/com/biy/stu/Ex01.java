package com.biy.stu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> data = new ArrayList<Integer>();
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
				Iterator<Integer> ite = data.iterator();
				while(ite.hasNext()) {
					int num = ite.next();
					System.out.print(num + "\t");
					int kor = ite.next();
					System.out.print(kor + "\t");
					int eng = ite.next();
					System.out.print(eng + "\t");
					int math = ite.next();
					System.out.println(math + "\t");
				}
			
				
				
				/*
				for(int i = 0; i< data.size(); i++) {
					int num = data.get(i++);
					System.out.print(num + "\t");
					int kor = data.get(i++);
					System.out.print(kor + "\t");
					int eng = data.get(i++);
					System.out.print(eng + "\t");
					int math = data.get(i);
					System.out.println(math + "\t");
				}
				*/
				
			}
			if(input == 2) {
				System.out.print("�й�>");
				int num = sc.nextInt();
				System.out.print("����>");
				int kor = sc.nextInt();
				System.out.print("����>");
				int eng = sc.nextInt();
				System.out.print("����>");
				int math = sc.nextInt();
				data.add(num);
				data.add(kor);
				data.add(eng);
				data.add(math);
				
				
			}
			if(input == 3) {
				System.out.print("������ �й�>");
				int num = sc.nextInt();
				for(int i = 0; i < data.size(); i+=4) {
					int su = data.get(i);
					
					if(num == su) {
						System.out.print("����>");
						data.set(i+1, sc.nextInt());
						System.out.print("����>");
						data.set(i+2, sc.nextInt());
						System.out.print("����>");
						data.set(i+3, sc.nextInt());
						break;
					}
				}
			}
			if(input == 4) {
				System.out.print("������ �й�>");
				int num = sc.nextInt();
				
				for(int i = 0; i < data.size(); i+=4) {
					int su = data.get(i);
					if(num == su) {
						data.remove(i);
						data.remove(i);
						data.remove(i);
						data.remove(i);
						break;
					}
				}
			}
		}
		
		
		
		
		
		sc.close();
	}
}
