package com.bit.day10;		//�켱���� 2.

import com.bit.etc10.Test01; //�켱���� 1.
// import com.bit.etc10.*;		//�켱���� 3. ���ϵ�
// import�� �� ��Ű���� ã�� ���� �ش� ��Ű���� ã�ƶ�
// �� *ǥ�ø� �ϸ� ���� ã�°� �ƴ� ���߿� ã�� ����
// �ظ��ؼ��� ���ϵ� ����(�޸� ������) 1���� ���� �� ������

//���� ��Ű�� ��� ����� ��Ű���� �� �ؼ� ���� ��

import static java.lang.Math.PI;
// static���� �ƿ� ���ھ� ���� ��. import�� �ϸ� PI�� �ҷ��� ��. �� �Ⱦ�

import java.util.Scanner;

public class Ex01 {
	public final static Double pi = 3.14; 
	String name = "��";
	public static void main(String[] args) {
		Scanner sc;
		System.out.println(PI);
//		com.bit.etc10.Ex01 me = new com.bit.etc10.Ex01();
//		System.out.println(me.name);
//		com.bit.day10.Test01 test = new com.bit.day10.Test01();
//		System.out.println(test.name);

		com.bit.etc10.Ex01 me = new com.bit.etc10.Ex01();
		System.out.println(me.name); //��
		//���� �̸��� ���� Ŭ������ ���ؼ� ���� ���� Ŭ������ �������
		Ex01 me1 = new Ex01();
		System.out.println(me1.name); //��
		//���� Ex01Ŭ�������� Ex01�� �ҷ����Ƿ� �ܺ� ��Ű���� Ex01����
		//�켱������ ����
		com.bit.day10.Test01 test = new com.bit.day10.Test01();
		System.out.println(test.name); //�� ��Ű��
		Test01 test2 = new Test01();
		System.out.println(test2.name); //�� ��Ű��
		Test01 test21 = new Test01();
		System.out.println(test21.name); //�� ��Ű��
		
		
		
	}
}
