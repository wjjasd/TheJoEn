package java03;

import javax.swing.JOptionPane;

public class WhileTest {
	public static void main(String[] args) {
		
		//계속반복
		while(true) {
			System.out.println("무한루프");
			String choice = JOptionPane.showInputDialog("계속하실래요? y)yes or n)no)");
			if(choice.equals("n") || choice.equals("no"))  {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
		
		
		//제한된 횟수만큼 반복
//		int i = 0;
//		while(i < 10) {
//			System.out.println("10번 반복");
//			i++;
//		}
	}
}
