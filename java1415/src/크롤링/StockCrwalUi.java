package 크롤링;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class StockCrwalUi {
	private static JTextField codeTf;
	
	public static void main(String[] args) {
		
		JTextArea textArea = new JTextArea();
		JFrame f = new JFrame();
		f.setSize(440,700);
		
		JButton samjeonBtn = new JButton("삼전");
		samjeonBtn.setBounds(106, 61, 82, 41);
		samjeonBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codeTf.setText("005930");
			}
		});
		f.getContentPane().setLayout(null);
		f.getContentPane().add(samjeonBtn);
		
		JButton kakaogameBtn = new JButton("카카오게임즈");
		kakaogameBtn.setBounds(12, 10, 167, 41);
		kakaogameBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codeTf.setText("293490");
			}
		});
		f.getContentPane().add(kakaogameBtn);
		
		JButton entyBtn = new JButton("엔티포스");
		entyBtn.setBounds(310, 10, 101, 41);
		entyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codeTf.setText("238090");
			}
		});
		f.getContentPane().add(entyBtn);
		
		JButton hanhuwaBtn = new JButton("한화솔루션");
		hanhuwaBtn.setBounds(292, 61, 119, 41);
		hanhuwaBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codeTf.setText("009830");
			}
		});
		f.getContentPane().add(hanhuwaBtn);
		
		codeTf = new JTextField();
		codeTf.setBounds(12, 155, 399, 50);
		f.getContentPane().add(codeTf);
		codeTf.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CODE:");
		lblNewLabel.setBounds(12, 115, 117, 42);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		f.getContentPane().add(lblNewLabel);
		
		JButton cholockbaamBtn = new JButton("초록뱀");
		cholockbaamBtn.setBounds(12, 61, 82, 41);
		cholockbaamBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codeTf.setText("047820");
			}
		});
		f.getContentPane().add(cholockbaamBtn);
		
		JButton sinpoongBtn = new JButton("신풍제약");
		sinpoongBtn.setBounds(191, 10, 107, 41);
		sinpoongBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codeTf.setText("019170");
			}
		});
		f.getContentPane().add(sinpoongBtn);
		
		JButton naverBtn = new JButton("네이버");
		naverBtn.setBounds(200, 61, 82, 41);
		naverBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codeTf.setText("035420");
			}
		});
		f.getContentPane().add(naverBtn);
		
		
		
		JButton crwalBtn = new JButton("크롤링 시작");
		crwalBtn.setBounds(12, 215, 399, 50);
		crwalBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code = codeTf.getText();
				StockVO vo = StockCrwal.getStockInfo(code);
				textArea.append("-------------------------------\n"); 
				textArea.append("종목코드 : " + vo.getCode()+"\n"); 
				textArea.append("종 목 명  : " + vo.getCompany()+"\n"); 
				textArea.append("현 재 가  : " + vo.getNow()+"원\n"); 
				textArea.append("전일대비 : " + vo.getDif()+"원\n"); 
				textArea.append("증 감 율  : " + vo.getPer()+"%\n"); 
				textArea.append("-------------------------------\n");
				textArea.append("\n");
			}
		});
		f.getContentPane().add(crwalBtn);
		
		JLabel lblNewLabel_1 = new JLabel("종목뷰");
		lblNewLabel_1.setBounds(12, 297, 57, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 322, 399, 329);
		f.getContentPane().add(scrollPane);
		
		
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea.setEditable(false);
		
		JButton clearBtn = new JButton("ClearAll");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		clearBtn.setBounds(58, 293, 97, 23);
		f.getContentPane().add(clearBtn);
		f.setVisible(true);
		
	}
}
