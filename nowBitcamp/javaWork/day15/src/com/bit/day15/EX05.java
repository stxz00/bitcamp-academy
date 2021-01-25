package com.bit.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EX05 {
	public static void main(String[] args) {
		//����Ϸ� : 3505ms (�⺻)������ ���� ����
		byte[] buf = new byte[64]; // n���� �޾Ƽ� �о���̰� ���� ��
		//����Ϸ� : 1063ms; 5�϶�  ������ +2 ����Ʈ����
		//����Ϸ� : 152ms; 64�϶�	������ +12 ����Ʈ����
		//���۸� ���� ���� Ŭ���� ����� jpg�� ����� Ŀ��
		//
		
		
		File src = new File("sample.jpg");
		File dest = new File("copy\\copy01.jpg");
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			System.out.println("�������");
			long before = System.currentTimeMillis();
			if(dest.exists()) {dest.createNewFile();}
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			
			while(true) {
				int su = is.read(buf); //����Ʈ �迭�� ����
				if(su == -1) {break;}
				os.write(buf); //����Ʈ �迭�� ��
			}
			long after = System.currentTimeMillis();
			System.out.println("����Ϸ� : " + (after - before) + "ms");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(is != null) {is.close();}
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
