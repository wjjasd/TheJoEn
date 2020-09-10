package DB연결;

import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class BbsUI {
	private static JTextField titleTf;
	private static JTextField contentTf;
	private static JTextField writerTf;
	private static JTextField noTf;
	private static JTextArea allTextA;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 463, 641);
		f.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel titleLb = new JLabel("제목");
		titleLb.setFont(new Font("굴림", Font.PLAIN, 16));
		titleLb.setBounds(26, 132, 65, 31);
		panel.add(titleLb);

		titleTf = new JTextField();
		titleTf.setBounds(87, 129, 348, 40);
		panel.add(titleTf);
		titleTf.setColumns(10);

		contentTf = new JTextField();
		contentTf.setColumns(10);
		contentTf.setBounds(87, 179, 348, 195);
		panel.add(contentTf);

		JLabel contentLb = new JLabel("내용");
		contentLb.setFont(new Font("굴림", Font.PLAIN, 16));
		contentLb.setBounds(26, 182, 65, 31);
		panel.add(contentLb);

		writerTf = new JTextField();
		writerTf.setColumns(10);
		writerTf.setBounds(87, 384, 348, 40);
		panel.add(writerTf);

		JLabel writerLb = new JLabel("작성자");
		writerLb.setFont(new Font("굴림", Font.PLAIN, 16));
		writerLb.setBounds(26, 387, 65, 31);
		panel.add(writerLb);

		JButton clearBtn = new JButton("CLEAR");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				noTf.setText("");
				titleTf.setText("");
				contentTf.setText("");
				writerTf.setText("");

			}
		});
		clearBtn.setBounds(12, 434, 93, 45);
		panel.add(clearBtn);

		JButton postBtn = new JButton("게시하기");
		postBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BbsVO vo = new BbsVO();
				vo.setNo(Integer.parseInt(noTf.getText()));
				vo.setTitle(titleTf.getText());
				vo.setContent(contentTf.getText());
				vo.setWriter(writerTf.getText());

				BbsDAO dao = new BbsDAO();
				try {
					dao.create(vo);
					System.out.println("게시글 작성 완료");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("게시글 작성 실패");
				}
				
				setBbsList();
			}
		});
		postBtn.setBounds(127, 434, 93, 45);
		panel.add(postBtn);

		JButton deleteBtn = new JButton("삭제");
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int no = Integer.parseInt(noTf.getText());
				BbsDAO dao = new BbsDAO();
				try {
					dao.delete(no);
					System.out.println("게시글 삭제 성공");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("게시글 삭제 실패");
				}
				
				setBbsList();

			}
		});
		deleteBtn.setBounds(243, 434, 93, 45);
		panel.add(deleteBtn);

		JButton updateBtn = new JButton("수정");
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				BbsVO vo = new BbsVO();
				vo.setNo(Integer.parseInt(noTf.getText()));
				vo.setTitle(titleTf.getText());
				vo.setContent(contentTf.getText());
				vo.setWriter(writerTf.getText());

				BbsDAO dao = new BbsDAO();
				try {
					dao.update(vo);
					System.out.println("게시글 수정 완료");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("게시글 수정 실패");
				}
				
				setBbsList();
				

			}
		});
		updateBtn.setBounds(355, 434, 93, 45);
		panel.add(updateBtn);

		noTf = new JTextField();
		noTf.setColumns(10);
		noTf.setBounds(87, 82, 348, 40);
		panel.add(noTf);

		JLabel noLb = new JLabel("번호");
		noLb.setFont(new Font("굴림", Font.PLAIN, 16));
		noLb.setBounds(26, 85, 65, 31);
		panel.add(noLb);

		allTextA = new JTextArea();
		allTextA.setEditable(false);
		allTextA.setFont(new Font("Monospaced", Font.BOLD, 30));
		allTextA.setColumns(30);
		allTextA.setRows(8);
		allTextA.setBounds(484, 72, 570, 579);
		f.getContentPane().add(allTextA);

		JLabel lblNewLabel = new JLabel("게시글 작성하기");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel.setBounds(185, 10, 116, 62);
		panel.add(lblNewLabel);

		JButton searchBtn = new JButton("검색하기");
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BbsDAO dao = new BbsDAO();
				BbsVO vo = new BbsVO();
				try {
					vo = dao.getPost(Integer.parseInt(noTf.getText()));

					if (vo != null) {

						titleTf.setText(vo.getTitle());
						contentTf.setText(vo.getContent());
						writerTf.setText(vo.getWriter());
						System.out.println("게시글 불러오기 성공");

					} else {

						titleTf.setText("검색결과 없음");
						contentTf.setText("검색결과 없음");
						writerTf.setText("검색결과 없음");
						System.out.println("검색결과 없음");
					}

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("게시글 불러오기 실패");
				}

			}
		});
		searchBtn.setBounds(12, 489, 93, 45);
		panel.add(searchBtn);

		JButton searchAllBtn = new JButton("전체 게시글 검색하기");
		searchAllBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setBbsList();

			}
		});
		searchAllBtn.setBounds(702, 17, 150, 45);
		f.getContentPane().add(searchAllBtn);
		

		

		f.setSize(1082, 700);
		f.setVisible(true);

	}
	
	private static void setBbsList() {
		allTextA.setText("");
		
		BbsDAO dao = new BbsDAO();

		try {
			ArrayList<BbsVO> bbsSet = dao.getAllPost();
			if (bbsSet != null) {
				for (int i = 0; i < bbsSet.size(); i++) {
					BbsVO vo = bbsSet.get(i);
					allTextA.append(vo.getNo() + "  " + vo.getTitle() + "  " + vo.getContent() + "  "
							+ vo.getWriter() + "\n");
				}
			}else {
				allTextA.append("등록된 게시글이 없습니다");
			}

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
