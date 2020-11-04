package com.mega.mvc08;

import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO2 {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public boolean insert(BbsVO bbsVO) {
		boolean result = false;
		int row = mybatis.insert("bbs.insert", bbsVO);
		if(row > 0) {
			result = true;
		}
		return result;
	}
	
	public boolean update(BbsVO bbsVO) {
		boolean result = false;
		int row = mybatis.update("bbs.update", bbsVO);
		if(row > 0) {
			result = true;
		}
		return result;
	}
	
	public boolean delete(String no) {
		boolean result = false;
		int row = mybatis.delete("bbs.delete", no);
		if(row > 0) {
			result = true;
		}
		return result;
	}
	
	public BbsVO selectOne(String no) {
		BbsVO bbsVO = mybatis.selectOne("bbs.selectOne", no);
		return bbsVO;
	}
	
	public List<BbsVO> selectList() {
		List<BbsVO> list = mybatis.selectList("bbs.selectList");
		System.out.println("list size: "+list.size());
		return list;
	}
	
}
