package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
		// 두수 입력 받고 정수로 변환후 더한 다음 결과 출력
		String num1 = JOptionPane.showInputDialog("첫번째 숫자는?");
		String num2 = JOptionPane.showInputDialog("두번째 숫자는?");
		
		int result = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		System.out.println(result);
	}

}
