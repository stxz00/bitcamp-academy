package com.bit.exercise;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class Ex01 extends Frame {
	int my = 0;
	int com = 0;
	String select = new String();
	String comsel = new String();
	Label la = new Label();
	FileDialog fdi = new FileDialog(this);
	
	Ex01(){
		setLayout(new BorderLayout());
		
		add(new Label("                             ���������� ver 0.6.0"),BorderLayout.NORTH);
		
		
		Panel p = new Panel();
		
		Button btn1 = new Button("����");
		btn1.setBackground(Color.WHITE);
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				select = "                        ��� : ����";
				int my = 1;
				computer();
				la.setText(select + comsel);
				
			}
		});
		
		p.add(btn1);
		
		Button btn2 = new Button("����");
		btn2.setBackground(Color.WHITE);
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				select = "                        ��� : ����";
				int my = 2;
				computer();
				la.setText(select + comsel);
			}
		});
		
		p.add(btn2);
		
		Button btn3 = new Button("��");
		btn3.setBackground(Color.WHITE);
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				select = "                        ��� : ��";
				int my = 3;
				computer();
				la.setText(select + comsel);
			}
		});
		
		p.add(btn3);
		
		Button btn4 = new Button("����");
		btn4.setBackground(Color.WHITE);
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		
		p.add(btn4);
		
		add(p,BorderLayout.CENTER);
		
		
		Menu m1 = new Menu("����");
		MenuItem mi1 = new MenuItem("����");
		mi1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fdi.setVisible(true);
				
			}
		});
		m1.add(mi1);
		MenuItem mi2 = new MenuItem("�ݱ�");
		m1.add(mi2);
		
		Menu m2 = new Menu("����");
		MenuItem mi3 = new MenuItem("����");
		m2.add(mi3);
		
		la = new Label("                   ����, ����, �� ��ư�� �����ϼ���");
		add(la,BorderLayout.SOUTH);
		
		
		
		
		MenuBar mb = new MenuBar();
		mb.add(m1);
		mb.add(m2);
		setMenuBar(mb);
		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent arg0) {
			}
			@Override
			public void windowIconified(WindowEvent arg0) {
			}
			@Override
			public void windowDeiconified(WindowEvent arg0) {
			}
			@Override
			public void windowDeactivated(WindowEvent arg0) {
			}
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
			}
			@Override
			public void windowClosed(WindowEvent arg0) {
			}
			@Override
			public void windowActivated(WindowEvent arg0) {
			}
		});
		
		setResizable(false);
		setBounds(100,100,300,150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Ex01 me = new Ex01();
	}
	
	public void computer() {
		Random ran = new Random();
		com = ran.nextInt(3) + 1;
		
		if(com == 1) {
			comsel = "   ��ǻ�� : ����";
		}else if(com == 2) {
			comsel = "   ��ǻ�� : ����";
		}else if(com == 3) {
			comsel = "   ��ǻ�� : ��";
		}
	}
}
