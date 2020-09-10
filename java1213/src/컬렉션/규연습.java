package 컬렉션;

import java.util.LinkedList;

public class 규연습 {

	public static void main(String[] args) {

		LinkedList subject = new LinkedList();
		subject.add("국어");
		subject.add("수학");
		subject.add("영어");
		subject.add("컴퓨터");
		
		System.out.print("시험과목 : ");
		for (int i = 0; i < subject.size(); i++) {
			System.out.print(subject.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		subject.remove();
		System.out.println("----------1일차 시험 종료 후 남은 과목----------");
		for (int i = 0; i < subject.size(); i++) {
			System.out.println(subject.get(i));
		}
		
		subject.remove();
		System.out.println("----------2일차 시험 종료 후 남은 과목----------");
		for (int i = 0; i < subject.size(); i++) {
			System.out.println(subject.get(i));
		}
		
		subject.remove();
		System.out.println("----------3일차 시험 종료 후 남은 과목----------");

		for (int i = 0; i < subject.size(); i++) {
			System.out.println(subject.get(i));
		}
	}

}
