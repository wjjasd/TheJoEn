package com.mega.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MovieController {
	@Autowired
	Discount dis;
	@RequestMapping("movie.do")
	public String showInfo(String title, String price, Model model) {
		//int priceI = Discount.calDiscount(Integer.parseInt(price));
		int priceI = dis.calDiscount(Integer.parseInt(price));
		model.addAttribute("title",title);
		model.addAttribute("priceI",String.valueOf(priceI));
		
		return "like";
	}
	
	@RequestMapping("reply.do")
	public void reply(String reply, Model model) {
		//DB처리
		//view로 넘김
		model.addAttribute("reply", reply);
	}
	
	@RequestMapping("dupCheck.do")
	public String dupCheck(String id, Model model) {
		//DB처리
		//view로 넘김
		String[] values = dis.idCheck(id);
		model.addAttribute("result", values[0]);
		return values[1];
	}

}
