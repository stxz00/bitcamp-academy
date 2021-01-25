package com.bit.exercise5;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer extends Thread{
	Socket sock;
	
	@Override
	public void run() {
		try(OutputStream os = sock.getOutputStream();){
			os.write("HTTP/1.1 200 OK\r\n".getBytes());
//			os.write("HTTP/1.1 404 Not Found\r\n".getBytes());
//			os.write("Content-Type:text/plain; \r\n".getBytes());
			os.write("\r\n".getBytes());
			os.write("<h1>Hello</h1> world".getBytes());
			os.flush();
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try(ServerSocket serv = new ServerSocket(5000);){
			System.out.println("접속대기");
			while(true) {
				Socket sock = serv.accept();
				System.out.println("접속완료");
				WebServer client = new WebServer();
				client.sock = sock; 
				client.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
