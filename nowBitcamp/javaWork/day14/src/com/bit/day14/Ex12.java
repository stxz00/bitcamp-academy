package com.bit.day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex12 {
	public static void main(String[] args) {
		//�ѱ��� 2����Ʈ �̹Ƿ� 1����Ʈ�� ������ �տ��ִ� 1����Ʈ�ۿ� ���б� ������ �߸��� ����Ʈ���ڰ� �����Ƿ� x �׷��� while�� ����Ʈ�� �ϳ��� �д°� �ƴ� �迭�� �ѱ۹��ڸ� �ϳ��� ������ ��Ƶ״ٰ� �� �� ������ ������ String���� �а� println �ϴ� ��. 
		File file = new File("target04.bin");
		String msg = null;
		byte[] by = new byte[(int) file.length()];
		FileInputStream fis = null;
		try {
			fis= new FileInputStream(file);
			
			for(int i = 0; i < by.length; i++) {
				by[i] = (byte)(fis.read());
			}
			msg = new String(by);
			System.out.println(msg);
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			 try {
				if(fis != null) {fis.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
