package com.bit.day09;

public class Ex02 {
	public static void main(String[] args) {
		
		//throwable : Error(ó�� �Ұ��� �ý��ۿ���), Exception(ó�� ������ ����)
		//Exception : IOException(����¿���), RuntimeException(���࿹��)
		//IOException : FileNotFoundException, SocketException
		//RuntimeException : ArithmeticException, ArrayIndexOutOfBoundsException
		
		int[] arr = {-2,-1,0,1,2};
		int su = 10;
		for(int i = 0; i < arr.length; i++) {
			
			try {
				su = 1/arr[i];
				// i=2�϶� su ���� �������� �ʱ� ������ ���� i=1�� ���� ���� ����
			}catch(ArithmeticException e) {
				// ArithmeticException : 0�϶� ����
			}
		System.out.println(su);	 
		// Ʈ����ĳġ ��ġ�� ���� ��µǴ� ������ ������ �ٸ�

		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			
			try {
				su = 1/arr[i];
				
			}catch(Exception e) {
				// ���� �ֻ��� Ŭ���� Exception���� ó��
			}
		System.out.println(su);	 
		

		}
		
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			
			try {
				su = 1/arr[i];
				
			}catch(RuntimeException e) {
				// ��������̹Ƿ� ArithmeticException�� ���� Ŭ������ ��Ÿ�� ������ ó�� 
			}
		System.out.println(su);	 
		}
		
		// ���� Ʈ����ĳġ
		System.out.println();
		for(int i = 0; i < 6; i++) {
			su = 0;
			try {
			try {
				su = 1/arr[i];
				
			}catch(RuntimeException e) {
				// ��������̹Ƿ� ArithmeticException�� ���� Ŭ������ ��Ÿ�� ������ ó�� 
			}}catch(ArithmeticException e) {
				
			}
		System.out.println(su);	 
		}
		
		// ���� ĳġ
		// ���� : ó���� Exception�� ���� ����Ŭ������ ���ܰ� ���� ���� ĳġ�� ������ �ʿ䰡 �����Ƿ� �ݴ�� ���� ĳġ���� ���� ĳġ ������ �ϸ� ��. ->�ƴϸ� ���� Ʈ����ĳġ�� �����ϸ� �ٲٸ� ��
		System.out.println();
		for(int i = 0; i < 6; i++) {
			su = 0;
			
			try {
				su = 1/arr[i];
			}catch(ArithmeticException e) {
				su -= 100;
				// ��������̹Ƿ� ArithmeticException�� ���� Ŭ������ ��Ÿ�� ������ ó�� 
			}catch(ArrayIndexOutOfBoundsException e) {
				su = 100;
			
				System.out.println(e.toString()); //�ݵ�� ���� ������ ���� ���ڿ� ���
				System.out.println(e.getMessage()); //�ݵ�� ���� ������ ���� ��� 
				System.out.println(e.getLocalizedMessage()); // �ݵ�� ���� ������ �� ����
				e.printStackTrace(); //�����޼��� ���
				//�ڡڡڡڡڡ�System.out.println()�� �ݵ�� �� ������ ������ ������ ����ϰ� �Ѿ���ϴ� ��ǻ�Ͱ� ������ ���� �� ����ϴ� e.printStackTrace();�� ����ϴ� �� ����(�����޼����� ��Ƶ״ٰ� ��ǻ�Ͱ� ���� �ְų� ���� �ð��� ������ְų� �� �������� ������ִ� �� ����) ��� ����� �� ��ǻ�Ͱ� ���� �ð��� ���� �� (IO�� ���� ���� ����� �� ������ ��ٸ��ϱ�) �ݵ�� �� �� ������ ����ؾ��Ѵ� �ϸ� System.out.println(e.toString()); ������ ����...�ڡڡڡڡڡ�
				System.out.println("-----����-----");
				StackTraceElement[] trace = e.getStackTrace();
				//e.getStackTrace(); ���ù������ �� ����
				for(int j = 0; j < trace.length; j++) {
					System.out.println(trace[j].toString());
				}
				// ���ϰ� ���� ���� ���, ������ �ϳ������� �迭�� �����, ���� ���� �迭�� ���� �� ���, �̴� �����, �� �ʿ�� ����.
			}catch(Exception e) {
				System.out.println("�𸣴� ������ �߻��߾���");
				
			}
			System.out.println(su);	 
		}
		
		//�ֻ��� Exception���θ� �������� �ʴ� ������ �� �������� �����ս��� �ٷ� �� �ֱ� ����
		
	}
}
