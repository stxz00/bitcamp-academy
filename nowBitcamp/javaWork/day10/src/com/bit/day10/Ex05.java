package com.bit.day10;


// �������̽��� ���� �߻�޼���� ���(public final static) 
interface Inter01{
	public abstract void func01();
	//Inter01(){} ������ ��ü�� ����
	//�ʵ嵵 ����
}

interface Inter02{
	public void func02(); // �޼��� abstract ��������
	void func03(); //����ϴ� ����Ʈ,protected �ǹ̰� ���� �׳� public�� ��κ� ������
	//private�� ������ ����ϸ� �������̵��ؾ��ϴϱ� �ȵ�
}

//�������̽��� �������̽��� ����ϴ� ��쿡�� ���� ��� ����
interface Inter03 extends Inter01, Inter02{
	
}

interface Inter04{
	public final static int su1 = 1111;
	final static int su2 = 2222;
	static int su3 = 3333;
	int su4 = 4444;
	//�� ���� ����
	
}

//�������̽� ���� ��� ���� �Ϲ� ����� �ϳ��� ����
class Test05 extends Ex05 implements Inter01, Inter02{
	

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func03() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

}


public class Ex05 extends Ex04 implements Inter04{
	public static void main(String[] args) {
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(su4);
		System.out.println(Inter04.su4);
		Inter04 me = new Ex05(); //����ۿ� ������ ����
		
		
	}
}
