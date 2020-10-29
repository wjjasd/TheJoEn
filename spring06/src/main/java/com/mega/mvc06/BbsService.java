package com.mega.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BbsService {
	
	@Autowired
	BbsDAO dao;
	
	public boolean insert(BbsVO bbsVO) {
		boolean result = dao.insert(bbsVO);
		return result;
	}

}
