package com.bit.day15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {
	public static void main(String[] args) {
		InputStream myIn = System.in;

		OutputStream myOut= System.out;
		//���ʿ��� �ܼ������� ���� �� -> �ƿ�ǲ��Ʈ��
		//�츮�� ��� SYstem.out�� �̰���
		try {
			int su = myIn.read(); 
			//�ܼ��� �ü���� ������ �ִ� �͹̳�(Ű���尰��)
			System.out.println(su); //�Է��� ������ �ϳ��� ���
			su = myIn.read();
			System.out.println(su);
			su = myIn.read();
			System.out.println(su);
			// a ������ ���� ġ�� a�� \r\n ����
			//IO������ ���ڷνḸ ���͸� �ν�
			//���⼭ ��µ�(������ Ư��)
			//�ڹ� IO�� �Է¹ޱ� ������ ����ϴ� Ư���� ����
			su = myIn.read();
			System.out.println(su);
			//�״��� ���� �Է��ϸ� ���
			System.out.println("��");
		
			
//			myOut.write(65);
//			myOut.write(66);
//			myOut.write(67);
//			myOut.flush();
//			myOut.close();
			//close�� ���� ������ ����� ���� �ʴ´�
			//���������� ���۸� ������ ���� �� ���۸� �о�� ����� close �̷� ������ close()�� ���� ������ �� ������� ���ư����� ���� �ݵ�� close �ϱ�
			//����� ��Ȳ������(ä�ð���) ���Ͽ��� IO�� ������ �ִ� ���� �о�ٴ� ������ flush()�� ���� ����� �ȴ� close ���� ������ �̰����� ���۸� �о�� �� close() ���ο� flush()�� ����Ǿ� ����!
			//�߰��� flush�� �о�� �ǳ� ������ ������ �������� �Ǵ� ������ ������ �ϱ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
