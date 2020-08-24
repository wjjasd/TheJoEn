package java03;

import javax.swing.JOptionPane;

public class 성별판별 {

	public static void main(String[] args) {
		//프로그램 언어로 문자를 char로 받을 수 있는 방법  없음
		String ssn = JOptionPane.showInputDialog("주민번호입력(xxxxxx-xxxxxx)");
		char gender = ssn.charAt(7);
		//위치를 가지고 특정한 문자 한개를 추출하면 됨.
		//위치 = index 0부터 시작함
		
		switch (gender) {
		case '1': case '3':
			System.out.println("남");
			break;
		case '2': case '4':
			System.out.println("여");
			break;
		default:
			System.out.println("올바른 값이 아닙니다");
			break;
		}
		
	}

}
