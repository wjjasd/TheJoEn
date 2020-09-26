<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	
    	MemberDAO dao = new MemberDAO();   	
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>입력한 아이디 : <%= id %></h1>
<h1>입력한 패스워드 : <%= pw %></h1>
<% if(dao.logIn(id, pw)) {%>
<h1>로그인 성공!!!</h1>
<%}else{ %>
<h1>로그인 실패!!!</h1>
<%} %>
</body>
</html>