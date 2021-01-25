package com.bit.tcp02;

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
import java.util.ArrayList;

public class BitServer extends Thread{
	Socket sock;
	static ArrayList<BufferedWriter> list = new ArrayList<>();
	
	
	
	public BitServer(Socket sock) {
		this.sock = sock;
	}
	
	public void allUser(String ip, String msg) throws IOException {
		for(int i = 0; i < list.size(); i++) {
			BufferedWriter bw = list.get(i);
			try {
				bw.write(ip + ">" + msg);
				bw.newLine();
				bw.flush();
			}catch(IOException e) {
				list.remove(bw);
			}
		}
	}
	
	
	@Override
	public void run() {
		InetAddress inet = sock.getInetAddress();
		String ip = inet.getHostAddress();
		System.out.println(ip + " ����");
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
			list.add(bw);
			String msg = null;
			while((msg = br.readLine()) != null) {	
				allUser(ip,msg);
			}
			
		} catch (IOException e) {
			System.out.println(ip + "����");
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
