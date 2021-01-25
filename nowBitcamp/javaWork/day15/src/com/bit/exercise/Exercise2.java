package com.bit.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		File file = new File("Exercise2.bin");
		Reader rd = null;
		BufferedReader br = null;
		Writer wt = null;
		BufferedWriter bw = null;
		
		System.out.println("�л� ���� ���α׷� ver");
		System.out.println("----------------------------------------------");
		String main = ("1.���� 2.�Է� 3.���� 4.���� 0.���� \n>");
		String menu = ("----------------------------------------------");
		menu += ("\n�й�\t�̸�\t����\t����\t����\n");
		menu += ("----------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		String input = new String();
		while(true) {
			System.out.print(main);
			input = sc.nextLine();
			if(input.equals("0")) {
				break;
			}else if(input.equals("1")) {
				System.out.println(menu);
				try {
					rd = new FileReader(file);
					br = new BufferedReader(rd);
					String data = new String();
					while(true) {
						String line = br.readLine();
						if(line == null) {break;}
						data += line + "\n";
					}
					System.out.print(data);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if(rd != null) {rd.close();}
						if(br != null) {rd.close();}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}else if(input.equals("2")) {
				System.out.print("�߰��� �й�");
				input = sc.nextLine();
				if(file.exists()) {
					try {
						rd = new FileReader(file);
						br = new BufferedReader(rd);
						
						String data = new String();
						Boolean boo = false;
						while(true) {
							String line = br.readLine();
							if(line == null) {break;}
							int last = line.indexOf("\t");
							String stuID = line.substring(0,last);
							if(stuID.equals(input)) {
								boo = true;
							}
						}
						if(boo) {
							System.out.println("������ �й��� �����մϴ�");
							continue;
						}
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						try {
							if(br != null) {rd.close();}
							if(rd != null) {rd.close();}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				System.out.print("�̸� > ");
				String name = sc.nextLine();
				System.out.print("���� > ");
				String kor = sc.nextLine();
				System.out.print("���� > ");
				String eng = sc.nextLine();
				System.out.print("���� > ");
				String math = sc.nextLine();
				String stu = input + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\n";
				
				try {
					file.createNewFile();
					rd = new FileReader(file);
					br = new BufferedReader(rd);
					
					String data = new String();
					while(true) {
						String line = br.readLine();
						if(line == null) {break;}
						data += line + "\n";
					}
					
					wt = new FileWriter(file);
					bw = new BufferedWriter(wt);
					
					bw.write(data);
					bw.write(stu);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if(br != null) {rd.close();}
						if(rd != null) {rd.close();}
						if(bw != null) {bw.close();}
						if(wt != null) {wt.close();}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}else if(input.equals("3")) {
				System.out.print("������ �й�");
				input = sc.nextLine();
				try {
					file.createNewFile();
					rd = new FileReader(file);
					br = new BufferedReader(rd);
					
					String data = new String();
					while(true) {
						String line = br.readLine();
						if(line == null) {break;}
						int last = line.indexOf("\t");
						String stuID = line.substring(0,last);
						if(stuID.equals(input)) {
							System.out.print("�̸� > ");
							String name = sc.nextLine();
							System.out.print("���� > ");
							String kor = sc.nextLine();
							System.out.print("���� > ");
							String eng = sc.nextLine();
							System.out.print("���� > ");
							String math = sc.nextLine();
							String stu = input + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\n";
							data += stu;
						}else{
							data += line + "\n";
						}
					}
					
					wt = new FileWriter(file);
					bw = new BufferedWriter(wt);
					bw.write(data);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if(br != null) {rd.close();}
						if(rd != null) {rd.close();}
						if(bw != null) {bw.close();}
						if(wt != null) {wt.close();}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	
			}else if(input.equals("4")) {
				System.out.print("������ �й�");
				input = sc.nextLine();
				try {
					file.createNewFile();
					rd = new FileReader(file);
					br = new BufferedReader(rd);
					
					String data = new String();
					while(true) {
						String line = br.readLine();
						if(line == null) {break;}
						int last = line.indexOf("\t");
						String stuID = line.substring(0,last);
						if(stuID.equals(input)) {
							
						}else{
							data += line + "\n";
						}
					}
					
					wt = new FileWriter(file);
					bw = new BufferedWriter(wt);
					bw.write(data);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if(br != null) {rd.close();}
						if(rd != null) {rd.close();}
						if(bw != null) {bw.close();}
						if(wt != null) {wt.close();}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			}
			
			
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}
}
