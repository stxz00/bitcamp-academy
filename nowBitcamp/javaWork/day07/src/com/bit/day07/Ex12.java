package com.bit.day07;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		System.out.println("주민번호 체크기(ver 0.2.0)");
		System.out.println("---------------------------");
		
		java.util.Scanner sc;
		sc = new Scanner(System.in);
		// 이영영일영일-삼사오육칠팔구
		// 200101-3234567 -> 1
		// 010101-4234567 -> 20
		// 990101-1234567 -> 22
		// 900201-2234567 -> 31
		char[] src1 = {'0','1','2','3','4','5','6','7','8','9'};
		char[] src2 = {'영','일','이','삼','사','오','육','칠','팔','구'};
		String input;
		boolean boo = true;
		do {
			input = sc.nextLine();
			// 한글 -> 숫자 변환
			char[] arr = input.toCharArray();
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < src2.length; j++) {
					if(arr[i] == src2[j]) {
						arr[i] = src1[j];
					}
				}
			}
			input = new String(arr);
			System.out.println(input);
			if(input.length() == 14 && input.charAt(6) == '-') {
				 
					boolean boo2 = true;
					for(int i = 0; i<input.length(); i++) {
						if(i!=6) {
						char temp = input.charAt(i);
						if(temp < '0' || temp > '9') {boo2 = false;}
						}
					}
					if(boo2) {
						boo = false;
					}else {
						System.out.println("입력이 잘못되었습니다");
					}
				
			}else {
					System.out.println("입력포멧을 다시 확인하세요");
					System.out.println("예시)900201-2234567");
			}
			
		}while(boo);
		
		
		char su7 = input.charAt(7);
		int age = 2020 + 1;
		if(su7 <= '2') {
			age -= 1900;
		}else {
			age -= 2000;
		}
	
		String year = input.substring(0, 2);
		age -= Integer.parseInt(year);
		
		if(su7 == '1' || su7 == '3') {
			su7 = '남';
		}else if(su7 == '2' || su7 == '4') {
			su7 = '여';
		}	
		System.out.println(age + "살 " + su7 + "성입니다");
		
	}
}
