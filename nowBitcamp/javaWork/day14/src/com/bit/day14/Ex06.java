package com.bit.day14;

import java.io.File;

public class Ex06 {
	public static void main(String[] args) {
		String oldName = "target02.txt";
		String newName = "target03.txt";
		
		File oldFile = new File(oldName);
		File newFile = new File(newName);
		
		if(oldFile.renameTo(newFile)) {
			//�̸����� ���� ������ �־�� ��
			System.out.println("rename..");
		}else {
			System.out.println("fail..");
		}
		
		// ���� �� ���� ������ �����ϰ� �ִ� ��� �ϳ��� ���� ������� �������� �ǰ� �ΰ��� ������ �����ϰ� �� ��. -> �����̿� ���� Ex07���� ����
	}
}
