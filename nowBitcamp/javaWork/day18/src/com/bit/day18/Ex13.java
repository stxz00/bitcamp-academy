package com.bit.day18;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Ex13 extends Frame implements ActionListener, FocusListener{
	//��ü ������ Ư���� �ݿ��ؼ� �̺�Ʈ�� �ߵ��ϴ� ActionListener
	TextField tf;
	public Ex13() {
		
		
		Panel p = new Panel();
		Button btn = new Button("��ư");
		tf = new TextField(10);
		List cho = new List();
		cho.addItem("item1");
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4");
		Checkbox ch1 = new Checkbox("item1");
		Checkbox ch2 = new Checkbox("item2");
		Checkbox ch3 = new Checkbox("item3");
		Checkbox ch4 = new Checkbox("item4");
		
		//mouseClickListener(this)
		btn.addActionListener(this);
		//���͸� �ľ� �̺�Ʈ �ߵ�
		tf.addActionListener(this);
		
		tf.setText("�Ӷ� �Է��ϼ���");
		tf.addFocusListener(this);
		//Ŭ���� ���� �Ǵ� ����Ŭ��
		cho.addActionListener(this);
		
		
		
		p.add(ch1);
		p.add(btn);
		p.add(tf);
		p.add(cho);
		
		
		add(p);
		setBounds(100,100,500,400);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Ex13 me = new Ex13();
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("�̺�Ʈ");
		
	}


	@Override
	public void focusGained(FocusEvent arg0) {
		System.out.println("��Ŀ���� �������");
		if(tf.getText().equals("�Ӷ� �Է��ϼ���")) {
			tf.setText("");
		}
	}


	@Override
	public void focusLost(FocusEvent arg0) {
		System.out.println("��Ŀ���� �Ҿ�����");
		if(tf.getText().trim().isEmpty()) {
			tf.setText("�Ӷ� �Է��ϼ���");
		}
	}
}
