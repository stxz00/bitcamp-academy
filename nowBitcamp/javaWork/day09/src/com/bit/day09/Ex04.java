package com.bit.day09;

public class Ex04 {
	public static void main(String[] args) {
		Ex04 me = new Ex04();
		Object obj = new Object();
		try {
		obj = func01(me);
		
		}catch(CloneNotSupportedException e) {		
			e.printStackTrace();
			System.out.println(obj.hashCode());
		}
	}
	/*
	public static Object func01(Ex04 me) {
		Object obj = null;
		try {
		obj=me.clone(); //protected ��� �ȵǾ� ������ ����
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();

		}
	}
	*/
	
	public static Object func01(Ex04 me) throws CloneNotSupportedException{
		Object obj = null;
		//try {
		obj=me.clone(); 
		//clone�� �Ʊ�� �ٸ��� Ʈ����ĳġ �϶�� ��
		//������ clone�޼��尡 CloneNotSupportedException�� �����ٰ� ���ǵǾ��� ���� �׷��� try/catch �Ǵ� �� �޼��带 throws ������
		//} catch(CloneNotSupportedException e) {
		//	e.printStackTrace();

		//}
		return obj;
	}
	
	// ȣ���ϸ� Exception�� ���� �� �����Ƿ� main�� ��½� try/catch�� e.printStackTrace();�� �ϰ� �־��� ��!
	
	// ���� ���ϴ� ���� ��ü�� ����� ������ ���� �� ���� ���̵� ���̶���� �̷��� ���� �� �� �ִ� 
	// �ڵ� �󿡼��� ������ ����� ������
}
