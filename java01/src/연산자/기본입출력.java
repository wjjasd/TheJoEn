package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) {
		
		// 파일이름 대문자시작 낙타 표기 예: MyClass
		// 변수명 소문자 시작 낙타 표기 예: myVar
		// 상수는 대문자로만 표기

		// 키보드로 입력한 값은 무조건 String! (계산하기위해 정수로 변환해야함)
		String name = JOptionPane.showInputDialog("당신의 이름은?");
		String age = JOptionPane.showInputDialog("당신의 나이는");
		System.out.println("당신의 이름은: " + name);
		System.out.println("당신의 나이는: " + age);

		//입력받는 나이값 문자열에서 정수로 변환
		int ageInt = Integer.parseInt(age);
		//작년나이 계산
		int lastAge = ageInt - 1;
		//출력
		System.out.println("당신의 작년나이는: " + lastAge);
	}

}
