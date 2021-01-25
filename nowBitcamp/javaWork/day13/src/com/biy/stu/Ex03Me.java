package com.biy.stu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Student{
	int kor;
	int eng;
	int math;
	int stu;
	
	public String toString() {
		return "\t" + kor + "\t" + eng + "\t" + math; 
	}
}

public class Ex03Me {
	public static void main(String[] args) {
		Map<Integer,Student> data = new HashMap<Integer,Student>();
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
				
				Set keys = data.keySet();
				Iterator<Integer> ite = keys.iterator();
				while(ite.hasNext()) {
					Integer key = ite.next();
					System.out.print(key);
					System.out.println(data.get(key));
				}
				
			}
			if(input == 2) {
				Student stu = new Student();
				System.out.print("�й�>");
				int num = sc.nextInt();
				System.out.print("����>");
				stu.kor = sc.nextInt();
				System.out.print("����>");
				stu.eng = sc.nextInt();
				System.out.print("����>");
				stu.math = sc.nextInt();
				data.put(num, stu);
			
			}
			if(input == 3) {
				System.out.print("������ �й�>");
				int num = sc.nextInt();
				Student stu = new Student();
				System.out.print("����>");
				stu.kor = sc.nextInt();
				System.out.print("����>");
				stu.eng = sc.nextInt();
				System.out.print("����>");
				stu.math = sc.nextInt();
				
				data.put(num, stu);	
				
			}
			if(input == 4) {
				System.out.print("������ �й�>");
				int num = sc.nextInt();
				
				data.remove(num);
			}
		}

		sc.close();
	}
}
