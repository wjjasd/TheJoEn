package com.mega.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	// 2. 컨트롤러에서 받기
	@RequestMapping("page2.mega")
	public void page2(String id, String pw, Model model) {
		System.out.println("page2 메서드 자동호출");
		System.out.println("controller가 받은 아이디: " + id);
		System.out.println("controller가 받은 아이디: " + pw);
		// 3. DAO 객체사용 DB처리
		String result = "로그인 실패";
		if (id.equals("root") && pw.equals("1234")) {
			result = "로그인 성공";
		}
		model.addAttribute("result",result);

		// 4. 처리결과를 가지고jsp로 간다
	}
}
