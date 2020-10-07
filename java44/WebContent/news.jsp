<%@page import="bean.MemberDAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><jsp:useBean id="vo2" class="bean.NewsVO"></jsp:useBean><jsp:setProperty property="*" name="vo2"/><%
   MemberDAO2 dao2 = new MemberDAO2(); //jsp:useBean으로 전달 받은 데이터를 vo클래스를 사용하여 저장한다
   boolean result = dao2.create(vo2);  //jsp:setProperty로 어떤 칼럼에 접근할 것인지 명시
%><%= result %>