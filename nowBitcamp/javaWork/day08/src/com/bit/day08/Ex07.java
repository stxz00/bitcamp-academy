package com.bit.day08;

public class Ex07 {
	public static void main(String[] args) {
		boolean boo1 = true;
		Boolean boo2 = true;
		Boolean boo3 = new Boolean(true);
		//Boolean boo3 = new Boolean(TRUE); true�� Ű���尪�̴� �빮�ڴ� x
		Boolean boo4 = new Boolean("true");
		Boolean boo5 = new Boolean("TRUE");
		System.out.println(boo3);
		System.out.println(boo4);
		System.out.println(boo5);
		//Boolean.parseBoolean(String)
		//Boolean.valueOf(String)
	}
}
