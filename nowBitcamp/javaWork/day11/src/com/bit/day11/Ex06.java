package com.bit.day11;
//��¥

import java.time.Year;
import java.util.Calendar;

class Test01{
	private static Test01 me = new Test01();
	private Test01(){
		
	}
	public static Test01 getInsteance() {
		return me;
	}
	public String toString() {
		return "Test01 class...";
	}
}


public class Ex06 {
	public static void main(String[] args) {
		// �ڹٴ� �ð��� ǥ���Ϸ��� �� ��ü�� ������� �� �����Ƿ� ��Ȯ���� ���� �׷��� ���� ��Ȯ�ϱ� ���� �ڹ� �������Ҷ����� ���Ӱ� ��
		
		// Calendar : ������ ���, protected�� ����� �޾ƾ� ��밡��
		
		Test01 you = Test01.getInsteance(); // �̷��� Test01�� ��밡��
		System.out.println(you.toString());
		
		// ��¥�� �� �� �ұ�Ģ���̰� �ʿ信 ���� ������ �ʿ��ϴ� �� 
		// ���� �� �� ������ �������� ������ ��
		
		Calendar me = Calendar.getInstance(); // getInstance()�� protected�� ǰ, new�� ������� ����
		// because Calendar�� �߻�Ŭ�����̱� ������ ��ü�� ������ �� ����(GregorianCalendar�� ��� �޾� getInstance() �޼���� �޴°�)
		// �̴� GregorianCalendar�� ���ο� ��ü�� ������ �� �ִٴ� ��
		
		//set ���縦 �ٸ� �������� �ٲٱ�
		me.set(Calendar.YEAR, 2002);
		me.set(Calendar.MONTH, 4);	//5��
		
		System.out.println(me); 
		System.out.println(me.get(Calendar.DAY_OF_YEAR) + "��°");
		System.out.println(me.get(Calendar.WEEK_OF_MONTH) + "����");
		System.out.println(me.get(Calendar.WEEK_OF_YEAR) + "����");
		System.out.println(me.get(1));	//get(field) �ʵ尪�� ��ȯ 1�� YEAR ��� �ε� static���� �����س���
		System.out.println(me.get(Calendar.YEAR ) +  "��"); 
		// MONTH 0 ~ 11
		System.out.println(me.get(2)+1);
		System.out.println(me.get(Calendar.MONTH) + 1 + "��");
		System.out.println(me.get(5));
		System.out.println(me.get(Calendar.DATE) + "��");
		System.out.println(me.get(Calendar.DAY_OF_MONTH) + "��");
		System.out.println(me.get(Calendar.DAY_OF_WEEK) + "����"); //������ int�� ��
		//SUNDAY(1), MONDAY(2), TUESDAY(3),
		//WENDNESDAY(4), THURSDAY(5); FRIDAY(6), SATURDAY(7)
		char week = '-';
		if(me.get(Calendar.DAY_OF_WEEK) == 1 ) {week='��';}
		if(me.get(Calendar.DAY_OF_WEEK) == 2) {week='��';}
		if(me.get(Calendar.DAY_OF_WEEK) == 3) {week='ȭ';}
		if(me.get(Calendar.DAY_OF_WEEK) == 4) {week='��';}
		if(me.get(Calendar.DAY_OF_WEEK) == 5) {week='��';}
		if(me.get(Calendar.DAY_OF_WEEK) == 6) {week='��';}
		if(me.get(Calendar.DAY_OF_WEEK) == 7) {week='��';}
		
		if(me.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {week='��';}
		if(me.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {week='��';}
		if(me.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) {week='ȭ';}
		if(me.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {week='��';}
		if(me.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {week='��';}
		if(me.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {week='��';}
		if(me.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {week='��';}
		
		System.out.println(week + "����");
		
		if(me.get(Calendar.AM_PM) == 0) {      // 0�̸� ���� 1�̸� ���� 
			System.out.println("am.");
		}else {
			System.out.println("pm.");
		}
		System.out.println(me.get(Calendar.HOUR) + "��");	//12�� �������� ����
		System.out.println(me.get(Calendar.HOUR_OF_DAY) + "��");	//0~23�� �������� ����
		System.out.println(me.get(Calendar.MINUTE) + "��");
		System.out.println(me.get(Calendar.SECOND) + "��");
		System.out.println(me.get(4));
		
		System.out.println(me.before(me)); //��󺸴� ������ 
		System.out.println(me.after(me)); // ������
		
	


	}
}
