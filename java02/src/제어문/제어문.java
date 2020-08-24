package 제어문;

import javax.swing.JOptionPane;

public class 제어문 {

	public static void main(String[] args) {
		String food = JOptionPane.showInputDialog("먹고싶은 음식은?");
		String result;
		
		if(food.equals("아이스크림")) {
			result = "뚜레주르 ㄱㄱ";
		}else if (food.equals("아이스커피")) {
			result = "이디아ㄱㄱ";
		}else {
			result = "물마시자!";
		}
		System.out.println(result);
	}

}
