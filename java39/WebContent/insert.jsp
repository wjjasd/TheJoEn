<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
	boolean result = false;
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	
	MemberDAO dao = new MemberDAO();
	try{
		dao.create(id, pw, name, tel);
		result = true;
	}catch(Exception e){
		
	}
	

%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입 결과 : <%= result %></h3>
<hr color="red">
아이디 : <%= id %> <br> <!-- 표현식 expression -->
패스워드 : <%= pw %> <br>
이름 : <%= name %> <br>
전화 : <%= tel %> <br>
<hr color="blue">
<a href="member.html">회원가입 페이지로</a>
</body>
</html>