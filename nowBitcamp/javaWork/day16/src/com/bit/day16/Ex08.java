package com.bit.day16;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex08 extends Frame{
	
	public Ex08() {
		setLayout(new FlowLayout());
		Label la1 = new Label("id:");
		TextField tf1 = new TextField(10); 
		//��ȣ���� ������
		//�� ���⿡���� ������� �ȼ������� �ƴ϶� ���� 10���� ���� �� �ִ� ������ ��������. ������ ���� ������ 10�� ������� �ϸ� �����ڴ� 12�� �ѱ��� 8�� ������ ����. �� �������� ����� �ƴ϶�� ��!
		//������ ���� ���� �ѱ� �־ �Ѵٸ� �ش� ���ڿ��� ���̴� ũ�⸸ŭ ������ ������!
		tf1.setText("���̵� �Է�");
		tf1.setBackground(Color.RED);
		tf1.setEditable(true); //���� ����, false�� ������ �ȵ����� ����� ��
		tf1.setEnabled(true); //���� �Ұ��� ����, false�� �ƿ� ����.
		add(la1);
		add(tf1);
		Label la2 = new Label("pw:");
		TextField tf2 = new TextField("pasword"); //1�ٸ� �Է°���
		tf2.setText("1234");
		tf2.setEchoChar('#'); //1234�� #���� ����
		System.out.println(tf2.getText());
		add(la2);
		add(tf2);
		Button btn = new Button("�α���");
		btn.setFocusable(false); //������ ��ư���� �� �� ���� ��, false�� x
		btn.setEnabled(true);
		add(btn);
		
		TextArea ta1 = new TextArea("�ʱⰪ",3,30,TextArea.SCROLLBARS_VERTICAL_ONLY); //������ �Է°���, ����Ʈ ����������, �ʱⰪ,����,����,��ũ�� �� ��ũ�� 0�� ����Ʈ, ���� ���� �� 1�� �Ʒ��� ��ũ�� ǥ��, 2�� �����θ� ��ũ�� ǥ��, 3�� �ƿ� ��ũ�� �ȳ���
		
	
		add(ta1);
		
		setLocation(100,100);
		setSize(500,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex08();
	}
}
