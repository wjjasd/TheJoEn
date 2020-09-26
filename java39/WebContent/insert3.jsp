<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:useBean id="vo" class="bean.BbsVO"></jsp:useBean>
<jsp:setProperty property="*" name="vo" />

<%
	//4.DAO이용해서 insert
	BbsDAO dao = new BbsDAO();
	boolean result = dao.create(vo);
	int no = vo.getNo();
	String title = vo.getTitle();
	String content = vo.getContent();
	String writer = vo.getWriter();
	//5. 처리결과를 client에 알려주어야함
	String check = "게시실패";
	if (result) {
		check = "게시성공";
	}
%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><%=check%></h3>
	<h3>
		번호 :
		<%=no%></h3>
	<h3>
		제목 :
		<%=title%></h3>
	<h2>
		내용 :
		<%=content%></h2>
	<h2>
		작성자 :
		<%=writer%></h2>
	<a href="bbs.html">작성 페이지로</a>
</body>
</html>