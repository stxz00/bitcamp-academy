package ncstest01;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Student{
	int kor,eng,math,total,average;
	String name;
	
	@Override
	public String toString() {
		return "이름 : " + name +"\n국어 : " + kor + " 영어 : " + eng + " 수학 : " + math + "\n" + "총점 : " + total +"\n평균 : " + average;
	}
}

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeMap<Integer, Student> data = new TreeMap<Integer, Student>();
		
		System.out.println("학생 성적 프로그램 이해남 만듬 ver");
		System.out.println("=====================================");
		
		String main = ("1.전체 2.상세 3.입력 4.수정 5.삭제 0.종료 \n>");
	
		
		while(true) {
			System.out.print(main);
			int num = sc.nextInt();
			
			if(num == 0) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}else if(num==1) {
				//보기
				if(data.size() == 0) {
					System.out.println("먼저 학번을 추가하시길 바랍니다");
				}
				Set keys = data.keySet();
				Iterator<Integer> ite = keys.iterator();
				while(ite.hasNext()) {
					int su = ite.next();
					Student stu = data.get(su);
					System.out.print("학번 : " + su + " " + stu.toString());
					System.out.println("\n-------------------------------------");
				}
			}else if(num==2) {
				if(data.size() == 0) {
					System.out.println("먼저 학번을 추가하시길 바랍니다");
				}else {
					System.out.print("조회할 학번을 입력하세요\n>>");
					int su = sc.nextInt();
					if(data.get(su)==null) {
						System.out.println("존재하지 않는 학번입니다");
					}else {
						System.out.println("학번 : " + su + " " + data.get(su).toString());
					}
				}
			}else if(num==3) {
			
				//추가
				System.out.print("추가할 학번을 입력하세요\n>>");
				int su = sc.nextInt();
				if(data.get(su)==null) {
					Student stu = new Student();
					System.out.print("이름을 입력하세요\n>>");
					sc.nextLine();
					stu.name = sc.nextLine();
					System.out.print("국어 점수를 입력하세요\n>>");
					stu.kor = sc.nextInt();
					System.out.print("영어 점수를 입력하세요\n>>");
					stu.eng = sc.nextInt();
					System.out.print("수학 점수를 입력하세요\n>>");
					stu.math = sc.nextInt();
					stu.total = stu.kor + stu.eng + stu.math;
					stu.average = (int)(stu.total/3);
					data.put(su,stu);			
				}else {
					System.out.println("이미 존재하는 학번입니다");
				}
			}else if(num==4) {
				//수정
				System.out.print("수정할 학번을 입력하세요\n>>");
				int su = sc.nextInt();
				if(data.get(su)==null) {
					System.out.println("존재하지 않는 학번입니다.");
				}else {
					Student stu = new Student();
					stu.name = data.get(su).name;
					System.out.print("국어 점수를 입력하세요\n>>");
					stu.kor = sc.nextInt();
					System.out.print("영어 점수를 입력하세요\n>>");
					stu.eng = sc.nextInt();
					System.out.print("수학 점수를 입력하세요\n>>");
					stu.math = sc.nextInt();
					stu.total = stu.kor + stu.eng + stu.math;
					stu.average = (int)(stu.total/3);
					data.put(su,stu);
				}
				
			}else if(num==5) {
				//삭제
				System.out.print("삭제할 학번을 입력하세요\n>>");
				int su = sc.nextInt();
				if(data.get(su)==null) {
					System.out.println("존재하지 않는 학번입니다.");
				}else {
					data.remove(su);
				}
				
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
			}
			
		}
		
		
	}
}
