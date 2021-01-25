package com.bit.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

// ��ü ����ȭ - Serializable
// ��ü�� ���� ���� ����ϴµ� ��� ����ϴ� �� ������ ���� �����Ƿ� ������ ��

class Node implements Serializable{ //�������̽� ����ȭ //cloneó�� ������Ƽ�� �ѰŶ�� �����ϸ� �� cloneable ��ü�� ������ ����Ʈ�� �ٲٴ� ������ ����ȭ
	//�޴� ����� �ڷḦ ������� �ٲ㼭 �� ����.(�������� ġ�� ���� ������ �޾Ƽ� ����(��)�ؼ� �ڱ��� �̵��� ���ϰ� �ϴ� ��)
	//�ø����ȣ�� �ο��ϰ�, ���� ������ �ٲ���ȴٸ� �ø����ȣ�� �ٲ����
	//���� ������ ����� ���� ����, os���� Ŭ���� ������ ������ �������� �ʰ� ������ �����ϸ� �ø��� ��ȣ�� �ٸ��Ƿ� ������ �������� ��! 
	//��� : �ʵ常
	//		���ܵ� ���� �� Ÿ���� ����Ʈ��
//	private static final Long serialVersionUID = 1L; //<- �ø����ȣ. ����� ǥ�ô� ���� �����ڰ� �ο��ϴ��� ����� ��
	
	transient int val1; //Ʈ����Ʈ transient : ���� ������ ���� ���� ����ȭ���� ������(���� �Ⱥ���).(ȣ�� �� ������ �ƴϰ� ������Ÿ���� ����Ʈ ������ ����. 0, null...)
	
	private int val2;
	int val3;
	
	
	public void func1(int a) {
		val1 = a;
	}
	public int get2() {
		return val2+10000; // ����ó�� os���� ���� ���¿��� �޼����� 10000�� �߰��ߴµ� ����ȭ ������ �ݿ� �ȵ� -> �̴� �޼��� ���� �ʵ常 ����ȭ�� ����� ���̴�
		// ���������� �� ��ü�� �ʵ�� �޼��� ���� �� �� �ʵ�� �� ��ü���� ���� �ʵ��� ���� �ٸ��� ����, �޼��嵵 �Ȱ��� ���� �޼������� �޸������� �޼���� ȣ���ϸ� ���ÿ��� ���������� �޼��带 ���������� ���� �޾Ƽ� �������� �����ϴµ� �̰� �޸������� ������ ������ �޸𸮼ս��� ���Ƿ� �ƿ� �޼��带 ���ÿ����� �÷������� ����ϸ� ��. Ŭ������ ���� �帧�� ������ �ִ� Ŭ������ ���� ���� ������ �޼ҵ尡 ���ǵǾ� ������ static������ main�� �ְ� Ŭ���������� ���� ���� �޼��尡 �ְ�, ���������� �޼��尡 �־�����Ƿ� �ſ� �ս���. �׷��� �ƿ� �޼��带 Ŭ�������� ��򰡿� �÷������� �̸����� �� �ʿ� ���� �� ���� ���� �����س����� ��.(������ �̷��� ������ Ŭ���������� ���� �κ��� ������), �� ���������� �츮�� �ƴ� ���� ������ ������. ������ �������� ���������� ���� �� �ְ� �׷��Ƿ� ���������� ��������. ��ü�� ��� �޼��尡 ����(Ŭ���������� ����) �ʵ常 �ְ� �ȴ� ����(������). �׷��� �Ǵ� �޼��尡 �����Ǿ Ŭ���������� ������ �ø����ȣ�� ������� �ʴ� ��!
	}
}


public class Ex06 {
	public static void main(String[] args) {
		File file = new File("test03.bin");
		OutputStream os = null;
		ObjectOutputStream oos = null;
		
		try {
			os = new FileOutputStream(file);
			oos = new ObjectOutputStream(os);
			
			Node node = new Node();
			node.val1 = 1111;
			node.func1(2222);
			
			oos.writeObject(node); //java.io.NotSerializableException ��ü ����ȭ
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
