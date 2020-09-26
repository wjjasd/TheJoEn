<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 1.id값 받기 -->
<!-- 2.dao와 연동 결과 받기 -->
<!-- html로 만들어서 전송 -->

<%
String id = request.getParameter("id");
MemberDAO dao = new MemberDAO();
MemberVO vo = dao.read(id);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td width="100" bgcolor="yellow">아이디</td>
			<td width="200" bgcolor="pink"><%=vo.getId()%></td>
		</tr>
		<tr>
			<td width="100" bgcolor="yellow">패스워드</td>
			<td width="200" bgcolor="pink"><%=vo.getPw()%></td>
		</tr>
		<tr>
			<td width="100" bgcolor="yellow">이름</td>
			<td width="200" bgcolor="pink"><%=vo.getName()%></td>
		</tr>
		<tr>
			<td width="100" bgcolor="yellow">전화</td>
			<td width="200" bgcolor="pink"><%=vo.getTel()%></td>
		</tr>
	</table>
	<hr color="green">
	<a href="index.html"><button>처음페이지</button></a>
	<a href="update.jsp?id=<%=vo.getId()%>"><button>수정페이지</button></a>
	<a href="delete.jsp?id=<%=vo.getId()%>"><button>회원탈퇴하기</button></a>
</body>
</html>