package com.bit.exercise;

import java.util.Scanner;

public class Form {
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("�л� ���� ���α׷� HashSet ver.");
			System.out.println("------------------------------------");
			
			String main ="1.���� 2.�Է� 3.���� 4.���� 0.����\n>";
			String menu = "------------------------------------\n";
			menu +="�й�\t����\t����\t����\n";
			menu += "------------------------------------";
			String input = null;
			while(true) {
				System.out.print(main);
				input = sc.nextLine();
				if(input.equals("0")) {
					break;
				}
				if(input.equals("1")) {
					System.out.println(menu);
						
			
					
					
					
				}
				if(input.equals("2")) {
					System.out.print("�й�>");
					input = sc.nextLine();
						
					
					
				}
				if(input.equals("3")) {
					System.out.print("������ �й�>");
					input = sc.nextLine();
				
					
					
					
				}
				if(input.equals("4")) {
					System.out.print("������ �й�>");
					input = sc.nextLine();
					
				}
		}
		System.out.println("�̿����ּż� �����մϴ�");
		sc.close();
	}
}
