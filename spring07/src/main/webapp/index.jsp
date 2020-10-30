<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SPRING TEST</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">

	$(function() {
		$('#checkBtn').click(function() {
			$.ajax({
				url: "dupcheck.do",
				data: {
					mID : $('#mID').val()
				},
				success: function() {
					alert('나 다녀왔다')
				}
			})
		})
	})
	
</script>
</head>
<body>
	<h1>Dup Check</h1>
	ID : <input type="text" id="mID">
	<div id="checkdiv"></div>
	<br>
	<button id="checkBtn">CHECK</button>
	<hr>
	<h1>member insert</h1>
	<form action="insert.do">
		ID : <input type="text" name="id"><br> 
		PW : <input type="text" name="pw"><br> 
		NAEM : <input type="text" name="name"><br> 
		TEL : <input type="text" name="tel"><br>
		<button>SIGN IN</button>
	</form>
	<hr>
	<h1>member selectOne</h1>
	<form action="selectOne.do">
		ID : <input type="text" name="mID"><br>
		<button>SELECT</button>
	</form>
	<hr>
	<h1>member tel update</h1>
	<form action="updateTel.do">
		ID : <input type="text" name="id"><br>
		TEL : <input type="text" name="tel"><br>
		<button>UPDATE</button>
	</form>
	<hr>
	<h1>member selectAll</h1>
	<form action="selectAll.do">
		<button>SELECT ALL</button>
	</form>
</body>
</html>