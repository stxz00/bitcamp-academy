package com.bit.ex05;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer extends Thread{
	Socket sock;
//	String msg = "<h1>Hello</h1> world...";
	String msg = "<h1>Hello</h1> world..."; //��� ����
	
	@Override
	public void run() {
		OutputStream os = null;
		try {
			os = sock.getOutputStream();
			
//			os.write("HTTP/1.1 200 OK \r\n".getBytes()); //��� �� ���а�踦 �ϱ� ���Ѱ� ���� ��Ȳ
														// �� ���� �� �κ��� �Ⱥ����ִ� ��� ���� �κ�
//			os.write("\r\n".getBytes()); //���� �������� ������ �������� �κ�
//			os.write(msg.getBytes());
			
//			os.write("HTTP/1.1 404 Not Found \r\n".getBytes()); //�������� ���� ������!
//			// �� ���� �� �κ��� �Ⱥ����ִ� ��� ���� �κ�
//			os.write("\r\n".getBytes()); //���� �������� ������ �������� �κ�
//			os.write(msg.getBytes());
			

			os.write("HTTP/1.1 200 OK\r\n".getBytes()); //�������
			os.write("Content-Type:text/plain; \r\n".getBytes()); 
			//����� ���� ����(text/plan �ϸ� �״�� msg �ؽ�Ʈ)
			os.write("\r\n".getBytes()); //���� �������� ������ �������� �κ�
			os.write(msg.getBytes());
			os.flush();
			os.close();
			//�츮�� �������ݿ� ������ �������!
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		ServerSocket serv = null;
		try {
			//�������� http://121.129.154.65:5000/ �ϸ� �ڹٿ� ���ӵ� ����Ʈ�ƿ� ����
			//http�̱� ������ �� ������ �����̶�� �������
			//���� �������� ��û�� �� �� �޾ƾ� �ϱ� ������ �ٸ�
			serv = new ServerSocket(5000); 
			System.out.println("���Ӵ��...");
			while(true) {
				Socket sock = serv.accept();
				System.out.println("���ӿϷ�");
				WebServer client = new WebServer();
				client.sock = serv.accept();
				client.start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}