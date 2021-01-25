package com.bit.day20;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Observer;

//�ڹٵ������ ���͸� ���
// ���Ϳ�(�ƹ��� Ȯ���ص� ������ �ʰ� �Ƿ�(3d), �������� ���� �׸��� ���������� ������ ������ ����(ĳ��,�Ϸ���Ʈ), ���� : ��̶�� ������ ��� �ȵ�. ������ �����̰� ��� ���׸İ� ������ ���ο� ���� ����� �� Ȯ�븦 ��� �ϴٺ��� ���� ���� ������� �Ǿ�����, ���� �׸��� ��û�� ������ ���, ���굵 �� �׷��� �׸��� �׸����� �������� ������, ������ ������,����,��ǥ,�������� ������ �ڹٴ� �̰��� ���) ��Ʈ�� ���(Ȯ��� ��� : �ȼ�, �������� ��ǥ, ������ ��ǥ�� �� �ȼ� �ػ󵵸� ������ �� �ȼ��� � ������ ���ϴ� ��(���伥), ���ϴ� �ſ� �׳� ���ϰ� ��� ����) 
public class Ex09 extends Frame{
	
	class myCanvas extends Canvas{

		@Override 
		public void paint(Graphics g) {
			g.setColor(Color.RED); //������ �� ��
			g.drawString("Hello", 100, 100); //�׸����� �۾� ����
			g.drawLine(0, 0, 100, 100); //������,���� 
			g.drawRect(100, 200, 100, 50); //�簢�� 
			g.drawOval(100, 300, 50, 50);
			g.drawArc(100, 400, 100, 100, 0, 180); //ȣ ��ó�� ���� �Ȱ��� �׸��� ������������ 360�� �� �󸶸�ŭ�� ������ ǥ��
			
			g.setColor(Color.BLUE);
			g.drawString("Hello", 300, 100); 
			g.drawLine(200, 0, 100, 100); 
			g.fillRect(200, 200, 100, 50); //ä�� ������
			g.fillOval(200, 300, 50, 50);
			g.fillArc(200, 400, 100, 100, 0, 180); 
			
			g.setColor(Color.GREEN);
			g.draw3DRect(300, 200, 100, 50,true); //boolean�κ��� ���� ��ġ
//			g.draw3DOval(300, 300, 50, 50,); ���� ����
//			g.fill3DArc(300, 400, 100, 100, 0, 180,true); ��������
			
			Image img = Toolkit.getDefaultToolkit().getImage("34.png");
			Observer observer;
			
			g.drawImage(img, 200, 100,this);
		}
		
	}
	
	Ex09(){
		Canvas can = new myCanvas();
		add(can);
		
		setBounds(100,100,500,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex09 me = new Ex09();
	}
}
