package com.bit.day17;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex06 extends Frame implements KeyListener{
	
	public Ex06() {
		Panel p = new Panel();
		TextField tf = new TextField(10);
		tf.addKeyListener(this);
		p.add(tf);
		
		Button btn = new Button("�̺�Ʈ��ü");
		btn.addKeyListener(this);
		p.add(btn);
		
	//	add(p);
		this.addKeyListener(this);
		setLocation(100,100);
		setSize(300,200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Ex06 me = new Ex06();
	}


	@Override
	public void keyPressed(KeyEvent e) {
//		TextField tf = (TextField)e.getSource();
//		System.out.println("keyPressed : Ű�� ������ ���� " +tf.getText());
		//���� ���� �Ϻ��� ���� ���� ��Ȳ�� Ű�� �ö����  �������̹Ƿ� getText()�� ����� -> ������ ���� ������ �����
		
		//���ӵ��� wasd�� �ٷιٷ� �� ���� ������ �Ǿ���ϹǷ� 
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
//		TextField tf = (TextField)e.getSource();
//		System.out.println("keyTyped : Ű���� " +tf.getText());
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
//		TextField tf = (TextField)e.getSource();	
//		System.out.println("keyReleased : Ű�� �ö�ö� " +tf.getText());
		//Ű�� ��� ������ �������� �ߵ����� �ʰ� ������ Ÿ���� ��� ��
		
//		Button btn = (Button)e.getSource();
//		System.out.println("keyReleased : Ű�� �ö�ö� " +btn.getLabel());
		//��Ŀ�� �ǰ� �ִ°� Ȯ�ε�
		
		Ex06 me = new Ex06();
		System.out.println("keyReleased : Ű�� �ö�ö� " +me.getLayout());
		
	}
	// �빮�� A�� �� �� shift ������ pressed�� �ߵ�. ������ �ְ����� ���� ������ ������! �̷��� ������ �̷������ �ϴ� Ű�� keyTped�� �ߵ� ���� ����.


	
}
