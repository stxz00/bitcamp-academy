package com.bit.day12;

import java.util.Enumeration;
import java.util.Vector;

public class Ex07 {
	public static void main(String[] args) {
		//Vector
		//stack�� ��ӹ޴� Vector
		//list�� ��ӹ���
		//������ ���� ����
		//Vector�� Array�� �������
		//������ �������� �迭�� ������� ������ ������ ����
		Vector vec1 = new Vector(); 
		vec1.addElement("ù��°");
		vec1.addElement("�ι�°");
		vec1.addElement("����°");
		vec1.addElement("�׹�°");
		
		System.out.println(vec1.elementAt(0));
		System.out.println(vec1.elementAt(1));
		System.out.println(vec1.elementAt(2));
		System.out.println(vec1.elementAt(3));

		
		System.out.println("-------------");
		/*
		System.out.println(vec1.lastElement()); //�׹�°
		vec1.remove(vec1.size()-1);
		System.out.println(vec1.lastElement()); //����°
		*/
		Enumeration eles = vec1.elements(); //Enumeration���� ������ ����
		while(eles.hasMoreElements()) {
		System.out.println(eles.nextElement());
		}
		
	}
}
