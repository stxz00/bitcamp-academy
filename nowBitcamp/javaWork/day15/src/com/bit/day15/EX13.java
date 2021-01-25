package com.bit.day15;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
//����Ʈ��̽�Ʈ��
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EX13 {
	public static void main(String[] args) {
		File file = new File("test01.txt");
		InputStream is = null;
		ByteArrayOutputStream baos = null;
		BufferedOutputStream bos = null;
		try {
			is = new FileInputStream(file);
			baos = new ByteArrayOutputStream();
			bos = new BufferedOutputStream(baos);
			while(true) {
				int su = is.read();
				if(su == -1) {break;}
				bos.write(su); 
				//�׵��ȿ��� ����� ����������
				//�̰��� �ӽ������� ������ �ʿ䰡 ���� �� ����ϴ� ��
				//�׵��� �迭 ���� ���ؼ� ������ �̰� �׷� �ʿ� ���� ����
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) {bos.close();}
				if(baos != null) {baos.close();}
				if(is != null) {is.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		File copy = new File("copy\\copy06.txt");
		OutputStream os = null;
		ByteArrayInputStream bais = null;
		byte[] buf = baos.toByteArray();
		//�ӽ������� ���� �迭�� ����
		try {
			os = new FileOutputStream(copy);
			bais = new ByteArrayInputStream(buf);
			while(true) {
				int su = bais.read();
				if(su == -1) {break;}
				os.write(su);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				
				if(bais != null) {bais.close();}
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
