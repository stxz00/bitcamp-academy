package com.bit.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class EX08 {
	public static void main(String[] args) {
		PrintStream myOut = System.out;
		System.out.write(97);
		System.out.flush();
		File file = new File("test02.txt");
		
		OutputStream os = null;
		
		PrintStream ps = null;
		
		try {
			os = new FileOutputStream(file);
			ps = new PrintStream(os);
//			ps.write();			
			ps.print("������� �ۼ�");
			ps.println("����ϰ� ����");
			ps.println("������ �ۼ�");
			//�ѱ�ó���� ���� ��
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) {ps.close();}
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
