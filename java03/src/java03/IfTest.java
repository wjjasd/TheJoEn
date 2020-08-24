package java03;

import javax.swing.JOptionPane;

public class IfTest {

	public static void main(String[] args) {

//		1번
//		int ok = 0, no = 0, etc = 0;
//		String userInput;
//
//		while (true) {
//			userInput = JOptionPane.showInputDialog("긍정 -> ok  부정 -> no  종료 -> end ");
//			if (userInput.equals("ok")) {
//				ok++;
//			} else if (userInput.equals("no")) {
//				no++;
//			} else if (userInput.equals("end")) {
//				System.out.println("ok : " + ok);
//				System.out.println("no : " + no);
//				System.out.println("기타 : " + etc);
//				System.exit(0);
//			} else {
//				etc++;
//			}
//		}

//		2번
//		String userInput;
//		while (true) {
//			userInput = JOptionPane.showInputDialog("정답을 입력하시오");
//			if (userInput.equals("88")) {
//				JOptionPane.showMessageDialog(null, "정답!");
//				System.exit(0);
//			} else {
//				JOptionPane.showMessageDialog(null, "오답!");
//			}
//		}

//		3번
		String userInput;
		int inputInt;
		int count = 0; //전체횟수
		while (true) {
			userInput = JOptionPane.showInputDialog("정답을 입력하시오");
			inputInt = Integer.parseInt(userInput);
			if (inputInt == 88) {//정답
				JOptionPane.showMessageDialog(null, "정답! (" + (count + 1) + "번 만에 정답)");
				System.exit(0);
			} else {//오답
				if (inputInt < 88) {//정답보다 작다
					JOptionPane.showMessageDialog(null, "정답보다 작습니다!");
					count++;
				} else {//정답보다 크다
					JOptionPane.showMessageDialog(null, "정답보다 큽니다!");
					count++;
				}
			}//오답

		}//while

	}//main

}//class
