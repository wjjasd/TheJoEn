package stackq;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {

		ArrayList<Integer> stack = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("스택용량 입력 >> ");
		int capa = sc.nextInt();
		int cursor = 0;

		while (true) {
			System.out.println();
			System.out.println("============================================================================================");
			System.out.println("1: push  2: pop  3: indexOf  4: clear  5: size  6: isEmpty  7: isFull  8: toString  9: exit");
			System.out.println();
			int method = sc.nextInt();
			switch (method) {
			case 1:
				if (cursor >= capa) {
					System.out.println("용량초과");
					System.out.println();
					break;
				} else {
					System.out.print("push할 정수 >>");
					stack.add(sc.nextInt());
					System.out.println(stack.get(cursor) + " push 함");
					System.out.println();
					cursor++;
					break;
				}

			case 2:
				if (cursor <= 0) {
					System.out.println("꺼낼 데이터 없음");
					break;
				} else {
					System.out.println("pop : " + stack.get(cursor - 1));
					System.out.println();
					stack.remove(cursor - 1);
					cursor--;
					break;
				}

			case 3:
				if (stack.size() == 0) {
					System.out.println("스택에 데이터 없음");
					break;
				} else {
					System.out.print("찾을 정수 입력 >>");
					int input = sc.nextInt();
					for (int i = 0; i < stack.size(); i++) {
						if (input == stack.get(i)) {
							System.out.println(input + "의 위치 : " + i);
						}
					}
					break;
				}

			case 4:
				stack.clear();
				cursor = 0;
				System.out.println("clear 완료");
				break;

			case 5:
				System.out.println("데이터의 개수: " + (cursor));
				break;

			case 6:
				if (stack.size() == 0) {
					System.out.println("비어있음");
					break;
				} else {
					System.out.println("비어있지 않음");
					break;
				}

			case 7:
				if (cursor == capa) {
					System.out.println("꽉참");
					break;
				} else {
					System.out.println("공간있음");
					break;
				}

			case 8:
				if (stack.size() == 0) {
					System.out.println("없음");
					break;
				} else {
					System.out.println("바닥->꼭대기");
					for (Integer i : stack) {
						System.out.print(i + " ");
					}
					System.out.println();
					break;
				}

			case 9:
				System.out.println("종료.");
				System.exit(0);
			}
		}

	}

}
