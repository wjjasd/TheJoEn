package 배열정리;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;

public class 주문프로그램 {

	static int now;
	static String[] imgs = { "jajang.png", "jambong.png", "wudong.png" };
	static int[] price = { 5000, 4000, 4500 };
	static int priceSum;
	static int countAll;
	static int countJajang;
	static int countJambong;
	static int countWudong;


	public static void main(String[] args) {

		priceSum = 0;
		now = 0;
		countAll = 0;
		countJajang = 0;
		countJambong = 0;
		countWudong = 0;


		JFrame fr = new JFrame();
		fr.getContentPane().setBackground(new Color(240, 128, 128));
		fr.setSize(800, 600);
		fr.getContentPane().setLayout(null);

		JLabel foodImg = new JLabel("img");
		foodImg.setIcon(new ImageIcon(imgs[now]));
		foodImg.setBounds(292, 125, 439, 310);
		fr.getContentPane().add(foodImg);

		JLabel sumLb = new JLabel("결재금액 : " + priceSum);
		sumLb.setFont(new Font("굴림", Font.BOLD, 18));
		sumLb.setBounds(22, 391, 203, 62);
		fr.getContentPane().add(sumLb);

		JLabel countLb = new JLabel("총 수량 : " + countAll);
		countLb.setFont(new Font("굴림", Font.BOLD, 18));
		countLb.setBounds(22, 319, 203, 62);
		fr.getContentPane().add(countLb);

		JLabel lblNewLabel_2 = new JLabel("원하는 메뉴버튼 클릭");
		lblNewLabel_2.setBounds(287, 10, 444, 39);

		fr.getContentPane().add(lblNewLabel_2);

		JPanel panel = new JPanel();
		panel.setBounds(12, 111, 213, 198);
		fr.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("선택하신 메뉴");
		lblNewLabel.setBounds(51, 5, 104, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("짜장 x");
		lblNewLabel_1.setBounds(12, 43, 44, 36);
		panel.add(lblNewLabel_1);
		
		JLabel jajangLb = new JLabel("0");
		jajangLb.setBounds(64, 43, 137, 36);
		panel.add(jajangLb);
		
		JLabel lblNewLabel_1_1 = new JLabel("짬뽕 x");
		lblNewLabel_1_1.setBounds(12, 89, 44, 36);
		panel.add(lblNewLabel_1_1);
		
		JLabel jambongLb = new JLabel("0");
		jambongLb.setBounds(64, 89, 137, 36);
		panel.add(jambongLb);
		
		JLabel lblNewLabel_1_2 = new JLabel("우동 x");
		lblNewLabel_1_2.setBounds(12, 135, 44, 36);
		panel.add(lblNewLabel_1_2);
		
		JLabel wudongLb = new JLabel("0");
		wudongLb.setBounds(64, 135, 137, 36);
		panel.add(wudongLb);

		JButton btnNewButton = new JButton("결재하기");
		btnNewButton.setBounds(22, 464, 203, 44);

		JButton jajang = new JButton("짜장");
		jajang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now = 0;
				countJajang++;
				jajangLb.setText(countJajang+"    "+(countJajang*price[now])+"원");
				countAll++;
				countLb.setText("총 수량 : " + countAll + "개");
				priceSum = countAll * price[now];
				sumLb.setText("결재금액 : " + priceSum + "원");
				foodImg.setIcon(new ImageIcon(imgs[now]));
			}
		});
		jajang.setBounds(292, 59, 105, 56);
		fr.getContentPane().add(jajang);

		JButton jambong = new JButton("짬뽕");
		jambong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now = 1;
				countAll++;
				countJambong++;
				jambongLb.setText(countJambong+"    "+(countJambong*price[now])+"원");
				countLb.setText("총 수량 : " + countAll + "개");
				priceSum = countAll * price[now];
				sumLb.setText("결재금액 : " + priceSum + "원");
				foodImg.setIcon(new ImageIcon(imgs[now]));
			}
		});
		jambong.setBounds(457, 59, 105, 56);
		fr.getContentPane().add(jambong);

		JButton wudong = new JButton("우동");
		wudong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now = 2;
				countAll++;
				countWudong++;
				wudongLb.setText(countWudong+"    "+(countWudong*price[now])+"원");
				countLb.setText("총 수량 : " + countAll + "개");
				priceSum = countAll * price[now];
				sumLb.setText("결재금액 : " + priceSum + "원");
				foodImg.setIcon(new ImageIcon(imgs[now]));
			}
		});
		wudong.setBounds(626, 59, 105, 56);
		fr.getContentPane().add(wudong);

		fr.getContentPane().add(btnNewButton);
		fr.setVisible(true);

	}
}
