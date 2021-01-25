package com.bit.day19;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.tools.Tool;

public class Ex01 extends Frame implements ActionListener{
	Label la2;
	
	public Ex01() {
		
		String header = "���� ���� �� ���� (ver 0.5.0)";
		Font font = new Font(Font.SANS_SERIF,Font.BOLD,30);
		BorderLayout border = new BorderLayout();
		setLayout(border);
		
		//�гη� �ؾ� ��� ������ ��
		Panel ptop = new Panel();
		Panel pcen = new Panel();
		Panel pdwn = new Panel();
		
		Label la1 = new Label(header);
		la1.setFont(font);
		ptop.add(la1);
		
		
		String result = "��� :                             ";
		la2 = new Label(result); //�ʱⰪ�� �۰� �ָ� ©��
		la2.setFont(font);
		pdwn.add(la2);
		
		
		pcen.setLayout(new GridLayout(1,4));
		Icon icon1 = new ImageIcon("a.png");
		Icon icon2 = new ImageIcon("b.png");
		Icon icon3 = new ImageIcon("c.png");
		
		JButton btn1 = new JButton("0",icon2);
		JButton btn2 = new JButton("1",icon1);
		JButton btn3 = new JButton("2",icon3);
		JButton btn4 = new JButton("����");
		
		btn1.setForeground(Color.WHITE); // �� ������
		btn2.setForeground(Color.WHITE);
		btn3.setForeground(Color.WHITE);
		
		
		btn1.setBackground(Color.WHITE);
		btn2.setBackground(Color.WHITE);
		btn3.setBackground(Color.WHITE);
		btn4.setBackground(Color.WHITE);
	
		btn4.setFont(new Font(Font.SANS_SERIF,font.BOLD,30));
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		pcen.add(btn1);
		pcen.add(btn2);
		pcen.add(btn3);
		pcen.add(btn4);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		add(ptop,BorderLayout.NORTH);
		add(pcen,BorderLayout.CENTER);
		add(pdwn,BorderLayout.SOUTH);
		
		
		setBounds(100,100,500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex01 me = new Ex01();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random ran = new Random();
		int con = ran.nextInt(3);
		int me = -1;
		
		JButton btn= ((JButton)e.getSource());
		String la = btn.getLabel();
		me = Integer.parseInt(la);
		
		if(con == me) {
			System.out.println("���");
		}else if(con == 0&&me ==1 
				|| con==1 && me == 2|| con ==2 && me==0){
			System.out.println("�̱�");
		}else {
			System.out.println("����");
		}
		String result = "��� : ";
		if(con == 0) {
			result += "����";
		}else if(con == 1) {
			result += "����";
		}else {
			result += "��";
		}
		result += "  ��� : ";
		if(me == 0) {
			result += "����";
		}else if(me == 1) {
			result += "����";
		}else {
			result += "��";
		}
		la2.setText(result);
		
	}
}
