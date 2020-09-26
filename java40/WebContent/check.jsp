<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    	String id = request.getParameter("id");
    	
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

<% if(dao.idDupCheck(id)) {%>
<h1>아이디 중복!!!</h1>
<%}else{ %>
<h1>아이디 중복안됨!!!</h1>
<%} %>
</body>
</html>