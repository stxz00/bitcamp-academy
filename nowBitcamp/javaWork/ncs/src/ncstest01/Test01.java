package ncstest01;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Student{
	int kor,eng,math,total,average;
	String name;
	
	@Override
	public String toString() {
		return "�̸� : " + name +"\n���� : " + kor + " ���� : " + eng + " ���� : " + math + "\n" + "���� : " + total +"\n��� : " + average;
	}
}

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeMap<Integer, Student> data = new TreeMap<Integer, Student>();
		
		System.out.println("�л� ���� ���α׷� ���س� ���� ver");
		System.out.println("=====================================");
		
		String main = ("1.��ü 2.�� 3.�Է� 4.���� 5.���� 0.���� \n>");
	
		
		while(true) {
			System.out.print(main);
			int num = sc.nextInt();
			
			if(num == 0) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}else if(num==1) {
				//����
				if(data.size() == 0) {
					System.out.println("���� �й��� �߰��Ͻñ� �ٶ��ϴ�");
				}
				Set keys = data.keySet();
				Iterator<Integer> ite = keys.iterator();
				while(ite.hasNext()) {
					int su = ite.next();
					Student stu = data.get(su);
					System.out.print("�й� : " + su + " " + stu.toString());
					System.out.println("\n-------------------------------------");
				}
			}else if(num==2) {
				if(data.size() == 0) {
					System.out.println("���� �й��� �߰��Ͻñ� �ٶ��ϴ�");
				}else {
					System.out.print("��ȸ�� �й��� �Է��ϼ���\n>>");
					int su = sc.nextInt();
					if(data.get(su)==null) {
						System.out.println("�������� �ʴ� �й��Դϴ�");
					}else {
						System.out.println("�й� : " + su + " " + data.get(su).toString());
					}
				}
			}else if(num==3) {
			
				//�߰�
				System.out.print("�߰��� �й��� �Է��ϼ���\n>>");
				int su = sc.nextInt();
				if(data.get(su)==null) {
					Student stu = new Student();
					System.out.print("�̸��� �Է��ϼ���\n>>");
					sc.nextLine();
					stu.name = sc.nextLine();
					System.out.print("���� ������ �Է��ϼ���\n>>");
					stu.kor = sc.nextInt();
					System.out.print("���� ������ �Է��ϼ���\n>>");
					stu.eng = sc.nextInt();
					System.out.print("���� ������ �Է��ϼ���\n>>");
					stu.math = sc.nextInt();
					stu.total = stu.kor + stu.eng + stu.math;
					stu.average = (int)(stu.total/3);
					data.put(su,stu);			
				}else {
					System.out.println("�̹� �����ϴ� �й��Դϴ�");
				}
			}else if(num==4) {
				//����
				System.out.print("������ �й��� �Է��ϼ���\n>>");
				int su = sc.nextInt();
				if(data.get(su)==null) {
					System.out.println("�������� �ʴ� �й��Դϴ�.");
				}else {
					Student stu = new Student();
					stu.name = data.get(su).name;
					System.out.print("���� ������ �Է��ϼ���\n>>");
					stu.kor = sc.nextInt();
					System.out.print("���� ������ �Է��ϼ���\n>>");
					stu.eng = sc.nextInt();
					System.out.print("���� ������ �Է��ϼ���\n>>");
					stu.math = sc.nextInt();
					stu.total = stu.kor + stu.eng + stu.math;
					stu.average = (int)(stu.total/3);
					data.put(su,stu);
				}
				
			}else if(num==5) {
				//����
				System.out.print("������ �й��� �Է��ϼ���\n>>");
				int su = sc.nextInt();
				if(data.get(su)==null) {
					System.out.println("�������� �ʴ� �й��Դϴ�.");
				}else {
					data.remove(su);
				}
				
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			}
			
		}
		
		
	}
}