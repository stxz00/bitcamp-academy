package com.bit.tcp01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class BitServer extends Thread{
	Socket sock;
	
	public BitServer(Socket sock) {
		this.sock = sock;
	}
	
	@Override
	public void run() {
		InetAddress inet = sock.getInetAddress();
		String ip = inet.getHostAddress();
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			is = sock.getInputStream();
			os = sock.getOutputStream();
			isr = new InputStreamReader(is);
			osw = new OutputStreamWriter(os);
			br = new BufferedReader(isr);
			bw = new BufferedWriter(osw);
			
			String msg = null;
			while((msg = br.readLine()) != null) {	//Ŭ���̾�Ʈ�� ���� ä���� �а�
				bw.write(ip + ">" + msg);			
				bw.newLine();
				bw.flush();
			}
			//������ �װ� �ٽ� �׳� Ŭ���̾�Ʈ�� ������ ���� Ŭ���̾�Ʈ���� �װ� read������ ������ �����ִ°�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				
				if(bw != null) {bw.close();}
				if(osw != null) {osw.close();}
				if(os != null) {os.close();}
						
//				if(br != null) {br.close();}
//				if(isr != null) {isr.close();}
//				if(is != null) {is.close();}
				if(sock != null) {sock.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		int port = 5000;
		
		
		ServerSocket serv = null;
				
		try {
			serv = new ServerSocket(port);
			
			while(true) {
				System.out.println("�����...");
				Socket sock = serv.accept();
				BitServer client = new BitServer(sock); //�����带 ��ӹ޴� BitServer�� �����ڷ� ����
//				new BitServer(serv.accept()).start(); ������ �̰� �����̴ϱ�
				client.start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(serv != null) {serv.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
}
