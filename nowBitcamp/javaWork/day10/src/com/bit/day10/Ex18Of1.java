package com.bit.day10;

import java.util.Arrays;
import java.util.Random;

class Ball{
	final int number;
	boolean check;
	public Ball(int a){
		number = a;
		check = false;;
	}
	
}


public class Ex18Of1 {
	public static void main(String[] args) {
		
		Ball[] ball = new Ball[45];
		int[] note = new int[6];
		int cnt = 0;
		
		for(int i = 0; i < ball.length; i++) {
			ball[i] = new Ball(i+1);
		}
		
		Random ran = new Random();
		
		while(true) {
			if(cnt == 6) {break;}
			
			int su = ran.nextInt(45);
			Ball in = ball[su];
			if(in.check) {
				continue;
			}else {
				note[cnt] = in.number;
				cnt++;
			}
		}
		int temp = 0;
		for(int i = 0; i < note.length-1; i++) {
			for(int j = i+1; j < note.length; j++) {
				if(note[i] > note[j]) {
					temp = note[i];
					note[i] = note[j];
					note[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(note));
	}
}
