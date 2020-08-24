package java03;

import javax.swing.JOptionPane;

public class Q1 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		char operator;
		int result = 0;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("첫번째 정수입력"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("두번째 정수입력"));
		String input = JOptionPane.showInputDialog("연산자입력 (+,-,*,/,%)");
		operator = input.charAt(0);

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;

		default:
			JOptionPane.showMessageDialog(null, "올바른 값이 아닙니다.");
			break;
		}

		JOptionPane.showMessageDialog(null, "결과 : " + result);

	}

}
