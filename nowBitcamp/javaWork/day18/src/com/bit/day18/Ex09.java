package com.bit.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Ex09 extends Frame{
	
	
	Ex09(){
		Panel p = new Panel();
		Button btn1 = new Button("ù��°");
		Button btn2 = new Button("�ι�°");
		
		btn1.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("ù��° ��ư�� ���");
			}
		});
		btn2.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("�ι�° ��ư�� ���");
			}
		});
		
		p.add(btn1);
		p.add(btn2);
		add(p);
		setLocation(100,100);
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex09 me = new Ex09();
	}
}
