package 그래픽Swing;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽 {

	public static void main(String[] args) {

		JFrame fr = new JFrame();
		
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fr, "btn1");
			}
		});
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fr, "btn2");
			}
		});
		JButton b3 = new JButton();
		ImageIcon img = new ImageIcon("sky.png");
		
		b1.setText("btn1");
		b2.setText("btn2");
		b3.setIcon(img);
		
		fr.add(b1);
		fr.add(b2);
		fr.add(b3);
		
		fr.setSize(500,500);
		
		FlowLayout flow =  new FlowLayout();
		fr.setLayout(flow);
		
		fr.setVisible(true);

	}

}
