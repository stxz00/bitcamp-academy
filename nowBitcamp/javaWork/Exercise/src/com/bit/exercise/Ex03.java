package com.bit.exercise;

import java.io.File;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) {
		File file = new File("My.txt");
		
	
			try {
				if(file.createNewFile()) {
					System.out.println("�����Ϸ�");
				}else {
					System.out.println("�̹� ���� �̸��� ������ �����մϴ�");
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		
		File file2 = new File("Myd");
		
		if(file2.mkdir()) {
			System.out.println("���͸� �����Ϸ�");
		}else {
			System.out.println("������ ���͸� ����");
		}
	}
}
