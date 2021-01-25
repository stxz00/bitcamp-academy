package com.bit.day15;
//���� ����
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		File file = new File("test01.txt");
		byte[] buf = new byte[4];
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			int su = is.read(buf);
			System.out.println(Arrays.toString(buf));
			System.out.println(su);
			//�о���� ���� ���� ������ ���� buf�� �о��� �� buf�� test���� 1����Ʈ�� �о���� ������ ����.
			su = is.read();
			System.out.println(su);
			su = is.read(); //�о���ϰ� ������ -1���
			System.out.println(su);
			
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
