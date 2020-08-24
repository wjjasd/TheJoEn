package java03;

import javax.swing.JOptionPane;

public class 부서판별 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("사원번호입력(AXX)");
		char depId = id.charAt(0);
		String num = id.substring(1);
		String dep = "";
		
		switch (depId) {
		case 'A':
			dep = "기획";
			break;
		case 'B':
			dep = "총무";
			break;
		case 'C':
			dep = "개발";
			break;

		default:
			dep = "부서없음";
			break;
		}
		
		System.out.println("사원번호 : " + num);
		System.out.println("부      서 : " + dep);
	}

}
