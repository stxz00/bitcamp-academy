package com.bit.day18;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//����� Ŭ���� 

/*
class WinClose implements WindowListener{
	public void windowActivated(WindowEvent arg0) {
	}
	public void windowClosed(WindowEvent arg0) {
	}
	public void windowClosing(WindowEvent arg0) {
	}
	public void windowDeactivated(WindowEvent arg0) {	
	}
	public void windowDeiconified(WindowEvent arg0) {
	}
	public void windowIconified(WindowEvent arg0) {
	}
	public void windowOpened(WindowEvent arg0) {
	}
	
}
*/
public class Ex15 extends Frame {
	
	Ex15(){
		/*
		//��ϸӽ�Ŭ������ ���� �ڵ� �и�
		addWindowListener(new WinClose() {
			//�������̵� ������ �ؼ� ��
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		*/
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Ŭ��");
			}
		});
		
		
		//�߻�޼��尡 ������ �߻�Ŭ������ ���Ƴ��� ����� Ŭ����
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setBounds(100,100,400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex15 me = new Ex15();
	}
}
