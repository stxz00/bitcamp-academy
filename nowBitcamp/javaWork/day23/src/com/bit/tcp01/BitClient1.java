package com.bit.tcp01;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class BitClient1 {
	
	public static void main(String[] args) {
		System.out.println("client start...");
		
		String ip = "localHost"; //�� �ּ�
		int port = 5000; // ��Ʈ��ȣ
		
		//��ȭ�� - ��޼��� - ��Ŭ��, ����Ģ - ��Ʈ��ȣ - 5000
		
		//�������� ������ �ٷ� ���ε� �ȰŰ� �̰Ŵ� Ǯ� �����
		SocketAddress endpoint = null; //������ ����� �ּ�
		endpoint = new InetSocketAddress(ip, port); 
		Socket sock = new Socket();
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		try {
//			sock = new Socket(ip,port);
			sock.connect(endpoint); //���ӽõ�
			System.out.println("������ ���ӵ�");
			os = sock.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				pw.println(sc.nextLine());
				pw.flush(); //���۸� �о���� ��
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pw != null) {pw.close();}
				if(osw != null) {osw.close();}
				if(os != null) {os.close();}
				if(sock != null) {sock.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
