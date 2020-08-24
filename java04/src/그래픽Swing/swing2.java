package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class swing2 {

	public static void main(String[] args) {

		//프레임
		JFrame f = new JFrame();
		FlowLayout fl = new FlowLayout();
		f.getContentPane().setLayout(fl);
		
		JButton sprBtn = new JButton();
		sprBtn.setForeground(Color.BLUE);
		sprBtn.setBackground(Color.ORANGE);
		sprBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "선선해요");
			}
		});
		sprBtn.setFont(new Font("궁서", Font.BOLD, 90));
		
		sprBtn.setText("봄");
	
		
		f.getContentPane().add(sprBtn);
		JButton sumBtn = new JButton();
		sumBtn.setBackground(Color.PINK);
		sumBtn.setForeground(new Color(0, 100, 0));
		sumBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "더워요");
			}
		});
		sumBtn.setFont(new Font("궁서", Font.BOLD, 90));
		sumBtn.setText("여름");
		f.getContentPane().add(sumBtn);
		
		f.setSize(300,300);
		f.setVisible(true);
		

	}

}
