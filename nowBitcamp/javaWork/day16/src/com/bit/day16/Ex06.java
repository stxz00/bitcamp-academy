package com.bit.day16;
// 1~6���� ���̾ƿ� ����
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.util.Scanner;

public class Ex06 extends Frame {
	static CardLayout layout ;
	public Ex06() {
		layout = new CardLayout();
		//�׿��ִ� ī�� �����ϸ� ù���� �� �ڷ� �װ� �� ������ �ݺ�
		setLayout(layout);
		
		Panel p1 = new Panel();
		p1.add(new Button("ù��°"));
		Panel p2 = new Panel();
		p2.add(new Button("�ι�°"));
		Panel p3 = new Panel();
		p3.add(new Button("����°"));
		
		add(p1);
		add(p2);
		add(p3);
				
		setLocation(100,100);
		setSize(400,200);
		setVisible(true);
/*		layout.next(this); �� ������ �ҷ��� ��� : �ι�°
		layout.next(this); ��� : ����°
*/		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex06 me = new Ex06();
		while(true) {
			System.out.print("1.���� 0.����");
			int input = sc.nextInt();
			if(input == 0) {break;}
			if(input == 1) {
				layout.next(me); //���� ���� ���Ǵ� ���̾ƿ�
			}
		}
	}
}
