package com.bit.day20;
//����Ʈ��Ʈ���� ������ �����ϱ�
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Ex01 {
	
	public static void main(String[] args) {
//		File file = new File("test01.txt");
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		PrintWriter ps = null;
		try {
			os = new FileOutputStream("test01.txt",true); //���� ���Ͽ� ���� �߰� //File���� �ٷ� ���� ���͸��� ��������� �ʾ� ����
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			ps = new PrintWriter(bw);
			/*
			bw.write("���ڿ���Ʈ������ ��ȯ");
			bw.newLine();
			bw.write("���ο� ���� �ۼ�");
			*/
			
			ps.println("���ڿ���Ʈ������ ��ȯ");
			ps.println("���ο� ���� �ۼ�");
			ps.println("�����ۼ��� ����");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {ps.close();}
				if(bw != null) {bw.close();}
				if(osw != null) {osw.close();}
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
