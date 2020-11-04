package com.mega.mvc08;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BbsService {
	
	@Autowired
	BbsDAO2 bbsDAO;
	
	public boolean insert(BbsVO bbsVO) {
		System.out.println("service vo : " + bbsVO);
		return bbsDAO.insert(bbsVO);
	}
	
	public boolean update(BbsVO bbsVO) {
		System.out.println("service vo : " + bbsVO);
		return bbsDAO.update(bbsVO);
	}
	
	public boolean delete(String no) {
		System.out.println("service no : " + no);
		return bbsDAO.delete(no);
	}
	
	public BbsVO selectOne(String no) {
		System.out.println("service no : " + no);
		return bbsDAO.selectOne(no);
	}
	
	public List<BbsVO> selectList() {
		return bbsDAO.selectList();
	}
	
}
