package com.bit.day20;

public class Ex14 extends Thread{
	
	public static void main(String[] args) {
		Ex14 me = new Ex14();
		me.setName("ù��°");
		Ex14 you = new Ex14();
		you.setName("�ι�°");
		
		Ex14 you2 = new Ex14();
		you2.setName("����°");
		
	
		
		//��� ���� �ߴٴ� ������ ����.
		//�������� �ʾƵ� �����ϰ� ���� 
		//�ϴ� ���� �ϱ� ���ؼ� ���μ����� ���� �ϴ� ��Ȳ���� �� ���� �����带 ���������� �����ϰ� me�� you�� ���� runnable�� running �� �ٲ㰡�� ������
		
		//�����ٷ��� �������� �ʰ� ������ �Ǵܿ� ���� ���������� ���μ����� ���Ͽ� �����ϰ� �Ǿ���� ��
		
		//������� �Ϻ��� ������ ��  ������ �Ϻ� ����� �����ϴ� ������� �����ϰ� ���̴� [[[Ȯ��]]]�� ������ �� �ִ�.
		// �װ��� �۾��ð��� �÷��ִ� ��.(�켱���� ��)
//		me.setPriority(1); //������ �����̿� ���� �޶���, �ݵ�� ù��°�� ������� ���� ������ Ȯ�������� ����ǰ� ������ �� ������
//		you.setPriority(10);
		me.setPriority(Thread.MIN_PRIORITY); //�켱������ ������ϻ� �� ���� ���ù޴� �� �ƴ�.
		you.setPriority(Thread.MAX_PRIORITY);
		you2.setPriority(Thread.NORM_PRIORITY); //����Ʈ ����
		
		me.start();
		you.start();
		you2.start();
		
		System.out.println(me.getName() + "�� ������ " + me.getPriority());
		System.out.println(you.getName() + "�� ������ " + you.getPriority());
		System.out.println(you2.getName() + "�� ������ " + you.getPriority());
	}
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(currentThread().getName() + i);
		}
	}
}
