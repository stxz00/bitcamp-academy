package com.bit.day16;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

//��ġ�� ���� ���
// �ٸ� ��� �� �󺧷� ���� ���� ���� ����

public class Ex12 {
	public static void main(String[] args) {
		Frame f = new Frame();
		GridBagLayout layout = new GridBagLayout();
		f.setLayout(layout);
		
		// �迭 ���������⵵ ����
		Label la1 = new Label("�̸�");
		Label la2 = new Label("����");
		Label la3 = new Label("�ֹι�ȣ");
		Label la4 = new Label("�ּ�");
		Label la5 = new Label("��ȭ��ȣ");
		Label la6 = new Label("���");
		Label la7 = new Label("�ڱ�Ұ�");
		TextField tf1 = new TextField();
		TextField tf2 = new TextField(6); //������� ���� ���Ŀ�
		TextField tf3 = new TextField(8);
		TextField tf4 = new TextField();
		TextField tf5 = new TextField(27);
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox ra1 = new Checkbox("����",false,cbg);
		Checkbox ra2 = new Checkbox("����",false,cbg);
		Choice cho = new Choice();
		cho.addItem("010");
		cho.addItem("011");
		cho.addItem("016");
		cho.addItem("017");
		cho.addItem("018");
		cho.addItem("019");
		Checkbox ch1 = new Checkbox("����1");
		Checkbox ch2 = new Checkbox("����2");
		Checkbox ch3 = new Checkbox("����3");
		//��ġ�� ���� ��� -> width ���
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		//�޼ҵ�� ���������� ����
		
		layout.setConstraints(la1, gbc);
	      f.add(la1);
	      
	      gbc.gridx=1;
	      gbc.gridy=0;
	      gbc.gridwidth=2;///
	      layout.setConstraints(tf1, gbc);
	      f.add(tf1);
	      
	      gbc.gridx=0;
	      gbc.gridy=1;
	      gbc.gridwidth=1;
	      layout.setConstraints(la2, gbc);
	      f.add(la2);
	      
	      gbc.gridx=1;
	      layout.setConstraints(ra1, gbc);
	      f.add(ra1);
	      
	      gbc.gridx=2;
	      layout.setConstraints(ra2, gbc);
	      f.add(ra2);
	      
	      gbc.gridx=0;
	      gbc.gridy=2;
	      layout.setConstraints(la3, gbc);
	      f.add(la3);
	      
	      Panel p3=new Panel();
	      p3.add(tf2);
	      p3.add(new Label("-"));
	      p3.add(tf3);
	      
	      gbc.gridx=1;
	      gbc.gridwidth=2;
	      layout.setConstraints(p3, gbc);
	      f.add(p3);
	      
	      gbc.gridx=0;
	      gbc.gridy=3;
	      gbc.gridwidth=1;
	      layout.setConstraints(la4, gbc);
	      f.add(la4);
	      
	      gbc.gridx=1;
	      gbc.gridy=3;
	      gbc.gridwidth=3;
	      layout.setConstraints(tf4, gbc);
	      f.add(tf4);
	      
	      gbc.gridx=0;
	      gbc.gridy=4;
	      gbc.gridwidth=1;
	      layout.setConstraints(la5, gbc);
	      f.add(la5);
	      
	      Panel p5=new Panel();
	      p5.add(cho);
	      p5.add(tf5);
	      gbc.gridx=1;
	      gbc.gridwidth=2;
	      layout.setConstraints(p5, gbc);
	      f.add(p5);
	      
	      gbc.gridx=0;
	      gbc.gridy=5;
	      gbc.gridwidth=1;
	      layout.setConstraints(la6, gbc);
	      f.add(la6);
	      
	      gbc.gridx=1;
	      layout.setConstraints(ch1, gbc);
	      f.add(ch1);
	      gbc.gridx=2;
	      layout.setConstraints(ch2, gbc);
	      f.add(ch2);
	      gbc.gridx=3;
	      layout.setConstraints(ch3, gbc);
	      f.add(ch3);
	      
	      gbc.gridx=0;
	      gbc.gridy=6;
	      layout.setConstraints(la7, gbc);
	      f.add(la7);
	      
	      TextArea ta=new TextArea();
	      
	      gbc.gridx=0;
	      gbc.gridy=7;
	      gbc.gridwidth=4;
	      layout.setConstraints(ta, gbc);
	      f.add(ta);
	      
	      f.setLocation(100,100);
	      f.setSize(400,400);
	      f.setVisible(true);

	      
	   }

	}
