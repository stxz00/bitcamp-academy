package com.bit.day20;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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

import javax.swing.JButton;

public class Ex18 extends Frame implements WindowListener, ActionListener, MouseListener,Runnable {
	
	MenuItem mi1 = new MenuItem("������");
	MenuItem mi2 = new MenuItem("����");
	MenuItem mi3 = new MenuItem("����");
	MenuItem mi4 = new MenuItem("����");
	Menu m1 = new Menu("����");
	
	MenuItem mi5 = new MenuItem("����");
	Menu m2 = new Menu("����");
	
	TextArea ta = new TextArea();
	
	boolean boo = false;
	String path = new String();
	
	
	Dialog dia1 = new Dialog(this);
	Button btn1 = new Button("��");
	Button btn2 = new Button("�ƴϿ�");
	
	Dialog dia2 = new Dialog(this);
	Button btn3 = new Button("Ȯ��");
	
	FileDialog fd = new FileDialog(this, "�ٸ� �̸����� ����", FileDialog.SAVE);
	
	Dialog di3 = new Dialog(this);
	
	Ex18(){
		dia2.setLayout(new GridLayout(2,1));
		
		dia2.add(new Label("�س���(��) �ۼ��Ͽ����ϴ�"));
		
		btn3.addMouseListener(this);
		dia2.add(btn3);
		
		
		
		dia1.setVisible(false);
		
		m1.add(mi1);
		m1.addSeparator();
		m1.add(mi2);
		m1.add(mi3);
		m1.addSeparator();
		m1.add(mi4);
		m2.add(mi5);
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mi5.addActionListener(this);
		
		MenuBar mb = new MenuBar();
		mb.add(m1);
		mb.add(m2);
		
		add(ta);
		
		addWindowListener(this);
		
		setMenuBar(mb);
		
		setTitle("�������");
		setLocation(100,100);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex18 me = new Ex18();
		
		Thread thr = new Thread(me);
		thr.start();

		
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		dia1.setLayout(new GridLayout(2,1));
		
		dia1.add(new Label("�����ϰ� �����Ͻðڽ��ϱ�?"));
		Panel p1 = new Panel();
		
		btn1.addMouseListener(this);
		
		
		btn2.addMouseListener(this);
		
		p1.add(btn1);
		p1.add(new Label("    "));
		p1.add(btn2);
		dia1.add(p1);
		dia1.setSize(175,120);
		dia1.setLocation(this.getX() + this.getWidth()/2 - dia1.getWidth()/2,
				this.getY() + this.getHeight()/2 - dia1.getHeight()/2);
		dia1.setVisible(true);
		setEnabled(false);
		
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
		if(mi1.equals(e.getSource())) {
			ta.getText();
			ta.setText("");
					
		}else if(mi2.equals(e.getSource())) {
			load();

		}else if(mi3.equals(e.getSource())) {
			save(boo);

		}else if(mi4.equals(e.getSource())) {
			dispose();
		}else if(mi5.equals(e.getSource())) {
			
			
			dia2.setSize(170,95);
			dia2.setLocation(this.getX() + this.getWidth()/2 - dia1.getWidth()/2,
					this.getY() + this.getHeight()/2 - dia1.getHeight()/2);
			dia2.setVisible(true);
			setEnabled(false);
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(btn1.equals(e.getSource())){
			save(false);
			dispose();
		}else if (btn2.equals(e.getSource())){
			dispose();
		}
		
		if(btn3.equals(e.getSource())) {
			setEnabled(true);
			dia2.setVisible(false);
		}
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
	
	
	public void load() {
		FileDialog fd = new FileDialog(this,"���� ����",FileDialog.LOAD);
		fd.setLocation(200,200);
		fd.setVisible(true);
		
		path = fd.getDirectory() + fd.getFile();
		
		File file = new File(path);
		
		InputStream is = null;
		BufferedInputStream bis = null;
		ByteArrayOutputStream baos = null;
		try {
			is = new FileInputStream(file);
			bis = new BufferedInputStream(is);
			baos = new ByteArrayOutputStream();
			
			while(true) {
				int input = bis.read();
				if(input == -1) {break;}
				baos.write(input);
			}
			byte[] by = baos.toByteArray();
			String open = new String(by);
			System.out.println(open);
			ta.setText(open);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if(baos != null) {baos.close();}
				if(bis != null) {bis.close();}
				if(is != null) {is.close();}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		setTitle(fd.getFile());
	}
	
	public void save(boolean boo) {
		if(!boo) {
			FileDialog fd = new FileDialog(this,"�ٸ� �̸����� ����", FileDialog.SAVE);
			fd.setLocation(200,200);
			fd.setVisible(true);
			
			path = fd.getDirectory() + fd.getFile();
			setTitle(fd.getFile());
		}
			
		File file = new File(path);
		
		OutputStream os = null;
		BufferedOutputStream bos = null;
		
		byte[] by = ta.getText().getBytes();
		try {
			os = new FileOutputStream(file);
			bos = new BufferedOutputStream(os);

			for(int i = 0; i < by.length; i++) {
				bos.write(by[i]);
			}
			this.boo = true;
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if(bos != null) {bos.close();}
				if(os != null) {os.close();}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	@Override
	public void run() {
	while(true) {	
		try {
			Thread.sleep(300000);
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
			Dialog dia3 = new Dialog(this); //���� ���忩��
			dia3.setLayout(new BorderLayout());
				
			Label la = new Label();
			la.setAlignment(Label.CENTER);
			Font font = new Font(Font.SANS_SERIF,Font.BOLD,15);
			la.setText("������ �����Ͻðڽ��ϱ�?");
			la.setFont(font);
				
			Panel p2 = new Panel();
			p2.setLayout(new GridLayout(1,2));
			JButton btn1 = new JButton("��");
			btn1.setFont(font);
			btn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					fd.setVisible(true);
					String save = fd.getDirectory() + fd.getFile();
					File file = new File(save);
					OutputStream os = null;
					BufferedOutputStream bos = null;
					PrintStream ps = null;
					try {
						os = new FileOutputStream(file);
						bos = new BufferedOutputStream(os);
						ps = new PrintStream(bos);
						
						ps.println(ta.getText());
							
						setEnabled(true);
						dia3.setVisible(false);
						
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} finally {
						try {
							if(ps != null) {ps.close();}
							if(bos != null) {bos.close();}
							if(os != null) {os.close();}
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
	
				}
			});
			JButton btn2 = new JButton("�ƴϿ�");
			btn2.setFont(font);
			btn2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					setEnabled(true);
					dia3.setVisible(false);
				}
			});
			p2.add(btn1);
			p2.add(btn2);
			
			dia3.setTitle("���� ����");
			dia3.add(la,BorderLayout.CENTER);
			dia3.add(p2,BorderLayout.SOUTH);
			Toolkit tool = Toolkit.getDefaultToolkit();
			Dimension dim = tool.getScreenSize();
			dia3.setBounds(dim.width/2-300/2,dim.height/2-200/2,300,200);
			setEnabled(false);
			dia3.setVisible(true);
		}
	}
}