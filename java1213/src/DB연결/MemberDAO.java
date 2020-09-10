package DB연결;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


//CRUD중심 기능 정의
//데이터와 관련된 작업(Data Access Object: DAO)
public class MemberDAO {
	public void create(String id, String pw, String name, String tel) throws Exception {
		// 1.connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공");
		// 2.db연결
//		String url = "연결방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3306/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공");

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
		
	
	}

	public MemberVO read(String id, String pw) throws Exception {

		MemberVO memberSet = new MemberVO();
		
		// 1.connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공");
		// 2.db연결
		//String url = "연결방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3306/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공");

		// 3.sql문 작성
		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,id);
		ps.setString(2,pw);
		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4 sql문 전송 성공");
		
		int count = 0;
		while(rs.next()) {
			
			memberSet.setId(rs.getString("id"));
			memberSet.setPw(rs.getString("pw"));
			memberSet.setName(rs.getString("name"));
			memberSet.setTel(rs.getString("tel"));

			count++;
			
		}
		
		if(count > 0) {
			
		}else {
			memberSet = null;
		}
			
		
		
		return memberSet;

	}
	


	public void update(String id, String tel) throws Exception {

		// 1.connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공");
		
		// 2.db연결
		//String url = "연결방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3306/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공");

		// 3.sql문 작성
		String sql = "update member set tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, tel);
		ps.setString(2, id);

		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		ps.executeUpdate();
		System.out.println("4 sql문 전송 성공");
		

	}

	public void delete(String id) throws Exception {

		// 1.connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공");
		// 2.db연결
		// String url = "연결방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3306/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공");

		// 3.sql문 작성
		String sql = "delete from member where id = '" + id + "'";
		PreparedStatement ps = con.prepareStatement(sql);

		System.out.println("3 sql문 생성 성공");

		// 4.sql문 전송
		ps.executeUpdate();
		System.out.println("4 sql문 전송 성공");

	}
}
