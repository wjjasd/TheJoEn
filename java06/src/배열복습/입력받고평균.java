package 배열복습;

import javax.swing.JOptionPane;

public class 입력받고평균 {
	public static void main(String[] args) {
		int[] jumsu = new int[5];
		for (int i = 0; i < 5; i++) {
			String data = JOptionPane.showInputDialog("점수입력");
			jumsu[i] = Integer.parseInt(data);
		}
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
				sum = sum + jumsu[i];
		//i=0	10 		0	 10
		//i=1	30		10	 20
		//i=2	60		30	 30
		//i=3	100		60	 40
		//i=4	150 	100	 50
		}
		System.out.println(sum);
	}

}
