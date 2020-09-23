<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 1. 넘어오는 값 받아서 vo에 저장 -->
<!-- userBean액션태그 new로 객체생성  import역활 -->
<jsp:useBean id="vo" class="bean.MemberVO"></jsp:useBean>
<!-- setProperty 액션태그 클라이언트가 전송한 파라미터 받고 vo에 set메소드 호출해줌 -->
<jsp:setProperty property="*" name="vo"/>
<!-- 2. dao로 update -->
<%
	MemberDAO dao = new MemberDAO();
	boolean result = dao.update(vo);
%>
<!-- 3. 결과 html전송 -->


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>업데이트 결과는<%= result %>입니다!</h3>
</body>
</html>