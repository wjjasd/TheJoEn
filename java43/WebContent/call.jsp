<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%><%
	String result = "�̼���";
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	if(Integer.parseInt(age) >= 18){
		result = "����";
	}
%><%= result %>