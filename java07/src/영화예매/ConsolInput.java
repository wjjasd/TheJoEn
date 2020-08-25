package 영화예매;

import java.util.Scanner;

public class ConsolInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("이름입력 >> ");
		String x = scan.next(); // 단어 하나 스캔
		System.out.println("이름 : " + x);

		System.out.print("나이입력 >> ");
		int y = scan.nextInt();
		System.out.println("내년 나이 : " + (y + 1));

		System.out.print("키입력 >> ");
		int z = scan.nextInt();
		System.out.println("내년 키 : " + (z + 20));

		System.out.print("밖에 비가 오는가 >> ");
		boolean h = scan.nextBoolean();
		if (h) {
			System.out.println("우산 챙겨야함");
		} else {
			System.out.println("우산 두고가도됨");
		}

		System.out.print("당신의 목표는?");
		 scan.nextLine();
		String life = scan.nextLine();
		System.out.println("목표" + life);
	}

}
