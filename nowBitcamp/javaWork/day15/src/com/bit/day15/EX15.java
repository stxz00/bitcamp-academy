package com.bit.day15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EX15 {
	public static void main(String[] args) {
		File file = new File("test03.txt");
		java.io.Writer wt = null;
		String msg = "xyz\t�ѱ�\n1234!@#$";
		char[] arr = msg.toCharArray();
		java.io.BufferedWriter bw = null;
		java.io.PrintWriter pw = null;
		try {
			file.createNewFile();
			wt = new FileWriter(file);
			bw = new BufferedWriter(wt);
			pw = new PrintWriter(bw);
			
			pw.print("��Ʈ���� �׳� �ۼ��� �� �ֽ��ϴ�");
			pw.println("��Ʈ���� �׳� �ۼ��� �� �ֽ��ϴ�");
			//println���� newLine�� ������
			
/*			
//			bw.write(arr);
			bw.write("��Ʈ���� �׳� �ۼ��� �� �ֽ��ϴ�");
//			bw.write("\r\n");
			bw.newLine(); // �ü���� ���� ���� ���
			bw.write("abcdefg");
			bw.newLine(); 
			bw.write("!@#$%");
			//���۴� 1����Ʈ�� ���°� �ƴ� �ϴ� �����ߴٰ� �Ѳ����� ���Ƿ� ���� 
			
*/			
			/*
			wt.write(65);
			wt.write(97);
			wt.write('A');
			wt.write('a');
			wt.write('B');
			wt.write('b');
			wt.write('C');
			wt.write('c');
			wt.write('\n');
			wt.write('��');
			wt.write('��');
			*/
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) {bw.close();}
				if(wt != null) {wt.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
