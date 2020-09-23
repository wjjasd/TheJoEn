<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
	
	//1.VO를 만들어서
	MemberVO vo = new MemberVO();
	//2.전달값받음
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	//3.VO에 넣는다
	vo.setId(id);
	vo.setPw(pw);
	vo.setName(name);
	vo.setTel(tel);
	//4.DAO이용해서 insert
	MemberDAO dao = new MemberDAO();
	boolean result = dao.create(vo);
	//5. 처리결과를 client에 알려주어야함
	String check = " 회원가입실패";
	if(result){
		check = "회원가입성공";
	}

%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%= check %></h3>
<a href="member.html">회원가입 페이지로</a>
</body>
</html>