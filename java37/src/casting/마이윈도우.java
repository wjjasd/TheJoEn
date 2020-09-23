package casting;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class 마이윈도우 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setTitle("my window");
		f.setSize(400,400);

		JButton btn = new JButton("btn1");
		JLabel lb = new JLabel("label");
		JPanel p = new JPanel();
		p.setSize(100, 100);
		p.setBackground(Color.BLUE);
		f.setLayout(new FlowLayout());
		f.add(btn);
		f.add(lb);
		f.add(p);
		
		Font font = new Font("궁서",Font.BOLD,50);
		lb.setFont(font);
		btn.setFont(font);
		
		f.setVisible(true);
	}

}
