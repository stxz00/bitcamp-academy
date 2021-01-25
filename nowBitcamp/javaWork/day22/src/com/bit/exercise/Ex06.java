package com.bit.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex06 {
	public static void main(String[] args) {
		
		String hi = "�ȳ��ϼ���";
		
		ServerSocket ss = null;
		Socket sock = null;
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			ss = new ServerSocket(5000);
			System.out.println("���� �����");
			sock = ss.accept();
			System.out.println(sock.getLocalAddress());
			
			os = sock.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			
			
			bw.write(hi);
			System.out.println("������ ��");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) {bw.close();}
				if(osw != null) {osw.close();}
				if(os != null) {os.close();}
				if(sock != null) {sock.close();}
				if(ss != null) {ss.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
