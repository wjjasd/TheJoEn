package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class input2 {

	public static void main(String[] args) {
		//입력받아서 배열 변수에 저장
		
		Random r = new Random();
		int[]data = new int[100];
		for (int i = 0; i < 100; i++) {
			data[i] = r.nextInt(100);
		}

		int result = data[0] + data[99];
		System.out.println(result);

	}

}
