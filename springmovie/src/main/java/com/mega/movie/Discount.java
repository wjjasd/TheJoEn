package com.mega.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Discount {
	
	@Autowired
	MemberDAO dao;
	
	public String[] idCheck(String id) {
		String page = "ok";
		String result = "사용가능";
		String[] ids = {"root","admin","apple","melon","mint"};
		for (int i = 0; i < ids.length; i++) {
			if(id.equals(ids[i])) {
				result = "사용불가능";
				page = "no";
			}
		}
		String[] values = {result,page};
		return values;
	}

	public int calDiscount(int price) {
		int result = price;
		if (price >= 10000) {
			result -= 1000;
		}
		return result;
	}

}
