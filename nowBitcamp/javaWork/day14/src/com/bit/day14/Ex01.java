package com.bit.day14;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		java.io.File file = new File("target01.txt");
		System.out.println("�������� : " + file.exists());
		//src�� �ƴ� ������Ʈ�ʿ� �־� true����
		java.io.File file11 = new File("src\\target01.txt");
		System.out.println("�������� : " + file11.exists());
		//�⺻������ ã�� ��ġ�� javaWork\day14
		
		//������
		java.io.File file111 = new File("C:\\Users\\stxz\\Desktop\\bitcamp\\javaWork\\day14\\target01.txt");
		System.out.println("�������� : " + file111.exists());
		
		//����� : ���� �ִ� ��ġ �������� ��ġ ���ϴ°�
		String path = "target01.txt"; 
		String path1 = ".\\target01.txt"; 
		// path1�� �����Ǿ� path�� �� ��
		// cmd�� ��  cd . ���� cd .. ��������
		// cd / �ϸ� �������� ������
		java.io.File file1111 = new File(path);
		System.out.println("�������� : " + file1111.exists());
		
		String path2 = "test01"; 
		java.io.File file11111 = new File(path2);
		System.out.println("�������� : " + file11111.exists());
		//������ ������ �׷��� true�� �� ��, �� �����ϱ�(=���丮)
		
		String path3 = "."; 
		java.io.File file111111 = new File(path3);
		System.out.println("�������� : " + file111111.exists());
		//���� ����
		System.out.println("�̸� : " + file111111.getName());
		
		System.out.println("�̸� : " + file111.getName());
		System.out.println("�̸� : " + file.getName());
		
		System.out.println("���丮 : " + file.isDirectory());
		System.out.println("���� : " + file.isFile());
		
		String path4 = "src"; 
		java.io.File file111112 = new File(path4);
		
		System.out.println("���丮 : " + file111112.isDirectory());
		System.out.println("���� : " + file111112.isFile());
		
		System.out.println("��� : " + file11.getPath());
		System.out.println("��� : " + file111.getPath());
		// ����η� �־����� ����η�, �����϶��� ����� ����
		System.out.println("������ : " + file11.getAbsolutePath());
		//����δ� ���� ������ �־���ϱ� ������ �޼��� ����
		
		System.out.println("------------1--------------");
		java.io.File file111113 = new File("target02.txt");
		System.out.println("�̸� : " + file111113.getName());
		System.out.println("��� : " + file111113.getPath());
		//�����δ� ������ ����! ���丮,���� ���� ���δ� false�ε� �̸��� ��θ� ã�� �� ����.
		System.out.println("������ : " + file111113.getAbsolutePath());
		System.out.println("-------------2-------------");
		String path5 = "C:\\Users\\stxz\\Desktop\\bitcamp\\javaWork\\day01\\..\\day14\\target02.txt"; 
		//..���� �ڷ� ���� �ٽ� day14�� ���͵� ��(�����ο� ����� �� �� �� ���̽�
		java.io.File file111114 = new File(path5);
		System.out.println("��� : " + file111114.getPath());
		System.out.println("������? : " + file111114.getAbsolutePath());
		// �����η� ������ �ʰ� ����
		
			try {
				System.out.println("������2 : " + file111114.getCanonicalPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		//���� ��η� �������
	
		
		System.out.println("------------3--------------");
		System.out.println("�θ��� : " + file111.getParent());
		System.out.println("size : " + file.length() + " bytes");
		//��Ʈ ũ��
		System.out.println("�������� : " + new Date(file.lastModified()));
		//file.lastModified() �� long������ ������ �̸� Date�� �ϸ� ����
		
		
		//�ڹٴ� �ڹٰ���ӽſ��� ���ư��µ� ���� �ü���� ������ ��������� ���� -> �ü���� ���� ���̿� �ڹٰ���ӽ�
		System.out.println("--------------4------------");
		System.out.println("rwx r�б���� : " + file.canRead());
		System.out.println("rwx w������� : " + file.canWrite());
		System.out.println("rwx x������� : " + file.canExecute());
		//target01.txt�� ��Ŭ�� properties -> read-only�� �ϸ� ������� falese ����
		
		System.out.println("------------5--------------");
		if(file111111.isDirectory()) {
			String[] arr = file111111.list();
			System.out.println(Arrays.toString(arr));
		}
		//���� ���� ���ϵ��� ��
		
		//dir.exe
		System.out.println("--------------------------");
		/*
		File file2 = new File(".");
		System.out.println(file2.getAbsolutePath() + " ���͸�");
		
		Date d = new Date(file2.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		String s = sdf.format(d);
		System.out.println(s + "\t<DIR>");
		String[] arr1 = file2.list();
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(s + "\t<DIR>\t" + arr1[i].length() + "\t" + arr1[i]);
		}
		
		System.out.println(new File(".").listFiles().length  + "�� ����");
		*/
		
		
		
	} 
}
