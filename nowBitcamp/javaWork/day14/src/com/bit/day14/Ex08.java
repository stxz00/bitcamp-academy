package com.bit.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex08 {
	public static void main(String[] args) {
		File file = new File("target01.txt");
		// ����Ʈ ���� ��Ʈ��
		// 1byte Stream (input) 1����Ʈ ü��� �о� ����
		java.io.InputStream is; //�о����, �߻�Ŭ����
		try {
				is = new java.io.FileInputStream(file); 
				//���Ͼ����� �� �ؾ��ϱ� ������ Ʈ����ĳġ�� �ʼ���
				while(true) {
					int su = is.read(); //����Ʈ ������ int�� ��ȯ
					//IOException �ʼ�üũ
					if(su == -1) {break;}
					System.out.println(su);
					//���� /r/n ���� �ϳ��� ���ڷ� �о��� �����츸 /r ����, �ٸ� �ü���� \n �� 10 �� ���
					//�׻� 0101010 �̷��� ����Ʈ ������ ������ ��
				}
				is.close();
				//IOException �ʼ�üũ
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
