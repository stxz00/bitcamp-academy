package com.bit.day17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;

//���콺��ǲ������

public class Ex04 extends Frame implements MouseInputListener{
	
	public Ex04() {
		Panel p = new Panel();
		Label la = new Label("��");
		la.setBackground(Color.GREEN);
		la.addMouseListener(this);
		p.add(la);
		
		
		Button btn01 = new Button("��ư");
		btn01.addMouseListener(this);
		p.add(btn01);
		p.addMouseListener(this); //â�� ���콺������ �ν�
		this.addMouseListener(this); // �г��� ������ �Ծ����ϱ� �г��� �Ⱦ�� â�� ���� ���콺������ �ν�, �ݱ� �� �ʿ����� �νľȵǰ� �Ǿ�����
//		add(p);
		setLocation(100,100);
		setSize(500,400);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex04();
	}


	@Override				//���콺 �̺�Ʈ�� ���õ� ������ �������� ��
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked : Ŭ��������");
		//�ð����� ���� Ŭ���� �Ǵ� ���ΰ� �ٸ�
				//����ä �ٸ� ���� �̵� �� ���ٴ��� �ƿ� ���������� ���ٴ���, �ð��� � ���� Ŭ�� �ߵ����ΰ� �ٸ�
		Object obj = e.getSource();
		
		
//		((Button)obj).setLabel("Ŭ��");
//		System.out.println(obj);
//		System.out.println(((Button)obj).getLabel());
		//��ư�� ������ �� java.awt.Button[button0,244,5,38x23,label=��ư]
		//�̺�Ʈ ��ü�� ������ ���� 
		System.out.println(e.getX() + " : " + e.getY()); 
		//�ش� ������Ʈ �� ���� (�����)�ȼ���
		System.out.println(e.getXOnScreen() + " : " + e.getYOnScreen());
		//��ũ�� ���� ������Ʈ ��ǥ
		
		//�׷��� �����Ӱ� ���õ� ������ ������ ���� -> ������ ��������
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("mouseEntered : ���콺 �̺�Ʈ��ü ���� ����������");
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("mouseExited : ����������");
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("mousePressed : ���콺 ��ư�� ������ ����");
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("mouseReleased : ���콺 ��ư�� �ö���� ����");
		
	}


	@Override
	public void mouseDragged(MouseEvent arg0) {
		System.out.println("mouseDragged");
	}


	@Override
	public void mouseMoved(MouseEvent arg0) {
		System.out.println("mouseMoved");
		
	}
}
