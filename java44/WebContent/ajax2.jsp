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
		/* 헬스 */
		$('#b1').click(function() {
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fhealth.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=vgpedlmhuhhgxdwpcywhnimgokl6f2xc5t3hkdev",
				data:{
					url: 'https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fhealth.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml',
					api_key: 'vgpedlmhuhhgxdwpcywhnimgokl6f2xc5t3hkdev',
					count: 20
				},
				success: function(result) {
					console.log('성공!!' + result)
					list = result.items
					console.log(list.length)
					if(list.length > 0){
						$(list).each(function(index, news) {
							 title = news.title
		                     pubDate = news.pubDate
		                     link = news.link
		                     console.log(title)
		                     console.log(pubDate)
		                     console.log(link)
		                     total = "<b><a href=" + link + ">"  + title + "</a></b> : " + pubDate + "<br>" + link
		                     $('#d1').append(total + "<hr>")
		                     
		                     $.ajax ({
		                    	url: 'news.jsp',
		                    	data: {
		                    		link: link,
		                    		title: title,
		                    		pubDate : pubDate		
		                    	},
		                    	success: function(result) {
									console.log('db결과 : ' + result)
								}
		                    	 
		                     })
						})
					}
				}
			})
		})
		
		$('#b2').click(function() {
			$('#d1').empty()
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Ftravel.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=vgpedlmhuhhgxdwpcywhnimgokl6f2xc5t3hkdev",
				data:{
					url: 'https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Ftravel.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml',
					api_key: 'vgpedlmhuhhgxdwpcywhnimgokl6f2xc5t3hkdev',
					count: 20
				},
				success: function(result) {
					console.log('성공!!' + result)
					list = result.items
					console.log(list.length)
					if(list.length > 0){
						$(list).each(function(index, news) {
							 title = news.title
		                     pubDate = news.pubDate
		                     link = news.link
		                     thumbnail = news.thumbnail
		                     console.log(title)
		                     console.log(pubDate)
		                     console.log(link)
		                     console.log(news.thumbnail)
		                     total = "<img src=" + thumbnail + "></img>" +"<b><a href=" + link + ">"  + title + "</a></b> : " + pubDate + "<br>" + link
		                     $('#d1').append(total + "<hr>")
						})
					}
				}
			})
		})
		
		$('#b3').click(function() {
			$('#d1').empty()
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Frss.hankyung.com%2Fnew%2Fnews_enter.xml&api_key=vgpedlmhuhhgxdwpcywhnimgokl6f2xc5t3hkdev",
				data:{
					url: 'https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Frss.hankyung.com%2Fnew%2Fnews_enter.xml',
					api_key: 'vgpedlmhuhhgxdwpcywhnimgokl6f2xc5t3hkdev',
					count: 20
				},
				success: function(result) {
					console.log('성공!!' + result)
					list = result.items
					console.log(list.length)
					if(list.length > 0){
						$(list).each(function(index, news) {
							 title = news.title
		                     pubDate = news.pubDate
		                     link = news.link
		                     image = news.image
		                     console.log(title)
		                     console.log(pubDate)
		                     console.log(link)
		                     total = "<b><img src=" + image + "></img></b> : " + "<b><a href=" + link + ">"  + title + "</a></b> : " + pubDate + "<br>" + link
		                     $('#d1').append(total + "<hr>")
						})
					}
				}
			})
		})
		
		$('#b4').click(function() {
			$('#d1').empty()
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Ftravel.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=vgpedlmhuhhgxdwpcywhnimgokl6f2xc5t3hkdev",
				data:{
					url: 'https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Ftravel.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml',
					api_key: 'vgpedlmhuhhgxdwpcywhnimgokl6f2xc5t3hkdev',
					count: 20
				},
				success: function(result) {
					console.log('성공!!' + result)
					list = result.items
					console.log(list.length)
					if(list.length > 0){
						$(list).each(function(index, news) {
							 title = news.title
		                     pubDate = news.pubDate
		                     link = news.link
		                     console.log(title)
		                     console.log(pubDate)
		                     console.log(link)
		                     total = "<b><a href=" + link + ">"  + title + "</a></b> : " + pubDate + "<br>" + link
		                     $('#d1').append(total + "<hr>")
						})
					}
				}
			})
		})
		
	})
</script>
</head>
<body>
	<button id="b1">헬스 연결</button>
	<button id="b2">트래블 읽어오기</button>
	<button id="b3">한경 연예</button>
	<button id="b4">한경 포토</button>
	<hr>
	<div id='d1'></div>
</body>
</html>