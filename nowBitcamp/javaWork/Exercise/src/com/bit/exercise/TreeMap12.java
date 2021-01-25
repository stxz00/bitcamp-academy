package com.bit.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Student1 {
	int num;
	String kor;
	String eng;
	String math;
	
	public Student1(Scanner sc) {
		System.out.print("�й�>");
		num = Integer.parseInt(sc.nextLine());
		System.out.print("����>");
		kor = sc.nextLine();
		System.out.print("����>");
		eng = sc.nextLine();
		System.out.print("����>");
		math = sc.nextLine();
	}

}

public class TreeMap12 {
	public static void main(String[] args) {
		File file = new File("TreeMap.txt");
		TreeMap<Integer, String> data = new TreeMap<>();
		
		FileInputStream fis = null;
		if(file.exists()) {
			try {
				fis = new FileInputStream(file);
				byte[] by = new byte[(int) file.length()];
				for(int i = 0; i < by.length; i++) {
					by[i] = (byte) fis.read();
				}
				String readData = new String(by);
				String[] sep = readData.split("\n");
				for(int i = 0; i < sep.length; i++) {
					sep[i] = sep[i] + "\n";
					int last = sep[i].indexOf("\t");
					int key = Integer.parseInt(sep[i].substring(0, last));
					data.put(key, sep[i]);
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
					FileOutputStream fos = null;
					try {
						fos = new FileOutputStream(file);
					
						Set keys = data.keySet();
						Iterator<Integer> ite = keys.iterator();
						while(ite.hasNext()) {
							int key = ite.next();
							String val = data.get(key);
							byte[] by = val.getBytes();
							for(int i = 0; i < by.length; i++) {
								fos.write(by[i]);
							}
						}
						
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						try {
							if(fos != null){fos.close();}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					break;
				}
				if(input.equals("1")) {
					System.out.println(menu);
					Set keys = data.keySet();
					Iterator<Integer> ite = keys.iterator();
					while(ite.hasNext()) {
						int key = ite.next();
						System.out.print(data.get(key));
					}

				}
				if(input.equals("2")) {
					Student1 add = new Student1(sc);
					String stu =  add.num + "\t" + add.kor + "\t" + add.eng + "\t" + add.math + "\n"; 
					data.put(add.num, stu);
					
				
				
				}
				if(input.equals("3")) {
					System.out.print("������ �й�>");
					input = sc.nextLine();
					if(data.get(Integer.parseInt(input)) != null) {
						Student1 set = new Student1(sc);
						String stu =  set.num + "\t" + set.kor + "\t" + set.eng + "\t" + set.math + "\n"; 
						data.replace(set.num, stu);
					} else {
						System.out.println("�������� �ʴ� �й��Դϴ�");
					}

				}
				if(input.equals("4")) {
					System.out.print("������ �й�>");
					input = sc.nextLine();
					if(data.get(Integer.parseInt(input)) != null) {
						data.remove(Integer.parseInt(input));
					} else {
						System.out.println("�������� �ʴ� �й��Դϴ�");
					}
				}
		}
		System.out.println("�̿����ּż� �����մϴ�");
		sc.close();
	}
}
