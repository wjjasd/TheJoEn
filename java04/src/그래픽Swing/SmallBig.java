package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SmallBig {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		
		FlowLayout fl = new FlowLayout();
		
		//라벨-1
		JLabel laNum1 = new JLabel();
		laNum1.setText("첫번째숫자");
		laNum1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		
		//입력란 첫번째 숫자
		JTextField num1 = new JTextField(7);
		num1.setHorizontalAlignment(SwingConstants.CENTER);
		num1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		
		// 라벨-2
		JLabel laNum2 = new JLabel();
		laNum2.setText("두번째숫자");
		laNum2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		
		//입력란 두번째 숫자
		JTextField num2 = new JTextField(7);
		num2.setHorizontalAlignment(SwingConstants.CENTER);
		num2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		
		//결과 출력 라벨
		JLabel resultLa = new JLabel("결과");
		resultLa.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		
		//비교버튼
		JButton btn = new JButton();
		btn.setText("두 수 비교하기");
		btn.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//textField에서 입력 얻어옴 -> 정수변환후 저장
			int num1Int = Integer.parseInt(num1.getText());	
			int num2Int = Integer.parseInt(num2.getText());	
			int gap; //두 수의 차를 저장할 변수
			//크기판별
			if(num1Int < num2Int) {
				gap = num2Int - num1Int; 
				resultLa.setText("두번째 숫자가 " + gap + "만큼 큼니다");
			}else {
				gap = num1Int - num2Int;
				resultLa.setText("첫번째 숫자가 " + gap + "만큼 큼니다");
			}
				
			}
		});
		
		//프레임 설정 & 띄우기
		f.getContentPane().setLayout(fl);
		f.getContentPane().add(laNum1);
		f.getContentPane().add(num1);
		f.getContentPane().add(laNum2);
		f.getContentPane().add(num2);
		f.getContentPane().add(btn);
		f.getContentPane().add(resultLa);
		f.setSize(500,300);
		f.setVisible(true);

	}

}
