package com.bit.day11;

class MyArray{
	private Object[] data = new Object[0];
	private int cnt;
	
	int size() {
		return cnt;
	}
	
	Object get(int idx) {
		return data[idx];
	}
	
	void add(Object su){
		Object[] temp = new Object[data.length+1]; 
		//������ ����
//		for(int i = 0; i <data.length; i++) {
//			temp[i] = data[i];
//		}
		System.arraycopy(data, 0, temp, 0, data.length);
		//�ű԰� �߰�
		temp[cnt++] = su;
		data = temp;
	}
	void set(int idx, int su) {
		data[idx] = su;
	}
	
	void remove(int idx) {
		cnt--;
		Object[] temp = new Object[data.length-1];
		// copy before index;
		System.arraycopy(data, 0, temp, 0, idx);
		// copy after index;
		System.arraycopy(data, idx+1, temp, idx, data.length-idx-1);
		// data.length-idx-1;
		data = temp;
	}
	
}

public class Ex13 {
	public static void main(String[] args) {
		MyArray arr = new MyArray();
		arr.add("ù��°");
		arr.add("�ι�°");
		arr.add("����°");
		arr.add("�׹�°");
		
		arr.set(2,5555);
		arr.remove(2);
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
//		java.util.ArrayList arr1 = new java.util.ArrayList();
	}
}
