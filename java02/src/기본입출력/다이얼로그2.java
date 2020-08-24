package 기본입출력;

import javax.swing.JOptionPane;

public class 다이얼로그2 {

	public static void main(String[] args) {
//		1번
//		String num1 = JOptionPane.showInputDialog("첫번째 숫자를 입력하세요");
//		String num2 = JOptionPane.showInputDialog("두번째 숫자를 입력하세요");
//		
//		int num1_1 = Integer.parseInt(num1);
//		int num2_1 = Integer.parseInt(num2);
//		
//		System.out.println("두수의합 : " + (num1_1 + num2_1));
//		System.out.println("두수의차 : " + (num1_1 - num2_1));
//		System.out.println("두수의곱 : " + (num1_1 * num2_1));
//		System.out.println("첫번째를 두번째수로 나눔 : " + (num1_1 / num2_1));
//		System.out.println("첫번째를 두번째로 나눈 나머지 : " + (num1_1 % num2_1));

//		2번
		String num1 = JOptionPane.showInputDialog("몇부터 찍을까");
		String num2 = JOptionPane.showInputDialog("숫자 몇까지 찍을까");
		int num1_1 = Integer.parseInt(num1);
		int num2_1 = Integer.parseInt(num2);
		if(num1_1 < num2_1) {
			for(int i = num1_1;i<num2_1+1;i++) {
				System.out.println(i);
			}
		}else {
			JOptionPane.showMessageDialog(null, "첫번째 수가 두번째 수보다 작아야 합니다");
		}

//		3번
//		String num1 = JOptionPane.showInputDialog("어떤 문자열을 찍을까");
//		String num2 = JOptionPane.showInputDialog("몇번 찍을까");
//		
//		int num2_1 = Integer.parseInt(num2);
//		for(int i = 0; i < num2_1; i++) {
//			System.out.print(num1);
//		}

	}

}
