package com.bit.day17;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


//���콺��Ǹ����� : ����� �巡��
public class Ex05 extends Frame implements MouseMotionListener{
	
	public Ex05() {
		
		
		addMouseMotionListener(this);
		setLocation(100,100);
		setSize(500,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex05 me = new Ex05();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouseDragged : �巡�� " + e.getX() +" : " + e.getY() );
		//���� �� 0,0 �������� x,y ��ǥ�� ���� ȭ�� ������ ���͵� Ŭ���� �ϰ� ������ �̺�Ʈ�� ���۵ǰ�����(���콺 �̺�Ʈ�� Ư����)
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		System.out.println("mouseMoved");
		
	}
}
