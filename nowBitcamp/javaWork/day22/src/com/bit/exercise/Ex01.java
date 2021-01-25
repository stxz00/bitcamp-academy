package com.bit.exercise;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {
	public static void main(String[] args) {
		String url = "naver.com"; //"naver.com";
		InetAddress addr = null;
		InetAddress addrs[] = null;
		byte[] by = null;
		try {
			addr = InetAddress.getByName(url);
			System.out.println(addr.getAddress()); 
			System.out.println(addr.getByName(url)); //�����θ�/�ּ�
			addrs = InetAddress.getAllByName(url);
			by = addr.getAddress();
			System.out.println(by);
			System.out.println("-------------------");
			
			for(int i = 0; i < addrs.length; i++) {
				System.out.println(addrs[i].getHostName()); //�����θ�
				System.out.println(addrs[i].getHostAddress()); //ȣ��Ʈ �ּ�
				System.out.println(addrs[i].getCanonicalHostName()); 
				System.out.println("-------------------");
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
