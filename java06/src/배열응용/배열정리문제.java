package 배열응용;

import javax.swing.JOptionPane;

public class 배열정리문제 {
	public static void main(String[] args) {
		// 1. 10,20,30,40,50을 배열에 넣고 첫번째값과 두번째값을 더해서 print!

		System.out.println("1번----------------------------------");
		int arry[] = { 10, 20, 30, 40, 50 };
		System.out.println("첫번째값 " + arry[0] + " + " + "두번째값 " + arry[1] + " = " + (arry[0] + arry[1]));

		// 2. java spring JSP를 입력받아 배열에 넣기
		System.out.println("");
		System.out.println("2번----------------------------------");
		String[] input = new String[3];
		input[0] = JOptionPane.showInputDialog("java");
		input[1] = JOptionPane.showInputDialog("spring");
		input[2] = JOptionPane.showInputDialog("JSP");

		System.out.println("java : " + input[0]);
		System.out.println("spring : " + input[1]);
		System.out.println("JSP : " + input[2]);

		// 3. 11,22,33,44 배열에 넣고 이중 33 어디있는지 출력
		System.out.println("");
		System.out.println("3번----------------------------------");
		int arry2[] = { 11, 22, 33, 44 };
		int index = 0;
		for (int i = 0; i < arry2.length; i++) {
			if (arry2[i] == 33) {
				index = i;
			}
		}
		System.out.println("33의 위치 : " + (index + 1) + "번째");

		// 4. 5개의 정수를 입력받고 프린트
		System.out.println("");
		System.out.println("4번----------------------------------");
		String[] input2 = new String[5];
		input2[0] = JOptionPane.showInputDialog("1");
		input2[1] = JOptionPane.showInputDialog("2");
		input2[2] = JOptionPane.showInputDialog("3");
		input2[3] = JOptionPane.showInputDialog("4");
		input2[4] = JOptionPane.showInputDialog("5");

		System.out.println("1 : " + input2[0]);
		System.out.println("2 : " + input2[1]);
		System.out.println("3 : " + input2[2]);
		System.out.println("4 : " + input2[3]);
		System.out.println("5 : " + input2[4]);

		// 5. 66,77,88,99 중 최대값 찾기
		System.out.println("");
		System.out.println("5번----------------------------------");
		int arry3[] = { 66, 77, 88, 99 };
		int max = arry3[0];
		for (int i = 0; i < arry3.length; i++) {
			if (max < arry3[i]) {
				max = arry3[i];
			}
		}
		System.out.println("max : " + max);

		// 6. 위 5번에서 66과 99의 위치를 변경
		System.out.println("");
		System.out.println("6번----------------------------------");
		int temp = arry3[0];
		arry3[0] = arry3[3];
		arry3[3] = temp;
		System.out.println("위치 변경후");
		for (int i = 0; i < arry3.length; i++) {
			System.out.println(i + ":" + arry3[i]);
		}

	}
}
