package com.bit.day18;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
class Item1 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("ù��°");	
	}
	
}

class Item2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("�ι�°");
	}
}
*/

public class Ex08 {//implements ActionListener{
	
	public static void main(String[] args) {
		
//		Ex08 me = new Ex08();
		
		Frame f = new Frame();
		
		MenuItem mi1 = new MenuItem("���1");
		MenuItem mi2 = new MenuItem("���2");
		int su = 2222;
		ActionListener listen = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1��" + su);
			}
		};
		
		mi1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("1��" + su);
			}
		});
		mi2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("2��" +su);
			}
		}); //�̷��� �������̽��� �ٷ� ��ϸӽ� Ŭ������ Ȱ���ϸ� ��û �������� �ڵ��� �������̰� �����ϰ� �ռ� su�� �ִ°�ó�� ���ٵ� ���� ��!!
		
		Menu mn = new Menu("��ɵ�");
		mn.add(mi1);
		mn.add(mi2);
		
		MenuBar mb = new MenuBar();
		mb.add(mn);
		
		f.setMenuBar(mb);
		f.setLocation(100,100);
		f.setSize(500,300);
		f.setVisible(true);
	}
/*
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("�׼�");
		
	}
*/	
}
