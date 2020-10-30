package com.mega.mvc07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;

	@RequestMapping("insert.do")
	public void insert(MemberVO memberVO, Model model) {
		System.out.println("controller received VO : "+ memberVO);
		boolean result = memberService.insert(memberVO);
		if(result) {
			model.addAttribute("result", result);
			model.addAttribute("memberVO", memberVO);			
		}
	}
	
	@RequestMapping("updateTel.do")
	public void update(MemberVO memberVO, Model model) {
		System.out.println("controller update received VO : "+ memberVO);
		boolean result = memberService.updateTel(memberVO);
		if(result) {
			model.addAttribute("result", result);		
		}else {
			System.out.println("update failed");
		}
	}
	
	@RequestMapping("selectOne.do")
	public void insert(String mID, Model model) {
		System.out.println("controller received mID : "+ mID);
		MemberVO memberVO = memberService.selectOne(mID);
		model.addAttribute("memberVO", memberVO);
		System.out.println("vo added : " + memberVO);
	}
	
	@RequestMapping("selectAll.do")
	public void selectAll(Model model) {
		List<MemberVO> list = memberService.selectAll();
		model.addAttribute("list",list);
	}
	
	@RequestMapping("dupcheck.do")
	public String check(String mID, Model model) {
		String page = "idDup"; //중복됨
		boolean result = true; //null이 아님
		System.out.println("controller received mID : "+ mID);
		MemberVO memberVO = memberService.selectOne(mID);
		System.out.println("dup check : " + memberVO);
		if(!memberVO.equals(null)) {
			result = false; //중복안됨
			page = "idAvailable"; //사용가능
			model.addAttribute("result", result);
		}else { //중복됨
			model.addAttribute("result", result);
		}
		
		return page;
		
	}
	
}
