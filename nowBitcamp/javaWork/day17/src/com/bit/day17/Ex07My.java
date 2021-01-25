package com.bit.day17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.management.remote.JMXAddressable;

//���� ���̾� ����� ���� �̸�
//�����ϸ� ���� �޴� ������ ����� �� �ְ�
// �����ϸ� ������
//������ �ϸ� ���� �����
//���� -> ���������� ���̾� ��������ϴ� ǥ��
//�̺�Ʈ 
//����Ʈ��Ʈ�� IO
//+���ι�ȣ

public class Ex07My extends Frame implements MouseListener, KeyListener, WindowListener, ActionListener{
	
	Menu m1 = new Menu("����");
	MenuItem mi1 = new MenuItem("������");
	MenuItem mi2 = new MenuItem("����");
	
	MenuItem mi3 = new MenuItem("����");
	MenuItem mi4 = new MenuItem("����");
	
	Menu m2 = new Menu("����");
	MenuItem mi5 = new MenuItem("����");
	MenuBar mb = new MenuBar();
	TextArea ta = new TextArea();
	
	
	
	Ex07My(){
		

		m1.add(mi1);
		m1.addSeparator();
		m1.add(mi2);
		m1.add(mi3);
		m1.addSeparator();
		m1.add(mi4);
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		
	
		m2.add(mi5);
		
		mi5.addActionListener(this);

		
		
		mb.add(m1);
		mb.add(m2);
		setMenuBar(mb);
		
		
	
		ta.addKeyListener(this);
		add(ta);
		
		
		
		addWindowListener(this);
		
		setTitle("�������");
		setLocation(100,100);
		setSize(500,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Ex07My me = new Ex07My();
		
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		Object obj = e.getSource();
		System.out.println(obj);
		
		
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}




	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent arg0) {
		Dialog di = new Dialog(this);
		di.setLayout(new GridLayout(2,1));
		Label la = new Label("�����Ͻðڽ��ϱ�?");
		di.add(la);
		Panel p1 = new Panel();
		Button btn1 = new Button("��");
		Button btn2 = new Button("�ƴϿ�");
		p1.add(btn1);
		p1.add(new Label("  "));
		p1.add(btn2);
		di.add(p1);
		di.setLocation(100,100);
		di.setSize(200,150);
		di.setVisible(true);
		

	}


	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		String m = ((MenuItem)obj).getLabel();
		
		if(mi1.getLabel() == m) {
			ta.setText("");
		}
		
		
		if(mi2.getLabel() == m) {
			FileDialog fd = new FileDialog(this);
			fd.setLocation(100,100);
			fd.setSize(500,500);
			fd.setVisible(true);
			
			File file = new File(fd.getDirectory() + fd.getFile());
			
			InputStream is = null;
			BufferedInputStream bis = null;
			
			try {
				is = new FileInputStream(file);
				bis = new BufferedInputStream(is);
				
				byte[] by = new byte[(int) file.length()];
				for(int i = 0; i < by.length; i++) {
					by[i] = (byte) bis.read();
				}
				String save = new String(by);
				ta.setText(save);
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {
				try {
					if(bis != null) {bis.close();}
					if(is != null) {is.close();}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}
		
		if(mi3.getLabel() == m) {
			FileDialog fd = new FileDialog(this,"",1);
			fd.setLocation(150,150);
			fd.setSize(500,500);
			fd.setVisible(true);
			
			System.out.println();
			
			
			File file = new File(fd.getDirectory() + fd.getFile());
			OutputStream os= null;
			BufferedOutputStream bos = null;
			byte[] by = ta.getText().getBytes();
			try {
				os = new FileOutputStream(file);
				bos = new BufferedOutputStream(os);
				for(int i = 0; i < by.length; i++) {
					bos.write(by[i]);
				}
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				try {
					if(bos != null) {bos.close();}
					if(os != null) {os.close();}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}
		
		if(mi4.getLabel() == m) {
			
			dispose();
			
			Dialog d = new Dialog(this);
			d.setLayout(new GridLayout(2,1));
			
			Label lb1 = new Label("�����Ͻðڽ��ϱ�?");
			d.add(lb1);
			Panel p = new Panel();
			Button btn1 = new Button(" �� ");
			Button btn2 = new Button("�ƴϿ�");
			p.add(btn1);
			p.add(btn2);
				
			d.add(p);
			d.setLocation(100,100);
			d.setSize(200,100);
			d.setVisible(true);
			
			
		}
		
		if(mi5.getLabel() == m) {
			Dialog d = new Dialog(this);
			d.setLayout(new GridLayout());
			Label la = new Label("���س���(��) �ۼ��Ͽ����ϴ�");
			
			d.add(la);
			d.setTitle("���� �ۼ�");
			d.setBackground(Color.WHITE);
			d.setLocation(150,150);
			d.setSize(180,100);
			d.setVisible(true);
			
			
		}

	}

}

