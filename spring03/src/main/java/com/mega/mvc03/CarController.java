package com.mega.mvc03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//일반자바 파일: POJO (Plain Old Java Object)
//Controller 기능을 가진 클래스로 만들기 위해 어노테이션 태그를 써준다
//내부적으로는 상속을 받게되고 핸들러맵퍼에 키:값을 등록한다 

@Controller
public class CarController {
	//컨트롤러에서 뷰까지 넘어가기 위한 항목 :
	//1. view페이지 이름
	//2. model의 속성값
	@RequestMapping("car.do")
	public String car(String color, Model model) {
		System.out.println("컨트롤러에서 받은 컬러" + color);
		
		return "img";
	}
	
}
