package com.bit.day08;

public class Ex08 {
	public static void main(String[] args) {
		char ch1 = 'a';
		Character ch2 = 'A';
		Character ch3 = new Character('A');
		System.out.println("�����ڵ����� : " + Character.isAlphabetic(ch1));
		System.out.println("�����ڵ����� : " + Character.isLetter(ch1));
		//�׳� ���� ����
		System.out.println("�������� : " + Character.isDigit(ch1));
		System.out.println("�빮������ : " + Character.isUpperCase(ch1));
		System.out.println("�ҹ������� : " + Character.isLowerCase(ch1));
		System.out.println("�����̽����� : " + Character.isSpace(ch1));
		System.out.println("�����̽����� : " + Character.isWhitespace(ch1));
		char ch4 = 'a';
		System.out.println(Character.toUpperCase(ch4));
		System.out.println(ch4);
		System.out.println(Character.toLowerCase(ch4));
	}
}
