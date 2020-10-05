<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    
    //파라미터값 받기
    String reply = request.getParameter("reply");
    //ReplyDAP로 댓글 저장처리
    //성공시 저장된 댓글 데이터 전송 
    String result = "-" + reply + "<br>";
    %><%= result %>
