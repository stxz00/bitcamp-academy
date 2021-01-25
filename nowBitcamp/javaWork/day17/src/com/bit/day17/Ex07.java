package com.bit.day17;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

//�ѹ� ������ ������ �� ������ ��� �ȹ���� �ϴ°� �غ���
//�ƴϸ� ���� ��Ȱ��ȭ ��Ű��
//�׳� ���� �� ������ �� ������

public class Ex07 extends Frame implements WindowListener, ActionListener, MouseListener{
	MenuItem mi11 = new MenuItem("������");
	MenuItem mi14, mi12 ,mi13,mi21;
	TextArea ta = new TextArea();
	String name = "�������";
	
	
	
	
	public Ex07() {
		
		setTitle(name);
		mi11.addActionListener(this);
		mi12 = new MenuItem("����");
		mi12.addActionListener(this);
		mi13 = new MenuItem("����");
		mi13.addActionListener(this);
		mi14 = new MenuItem("����");
		mi14.addActionListener(this);
		mi21 = new MenuItem("����");
		mi21.addActionListener(this);
		
		Menu mn01 = new Menu("����");
		mn01.add(mi11);
		mn01.addSeparator();
		mn01.add(mi12);
		mn01.add(mi13);
		mn01.addSeparator();
		mn01.add(mi14);
		Menu mn02 = new Menu("����");
		mn02.add(mi21);
		
		add(ta);
		
		
		MenuBar mb = new MenuBar();
		mb.add(mn01);
		mb.add(mn02);
		
		
		setMenuBar(mb);
		
		
		setLocation(100,100);
		setSize(500,400);
		setVisible(true);
		addWindowListener(this);
	}
	
	public static void main(String[] args) {
		Ex07 me = new Ex07();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
	
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		dispose();
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		MenuItem mi = (MenuItem)e.getSource(); //� ���� �̺�Ʈ�� �߻��ߴ��� �ּҰ����� �˷��ִ°�
		String label = mi.getLabel();
		if(label.equals("����")) {
			dispose();
		}else if(label.equals("������")) {
			ta.setText("");
		}
		*/
		if(mi14==e.getSource()) {
			dispose();
		}else if(mi11==e.getSource()) {
			ta.setText("");
			setTitle("�������");
		}else if(mi21 == e.getSource()) {
			dia = new Dialog(this,"����");
			dia.setLayout(new FlowLayout());
			Button btn = new Button("Ȯ��");
			btn.addMouseListener(this);
			dia.add(btn);
			dia.setSize(200,100);
			dia.setLocation(this.getX() + this.getWidth() /2 - dia.getWidth()/2, this.getY() + this.getHeight()/2 - dia.getHeight()/2);
			dia.setVisible(true);
			setEnabled(false);
		}else if(mi13 == e.getSource()) {
			FileDialog fd = new FileDialog(this,"����");
			
			fd.setSize(200,100);
			fd.setLocation(this.getX() + this.getWidth() /2 - fd.getWidth()/2, this.getY() + this.getHeight()/2 - fd.getHeight()/2);
			fd.setVisible(true);
			
			
			String dir = fd.getDirectory();
			String name = fd.getFile();
			
			File file = new File(dir + name);
			
			OutputStream os = null;
			PrintStream ps = null;
			try {
				os = new FileOutputStream(file);
				ps = new PrintStream(os);
				ps.print(ta.getText());
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				try {
					if(ps != null) {ps.close();}
					if(os != null) {os.close();}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setTitle(name);
			}
			
			
		}else if(mi12 == e.getSource()) {
			FileDialog fd = new FileDialog(this,"����");
			fd.setVisible(true);
			String dir = fd.getDirectory();
			String name = fd.getFile();
			
			File file = new File(dir + name);
			
			InputStream is = null;
			ByteArrayOutputStream baos = null;
			
			try {
				is = new FileInputStream(file);
				baos = new ByteArrayOutputStream();
				
				while(true) {
					int su = is.read();
					if(su == -1) {break;}
					baos.write(su);
				}
				byte[] arr = baos.toByteArray();
				String msg = new String(arr);
				ta.setText(msg);
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {
				
				try {
					if(baos != null) {baos.close();}
					if(is != null) {is.close();}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			setTitle(name);
			
		}
		
		
	}
	Dialog dia;
	@Override
	public void mouseClicked(MouseEvent arg0) {
		setEnabled(true); //������ �ٸ��� ������â�� ����(�ƿ� dispose�� �ȵ�)
		dia.dispose();
		
		
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
}
