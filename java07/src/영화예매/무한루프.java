package 영화예매;

import java.util.Scanner;

public class 무한루프 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10]; // 좌석마다 예매 상황을 저장할 공간들

		while (true) {
			System.out.println();
			System.out.println();
			System.out.println("----------------------------------------------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print((i+1) + "  ");
			}
			System.out.println();
			System.out.println("----------------------------------------------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print((seat[i]) + "  ");
			}
			System.out.println();
			System.out.println();
			System.out.print("원하는 좌석을 입력하세요 (종료는 -1) >>   ");
			int choice = scan.nextInt() - 1;
			if (choice == -2) {
				int price = 0;
				System.out.println("프로그램 종료!");
				System.out.print("예약된 좌석 : ");
				for(int i = 0; i < seat.length; i++) {
					if(seat[i]==1) {
						price += 10000;
						System.out.print((i+1) + "  ");
					}
				}
				System.out.println();
				System.out.println("총 가격  : " + price);
				
				
				break;
			}
			if(seat[choice] == 1) {
				System.out.println("이미 예약된 좌석입니다 다른 좌석을 선택하세요");
			}else {
				seat[choice] = 1;
			System.out.println("예약완료");
			}
			
		}
	}

}
