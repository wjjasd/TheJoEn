package java03;

import javax.swing.JOptionPane;

public class Vote {

	public static void main(String[] args) {
		String input;
		int inputInt;
		int iu = 0;
		int lzs = 0;
		int bts = 0;
		while (true) {
			input = JOptionPane.showInputDialog("============================\n" 
												+ "인기투표!\n"
												+ "1. 아이유  2. 유재석  3.방탄  4.종료\n" 
												+ "============================\n");
			inputInt = Integer.parseInt(input);
			switch (inputInt) {
			case 1:
				iu++;
				break;
			case 2:
				lzs++;
				break;
			case 3:
				bts++;
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "투표종료\n" 
												+ "=========결과 ==========\n" 
												+ " 아이유 : " + iu + "\n"
												+ " 유재석 : " + lzs + "\n" 
												+ " 방탄     : " + bts);
				System.exit(0);
			}
		}

	}

}
