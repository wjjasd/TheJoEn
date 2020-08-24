package 그래픽Swing;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AdultCheck {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		
		FlowLayout fl = new FlowLayout();
		fl.setAlignment(FlowLayout.CENTER);
		
		// 성명 라벨
		JLabel laName = new JLabel();
		laName.setText("성명: ");
		laName.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		// 성명 입력
		JTextField name = new JTextField(7);
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		
		// 생년월일 라벨
		JLabel la = new JLabel();
		la.setText("출생년도 형식(2020) : ");
		la.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		// 생년월일 입력
		JTextField birth = new JTextField(7);
		birth.setHorizontalAlignment(SwingConstants.CENTER);
		birth.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		
		// 결과 라벨
		JLabel resultLa = new JLabel();
		resultLa.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		// 버튼
		JButton btn = new JButton();
		btn.setText("성인 판별");
		btn.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				//성명, 생년월일 textField 값 얻어오기		
				String nameStr = name.getText();
				String input = birth.getText();
				int age = 2020 - Integer.parseInt(input);
			
				if( age > 18 ) { //18세 이상  == 성인
					resultLa.setText(nameStr+": "+"성인입니다");
				}else {
					resultLa.setText(nameStr+": "+"미성년입니다");
				}
				
			}
		});	
		//프레임 설정	
		f.getContentPane().setLayout(fl);
		f.getContentPane().add(la);
		f.getContentPane().add(birth);
		f.getContentPane().add(laName);
		f.getContentPane().add(name);
		f.getContentPane().add(btn);
		f.getContentPane().add(resultLa);
		f.setSize(260,400);
		f.setVisible(true);
	}

}
