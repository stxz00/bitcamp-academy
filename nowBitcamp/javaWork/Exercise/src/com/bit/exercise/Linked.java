package com.bit.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Linked {
	private static Scanner sc = new Scanner(System.in);
	private static LinkedList<Integer> data =  new LinkedList<>();

	static void stuInsert() {
		System.out.print("�й� > ");
		int num = sc.nextInt();
		for(int i = 0; i < data.size(); i+=4) {
			if(data.get(i) == num) {
				System.out.println("�̹� �й��� �����մϴ�");
				break;
			}
		}
		data.add(num);
		System.out.print("���� > ");
		data.add(sc.nextInt());
		System.out.print("���� > ");
		data.add(sc.nextInt());
		System.out.print("���� > ");
		data.add(sc.nextInt());
	}
	
	
	public static void main(String[] args) {
		File file = new File("Linked.txt");

		FileInputStream fis = null;
		if(file.exists()) {
			try {
				fis = new FileInputStream(file);
				
				for(int i = 0; i < file.length(); i ++) {
					data.add((int)fis.read());
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if(fis != null) {fis.close();}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		System.out.println("�л� ���� ���α׷� LinkedList ver.");
		System.out.println("---------------------------------------");
		
		String main = "1.���� 2.�Է� 3.���� 4.���� 0.����\n>";
		String menu = "---------------------------------------\n";
		menu += "�й�\t����\t����\t����\t\n";
		menu += "---------------------------------------";
		
		int input = 0;
		
		while(true) {
			System.out.print(main);
			input = sc.nextInt();
			if(input == 0) {
				FileOutputStream fos = null;
				try {
					fos = new FileOutputStream(file);
					byte[] by = new byte[data.size()]; 
					for(int i = 0; i < data.size(); i++) {
						by[i] = data.get(i).byteValue();
						fos.write(by[i]);
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if(fos != null) {fos.close();}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				break;
				}
			
			if(input == 1) {
				System.out.println(menu);
				for(int i = 0; i < data.size(); i+=4) {
					System.out.println(data.get(i) + "\t" + data.get(i+1) + "\t" + data.get(i+2) + "\t" + data.get(i+3));
					if(data.size()-4 == i) {
						break;
					}
				}
			}
			if(input == 2) {
				stuInsert();
			}
			if(input == 3) {
				System.out.print("������ �й� > ");
				input = sc.nextInt();
				for(int i = 0; i < data.size(); i+=4) {
					if(data.get(i) == input) {
						System.out.print("���� > ");
						data.set(i+1,sc.nextInt());
						System.out.print("���� > ");
						data.set(i+2,sc.nextInt());
						System.out.print("���� > ");
						data.set(i+3,sc.nextInt());
						break;
					}else if(data.size()-4 == i) {
						System.out.println("�й��� �������� �ʽ��ϴ�");
						break;
					}
				}
			}
			if(input == 4) {
				System.out.print("������ �й� > ");
				input = sc.nextInt();
				for(int i = 0; i < data.size(); i+=4) {
					if(data.get(i) == input) {
						data.remove(i);
						System.out.print("���� > ");
						data.remove(i);
						System.out.print("���� > ");
						data.remove(i);
						System.out.print("���� > ");
						data.remove(i);
						break;
					}else if(data.size()-4 == i) {
						System.out.println("�й��� �������� �ʽ��ϴ�");
						break;
					}	
				}
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}	
}
