package 스레드;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.util.Date;
import java.awt.Color;


public class ThreadRun4 extends JFrame {

	private static final long serialVersionUID = 1L;
	JLabel top = new JLabel("1");
	JLabel center = new JLabel("2");
	JLabel sub = new JLabel("3");
	
	public ThreadRun4() {

		setTitle("나의 멀티 스레드");
		setSize(800,300);
		
		top.setBackground(new Color(255, 175, 175));
		top.setFont(new Font("굴림", Font.BOLD, 25));
		getContentPane().add(top, BorderLayout.NORTH);
		
		center.setBackground(Color.ORANGE);
		getContentPane().add(center, BorderLayout.CENTER);
		
		sub.setBackground(Color.PINK);
		sub.setFont(new Font("굴림", Font.BOLD, 25));
		getContentPane().add(sub, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("      ");
		getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("       ");
		getContentPane().add(lblNewLabel_1, BorderLayout.EAST);
		
		CounterThread2 counter = new CounterThread2();
		counter.start();
		
		TimerThread2 time = new TimerThread2();
		time.start();
		
		ImgThread2 img = new ImgThread2();
		img.start();
		
	}
	
	public class CounterThread2 extends Thread {
		
		@Override
		public void run() {

			for (int i = 500; i > 0; i--) {
				top.setText("카운터" + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}
	}
	
	public class TimerThread2 extends Thread {
		
		@Override
		public void run() {
			for (int i = 0; i < 300; i++) {
				Date date = new Date();	
				sub.setText(date.toString());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
	
	public class ImgThread2 extends Thread {

		@Override
		public void run() {
			String[] img = { "..\\java36\\src\\img\\1.png", "..\\java36\\src\\img\\2.png", "..\\java36\\src\\img\\3.png", "..\\java36\\src\\img\\4.png", "..\\java36\\src\\img\\5.png" };
			for (int i = 0; i < img.length; i++) {
				ImageIcon imgIcon = new ImageIcon(img[i]);
				Image pic = imgIcon.getImage(); // ImageIcon을 Image로 변환.(객체를 돌려준다.)
				Image picCh = pic.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);// 이미지 사이즈 조정
				ImageIcon iconCh = new ImageIcon(picCh); // Image로 ImageIcon 생성
				center.setIcon(iconCh);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
	
	public static void main(String[] args) {

		ThreadRun4 t = new ThreadRun4();
		t.setVisible(true);
		
	}

}
