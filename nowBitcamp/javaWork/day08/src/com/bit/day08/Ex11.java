package com.bit.day08;
/*
�л������������α׷�(ver 0.2.0) ���ڿ�
--------------------------------
�ѿ�>3

1.���� 2.�Է� 0.����>1
--------------------------------
�й� | ���� | ���� | ���� |�հ�
--------------------------------


1.���� 2.�Է� 0.����>2
1�� ����>90
1�� ����>80
1�� ����>70

1.���� 2. �Է� 0.����>1
--------------------------------
�й� | ���� | ���� | ����  |�հ�
--------------------------------
1      90    80      70		000


*/
public class Ex11 {
	public static void main(String[] args) {
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		String input;
		System.out.println("�л������������α׷�(ver 0.2.0)");
		System.out.println("--------------------------------");
		
		String table = "--------------------------------\n�й� | ���� | ���� | ���� | �հ�\n--------------------------------\n";
		int cnt = 0;
		
		while(true) {
			System.out.print("1.���� 2.�Է� 0.����> ");
			input = sc.nextLine();
			if(input.equals("0")) {break;}
			if(input.equals("1")) {
				System.out.println(table);
			}
			if(input.equals("2")) {
				cnt++;
				table+=cnt;
				System.out.print(cnt + "�� ����>");
				input = sc.nextLine();
				int kor = Integer.parseInt(input);
				table += "\t " + kor;
				System.out.print(cnt + "�� ����>");
				input = sc.nextLine();
				int eng = Integer.parseInt(input);
				table += "    " + eng;
				System.out.print(cnt + "�� ����>");
				input = sc.nextLine();
				int math = Integer.parseInt(input);
				table += "     " + math;
				table += "     " + (kor+eng+math) +"\n";
				
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
		sc.close();
	}
}
