package com.bit.day11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex07 {
	public static void main(String[] args) {
		GregorianCalendar  cal;
		//���� �ð��� ����Ʈ
		cal = new GregorianCalendar(2003,2,1); // ���ϴ� ��¥�� ���� �ݿ���
		System.out.print(cal.get(Calendar.YEAR) + ".");
		System.out.print(cal.get(Calendar.MONTH) + 1 +".");
		System.out.print(cal.get(Calendar.DATE) + ".");
		System.out.print(cal.get(Calendar.HOUR_OF_DAY) + ":");
		System.out.print(cal.get(Calendar.MINUTE) + ":");
		System.out.println(cal.get(Calendar.SECOND));
		
		System.out.println(cal.getActualMaximum(Calendar.DATE)); // �� ���� �ִ� ��
		
		
		
		
	}
}
