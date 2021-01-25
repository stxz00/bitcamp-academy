package com.bit.exercise;

import java.awt.BorderLayout;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

public class Ex02 extends Frame{
	
	TextArea ta = new TextArea();
	
	//������ �����ư����  �����
	
	Ex02(){
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim1 = tool.getScreenSize();
		Dimension dim2 = getSize();
		
		MenuItem mi1 = new MenuItem("���� �����(N)");
		
		Dialog di1 = new Dialog(this);
		Font font = new Font(Font.SANS_SERIF,Font.BOLD,15);
		Color col = new Color(240,240,240); //����Ʈ�׷���
		mi1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(ta.getText().length() != 0) {
					di1.setLayout(new BorderLayout());
					
					Panel p1 = new Panel();
					Label la = new Label("���� ������ ���� ������ �����Ͻðڽ��ϱ�?");
					p1.setBackground(Color.white);
					la.setFont(font);
					p1.add(la);
					
					Panel p2 = new Panel();
					
					JButton btn1 = new JButton("����(S)");
					btn1.setBackground(col);
					JButton btn2 = new JButton("���� �� ��(N)");
					btn2.setBackground(col);
					btn2.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent arg0) {
							ta.setText("");
							setEnabled(true);
							di1.setVisible(false);
						}
					});
					JButton btn3 = new JButton("���");
					btn3.setBackground(col);
					btn3.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent arg0) {
							setEnabled(true);
							di1.setVisible(false);
						}
					});
					p2.add(btn1);
					p2.add(btn2);
					p2.add(btn3);
					
					di1.add(p1,BorderLayout.CENTER);
					di1.add(p2,BorderLayout.SOUTH);
					
					di1.setTitle("�޸���");
					di1.setBounds(dim1.width/2 - 370/2, dim1.height/2 - 135/2,370,135);
					di1.setVisible(true);
					setEnabled(false);
				}
				System.out.println(ta.getText().length());
			}
		});
		
		MenuItem mi2 = new MenuItem("�� â(W)");
		MenuItem mi3 = new MenuItem("����(O)");
		MenuItem mi4 = new MenuItem("����(S)");
		MenuItem mi5 = new MenuItem("�ٸ� �̸����� ����(A)");
		MenuItem mi6 = new MenuItem("������ ����(U)");
		MenuItem mi7 = new MenuItem("�μ�(P)");
		MenuItem mi8 = new MenuItem("������(X)");
		
		Menu m1 = new Menu("����(E)");
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		m1.add(mi5);
		m1.addSeparator();
		m1.add(mi6);
		m1.add(mi7);
		m1.addSeparator();
		m1.add(mi8);
		
		Menu m2 = new Menu("����(E)");
		
		MenuItem mi11 = new MenuItem("�������(U)");
		MenuItem mi12 = new MenuItem("�߶󳻱�(T)");
		MenuItem mi13 = new MenuItem("����(C)");
		MenuItem mi14 = new MenuItem("�ٿ��ֱ�(P)");
		MenuItem mi15 = new MenuItem("����(L)");
		MenuItem mi16 = new MenuItem("Bing���� �˻�(S)");
		MenuItem mi17 = new MenuItem("ã��(F)");
		MenuItem mi18 = new MenuItem("���� ã��(N)");
		MenuItem mi19 = new MenuItem("���� ã��(V)");
		MenuItem mi20 = new MenuItem("�ٲٱ�(R)");
		MenuItem mi21 = new MenuItem("�̵�(G)");
		MenuItem mi22 = new MenuItem("��� ����(A)");
		MenuItem mi23 = new MenuItem("�ð�/��¥(D)");
		
		m2.add(mi11);
		m2.addSeparator();
		m2.add(mi12);
		m2.add(mi13);
		m2.add(mi14);
		m2.add(mi15);
		m2.addSeparator();
		m2.add(mi16);
		m2.add(mi17);
		m2.add(mi18);
		m2.add(mi19);
		m2.add(mi20);
		m2.add(mi21);
		m2.addSeparator();
		m2.add(mi22);
		m2.add(mi23);
		
		Menu m3 = new Menu("����(O)");
		
		MenuItem mi31 = new MenuItem("�ڵ� �� �ٲ�(W)");
		MenuItem mi32 = new MenuItem("�۲�(F)");
		m3.add(mi31);
		m3.add(mi32);
		
		Menu m4 = new Menu("����(V)");
		Menu mi33 = new Menu("Ȯ���ϱ�/����ϱ�(W)");
		MenuItem mi34 = new MenuItem("Ȯ��(I)");
		MenuItem mi35 = new MenuItem("���(O)");
		MenuItem mi36 = new MenuItem("���(O)");
		MenuItem mi37 = new MenuItem("Ȯ���ϱ�/����ϱ� �⺻ �� ����");
		mi33.add(mi34);
		mi33.add(mi35);
		mi33.add(mi36);
		mi33.add(mi37);
		
		CheckboxMenuItem cbm = new CheckboxMenuItem("����ǥ����(S)");
		
		m4.add(mi33);
		m4.add(cbm);
		
		Menu m5 = new Menu("����(H)");
		MenuItem mi38 = new MenuItem("���� ����(H)");
		MenuItem mi39 = new MenuItem("�ǵ�� ������(F)");
		MenuItem mi40 = new MenuItem("�޸��� ����(A)");
		
		m5.add(mi38);
		m5.add(mi39);
		m5.addSeparator();
		m5.add(mi40);
		
		
		MenuBar mb = new MenuBar();
		
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.add(m5);
		
		setMenuBar(mb);
		

		add(ta);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setTitle("������� - Windows �޸���");
		
		setBounds(100,100,500,800);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex02 me = new Ex02();
	}
}
