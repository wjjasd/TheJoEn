<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%><%
	String result = "";
	String score = request.getParameter("score");
	if(Integer.parseInt(score) >= 90 ){
		result = "�ֿ��";
	}else if(Integer.parseInt(score) >= 80){
		result = "���";
	}else{
		result = "����";
	}
%><%= result %>