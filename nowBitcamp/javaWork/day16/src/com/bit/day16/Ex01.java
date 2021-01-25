package com.bit.day16;

import java.awt.Button;
import java.awt.Panel;

// �ڹ� UI
// ��â�� : �ڹ� ���ø� java.applet
// �ǿ��� Ŀ�� �Ⱦ�����
// �� ���� : �ڹ� awt java.awt -> ���� �̽�����, �츮�� ����� ����
// �ü���� ������ ���� ���� ���� ������ �� ������(��ư ��)
// �ڹ�x����(javax.swing) : �ڹٰ� ���� ������ϱ� ������ ���� ����� ����

// ��ư�� javax.swing.JButton;

// UI�� ����ϴ� ���� ���� ����� ���!
public class Ex01  extends java.awt.Frame{
	
	public Ex01() {
		Panel p = new Panel();
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		btn2.setSize(200,200); // �ص� ���� �ȵ�
		p.add(btn1); // �гο� ��ư�� ����
		p.add(btn2);
		add(p); // �г��� ����
		
		setLocation(200,300); // ���� �� ����� ��ġ ���� 
		setSize(200,300); // UI ������ ����
		setVisible(true); 
		// ȭ�鿡 ������ ����. �����ϸ� ȭ�� ���� �⺻������ UI�� �ƹ��͵� �۵� ���� �ҷ��� �̺�Ʈ ó�� �ؾ��� �ִ�, �ּ�ȭ�� �ü���� �� �׷��� �۵� ���ϴ°�
		
	}
	
	public static void main(String[] args) {
		// GUI - awt
	
		
		Ex01 me = new Ex01();
		
	}
}
