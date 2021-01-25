package com.bit.day22;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

//�������α׷���
public class Ex06 {
	
	public static void main(String[] args) {
		//�Ϲ������� TCP, Ư���� ������ UDP(������� ���, �ŷڼ����� ������ ����, ���ۼ��� �ٲ��, ���ſ��� Ȯ�ݾ���, ��Ŷ����, ���ۼӵ� ����)
		
		// ���� : ���μ������� ��ſ� ���Ǵ� ���� ���� (��ȭ�� ���� ���)
		// Ŭ���̾�Ʈ ������ ���� ��û���� �׿� ���� �ϳ��� ������ �ʿ���. Ŭ���̾�Ʈ�� �ϳ��� �����ϸ� ������ ������ ���� ���� �����ϴϱ�
		// Ŭ���̾�Ʈ�� ��ǲ�� ������ �ƿ�ǲ�̰� �ƿ�ǲ�� ��ǲ
		
		java.net.Socket sock = null;
		// ���Ͽ� ������ �����Ǹ� �־�� ���� //������ ���� ��ǻ�� �ּ�
		// �⺻������ ���� �������� ���� ���� ���� ��Ʈ��ȣ�� �ʿ�
		
		InputStream is = null;
		InputStreamReader isr = null;
		
		try {
			sock = new Socket("127.0.0.1",5000); //������ ��Ʈ��ȣ, �̻��·� �����ϸ� ���� ���� ���������� x
			is = sock.getInputStream(); //�����κ��� ȯ���λ� ����
			isr = new InputStreamReader(is);
			
			while(true) {
				int su = isr.read();
				if(su == -1) {break;}
				System.out.print((char)su);
			}
			
//			System.out.println("���ӵ�");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(isr != null) {isr.close();}
				if(is != null) {is.close();}
				if(sock != null) {sock.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
