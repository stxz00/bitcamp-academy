package com.bit.oracle01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Ex03 {
	
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream(new File("text.properties"));
			Properties prop = new Properties();
			prop.load(is);
			System.out.println(prop.getProperty("name"));
			System.out.println(prop.getProperty("key1"));
			System.out.println(prop.getProperty("key2"));
			//�������� ���Ϸ� �ް� �����ϱ�
			//�ٸ� �����̶� �޾Ƽ� �� �� �ִ� ��!
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(is != null) {is.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
