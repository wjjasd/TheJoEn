<%@page import="bean.BbsVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.BbsDAO"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- DAO를 이용 게시판 전체 검색 해서 html로 반환 -->
    
    <% 
    	BbsDAO dao = new BbsDAO();
    	ArrayList<BbsVO> list = dao.getAllPost();
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 전체검색</title>
<style type="text/css">
   td {
      width: 150px;
      text-align: center;
   }
   .td{
      background: green;
   }
</style>
</head>
<body>
<h3>게시판 전체글</h3>
<table border="1">
<tr>
	<td class="td">번호</td>
	<td class="td">타이틀</td>
   	<td class="td">내용</td>
   	<td class="td">작성자</td>
</tr>
<%for(int i = 0; i < list.size(); i++) { 
	BbsVO vo = list.get(i); 
%>
<tr>
	<td><%= vo.getNo() %></td>
	<td><%= vo.getTitle() %></td>
	<td><%= vo.getContent() %></td>
	<td><%= vo.getWriter() %></td>
</tr>
<% } %>
</table>
</body>
</html>