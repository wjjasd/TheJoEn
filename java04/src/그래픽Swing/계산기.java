package 그래픽Swing;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 계산기 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		ImageIcon img = new ImageIcon("cal.png");
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel result = new JLabel();
		JTextField t1 = new JTextField(6);
		JTextField t2 = new JTextField(6);
		FlowLayout fl = new FlowLayout();

		l1.setIcon(img);
		l2.setFont(new Font("맑은 고딕", Font.BOLD, 70));
		l2.setText("숫자1");

		l3.setFont(new Font("맑은 고딕", Font.BOLD, 70));
		l3.setText("숫자2");

		result.setFont(new Font("맑은 고딕", Font.BOLD, 50));

		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("굴림", Font.PLAIN, 64));
		t1.setBackground(Color.YELLOW);

		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setFont(new Font("굴림", Font.PLAIN, 64));
		t2.setBackground(Color.YELLOW);
		JButton plus = new JButton();

		plus.setFont(new Font("굴림", Font.PLAIN, 60));
		plus.setText("+");
		plus.setBackground(Color.BLUE);
		plus.setForeground(Color.RED);
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(t1.getText());
				int num2 = Integer.parseInt(t2.getText());
				int sum = num1 + num2;

				result.setText(num1 + " + " + num2 + " = " + sum);

//				JOptionPane.showMessageDialog(f, num1 + " + " + num2 + " = " + sum);
			}
		});
		f.getContentPane().add(plus);
		f.getContentPane().add(plus);
		f.getContentPane().add(plus);

		JButton multi = new JButton();
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(t1.getText());
				int num2 = Integer.parseInt(t2.getText());
				int multi = num1 * num2;

				result.setText(num1 + " * " + num2 + " = " + multi);
				
			}
		});

		JButton div = new JButton();
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(t1.getText());
				int num2 = Integer.parseInt(t2.getText());
				int div = num1 / num2;

				result.setText(num1 + " / " + num2 + " = " + div);
			}
		});

		div.setText("/");
		div.setForeground(Color.RED);
		div.setFont(new Font("굴림", Font.PLAIN, 60));
		div.setBackground(Color.BLUE);

		f.getContentPane().add(div);
		multi.setText("*");
		multi.setForeground(Color.RED);
		multi.setFont(new Font("굴림", Font.PLAIN, 60));
		multi.setBackground(Color.BLUE);
		f.getContentPane().add(multi);

		JButton minus = new JButton();
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(t1.getText());
				int num2 = Integer.parseInt(t2.getText());
				int minus = num1 - num2;

				result.setText(num1 + " - " + num2 + " = " + minus);
				
			}
		});
		minus.setText("-");
		minus.setForeground(Color.RED);
		minus.setFont(new Font("굴림", Font.PLAIN, 60));
		minus.setBackground(Color.BLUE);
		
		f.getContentPane().add(minus);
		f.getContentPane().add(minus);
		f.getContentPane().add(result);
		f.setSize(400, 900);
		f.getContentPane().setLayout(fl);
		f.getContentPane().add(l1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t1);
		f.getContentPane().add(l3);
		f.getContentPane().add(t2);
		f.setVisible(true);
	}

}
