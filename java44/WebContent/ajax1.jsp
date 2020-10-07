<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	/* 콜백함수 브라우저가 돔트리 구성 후, 리스너가 이벤트를 인식하면 호출됨 */
	$(function() {
		/* 버튼 b1 클릭 리스너 */
		$('#b1').click(function() {
			/* 브라우저에서 member.xml을 요청 */
			/* 요청한 xml에는 사용자들의 정보가 들어있음 */
			$.ajax({
				url : "data/member.xml",
				success : function(doc) {
					console.log('xml결과요청성공')
					console.log('xml결과: ' + doc)
					/* xml바디에 있는 레코드를 찾아 list에 담는다 */
					list = $(doc).find('record')
					console.log('레코드의 개수: ' + list.length)
					if (list.length > 0) {/* 데이터가 존재하면 */
						/* for each와 동일하게 list의 크기 만큼 익명함수 실행 */
						$(list).each(function(index, item) {
							
							/* xml에서 키값으로 데이터를 찾아옴 */
							first_name = $(item).find('first_name').text()
							last_name = $(item).find('last_name').text()
							email = $(item).find('email').text()
							gender = $(item).find('gender').text()
							ip_address = $(item).find('ip_address').text()
							id = $(item).find('id').text()
							
							/* 읽어온 값을 UI에 반영 */
							$('#d1').append("id: "+id+"<br>"
											+"first_name: "+first_name+"<br>"
											+"last_name: "+last_name+"<br>"
											+"email: "+email+"<br>"
											+"gender: "+gender+"<br>"
											+"ip_adress: "+ip_address+"<br>"
											+"<hr>")
											
							/* 읽어온 데이터를 DB에 INSERT하기위해 db1.jsp를 호출 */
							$.ajax({
								url: "db1.jsp",
								/* 전달할 데이터를 명시할때는 키와값의 묶음으로 전달한다 */
								data: {
									/* key : value */
									id : id,
									first_name : first_name,
									last_name : last_name,
									email : email,
									gender : gender,
									ip_address : ip_address
								},
								/* 연결 성공시 실행되는 함수 */
								success: function(result) {
									if(index == list.length - 1){
										/* alert('db1.jsp를 통해 db에 넣기! - 전송함') */
										alert(index)								
										/* alert('db1.jsp의 결과 : ' + result) */
										
									}
								}
							})
						})
						
					}
				}
			})
		});
		$('#b2').click(function() {
			$.ajax({
				url : "data/member.json",
				success : function(doc) {
					//alert('json요청성공')
					console.log(doc)
					$(doc).each(function(index, item) {
						id = item.id
						first_name = item.first_name
						last_name = item.last_name
						email = item.email
						gender = item.gender
						ip_address = item.ip_address
						
						/* 읽어온 값을 UI에 반영 */
						$('#d1').append("id: "+id+"<br>"
										+"first_name: "+first_name+"<br>"
										+"last_name: "+last_name+"<br>"
										+"email: "+email+"<br>"
										+"gender: "+gender+"<br>"
										+"ip_adress: "+ip_address+"<br>"
										+"<hr>")
					})//each
				}//success
			})
		})
		$('#b3').click(function() {
			alert('testb3')
		})
	})
</script>
</head>
<body>
	<button id="b1">XML읽어오기</button>
	<button id="b2">JSON읽어오기</button>
	<button id="b3">DB에 넣기</button>
	<hr>
	<div id='d1'></div>
	<table id='t1'>
	</table>
</body>
</html>