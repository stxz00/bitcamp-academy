package com.bit.day14;

import java.io.File;

public class EX04 {
	public static void main(String[] args) {
		/*
		String path = "test05\\etc01";
		File file = new File(path);
		File parent = new File(file.getParent());
		parent.mkdir();
		if(file.mkdir()) {
			//���丮 ����
			System.out.println("���丮 ���� �Ϸ�");
		}else {
			System.out.println("��������");
		}
		*/
		String path = "test05\\etc01";
		File file = new File(path);
		if(file.mkdirs()) {
			//���丮 ����
			System.out.println("���丮 ���� �Ϸ�");
		}else {
			System.out.println("��������");
		}
		
	}
}
