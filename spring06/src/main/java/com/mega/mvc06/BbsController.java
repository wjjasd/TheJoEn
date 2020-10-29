package com.mega.mvc06;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Handles requests for the application home page.
 */
@Controller
public class BbsController {
	
	@Autowired
	BbsService service;
	
	@RequestMapping("insert.do")
	private void insert(BbsVO bbsVO, Model model) {
		boolean result = service.insert(bbsVO);
		model.addAttribute("result",result);
	}

	
}
