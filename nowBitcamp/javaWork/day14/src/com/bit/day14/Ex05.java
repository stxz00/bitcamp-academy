package com.bit.day14;

import java.io.File;

public class Ex05 {
	public static void main(String[] args) {
		String path = "test03";
		File file = new File(path);
		String[] chileds = file.list();
		try {
		for(int i = 0; i< chileds.length; i++) {
			File child = new File(path+"\\"+chileds[i]);
			child.delete();
			
		}
		}catch(NullPointerException e){}
		
		if(file.delete()) {
			System.out.println("�����Ϸ�");
		}else {
			System.out.println("������ ����� �������� �ʽ��ϴ�");
		}
		// ������ ������ ������ �� ����
		// ���丮�� �����̳� �����̴ϱ� ������ �̸��� ���� �Ǹ� ������ �� � ���� ���������� ��.
		// �ٵ� ���ﶧ ���� ������ ���� �̴� Ȯ������ �������� ���� ��
		// ���� ���͸� �Ǵ� ���� test05�� �̹� �ִٰ� �ϸ� �������� ����
		// test05 �ȿ��� rmdir et01�� ����� �����ϸ� ������
		
		//�����ϸ� ���� ���� ���ϵ��� ���� ����� ���� ������ ����� ��
		
	}
}
