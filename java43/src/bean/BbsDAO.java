package bean;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BbsDAO {

	private Connection con;

	public void setConector() throws Exception {
		// 1.connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공");
		// 2.db연결
		// String url = "연결방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3306/shop1";
		String user = "root";
		String password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공");
	}

	public boolean create(BbsVO bbsVo) throws Exception {

		setConector();
		
		int no = bbsVo.getNo();
		String title = bbsVo.getTitle();
		String content = bbsVo.getContent();
		String writer = bbsVo.getWriter();
		
		boolean result = false;

		// 3.sql문 작성
		String sql = "insert into bbs values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setInt(1, no);
		ps.setString(2, title);
		ps.setString(3, content);
		ps.setString(4, writer);

		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		int row = ps.executeUpdate();
		System.out.println("4 sql문 전송 성공");
		if(row ==1) {
			result = true;
		}

		return result;

	}
	
	public boolean delete(int no) throws Exception {

		setConector();
		
		boolean result = false;

		// 3.sql문 작성
		String sql = "delete from bbs where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3 sql문 생성 성공");
		ps.setInt(1, no);

		// 4.sql문 전송
		int row = ps.executeUpdate();
		System.out.println("4 sql문 전송 성공");
		
		if(row == 1) {
			result = true;
		}

		return result;

	}
	
	public boolean update(BbsVO bbsVo) throws Exception {

		setConector();
		
		int no = bbsVo.getNo();
		String title = bbsVo.getTitle();
		String content = bbsVo.getContent();
		String writer = bbsVo.getWriter();
		
		boolean result = false;

		// 3.sql문 작성
		String sql = "update bbs set title = ?, content = ?, writer = ? where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, title);
		ps.setString(2, content);
		ps.setString(3, writer);
		ps.setInt(4, no);

		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		int row = ps.executeUpdate();
		System.out.println("4 sql문 전송 성공");
		
		if(row == 1) {
			result = true;
		}
		
		return result;

	}
	
	public BbsVO getPost(int no) throws Exception {

		setConector();
		
		// 3.sql문 작성
		String sql = "select * from bbs where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setInt(1, no);

		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4 sql문 전송 성공");
		
		BbsVO vo = new BbsVO();
		
		int size = 0;
		while(rs.next()) {
			vo.setNo(rs.getInt("no"));
			vo.setTitle(rs.getString("title"));
			vo.setContent(rs.getString("content"));
			vo.setWriter(rs.getString("writer"));
			size++;
		}
		
		if(size == 0 ) {
			vo = null;
		}
		
		return vo;

	}
	
	public List<BbsVO> getPostByTitle(String title) throws Exception {

		setConector();
		
		// 3.sql문 작성
		String sql = "select * from bbs where title like '" + title + "%'";
		PreparedStatement ps = con.prepareStatement(sql);


		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4 sql문 전송 성공");
		
		
		List<BbsVO> list = new ArrayList<BbsVO>();
		int size = 0;
		while(rs.next()) {
			BbsVO vo = new BbsVO();
			vo.setNo(rs.getInt("no"));
			vo.setTitle(rs.getString("title"));
			vo.setContent(rs.getString("content"));
			vo.setWriter(rs.getString("writer"));
			list.add(vo);
			size++;
		}
		
		if(size == 0 ) {
			list = null;
		}
		
		return list;

	}
	
	public List<BbsVO> getPostByContent(String content) throws Exception {

		setConector();
		
		// 3.sql문 작성
		String sql = "select * from bbs where content like '%" + content + "%'";
		PreparedStatement ps = con.prepareStatement(sql);


		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4 sql문 전송 성공");
		
		
		List<BbsVO> list = new ArrayList<BbsVO>();
		int size = 0;
		while(rs.next()) {
			BbsVO vo = new BbsVO();
			vo.setNo(rs.getInt("no"));
			vo.setTitle(rs.getString("title"));
			vo.setContent(rs.getString("content"));
			vo.setWriter(rs.getString("writer"));
			list.add(vo);
			size++;
		}
		
		if(size == 0 ) {
			list = null;
		}
		
		return list;

	}
	
	public ArrayList<BbsVO> getAllPost() throws Exception {

		ArrayList<BbsVO> bbsSet = new ArrayList<BbsVO>();
		
		setConector();
		
		// 3.sql문 작성
		String sql = "select * from bbs";
		PreparedStatement ps = con.prepareStatement(sql);

		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4 sql문 전송 성공");
		

		while(rs.next()) {
			BbsVO vo = new BbsVO();
			vo.setNo(rs.getInt("no"));
			vo.setTitle(rs.getString("title"));
			vo.setContent(rs.getString("content"));
			vo.setWriter(rs.getString("writer"));
			
			bbsSet.add(vo);
			
		}
		
		if(bbsSet.size() < 0 ) {
			bbsSet = null;
		}
		
		return bbsSet;

	}

}
