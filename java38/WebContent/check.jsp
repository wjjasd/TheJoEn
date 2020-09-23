<%@page import="javax.swing.JOptionPane"%>
<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	1. 클라이언트가 입력해서 제출한 데이터를 받아와야한다.
	2. DB연동해서 처리후 결과 받기
	3. 받아온 결과에 따라서 화면을 html로 만들어서 클라이언트로 전송
 -->

<%	//스크립트릿(scriptlet)

	//HttpSevletRequst request = new HttpServletRequest();
	//내장된 객체
	 String id = request.getParameter("id");
	 String pw = request.getParameter("pw");
	 String name = "";
	 String tel = "";
	 
	 MemberDAO dao = new MemberDAO();
	 MemberVO vo = dao.read(id, pw);
	 if(vo==null){
		 JOptionPane.showMessageDialog(null, "로그인실패");
	 }else{
		 name = vo.getName();
		 tel = vo.getTel();
	 }

%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>당신이 입력한 정보</h3>
<hr color="red">
아이디 : <%= id %> <br> <!-- 표현식 expression -->
패스워드 : <%= pw %> <br>
이름 : <%= name %> <br>
전화 : <%= tel %> <br>
<hr color="blue">
<a href="login.html">로그인 페이지로</a>

</body>
</html>