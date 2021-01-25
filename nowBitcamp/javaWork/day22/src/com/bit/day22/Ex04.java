package com.bit.day22;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex04 {
	
	public static void main(String[] args) {
		String spec = "https://shopping.naver.com/style/fashionbrand/stores/100060243/products/5265904503?NaPm=ci%3Dshoppingwindow%7Cct%3Ddummy%7Ctr%3Dswl%7Chk%3D66ce621a5bccd71b510821380b796d02c838ddd1%7Ctrx%3Di%3A5265904503#top"; 
		//spec�� �ּ�, ��Ŀ�� ��� #top ���� �ڿ� ��
//		��������://������(ip): ��Ʈ��ȣ/�н�?����#��Ŀ
//		���������� ���� �ٿ��������� ���ص� �ڵ����� �ٿ���
//		�������� http, https 
//		http�� ��ȣȭ ���� �ʰ� �����Ǿ����� ������ �ؽ�Ʈ Ʈ������ ��������
//		�׷��� ��ȣȭ�� https �� over secure socket layer
//		ȸ������ �α��� ��.. ������� �������� ����ȭ �Ǿ�����.
		
// 		��Ʈ - ����Ʈ ��Ʈ : 80(http), 443(https)
//		0�� ~ 1023��: �� �˷��� ��Ʈ (well-known port), ������ ��ӵǾ��ִ� ��Ʈ(������ ��Ʈ) 
//		1024�� ~ 49151��: ��ϵ� ��Ʈ (registered port), ���ӵ� ���� �ƴ����� ȸ�縶�� ������ ��Ʈ�� ����, ������ ��Ʈ�� ���� �Ұ���, �浹����, ��Ű ��ȣ�� ������ ȸ�� �������� 
//		49152�� ~ 65535��: ���� ��Ʈ (dynamic port), ������� �ᵵ ��

//  	�н��� ��û����(��û �������� ����), /<- ��Ʈ�� ���ϴ� ������ ��. 

// 		���� - ��������, ?����
		
//		��Ŀ - �پ��� �������� ��� #
		
		java.net.URL url = null;
		
		try {
			url = new URL(spec);
			System.out.println("�������� : " + url.getProtocol());
			System.out.println("������ : " + url.getHost());
			System.out.println("��Ʈ1 : " + url.getPort()); //-1�� �ּһ󿡼� �Ⱥ��δٴ� ��
			System.out.println("��Ʈ2 : " + url.getDefaultPort()); //����Ʈ��Ʈ  https://swindow.naver.com:443 �� �����Ǿ�����
			System.out.println("�н� : " + url.getPath());
			System.out.println("url���� : " + url.getQuery());
			System.out.println("��Ŀ : " + url.getRef());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
