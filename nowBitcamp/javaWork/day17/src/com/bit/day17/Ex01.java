package com.bit.day17;
//�޴������
//�޴��� ��ü�� ������â
//�޴��� �������� ���弱
// Menu, Button, Canvas, Checkbox, Choice, Container, Label, List, Scrollbar, TextComponent �� ��κ��� UI�� ������Ʈ�� ��ӹ���
import java.awt.CheckboxMenuItem;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex01 implements ActionListener{
	
	
	public static void main(String[] args) {
		Frame frame = new Frame();
		
		
		
		MenuItem it01 = new MenuItem(); //�޴��� ����Ʈ �߰�
		it01.setLabel("������");
		
		MenuItem it02 = new MenuItem("����");
		MenuItem it03 = new MenuItem("����");
		
		
		MenuItem it04 = new CheckboxMenuItem("�ߺ���",true); 
		//üũ�ڽ� ����Ʈ �߰�
		
		MenuItem it05 = new CheckboxMenuItem("Ȯ��"); 
		MenuItem it06 = new CheckboxMenuItem("���"); 
		
		Menu mn04 = new Menu("Ȯ��/���"); //�޴��� �� �� �޴� �ֱ�
		mn04.add(it05);
		mn04.add(it06);
		// �޴��� �޴� �������� ��ӹް�, ������ ������ �̷� �� ������
		
		
		Menu mn01 = new Menu(); //�޴��ٿ� �޴��� ����
		mn01.setLabel("����(F)");
		mn01.add(it01);
		mn01.add(it02);
		mn01.addSeparator(); //���м� �߰�
		mn01.add(it03);
		
		Menu mn02 = new Menu("����(H)");
		
		Menu mn03 = new Menu("����(V)");
		mn03.add(it04);
		mn03.add(mn04); //Ȯ�� ��� �޴��� ���⿡ �߰�
		
		MenuBar mb = new MenuBar();
		mb.add(mn01); //�޴��ٿ� �޴� ���� ����
		mb.add(mn03);
		mb.add(mn02);
		frame.setMenuBar(mb); //1. �޴��ٻ���, ���� �Ⱥ���
		
		frame.setLocation(100,100);
		frame.setSize(500,300);
		frame.setVisible(true);
		
		FileDialog dia = new FileDialog(frame,"",FileDialog.SAVE); 
		//���� ���̾˷α�(������ ������, Ÿ��Ʋ,0 : ����, 1 : ���� ��)
		//�ü���� ���� �Ǵ� ����� �ٸ�
		
		dia.setLocation(150,150);
		dia.setSize(200,200);
		dia.setVisible(true);
		
		//�Ʒ��� ������ �����Ͽ� ����, ������ ������ ������ �̸��� ������ �� Ȯ��
		System.out.println(dia.getDirectory()); //���͸� ��ġ��
		System.out.println(dia.getFile());  //������ ��ġ ��ġ�� ��Ȯ�� ��ġ�� ��
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
