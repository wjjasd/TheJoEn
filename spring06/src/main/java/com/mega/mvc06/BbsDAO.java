package com.mega.mvc06;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BbsDAO {

	@Autowired
	SqlSessionTemplate mybatis;

	public boolean insert(BbsVO vo) {
		boolean result = false; 
		int row = mybatis.insert("bbs.insert", vo);
		if(row==1) {
			result = true;
		}
		return result;
	}

//	public void delete(BbsVO vo) {
//		int row = mybatis.delete("bbs.delete", vo);
//	}
//
//	public void update(BbsVO vo) {
//		int row = mybatis.update("bbs.update", vo);
//	}
//
//	public BbsVO select(BbsVO vo) {
//		BbsVO vo2 = mybatis.selectOne("bbs.one", vo);
//		return vo2;
//	}
//	
//	public List<BbsVO> list() {
//		List<BbsVO> list = mybatis.selectList("bbs.list");
//		return list;
//	}

}
