package com.bit.day14;

import java.io.File;
import java.io.IOException;

public class EX07 {
	public static void main(String[] args) {
		String prefix = "target03"; //���� ���
		String suffix = ".txt";		//���� Ȯ����
	//c:\Users\����\AppData\Local\Temp
	//C:\Users\stxz\AppData\Local\Temp
		try {
			File file = File.createTempFile(prefix, suffix);
			//createTempFile�ӽ����� ����°�
	// ���ο� �ӽ������� ���� �̸��� prefix�� suffix�� �ٿ� directory ������ �����Ѵ�.
			try {
				Thread.sleep(3000); //��½ð� ���� 1000�� 1��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			file.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//�ӽ������� �ü������ 30�� �ĸ� �˾Ƽ� ����
		//��ũ��â�� ���ε�� â�� ���ڸ��� �ӽ����� �� ����°�
		//�ӽ������� ����� �ص� 0101010 ���� �ڷ���� ���� ����
		//���� �������� �� �� �ٽ� Ű�� �ҷ����� ������ �ӽ������� ���ٰ� �ٿ� ���� ��
		
	}
}
