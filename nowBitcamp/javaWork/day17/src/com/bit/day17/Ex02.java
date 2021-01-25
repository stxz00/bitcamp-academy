package com.bit.day17;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex02 extends Frame implements WindowListener{
	//�����츮���ʴ� �������̽�, ���� �������̵�
	//â�� ���õ� �̺�Ʈ
	public Ex02() {
		
		addWindowListener(this); //����  
		
		
		setLocation(100,100);
		setSize(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex02 me = new Ex02();
		
		System.out.println("������ �����ϰڽ��ϴ�");
		return;
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("windowActivated : Ȱ��ȭ");
		//â�� ���� �� ���� ����
		this.setBackground(Color.WHITE);
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		System.out.println("windowClosed : ���������� ��û�� ���� ����(������ ������ ����)");
		
		
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("windowClosing : �ݱ��ư�� ��������");
//		dispose(); //GUI �����û -> closed ����
		//�ݵ�� dispose()�� �ϴ� �� �ƴ� �ݱ��ư�� ������ �� �ٸ� �̸����� �����ϰų� ���ϴ��̾˷α׸� �����ϴ� ���� ����� ������ �����
		FileDialog dia = new FileDialog(this,"����",1);
		dia.setLocation(200,200);
		dia.setSize(400,200);
		dia.setVisible(true);
		
//		System.exit(0); // �ý��� �������� -> closed�� ������� ����
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("windowDeactivated : ��Ȱ��ȭ");
		// â�� ������ 
		this.setBackground(Color.GRAY);
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("windowDeiconified : �ּ�ȭ���� ������(�������ȭ)");
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("windowIconified : �ּ�ȭ��(�۾�ǥ���ٿ� ������ȭ)");
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println("windowOpened : ����");
		// â�� ������ ��Ƽ���� �Բ� ����
	}
}
