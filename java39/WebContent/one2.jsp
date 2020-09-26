<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 1.id값 받기 -->
<!-- 2.dao와 연동 결과 받기 -->
<!-- html로 만들어서 전송 -->

<%
	String title = request.getParameter("title");
String content = request.getParameter("content");
BbsDAO dao = new BbsDAO();
List<BbsVO> list = new ArrayList<>();
if (title != null) {
	list = dao.getPostByTitle(title);
}
if (content != null) {
	list = dao.getPostByContent(content);
}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3 style="color: blue">
		검색한 결과의 개수는
		<%=list.size()%>개
	</h3>
	<table border="1">
		<tr>
			<td class="td">아이디</td>
			<td class="td">패스워드</td>
			<td class="td">이름</td>
			<td class="td">전화번호</td>
		</tr>
		<%
			for (int i = 0; i < list.size(); i++) {
			BbsVO vo = list.get(i);
		%>
		<tr>
			<td><%=vo.getNo()%></td>
			<td><%=vo.getTitle()%></td>
			<td><%=vo.getContent()%></td>
			<td><%=vo.getWriter()%></td>
		</tr>

		<%
			}
		%>
	</table>

</body>
</html>