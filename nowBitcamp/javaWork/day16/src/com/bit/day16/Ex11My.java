package com.bit.day16;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex11My extends Frame {
	
	public Ex11My(){
	
		GridLayout gl = new GridLayout(8,1);
		setLayout(gl);
		
		Panel pName = new Panel();
		Label laN = new Label();
		laN.setText("�̸�");
		TextField tN = new TextField(10);
		pName.add(laN);
		pName.add(tN);
		
		Panel pGender = new Panel();
		Label laG = new Label();
		laG.setText("����");
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("����",false,cbg);
		Checkbox cb2 = new Checkbox("����",false,cbg);
		
		pGender.add(laG);
		pGender.add(cb1);
		pGender.add(cb2);
		
		
		Panel pNum = new Panel();
		Label laN2 = new Label();
		laN2.setText("�ֹι�ȣ");
		TextField tN2 = new TextField("123456");
		tN2.setText("");
		Label laN22 = new Label();
		laN22.setText("-");
		TextField tN22 = new TextField("1234567");
		tN22.setText("");
		
		
		pNum.add(laN2);
		pNum.add(tN2);
		pNum.add(laN22);
		pNum.add(tN22);
		
		Panel pAdress = new Panel();
		Label laA = new Label();
		laA.setText("�ּ�");
		TextField tA = new TextField("1234567");
		tA.setText("");
		
		pAdress.add(laA);
		pAdress.add(tA);
		
		
		Panel pP = new Panel();
		Label laP = new Label();
		laP.setText("��ȭ��ȣ");
		List list = new List(1);
		list.add("010");
		list.add("010");
		list.add("010");
		list.setEnabled(false);
		TextField tP = new TextField("99280978");
		tP.setText("");
		
		//���
		Panel pH = new Panel();
		Label laH = new Label();
		laH.setText("���");
		CheckboxGroup cbg2 = new CheckboxGroup();
		Checkbox cb3 = new Checkbox("����",false,cbg2);
		Checkbox cb4 = new Checkbox("����",false,cbg2);
		Checkbox cb5 = new Checkbox("����",false,cbg2);
		pH.add(laH);
		pH.add(cb3);
		pH.add(cb4);
		pH.add(cb5);
		
		
		Panel My = new Panel();
		Label laM = new Label("�ڱ�Ұ�");
		My.add(laM);
		Panel My1 = new Panel();
		TextArea ta = new TextArea("",30,50,TextArea.SCROLLBARS_NONE);
		My1.add(ta);
		
	
		pP.add(laP);
		pP.add(list);
		pP.add(tP);
		
		add(pName);
		add(pGender);
		add(pNum);
		add(pAdress);
		add(pP);
		add(pH);
		add(My);
		add(My1);
		
		
		setLocation(100,100);
		setSize(600,600);
		setVisible(true);
		setTitle("Window Title");
		
	}
	
	public static void main(String[] args) {
		new Ex11My();
	}
}
