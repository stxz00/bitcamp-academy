package com.bit.day17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

//���������� ������
//JFrame������ �̹� �����Ǿ� ����

public class Ex03 extends JFrame {
	
	public Ex03() {
		// 0 - Do_NOTHING_ON_CLOSE()
		// 1 - HIDE_ON_CLOSE (setVisible(false);)
		// 2 - DISPOSE_ON_CLOSE (dispose())
		// 3 - 	EXIT_ON_CLOSE (System.exit(0);)
	
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		//Ŭ���� �� �� ��� �� �� ���ϴ� ��
		//0�� �׳� frame�� ����(�ƹ��͵� ����) 1�� ����Ʈ���� �����ϰ� ����ȵ�ä â�� ����(setVisible(false);)
		//2�� (�����ϰ�)�ݱ�(dispose()) DISPOSE_ON_CLOSE, 3�� ���� �ݱ�(exit) EXIT_ON_CLOSE
		
		setLocation(100,100);
		setSize(400,300);
		setVisible(true); //JFrame�� ���� �� false�� ���ϰ� ������ ������ ����
	}
	
	public static void main(String[] args) {
		Ex03 me = new Ex03();
	}

}
