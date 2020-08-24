package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;

public class 마이윈도우2 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(500,500);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("버튼안눌림");
		textPane.setFont(new Font("굴림", Font.PLAIN, 35));
		textPane.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(textPane, BorderLayout.CENTER);
		f.setVisible(true);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textPane.setText("버튼눌림");
				JOptionPane.showMessageDialog(f, "test");
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.EAST);
		
		JMenuBar menuBar = new JMenuBar();
		f.setJMenuBar(menuBar);
		
		JButton btnNewButton_1 = new JButton("New button");
		menuBar.add(btnNewButton_1);
		
		
	}

}
