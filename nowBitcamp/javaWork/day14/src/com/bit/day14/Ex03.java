package com.bit.day14;

import java.io.File;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) {
		
//		File file = new File(".\\test03\\target03.txt");
		//������ ��θ� ã�� �� ���� ���丮 ��������
		/*
		File file = new File(".\\test03\\target03.txt");
		File parent = new File(file.getParent()); // ������ test03 �� ��
		parent.mkdir();
		try {
			if(file.createNewFile()){
				System.out.println("�����Ϸ�");
			}else {
				System.out.println("���ϸ� ���� ����");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		*/
		
		File file = new File(".\\test03\\target03.txt");
		
		file.mkdirs();
		try {
			if(file.createNewFile()){
				System.out.println("�����Ϸ�");
			}else {
				System.out.println("���ϸ� ���� ����");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
