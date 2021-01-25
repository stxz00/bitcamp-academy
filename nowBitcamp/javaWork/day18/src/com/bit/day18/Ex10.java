package com.bit.day18;

import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

//��Ŷ

public class Ex10 extends Frame{
	
	public Ex10() {
		
		JButton btn = new JButton(); // ��ư �̹��� �ֱ�
		
		File file = new File("imgs\\image.png");
	
		InputStream is = null;
		byte[] arr = new byte[(int)file.length()];
		try {
			is = new FileInputStream(file);
			for(int i = 0 ; i < arr.length; i++) {
				arr[i] = (byte) is.read();
			}
		} catch(IOException e){
			e.printStackTrace();
		} finally {
			try {if(is != null) {is.close();}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		Toolkit tool = Toolkit.getDefaultToolkit();

//		Image img = tool.createImage(arr);
		
		Image img = tool.createImage("imgs\\image.png");
		
		Icon icon = new ImageIcon(img);
		
		btn.setIcon(icon);
		add(btn);
		
		int locX = 0, locY = 0;
		//�� ������� �ü������ ��Ź�ؾ��ϴµ� 
		//tookit�� �߻�Ŭ����
		
//		tool.beep(); // ������ġ�� ��- �ϴ� �Ҹ��� ��
		Dimension dim = tool.getScreenSize();
		//������ ��ü���� ���۳�Ʈ�� ���� ���̸� ���� ���е��θ� ĸ��ȭ
		System.out.println(dim.width + "x" + dim.height); //int
		System.out.println(dim.getWidth() + "x" + dim.getHeight()); //double
		setSize(500,300);
		
		Dimension dim2 = getSize();
		//������â�� ������
		
		
		locX = dim.width/2 - dim2.width/2;          //-500/2; 
		//��ũ���������� ���ݿ� setSize�� ������ ���� �߾��̴�
		locY = dim.height/2 - dim2.height/2;           //- 300/2;
		
		setSize(500,300);
		setLocation(locX,locY);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex10 me = new Ex10();
	}
}
