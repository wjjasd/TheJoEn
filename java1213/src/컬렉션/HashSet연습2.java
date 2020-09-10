package 컬렉션;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet연습2 {

	public static void main(String[] args) {

		// 여행을 가려함.
		// 한 번 다녀온 곳은 가지 않음.
		// 가고싶은곳 : 유럽,일본,필리핀,캐나다,미국

		HashSet loc = new HashSet();
		loc.add("유럽");
		loc.add("일본");
		loc.add("필리핀");
		loc.add("캐나다");
		loc.add("미국");

		System.out.println("다녀온 여행지");
		System.out.println(loc);
		System.out.println();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("가고싶은 여행지를 입력하세요");
			String des = sc.next();
			if (loc.contains(des)) {
				System.out.println("다녀온 여행지입니다");
			} else {
				System.out.println("다음 여행지 : " + des);
				break;
			}
		}

	}

}
