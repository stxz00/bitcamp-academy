package com.bit.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EX06 {
	public static void main(String[] args) {
		File src = new File("test01.txt");
		File dest = new File("copy\\copy01.txt");
		
		InputStream is = null;
		OutputStream os = null;
		byte[] buf = new byte[5];
		try {
			dest.createNewFile();
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			
			while(true) {
//				int su = is.read(buf,0,3) ó������ ������ �о���� ���� 0 ���� 3���� ������ ���� ����				
				int su = is.read(buf);
				System.out.println(su); 
				//5 5 5 2 -1
				//2���� 3�� ���ƹ���
				if(su == -1) {break;}
				os.write(buf,0,su); //������ �迭 0���� ���� ������(su)��ŭ ���
//				���� ���
//				abcd
//				ABCD
//				efg
//				Efgg
//				E
//				���� ������ ����Ʈ �� ��ŭ �޸��� ����Ʈ�� ����		
//				�о���̴� ����ŭ �������� �����ϸ� ��
//				���� ������ ������ ������ ������ ���� ���� ����Ʈ�� ��ŷ ���� �ڵ带 �־���� �� �����Ƿ� �� �ش� ������ �ذ��ؾ��ϱ� ������ �̷��� �ϴ� ��.
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
