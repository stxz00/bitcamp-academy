package com.biy.day13;

class Game{
	int su = 100;
}

class Dunfa extends Game{
	int su = 1000;
}

class Maple extends Game{
	int su = 500;
}

class Steam{
	
	static int play(TwoD<? extends Game> o) {
		// ���⼭ �׳� <Game>�� ���� ���� TwoD���� Game������ �ߴµ� Game�� �ƿ� ������ ��Ȳ�̴� Game ����Ŭ�������� �ü��� ����.
		// �׷��� ���ϵ�ī��� ����Ŭ������ �����Ͽ� �ü��� �ְ� ��
		// �� �̰͵� ������ static int play(TwoD<? extends Oject> o) {
		// TwoD���� Game�� ���������ϱ� �̹� Game�� �� ���� Ŭ�������� �ҷ��� �� �ִ� ��Ȳ�̴ϱ� �� ������ �ʿ䰡 �����Ƿ� Object�� �����ص� ����!	
		//�׳� TWoD�� ���׸���� �����ϰ� ���� �� �׳� ���� �����ϱ� ? extends Game�̳� Object ���ٰ� �����ϸ� �ɵ�
		int su = 50000;
		return su;
	}
	
	//���� �Ʒ� �޼���� ����
	
	static <T extends Game> int play2(TwoD<T> o) {
		int su = 0;
		return su;
	}
	//����ο� ���Ӱ� ����Ŭ������ ���������� ���� ����̳� �������� ���� <T>�� ������ ������ <Object>�� ������ TwoD���� �̹� Game�� ���� Ŭ�������� ������ �� ��Ȳ���� ��ü�ϱ� Game�� ����Ŭ���� �׳� �Ȱ��� ���� ��.
	//�� ������ <T>Box<T>�� ���� Ÿ���� ��ü�� ��� �װ��� ��Ȳ�� ���� �ٸ��� �� �����ؼ� ����ϱ�
	
	static <T extends Game> int play3(TwoD<? extends Game> o) {
		//�Ķ���Ϳ��� <T extends Game>�� �����ϸ� TwoD<Game>���� Game�� ������ ������ ������ ����Ƿ� X
		int su = 0;
		return su;
	}
	
	static int play4(TwoD<?> o) {
		//<T>�� �ٸ� �� ����
		int su = 0;
		return su;
	}
	
}

class TwoD<Game>{}

//class TowD<T extends Game>{} �� �� ���⼭�� ���� ��������� �� Ŭ���� ���ο��� ����� �� T��� ª�� ����
//class TwoD2<? extends Game>{}
//ó������ ���ϵ�ī�尡 �ȵǴ°� �����غ��� �׳� Game�̳� T extends���� �Ǵµ� ���� �׷� �ʿ䰡 �����ϱ� ������ �� ��(�׷��� �̸� �޼��忡���� ����ϴ� ����)




public class MyExercise {
	public static void main(String[] args) {
		

		TwoD<Maple> m = new TwoD<Maple>();
		
		TwoD<Game> g = new TwoD<Game>();
		
		System.out.println(Steam.play(m));
		
		System.out.println(Steam.play(g)+1);
		
		System.out.println(Steam.play2(m));
		
		System.out.println(Steam.play2(g));
		
		System.out.println(Steam.play3(m));
		
		System.out.println(Steam.play3(g));
		
		
	}
}
