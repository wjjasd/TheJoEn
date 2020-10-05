<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%
	
	String id = request.getParameter("id");
	MemberDAO dao = new MemberDAO();
	boolean result = dao.idDupCheck(id);
	String message = "사용불가";
	if(!result){
		message = "사용가능";
	}
	%><%= message %>