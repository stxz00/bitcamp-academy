package com.bit.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;

public class UdpSender {
	
	public static void main(String[] args) {
		String msg = "udp������κ���";
		InetAddress addr = null;
		byte[] by = {(byte)175,(byte)192,123,116}; //�� �ּҸ� ����Ʈ�迭�� ��
		
		
		java.net.DatagramSocket sock = null;
		java.net.DatagramPacket pack = null;
		
		try {
			addr = InetAddress.getByAddress(by);
			sock = new DatagramSocket();
			byte[] arr = msg.getBytes();
//			pack = new DatagramPacket(arr, arr.length,addr,5000);
			pack = new DatagramPacket("abcd".getBytes(), 4,addr,5000);
			
			//����Ÿ�� �ɰ��� ���� ����,�ּ�,��Ʈ
			sock.send(pack);//��Ŷ �������� 010101 ����
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sock.close();
		}
		
		
	}
}
