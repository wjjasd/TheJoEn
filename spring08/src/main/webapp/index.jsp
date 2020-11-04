<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BBS TEST</title>
</head>
<body>
	<h1>bbs insert</h1>
	<form action="insert.do">
		no : <input type="text" name="no"><br>
		title : <input type="text" name="title"><br>
		content : <input type="text" name="content"><br> 
		writer : <input type="text" name="writer"><br>
		<button>insert</button>
	</form>
	<hr>
	<h1>bbs selectOne</h1>
		<form action="selectOne.do"> no : <input type="text" name="no"><br>
		<button>SELECT</button>
	</form>
	<hr>
	<h1>bbs title update</h1>
	<form action="update.do"> 
		no : <input type="text" name="no"><br> 
		title : <input type="text" name="title"><br>
		<button>UPDATE</button>
	</form>
	<hr>
	<h1>bbs selectAll</h1>
	<form action="selectList.do">
		<button>SELECT ALL</button>
	</form>
	<h1>bbs title delete</h1>
	<form action="delete.do">
		no : <input type="text" name="no"><br> 
		<button>DELETE</button>
	</form>
	<hr>
</body>
</html>