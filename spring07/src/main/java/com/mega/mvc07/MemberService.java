package com.mega.mvc07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	MemberDAO memberDAO;
	
	public boolean insert(MemberVO memberVO) {
		System.out.println("service received : " + memberVO);
		boolean result = memberDAO.insert(memberVO);
		return result;
	}
	
	public boolean updateTel(MemberVO memberVO) {
		System.out.println("service received : " + memberVO);
		boolean result = memberDAO.updateTel(memberVO);
		return result;
	}
	
	public MemberVO selectOne(String mID) {
		System.out.println("service received : " + mID);
		return memberDAO.selectOne(mID);
	}
	
	public List<MemberVO> selectAll() {
		return memberDAO.selectAll();
	}
	
	

}
