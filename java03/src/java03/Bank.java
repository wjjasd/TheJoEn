package java03;

import javax.swing.JOptionPane;

public class Bank {

	public static void main(String[] args) {

		int money = 0; //잔고
		String userInputMoney; //입력금액
		int intInputMoney;	//입력금액 정수형

		String mess = "------------------------------------\n" + "은행입출금 시스템\n"
				+ "------------------------------------\n" + "1)입금 2)출금 3)잔고 4)종료\n" + "  ";

		while (true) {
			String input = JOptionPane.showInputDialog(mess);
			int intInput = Integer.parseInt(input);
			// 종료
			if (intInput == 4) {
				JOptionPane.showMessageDialog(null, "시스템을 종료합니다");
				System.exit(0);
			// 입금
			} else if (intInput == 1) {
				userInputMoney = JOptionPane.showInputDialog("금액을 입력하시오");
				intInputMoney = Integer.parseInt(userInputMoney);
				money += intInputMoney;
				JOptionPane.showMessageDialog(null, "잔고: " + money);
			// 출금
			} else if (intInput == 2) {
				userInputMoney = JOptionPane.showInputDialog("금액을 입력하시오");
				intInputMoney = Integer.parseInt(userInputMoney);
				//입력한 출금액이 잔고보다 크면 잔고부족
				if(intInputMoney > money) {
					JOptionPane.showMessageDialog(null, "잔고가 부족합니다");
				}else {
					money -= intInputMoney;
					JOptionPane.showMessageDialog(null, "잔고: " + money);
				}
				
			// 잔고확인
			} else if (intInput == 3) {
				JOptionPane.showMessageDialog(null, "잔고: " + money);
			}

		}

	}

}
