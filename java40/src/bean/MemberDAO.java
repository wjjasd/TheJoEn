package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//CRUD중심 기능 정의
//데이터와 관련된 작업(Data Access Object: DAO)
public class MemberDAO {

	Connection con;
	String url = "jdbc:mysql://localhost:3306/shop1";
	String user = "root";
	String password = "1234";

	public MemberDAO() throws Exception {
		// 1.connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공");
		// 2.db연결
		// String url = "연결방법://ip:port/db명";

		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공");
	}
	
public boolean idDupCheck(String id) throws Exception {
		
		boolean result = false;
		
		// 3.sql문 작성
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,id);
	
		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4 sql문 전송 성공");
		int size = 0;
		while(rs.next()) {
			size++;
		}
		if(size > 0) {
			result = true;
		}	
	
		return result;

	}
	
	public boolean logIn(String id, String pw) throws Exception {
		
		boolean result = false;
		
		// 3.sql문 작성
		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,id);
		ps.setString(2,pw);
		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4 sql문 전송 성공");
		
		int size = 0;
		while(rs.next()) {
			size++;
		}
		if(size > 0) {
			result = true;
		}
		
		return result;

	}
	
	public List<MemberVO> getAllMember() throws Exception {

		List<MemberVO> memberList = new ArrayList<MemberVO>();
		
		
		// 3.sql문 작성
		String sql = "select * from member";
		PreparedStatement ps = con.prepareStatement(sql);

		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4 sql문 전송 성공");
		

		while(rs.next()) {
			MemberVO vo = new MemberVO();
			vo.setId(rs.getString("id"));
			vo.setPw(rs.getString("pw"));
			vo.setName(rs.getString("name"));
			vo.setTel(rs.getString("tel"));
			memberList.add(vo);
		}
		
		if(memberList.size() <= 0 ) {
			memberList = null;
		}
		
		return memberList;

	}
	
	public List<MemberVO> getMember(String tel) throws Exception {

		List<MemberVO> memberList = new ArrayList<MemberVO>();
		
		
		// 3.sql문 작성
		String sql = "select * from member where tel = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,tel);
		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4 sql문 전송 성공");
		

		while(rs.next()) {
			MemberVO vo = new MemberVO();
			vo.setId(rs.getString("id"));
			vo.setPw(rs.getString("pw"));
			vo.setName(rs.getString("name"));
			vo.setTel(rs.getString("tel"));
			memberList.add(vo);
		}
		
		if(memberList.size() <= 0 ) {
			memberList = null;
		}
		
		return memberList;

	}
	
	public List<MemberVO> getSomeMember(String tel) throws Exception {

		List<MemberVO> memberList = new ArrayList<MemberVO>();
		
		
		// 3.sql문 작성
		String sql = "select * from member where tel like '" + tel + "%'";
		PreparedStatement ps = con.prepareStatement(sql);
		
		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4 sql문 전송 성공");
		

		while(rs.next()) {
			MemberVO vo = new MemberVO();
			vo.setId(rs.getString("id"));
			vo.setPw(rs.getString("pw"));
			vo.setName(rs.getString("name"));
			vo.setTel(rs.getString("tel"));
			memberList.add(vo);
		}
		
		if(memberList.size() <= 0 ) {
			memberList = null;
		}
		
		return memberList;

	}

	public void create(String id, String pw, String name, String tel) throws Exception {

		// 3.sql문 작성
		String sql = "insert into member values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);

		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		ps.executeUpdate();
		System.out.println("4 sql문 전송 성공");

		con.close();
		ps.close();

	}

	public boolean create(MemberVO vo) throws Exception {

		String id = vo.getId();
		String pw = vo.getPw();
		String name = vo.getName();
		String tel = vo.getTel();

		boolean result = false;

		// 3.sql문 작성
		String sql = "insert into member values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);

		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		int row = ps.executeUpdate();
		System.out.println("4 sql문 전송 성공");
		if (row == 1) {
			result = true;
		}

		con.close();
		ps.close();

		return result;

	}

	public MemberVO read(String id) throws Exception {

		MemberVO memberSet = new MemberVO();

		// 3.sql문 작성
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4 sql문 전송 성공");

		int count = 0;
		while (rs.next()) {

			memberSet.setId(rs.getString("id"));
			memberSet.setPw(rs.getString("pw"));
			memberSet.setName(rs.getString("name"));
			memberSet.setTel(rs.getString("tel"));

			count++;

		}

		if (count > 0) {

		} else {
			memberSet = null;
		}

		rs.close();
		con.close();
		ps.close();

		return memberSet;

	}

	public boolean update(MemberVO vo) throws Exception {

		String id = vo.getId();
		String pw = vo.getPw();
		String name = vo.getName();
		String tel = vo.getTel();

		// 3.sql문 작성
		String sql = "update member set pw = ?, name = ?, tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, pw);
		ps.setString(2, name);
		ps.setString(3, tel);
		ps.setString(4, id);

		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		int row = ps.executeUpdate();
		System.out.println("4 sql문 전송 성공");

		con.close();
		ps.close();

		boolean result = false;
		if (row == 1) {
			result = true;
		}

		return result;
	}

	public boolean delete(String id) throws Exception {

		boolean result = false;
		// 3.sql문 작성
		String sql = "delete from member where id = '" + id + "'";
		PreparedStatement ps = con.prepareStatement(sql);

		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		int row = ps.executeUpdate();
		System.out.println("4 sql문 전송 성공");

		if (row == 1) {
			result = true;
		}
		con.close();
		ps.close();

		return result;

	}
}
