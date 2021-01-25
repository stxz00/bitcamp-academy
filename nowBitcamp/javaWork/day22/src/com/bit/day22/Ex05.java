package com.bit.day22;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex05 {
	
	public static void main(String[] args) {
//		File file = new File("copy/naver.html");
		File file = new File("copy/7z.exe");
		
		java.net.URLConnection conn = null;
		
		//url�κ��� ���ӻ��¸� �޴� �� connection�� ����
		
		String spec = "https://www.7-zip.org/a/7z1900.exe"; //"https://www.naver.com/";  //"https://google.com";
		// ������ �Ǿ��־ /a/������ 7z1900.exe �� ���� ������ �ʰ� �ٸ� ���� ���� ��. 
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
//		Writer fw = null;
//		PrintWriter pw = null;
		
		OutputStream os = null;
		
		URL url = null;
		try {
			File parent = new File(file.getParent());
			parent.mkdir();
			file.createNewFile();
//			fw = new FileWriter(file);
//			pw = new PrintWriter(fw);
			os = new FileOutputStream(file);
			
			
			url = new URL(spec); //�������� ���� �Ұ���
			conn = url.openConnection(); //url�κ��� ���ӹ���
			//System.out.println(conn); //������ ������������ �����ִ°� �����ִ� �� �ƴ϶� ������ �ҽ��� �޾ƿ��°�!
			is = conn.getInputStream(); 
			isr = new InputStreamReader(is,"utf-8"); //�ѱ� �ȱ����� utf-8 ����
			br = new BufferedReader(isr);
			
//			String msg = null;
//			while((msg = br.readLine()) != null) {
//				pw.println(msg); //�ҽ� ���
//			}
			
			int su = 1;
			while((su = is.read()) != -1) {
				os.write(su);
			}
			
			System.out.println("ũ�Ѹ� ��...");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(os != null) {os.close();}
//				if(pw != null) {pw.close();}
//				if(fw != null) {fw.close();}
//				if(br != null) {br.close();}
//				if(isr != null) {isr.close();}
				if(is != null) {is.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

//��ó�� �������� �ϴ� ������ ������ ��û�ϵ� ������ ��û�ϵ� 010101�� �о��ְ� �� ��ǻ�Ͱ� �޾����� ��