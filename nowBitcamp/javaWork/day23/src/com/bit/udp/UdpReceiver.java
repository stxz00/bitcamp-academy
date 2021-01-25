package com.bit.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Arrays;

public class UdpReceiver {
	
	public static void main(String[] args) {
		DatagramSocket sock = null;
		DatagramPacket pack = null;
		
		byte[] buf = new byte[10];
		
		try {
			sock = new DatagramSocket(5000); //��Ƴ� ������ ����
			pack = new DatagramPacket(buf, 1);
			System.out.println("���� �غ���...");
			sock.receive(pack); // ���� �� �������� buf�� 15�������� ����
			InetAddress addr = pack.getAddress(); //�ڷḦ ���� Ŭ���̾�Ʈ�� �ּҸ� ���� �� �ִ�. ������ �ɰ��� ���� Set�� ���� �ߺ��� �ּҵ��� �ɷ����� �ְ���� �� �ִ�
			System.out.println(addr.getHostName());
			
			System.out.println(Arrays.toString(buf));
//			String msg = new String(buf);
//			System.out.println(">> " + msg);
			System.out.println(buf[0]);
			
			pack = new DatagramPacket(buf, 1);
			System.out.println("�� ���� �غ���");
			sock.receive(pack);
			System.out.println(Arrays.toString(buf));
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sock.close();
		}
		//Ư¡ : UDP�� ���� ��Ŷ�� ���� �˾ƾ��Ѵ�(�𸣸� �迭 ����� ��û �÷�����)
		//������ ���ù����� ����, Ŭ���̾�Ʈ�� ������ ������ ������ ������ ���� ���� �������忡���� Ŭ���̾�Ʈ�� �𸣴� ��� ������� ���� ����Ÿ�� ����
		
		// ����Ŭ ���� - > ���� ���� �� ����Ÿ���̽��� ���� �ܺο��� ���� ����� ���ؼ� �����Ϸ��� �� �ƴ϶� �Խ��ǿ� ���� ���� ����Ÿ���̽��� ���� ������ �ϱ� ���� �������� ����Ÿ ���̽��� ���� �ٵ� ����Ÿ���̽� ��� ���Ƴ��Ҵ� ���� �ܺο� ���� �����ϰ� �ǹǷ� ���α׷� ������ �̸� ���ƹ���. �׷��� ������ ����ȣ��Ʈ�� ������ ���� ����ȣ��Ʈ�� ������ �ϰ� �ϰ� �ܺ��� ���� ����. �����Ƿ� �����ϸ� �ܺο� ������ ������ ������.
	}
}
