package 연산자;

import javax.swing.JOptionPane;

public class 논리연산자3 {

	public static void main(String[] args) {
		
		String 가입id = "1111";
		String 가입pw = "2222";
		
		String 로그인id = JOptionPane.showInputDialog("id");
		String 로그인pw = JOptionPane.showInputDialog("pw");
		
		if(가입id.equals(로그인id)  && 가입pw.equals(로그인pw)) {
			System.out.println("로그인ok");
		}else {
			System.out.println("로그인not");
		}
		
		
	}

}
