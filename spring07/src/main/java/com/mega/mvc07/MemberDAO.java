package com.mega.mvc07;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public boolean insert(MemberVO memberVO) {
		System.out.println("DAO received : " + memberVO);
		boolean result = false; 
		
		int row = mybatis.insert("member.insert", memberVO);
		if(row==1) {
			result = true;
		}
		return result;
	}
	
	public boolean updateTel(MemberVO memberVO) {
		System.out.println("DAO received : " + memberVO);
		boolean result = false; 
		
		int row = mybatis.update("member.updateTel", memberVO);
		System.out.println("update row" + row);
		if(row==1) {
			result = true;
		}
		return result;
	}
	
	public MemberVO selectOne(String mID) {
		
		MemberVO memberVO = new MemberVO();
		memberVO = mybatis.selectOne("member.selectOne", mID);
		
		return memberVO;
	}
	
	public List<MemberVO> selectAll(){
		List<MemberVO> list = mybatis.selectList("member.selectAll");
		System.out.println("list size: " + list.size());
		return list;
	}

}
