package com.bit.day16;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

//grid�� ���ϴ� ȭ���� ����� ���� �ſ� �����. ���߿� �� ���� ����� ������ ���� �����Ϸ� ������� �ʾƵ� ��

public class Ex04 extends Frame {
	public Ex04() {
		GridBagLayout gbl = new GridBagLayout();
		setLayout(gbl);
		//�����ս� ��ÿ� ��� ���� �� ���ϴ� ��
		//add �ϱ� ���� ��ġ ����
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		Button btn5 = new Button("btn5");
		Button btn6 = new Button("btn6");
		Button btn7 = new Button("btn7");
		
		 GridBagConstraints gbc=new GridBagConstraints();
		 // gbc.fill -> ��ġ�� �������� ��� ä����(������ ä�� ������)
		 //��ġ(�Ʒ� 3���� �����ؾ� ��ġ�� ������)
		 //	����, ������ġ
		 //	����,����
		 //	����ġ
		 // ��ġ�� �Ӽ��� ������� �� ��������(�̸� �ٵ��ǽ����� ������ ���س��� �ϸ� ��)
		 
		 
	      gbc.fill=1; //ä�� ��� �� �� , 0�� ä���� �ʰ� ��ġ����
//	      gbc.fillGridBagConstraints.BOTH; �Բ� ä�� ��ġ
	      // Field descriptor #12 I
//	      public static final int RELATIVE = -1;
//	      
//	      // Field descriptor #12 I
//	      public static final int REMAINDER = 0;
//	      
//	      // Field descriptor #12 I
//	      public static final int NONE = 0;
//	      
//	      // Field descriptor #12 I
//	      public static final int BOTH = 1;
//	      
//	      // Field descriptor #12 I
//	      public static final int HORIZONTAL = 2;
//	      
//	      // Field descriptor #12 I
//	      public static final int VERTICAL = 3;
//	      
//	      // Field descriptor #12 I
//	      public static final int CENTER = 10;
	      gbc.gridx=0; // ���� ��ġ 
	      gbc.gridy=0; // ���� ��ġ
	      //���̿� ���̴� ������� ũ����(�ȼ�����x)
	      gbc.gridwidth = 1; //����
	      gbc.gridheight = 1; //����
	      gbc.weightx = 1.0; // ����ġ : ���� ������ ��� �������� ���� ��. ����Ʈ�� 0��
	      // ����ġ�� ������ �� �� ��Ҹ��� ������ �ٸ��Ƿ� ����!
	      // ���� ���ΰ� �� 2ĭ, �Ʒ����� 3ĭ�̸� �װ��� ����ġ�� ����
	      gbc.weighty = 1.0; 
	      gbl.setConstraints(btn1, gbc);
	      add(btn1);
	      
	      gbc.gridx=1;
	      gbc.gridy=0;
	      gbc.gridwidth=1;
	      gbl.setConstraints(btn2, gbc);
	      add(btn2);
	      
	      gbc.gridx=2;
	      gbc.gridy=0;
	      gbc.gridwidth=1;
	      gbl.setConstraints(btn3, gbc);
	      add(btn3);
	      
	      gbc.gridx=0;
	      gbc.gridy=1;
	      gbc.gridwidth=1;
	      gbl.setConstraints(btn4, gbc);
	      add(btn4);
	      
	      gbc.gridx=1;
	      gbc.gridy=1;
	      gbc.gridwidth=2;
	      gbl.setConstraints(btn5, gbc);
	      add(btn5);
	      
	      gbc.gridx=0;
	      gbc.gridy=2;
	      gbc.gridwidth=2;
	      gbl.setConstraints(btn6, gbc);
	      add(btn6);
	      
	      gbc.gridx=2;
	      gbc.gridy=2;
	      gbc.gridwidth=1;
	      gbl.setConstraints(btn7, gbc);
	      add(btn7);

		setVisible(true);
		setLocation(100,100);
		setSize(300,300);
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
