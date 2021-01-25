//data�� �ޱ� int��, �Էµ��ڸ��� ����ϱ��

package com.bit.day15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;




public class Ex12My {
	public static void main(String[] args) {

		File file = new File("Ex12My.bin");
		InputStream is = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		OutputStream os = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		ArrayList<Integer> data = new ArrayList<>();
		
		if(file.exists()) {
			try {
				is = new FileInputStream(file);
				bis = new BufferedInputStream(is);
				dis = new DataInputStream(bis);
				
				while(true) {
					int su = dis.readInt();
					if(su == -1) {break;}
					data.add(su);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (EOFException e) {
				//���� �� ���� ����
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(dis != null) {dis.close();}
					if(bis != null) {bis.close();}
					if(is != null) {is.close();}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("�л� ���� ���α׷�  DataIOStream ver.");
			System.out.println("------------------------------------");
			
			String main ="1.���� 2.�Է� 3.���� 4.���� 0.����\n>";
			String menu = "------------------------------------\n";
			menu +="�й�\t����\t����\t����\n";
			menu += "------------------------------------";
			int input = 0;
		
			while(true) {
				
					System.out.print(main);
					input = sc.nextInt();
					if(input == 0) {
					
					
					
						break;
					}
					if(input == 1) {
						System.out.println(menu);
						for(int i = 0; i < data.size(); i += 4) {
							System.out.print(data.get(i) + "\t" + data.get(i+1) + "\t" + data.get(i+2) + "\t" + data.get(i+3) + "\n");
						}
					
					
					}
					if(input == 2) {
						System.out.print("�й�>");
						data.add(sc.nextInt());
						System.out.print("����>");
						data.add(sc.nextInt());
						System.out.print("����>");
						data.add(sc.nextInt());
						System.out.print("����>");
						data.add(sc.nextInt());
					
					
					}
					if(input == 3) {
						System.out.print("������ �й�>");
						input = sc.nextInt();
						for(int i = 0; i < data.size(); i+=4) {
							if(data.get(i) == input) {
								data.set(i, input);
								System.out.print("����>");
								data.set(i+1,sc.nextInt());
								System.out.print("����>");
								data.set(i+2,sc.nextInt());
								System.out.print("����>");
								data.set(i+3,sc.nextInt());
							}
						}
						
					}
					if(input == 4) {
						System.out.print("������ �й�>");
						input = sc.nextInt();
						for(int i = 0; i < data.size(); i+=4) {
							if(data.get(i) == input) {
								data.remove(i);
								data.remove(i);
								data.remove(i);
								data.remove(i);
							}
						}
					}

			try {	
				file.createNewFile();
				os = new FileOutputStream(file);
				//bos = new BufferedOutputStream(os);
				//bos�� ���� �ʴ� ���� -> ����Ʈ�� �̹� ��ȯ���ױ� ����?
				dos = new DataOutputStream(os);
				
				for(int i = 0; i < data.size(); i++) {
					int su = data.get(i);
					dos.writeInt(su);
				}
				
			}catch(FileNotFoundException e){
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(dos != null) {os.close();}
					if(bos != null) {os.close();}
					if(os != null) {os.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
		sc.close();
	
	}
}
