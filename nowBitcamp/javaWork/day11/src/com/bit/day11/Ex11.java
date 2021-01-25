package com.bit.day11;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] data;
		String title = "�л��������� ���α׷�(ver 0.4.1)";
		String menu = "1.���� 2.�Է� 3.���� 4.���� 0.����>";
		String table = "-----------------------------------------------";
		table += "\n�й�\t����\t����\t����";
		table += "\n-----------------------------------------------";
		System.out.println(title);
	
		System.out.print("�ѿ�>");
		int input = sc.nextInt();
		data = new int[input][3];
		
		while(true) {
			System.out.print(menu);
			input = sc.nextInt();

			if(input == 0) {break;}
			if(input == 1) {
				System.out.println(table);
				for(int i = 0; i < data.length; i++) {
					int[] stu = data[i];
					String msg = i+1+"\t"+stu[0]+"\t"+stu[1]+"\t"+stu[2];
					System.out.println(msg);
				}
				
			}
			if(input == 2) {
				int[] stu = new int[3];
				System.out.print("�й�>");
				int num = sc.nextInt();
				
				try{
					data[num-1] = stu; //���� ����� �Ʒ� ���� ��� ����
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("�������� �ʴ� �й��Դϴ�");
					continue;	
				}
				System.out.print("����>");
				stu[0] = sc.nextInt();
				System.out.print("����>");
				stu[1] = sc.nextInt();
				System.out.print("����>");
				stu[2] = sc.nextInt();

			}
			if(input == 3) {
				int[] stu = new int[3];
				System.out.print("������ �й�>");
				int num = sc.nextInt();
				
				try{
					data[num-1] = stu;
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("�������� �ʴ� �й��Դϴ�");
					continue;	
				}
				System.out.print("����>");
				stu[0] = sc.nextInt();
				System.out.print("����>");
				stu[1] = sc.nextInt();
				System.out.print("����>");
				stu[2] = sc.nextInt();
				
			}
			if(input == 4) {
				System.out.print("������ �й�>");
				int num = sc.nextInt();
				
				try{
					data[num-1] = new int[3];
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("�������� �ʴ��й��Դϴ�");
					continue;	
				}

			}
			
		}
		System.out.println("�̿����ּż� �����մϴ�");
		
		sc.close();
	}
}
