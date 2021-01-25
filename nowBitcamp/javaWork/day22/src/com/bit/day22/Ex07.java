package com.bit.day22;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex07 {
	
	public static void main(String[] args) {
		ServerSocket serv = null; //���������� ������ �������� �ʰ� �ִٰ� ���� ���� ������ Ŭ���̾�Ʈ�� �����Ϸ� �� �� ������ ����
		Socket sock = null; 
		String msg = "������ ȯ���մϴ�";
		OutputStream os= null;
		try {
			serv = new ServerSocket(5000); //��Ʈ 5000���� �� ���� //�����Ͱ� ������ ������ ���
//			System.out.println("���Ӵ����...");
			sock = serv.accept(); // ���������� ������ ����.
			System.out.println(sock.getInetAddress()); //���� Ŭ���̾�Ʈ ������ �ּҸ� ����
			//������ ��ü�� Ŭ���̾�Ʈ ���α׷���!! �̰� �����ϰ� ��Ʈ 5000�� �������� ġ�� ����!
			
//			System.out.println("�޾Ƶ���");
			//Ex07�� �����ϸ� ������ ������� ���Ӵ�� ���� ����
			// �̶� Ex06�� �����ϸ� Ŭ���̾�Ʈ�� ���ӵ�
			
			os = sock.getOutputStream(); //�������κ��� �ƿ�ǲ��Ʈ�� ��
			os.write(msg.getBytes()); //���Ͽ� ����ȯ�� �������
			os.flush();
			
			os.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
			try {
				if(os != null){os.close();}
				if(sock != null){sock.close();}
				if(serv != null) {serv.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); // �����޼����� ������ ����ٴ� ��.
			}
		}
		
	}
}
