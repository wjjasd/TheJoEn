<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");

MemberDAO dao = new MemberDAO();
boolean result = dao.delete(id);
String check = "탈퇴실패";
if (result) {
	check = "탈퇴성공";
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>
		결과 :
		<%=check%></h3>
	<hr color="blue" />
	<span style="color: red"><%=check%></span>
</body>
</html>