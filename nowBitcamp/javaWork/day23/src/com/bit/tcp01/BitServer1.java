package com.bit.tcp01;
//���ڼ���
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class BitServer1 extends Thread{
	 Socket sock;

	public static void main(String[] args) {
		String ip = "localHost"; //����ȣ��Ʈ�� ���� ������ �������� Ŭ���̾�Ʈ�� ����ȣ��Ʈ�� ������ ������ �׷��Ƿ� �ܺ� Ŭ���̾�Ʈ ���� �ÿ� ����ȣ��Ʈ ���� �ؾ���
		int port = 5000;
	    SocketAddress endpoint=null;
	    endpoint=new InetSocketAddress(ip, port);
	    ServerSocket serv=null;
	      try {
	         serv=new ServerSocket();
	         serv.bind(endpoint);
	         System.out.println("���Ӵ����...");
	         while(true) {   
	            BitServer1 client=new BitServer1();
	            client.sock=serv.accept();
	            client.start();
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if(serv!=null) {serv.close();}
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }

	   }
	   
	   @Override
	   public void run() {
	      InputStream is=null;
	      InputStreamReader isr=null;
	      BufferedReader br=null;
	      
	      try {
	         is=sock.getInputStream();
	         isr=new InputStreamReader(is);
	         br=new BufferedReader(isr);
	         
	         while(true) {
	            System.out.println(br.readLine());
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if(br!=null) {br.close();}
	            if(isr!=null) {isr.close();}
	            if(is!=null) {is.close();}
	            if(sock!=null) {sock.close();}
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }
	   }

	}