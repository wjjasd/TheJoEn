package 기본입출력;

import javax.swing.JOptionPane;

public class 다이얼로그 {

	public static void main(String[] args) {
//		String name = JOptionPane.showInputDialog("당신의 이름은?");
//		String age = JOptionPane.showInputDialog("당신의 나이는");
		String hour = JOptionPane.showInputDialog("지금 몇시?");
		JOptionPane.showMessageDialog(null, hour + " 시입니다.","현재시각", JOptionPane.PLAIN_MESSAGE);
		
		int hour2 = Integer.parseInt(hour);
		
		if (hour2 < 16) {
			JOptionPane.showMessageDialog(null,"아직멀었다","집에가려면",JOptionPane.PLAIN_MESSAGE);
			
		} else {
			JOptionPane.showMessageDialog(null,"얼마안남았다","집에가려면",JOptionPane.PLAIN_MESSAGE);
		}
		
	}

}
