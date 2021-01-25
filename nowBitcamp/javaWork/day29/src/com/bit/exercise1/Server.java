package com.bit.exercise1;

import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread{
	Socket sock;
	
	@Override
	public void run() {
		File file = new File("game1.png");
		try(InputStream is = sock.getInputStream();
			OutputStream os = sock.getOutputStream();
			FileInputStream fis = new FileInputStream(file);){
			int su = -1;
			while((su = fis.read()) != -1) {
				os.write(su);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	public static void main(String[] args) {
		
		try(ServerSocket serv = new ServerSocket(5000);){
			
			while(true) {
				Server se = new Server();
				se.sock = serv.accept();
				se.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
