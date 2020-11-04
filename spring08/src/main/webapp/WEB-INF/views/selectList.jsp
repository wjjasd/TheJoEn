<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Bbs INFO<br>
<hr>
<c:forEach var="bbsVO" items="${list}">
ID : ${bbsVO.no},
PW : ${bbsVO.title},
NAME : ${bbsVO.content},
TEL : ${bbsVO.writer}"<br>

</c:forEach>
<a href="index.jsp">BACK TO HOME</a>
</body>
</html>