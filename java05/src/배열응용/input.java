package 배열응용;

import javax.swing.JOptionPane;

public class input {

	public static void main(String[] args) {
		//입력받아서 배열 변수에 저장
		
		String[] data = new String[3];
		for (int i = 0; i < 3; i++) {
			data[i] = JOptionPane.showInputDialog("저장할 데이터를 입력하시오.");
		}
		
		for(String s : data) {
			System.out.println(s);
		}

	}

}
