<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%boolean result = (Boolean)request.getAttribute("result"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
result : ${result}<br>
<%if(result == true) {%>
CONGRATULATIONS!! SIGN IN SUCCESS!! <br>
<%} %>
<hr>
Member INFO<br>
ID : ${memberVO.id}<br>
PW : ${memberVO.pw}<br>
NAEM : ${memberVO.name}<br>
TEL : ${memberVO.tel}<br>
<a href="index.jsp">BACK TO HOME</a>
</body>
</html>