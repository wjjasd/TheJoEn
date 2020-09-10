package DB연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class 회원CRUDUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(116, 43, 57, 15);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 20));
		t1.setBounds(185, 31, 168, 38);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JLabel lblPw = new JLabel("pw");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 20));
		lblPw.setBounds(116, 97, 57, 15);
		f.getContentPane().add(lblPw);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBounds(185, 85, 168, 38);
		f.getContentPane().add(t2);

		JLabel lblName = new JLabel("name");
		lblName.setFont(new Font("굴림", Font.PLAIN, 20));
		lblName.setBounds(116, 148, 57, 15);
		f.getContentPane().add(lblName);

		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 20));
		t3.setColumns(10);
		t3.setBounds(185, 136, 168, 38);
		f.getContentPane().add(t3);

		JLabel lblTel = new JLabel("tel");
		lblTel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblTel.setBounds(116, 204, 57, 15);
		f.getContentPane().add(lblTel);

		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 20));
		t4.setColumns(10);
		t4.setBounds(185, 192, 168, 38);
		f.getContentPane().add(t4);

		JButton create = new JButton("create");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				MemberDAO memdao = new MemberDAO();
				try {
					memdao.create(id, pw, name, tel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		create.setBounds(25, 278, 97, 41);
		f.getContentPane().add(create);

		JButton read = new JButton("read");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				MemberDAO memdao = new MemberDAO();
				try {
					int size = 0;
					ResultSet rs = memdao.read(id);

					while (rs.next()) {
						String pw = rs.getString("pw");
						String name = rs.getString("name");
						String tel = rs.getString("tel");
						t2.setText(pw);
						t3.setText(name);
						t4.setText(tel);
						size++;
					}
					
					if(size <= 0) {
						t1.setText("없음");
						t2.setText("없음");
						t3.setText("없음");
						t4.setText("없음");
						System.out.println("가져온 데이터 사이즈"+size);
					}else{
						System.out.println("가져온 데이터 사이즈"+size);
					}

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		read.setBounds(134, 278, 97, 41);
		f.getContentPane().add(read);

		JButton update = new JButton("update tel");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String tel = t4.getText();
				MemberDAO memdao = new MemberDAO();
				try {
					memdao.update(id, tel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		update.setBounds(243, 278, 97, 41);
		f.getContentPane().add(update);

		JButton delete = new JButton("delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				MemberDAO memdao = new MemberDAO();
				try {
					memdao.delete(id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		delete.setBounds(359, 278, 97, 41);
		f.getContentPane().add(delete);
		f.setVisible(true);
	}
}
