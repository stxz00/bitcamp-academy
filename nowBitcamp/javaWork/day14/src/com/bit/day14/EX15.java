package com.bit.day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EX15 {
	public static void main(String[] args) {
		// �л������������α׷�(ver 0.6.0)
		
		File file = new File("data.bin");

		System.out.println("�л������������α׷�(ver 0.6.0");
		String menu = "1.���� 2.�Է� 3.���� 4.���� 0.����\n>";
		String table = "----------------------------------------";
		table += "\n�й�\t����\t����\t����\n"; 
		table +=  "----------------------------------------\n";
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		String data = "";
		FileInputStream fis = null;
		if(file.exists()) {
			byte[] by = new byte[(int)file.length()];
			try {
				fis = new FileInputStream(file);
				for(int i = 0; i< file.length(); i++) {
					by[i] = (byte)fis.read();
				}
				data = new String(by);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if(fis != null) {fis.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		while(true) {
			System.out.print(menu);
			input=sc.nextInt();
			if(input == 0) {
				FileOutputStream fos = null;
				byte[] by = data.getBytes();
				try {
					fos = new FileOutputStream(file);
					for(int i = 0; i < by.length; i++) {
						fos.write(by[i]);
					}
						
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					
					try {
						if(fos !=null) {fos.close();}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				break;
				}
			if(input == 1) {
				System.out.print(table);
				System.out.println(data);
			}else if(input == 2) {
				String[] titles = {"�й�","����","����","����"};
				int[] stu = new int[titles.length];
				for(int i = 0; i < stu.length; i++) {
					System.out.print(titles[i]);
					stu[i] = sc.nextInt();
				}
				// �й�\t����\t����\t����\n
				data += stu[0] + "\t" + stu[1] + "\t" + stu[2] + "\t"+ stu[3] + "\n";
				
			}else if(input == 3) {
				
				
			}else if(input == 4) {
				System.out.print("������ �й�>");
				input = sc.nextInt();
				int idx =data.indexOf("\n"+ input +"\t")+1;
				int tap = data.indexOf('\t');
				String first = data.substring(0,tap);
				if(input == Integer.parseInt(first)) {idx = 0;}
				int last = data.indexOf('\n', idx+1);
				String old = data.substring(idx,last+1);
				data = data.replace(old,"");
			}
			
		}
		
	}
}
