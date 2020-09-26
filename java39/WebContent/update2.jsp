<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 1.no값 받기 -->
<!-- 2.dao와 연동 결과 받기 -->
<!-- html로 만들어서 전송 -->

<%
	int no = Integer.parseInt(request.getParameter("no"));
	BbsDAO dao = new BbsDAO();
	BbsVO vo = dao.getPost(no);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>게시물 수정페이지</h3>
	<form action="update2.jsp">
		<table>
			<tr align="center">
				<td width="100" bgcolor="yellow">아이디</td>
				<td width="200" bgcolor="pink"><input type="text" name="id"
					value="<%=vo.getNo()%>" readonly="readonly"></td>
			</tr>
			<tr align="center">
				<td width="100" bgcolor="yellow">패스워드</td>
				<td width="200" bgcolor="pink"><input type="text" name="pw"
					value="<%=vo.getTitle()%>"></td>
			</tr>
			<tr align="center">
				<td width="100" bgcolor="yellow">이름</td>
				<td width="200" bgcolor="pink"><input type="text" name="name"
					value="<%=vo.getContent()%>"></td>
			</tr>
			<tr align="center">
				<td width="100" bgcolor="yellow">전화번호</td>
				<td width="200" bgcolor="pink"><input type="text" name="tel"
					value="<%=vo.getWriter()%>"></td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="submit">수정 처리 요청</button>
				</td>
			</tr>
		</table>
	</form>
	<hr color="green">
	<a href="index.html"><button>처음페이지</button></a>
	<a href="one2.jsp?id=<%=vo.getNo()%>"><button>검색페이지</button></a>
	<a href="delete2.jsp?id=<%=vo.getNo()%>"><button>회원탈퇴하기</button></a>
</body>
</html>