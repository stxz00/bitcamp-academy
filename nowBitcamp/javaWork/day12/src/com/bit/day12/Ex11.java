package com.bit.day12;
//TreeSet
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex11 implements Comparable{
	int val;
	Ex11(int val){
		this.val = val;
	}
	public static void main(String[] args) {
		Set set = new TreeSet();
		// TreeSet�� HashSet���� �ٸ��� Value�� �������� �����Ƿ�
		// Value�� ���� ��ü�� �񱳰� �ȵ�
		Ex11 me = new Ex11(1111);
		Ex11 you = me;
		set.add(me); // ó�� ���� �� ��
		set.add(new Ex11(2222)); 
		//Comparable ĳ���ÿ��� (������ ����ȯ�ؼ� ���ϰ� �ִ� ��)
		//���� ��� ���� �� ������ ������ ���� �ʾ����Ƿ�
		//Comparable ��� �� �������̵� �� ���� �� ������ ������ָ� ��
		set.add(me);
		set.add(new Ex11(2222));
		set.add(you);
		set.add(new Ex11(2222));
		set.add(new Ex11(3333));
		set.add(new Ex11(4444));
		
//		Iterator ite = set.iterator();
//		while(ite.hasNext()) {
//			System.out.println(((Ex11)ite.next()).val);
//		}
	}

	@Override
	public int compareTo(Object o) {
		System.out.println(this.val); //Ȯ�ο�
		
		return ((Ex11)o).val - this.val;
		//0�̸� ����, 1�̳� -1 ���̸� �ٸ��ϱ� ���ϰ��� �� 1�� �����ϸ� �� �ٸ��ٰ� �ν��ϹǷ� �־��� 
		//���ϰ��� ������ ����Ŀ� ���� ���� ��ġ�� ������
	}
}
