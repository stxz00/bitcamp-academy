package com.bit.day16;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.LinearGradientPaint;
import java.awt.Panel;


public class Ex03 extends Frame{
	public Ex03() {
		// ��ġ������
//		FlowLayout layout = new FlowLayout();
//��ġ�� ó�� ���� �߾ӿ� ���� �����ʿ� �״����� ��ġ�ϰ� 
//�� ���ٿ� ���̻� ����� ���� ������ �� ���� �ٷ� ��ġ��
//ȭ�� ���� �����ص� �׿� �°� ��ġ��
// ��ư btn2.setSize(200,200); �ص� ���� �ȵ�(��ư ���� ���뿡 ���� ũ�� ������)
//		setLayout(layout);
	
		
//		GridLayout layout = new GridLayout(2,3); //����, ���� �� ��
		// ������ �켱�̰� �� ���� �������� �������� ����(�ݵ�� ����� �����ٷ� �Ǵ� �� �ƴ�)
		//����� �ٿ��� ��ġ ������ ����
//		setLayout(layout);
		
		
// 		�� �� ����� �̹� ��ġ ����� ������ ����
		
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		//�����ս� ��ÿ� ��� ���� �� ���ϴ� ��
		//add �� �ÿ� ����
		//add �� ��ġ�� �����������, ������ ����
		
		
		// ������Ʈ �߰�
	
/*		
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		Button btn3 = new Button("��ư3");
		Button btn4 = new Button("��ư4");
		Button btn5 = new Button("��ư5");
		add(btn1,"North");
		add(btn2,"South"); //�׳� �߰��ϸ� ��ư2�� ȭ�� �� �Ծ����
//		add(btn2"); //�� �߰��ص� �ȳ���
		add(btn3,"West");
		add(btn4,"East"); 
		add(btn5,"Center"); 
		setLocation(100,100);
		setSize(800,800);
		setVisible(true);
*/		
//		Panel east = new Panel(); 
		GridLayout layout2 = new GridLayout(2,3);
		Panel west = new Panel(); 
		
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		Button btn3 = new Button("��ư3");
		Button btn4 = new Button("��ư4");
		Button btn5 = new Button("��ư5");
		
//		east.add(btn4);
		west.add(btn2);
		west.add(btn4);
		west.setLayout(layout2); //�гο� ���̾ƿ��� �־� ����
		
		
		add(btn1,BorderLayout.NORTH);
//		add(btn1,"North"); //����� ���س��� 
//		add(btn2,"South"); 
		add(west,BorderLayout.WEST);
//		add(west,"West");
//		add(east,"East"); 
		add(btn5,BorderLayout.CENTER);
//		add(btn5,"Center"); 
		setLocation(100,100);
		setSize(800,800);
		setVisible(true);
		
		//Grid ���� Border ���� �ȵ���̵嵵 ��
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
