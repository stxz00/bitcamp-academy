package com.bit.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

//��ġ������
//���ݱ��� �츮�� ����ߴ� ��ġ�����ڴ� ������̾���(��ü ȭ�� ������ ���� �� ������ ���缭)
//�̹��� �Ƚ��� ȭ��â�� ����� ��ġ�� �����ִ� ��
//������ǥ
public class Ex16 extends Frame{

	Ex16(){
//		setLayout(null); //��ġ�����ڰ� ���� ������ ���� �ڱⰡ ��������
		//����� �ø��ų� �ٿ��� �� �ڸ��� �����Ǿ� ����
		Panel p = new Panel();
		p.setLayout(null);
		
		Button btn = new Button("��ư");
		btn.setSize(100,50);
		btn.setLocation(0,0);
		p.add(btn);
		add(p);
		
//		btn.setLocation(1,31); //0,0�ϸ� ��ġ�� ���¹��̱⶧���� ��������
//		add(btn);
		
		
		
		//��� ����, ����� �� �� �����ϸ� ��ư�� add�ص� ������ ����
		
		
		
		setBounds(100,100,500,400);
		setVisible(true);	
		setResizable(false); //ȭ�� ����
		System.out.println(p.getWidth() + "," + p.getHeight());
		btn.setLocation(p.getWidth(),0);
	}
	
	public static void main(String[] args) {
		Ex16 me = new Ex16();
	}
}
