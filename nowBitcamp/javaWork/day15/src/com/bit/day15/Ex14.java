package com.bit.day15;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//���ڽ�Ʈ��
public class Ex14 {
	public static void main(String[] args) {
		File file = new File("test01.txt");
		
		// 2����Ʈ�� ���� 2����Ʈ�������� Ȧ������Ʈ ������ ����� ���� �� ����
		// char�� ������ �����ϱ� 0~256 �߿� ���ٴ� ǥ�÷� int���� 0�� ����
		java.io.Reader rd = null;
		char[] cbuf = new char[5];
		BufferedReader br = null;
		try {
			rd = new FileReader(file);
			br = new BufferedReader(rd);
			/*
			while(true) {
				int su = rd.read();
				if(su == -1) {break;}
				System.out.print((char)su);
			}
			*/
			while(true) {
				//int su = br.read(cbuf);
				//if(su == -1) {break;}
				//System.out.print(new String(cbuf,0,su));
				String msg = br.readLine(); //1���� ����
				if(msg == null) {break;}
				System.out.println(msg);
				
				
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rd != null) {rd.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
