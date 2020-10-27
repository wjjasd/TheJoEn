package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("insert.do")
	public String insert(String id, String pw) {
		System.out.println("회원가입 성공!!");
		System.out.println("아이디 : " + id);
		System.out.println("패스워드 : " + pw);
		return "insert2";
	}

}
