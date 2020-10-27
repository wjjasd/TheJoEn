<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/movie.css" />
<script src="resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	$(function() {
		//alert("환영합니다")
		$('#b1').click(function() {
			replyVal = $('#reply').val();
			$.ajax({
				url : "reply.do",
				data : {
					reply : replyVal
				},
				success : function(result) {
					$('#d1').append(result)
				}
			});
		});
		$('#dupBtn').click(function() {
			userId = $('#userId').val();
			$.ajax({
				url : "dupCheck.do",
				data : {
					id : userId
				},
				success : function(result) {
					$('#dupResult').html(result)
				}
			});
		});
	})
</script>
</head>
<body>
	아이디 :
	<input id="userId">
	<br>
	<button id="dupBtn">중복체크</button>
	<div id="dupResult"></div>
	<hr color="red">
	<form action="movie.do">
		영화제목<input name="title"><br> 관람료<input name="price"><br>
		<button>영화보러 가즈아!</button>
	</form>
	<hr>
	댓글:
	<input type="text" id="reply">
	<button id="b1">댓글달기</button>
	<div id="d1"></div>
</body>
</html>