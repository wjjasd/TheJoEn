package com.mega.mvc08;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController2 {

	@Autowired
	BbsService service;
	
	@RequestMapping("insert.do")
	public void insert(BbsVO bbsVO, Model model) {
		boolean result = service.insert(bbsVO);
		model.addAttribute("reslut", result);
	}
	
	@RequestMapping("update.do")
	public void update(BbsVO bbsVO, Model model) {
		boolean result = service.update(bbsVO);
		model.addAttribute("reslut", result);
	}
	
	@RequestMapping("delete.do")
	public void delete(String no, Model model) {
		boolean result = service.delete(no);
		System.out.println(result);
		model.addAttribute("result", result);
	}
	
	@RequestMapping("selectOne.do")
	public void selectOne(String no, Model model) {
		BbsVO bbsVO = service.selectOne(no);
		model.addAttribute("bbsVO", bbsVO);
	}
	
	@RequestMapping("selectList.do")
	public void selectOne(Model model) {
		List<BbsVO> list = service.selectList();
		model.addAttribute("list", list);
	}
	
}
