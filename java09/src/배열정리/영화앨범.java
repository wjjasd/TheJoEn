package 배열정리;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범 {
	
	static int now = 2;

	public static void main(String[] args) {
		
		String[] titles = {"다만 악에서 구하소서","오케이 마담","테넷","짱구","캐리비안 해적"};
		String[] images = {"daman.jpg","okmadam.jpg","tenet.jpg","jjanggu.jpg","carry.jpg"};
		String[] directors = {"홍원찬","이철하","크리스토퍼 놀란","하시모토","마리트모움"};
		double[] rates = {7.79,6.61,8.63,9.21,4.00};
		

		JFrame frame = new JFrame("열화앨범");
		frame.getContentPane().setBackground(new Color(255, 245, 238));
		frame.setSize(500,500);
		frame.getContentPane().setLayout(null);
		
		JLabel title = new JLabel(titles[2]);
		title.setFont(new Font("굴림", Font.BOLD, 23));
		title.setBounds(72, 10, 354, 60);
		title.setHorizontalAlignment(0);
		frame.getContentPane().add(title);
		
		JLabel img = new JLabel("img label");
		img.setIcon(new ImageIcon("D:\\yangkj\\workspace\\java09\\src\\배열정리\\"+images[2]));
		img.setBounds(208, 80, 218, 318);
		frame.getContentPane().add(img);
		
		JLabel lblNewLabel32 = new JLabel("감독");
		lblNewLabel32.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel32.setBounds(72, 135, 55, 39);
		frame.getContentPane().add(lblNewLabel32);
		
		JLabel director = new JLabel(directors[2]);
		director.setForeground(new Color(205, 92, 92));
		director.setFont(new Font("굴림", Font.PLAIN, 16));
		director.setBounds(72, 169, 130, 39);
		frame.getContentPane().add(director);
		
		JLabel lblNewLabel_2_2 = new JLabel("평점");
		lblNewLabel_2_2.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_2_2.setBounds(72, 241, 55, 39);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel rate = new JLabel(rates[2]+"");
		rate.setForeground(new Color(205, 92, 92));
		rate.setFont(new Font("굴림", Font.PLAIN, 16));
		rate.setBounds(72, 275, 116, 39);
		frame.getContentPane().add(rate);
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now--;
				if(now<0) {
					now = 4;
				}
				title.setText(titles[now]);
				img.setIcon(new ImageIcon("D:\\yangkj\\workspace\\java09\\src\\배열정리\\"+images[now]));
				rate.setText(rates[now]+"");
				director.setText(directors[now]);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton.setBounds(0, 0, 46, 461);
		btnNewButton.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(">");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now++;
				if(now>4) {
					now = 0;
				}
				title.setText(titles[now]);
				img.setIcon(new ImageIcon("D:\\yangkj\\workspace\\java09\\src\\배열정리\\"+images[now]));
				rate.setText(rates[now]+"");
				director.setText(directors[now]);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton_1.setBounds(438, 0, 46, 461);
		btnNewButton_1.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_1);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}
}
