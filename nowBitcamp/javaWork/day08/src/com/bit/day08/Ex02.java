package com.bit.day08;

public class Ex02 {
	public static void main(String[] args) {
		// int -> Integer
		int su1 = 1234;
		Integer su2 = 1234; // �ڽ�
		Integer su3 = new Integer(su1); //�ڽ�, ����
		Integer su4 = new Integer("1234"); // ���ڿ� -> ����
		
		System.out.println(su1+1);
		System.out.println(su2+1); //���� �� ��ü���� �⺻�ڷ������� ����
		System.out.println(su3);
		System.out.println(su4);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		
		System.out.println(su3==su4); //�ٸ� �ּҰ�
		System.out.println(su3+0==su4+0); //�����ϱ� ������ �⺻�ڷ��� value��
		System.out.println(su3.equals(su4)); //value ��
		System.out.println(su3.intValue()); //return���� int��(����)
		System.out.println(su3.intValue()==su4.intValue());
		System.out.println(su3.doubleValue()==su4.doubleValue());
		System.out.println(su3.longValue()==su4.longValue()); //long������ ����
		String msg = "1223";
		int su5 = Integer.parseInt(msg); //�Ľ���Ʈ�ϴ� ���� �ٷ� ��Ʈ�� return�� int
		int su6 = new Integer(msg); //��ü�� ��Ƽ���� �Ǳ� ���� ���� return�� Integer
		int su7 = Integer.valueOf(msg); //returnŸ���� ��ü return�� Integer
		System.out.println(Integer.reverse(-2)); //��Ʈ������ 0���� -2�� �� ��
		int su8 = 6554;
		System.out.println("2���� : " + Integer.toBinaryString(su8)); //return Ÿ�� String
		System.out.println("8���� : " + Integer.toOctalString(su8));
		System.out.println("16���� : " + Integer.toHexString(su8));
		int su9 = 17; 
		System.out.println(Integer.min(su8, su9)); // �� �� ���� ��
		System.out.println(Integer.max(su8, su9)); // �� �� ū ��
		System.out.println(Integer.sum(su8, su9)); // �հ�
		
		System.out.println(Integer.compare(su8, su9)); 
		System.out.println(su3.compareTo(su4));
		// ������ 0 ���� ũ�� 1 �ڰ� ũ�� -1
		// compare�� Int�� �� ����, compareTo�� Integer�� �� ��
	}
}
