package com.bit.day18;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Ex17 extends Frame{
	int my = 0;
	String my1 = new String();
	String com1 = new String();
	Label la2;
	Ex17(){
		setLayout(new GridLayout(3,1));
		Label la1 = new Label("���� ���� �� ����(ver 0.5.0)");
		
		add(la1);
	
	
		Panel p = new Panel();
		Button btn1 = new Button("��\n��");
		btn1.setBackground(Color.WHITE);
		btn1.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				my = 1;
				my1 = "��� : ����";
				computer();
				la2.setText(com1 + my1);
			
			}
			
		});
		Button btn2 = new Button("��\n��");
		btn2.setBackground(Color.WHITE);
		btn2.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				my = 2;
				my1 = "��� : ����";
				computer();
				la2.setText(com1 + my1);
			}
			
		});
		
		Button btn3 = new Button("��");
		btn3.setBackground(Color.WHITE);
		btn3.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				my = 3;
				my1 = "��� : ��";
				computer();
				la2.setText(com1 + my1);
			}
			
		});
		Button btn4 = new Button("����");
		btn4.setBackground(Color.WHITE);
		btn4.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				dispose();
				la2.setText(com1 + my1);
				
			}
			
		});
		
		
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		
		add(p);
		
		
		la2 = new Label();

		add(la2);
	
		setBounds(100,100,300,300);
		setVisible(true);
		setResizable(false);
	}
	
	public void computer() {
		Random random = new Random();
		int num = random.nextInt(3);
		num++;
		if(num == 1) {
			com1 = "�� : ����   ";
		}else if(num == 2) {
			com1 = "�� : ����   ";
		}else if(num == 3) {
			com1 = "�� : ��   ";
		}
	}
	
	
	public static void main(String[] args) {
		Ex17 me = new Ex17();
	}
}
