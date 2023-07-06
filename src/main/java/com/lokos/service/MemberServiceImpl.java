package com.lokos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lokos.mapper.MemberMapper;
import com.lokos.model.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired MemberMapper memberMapper;	
	
	// 회원등록
	@Override
	public int insertMemberInfo(MemberDTO memberDTO) {
		return memberMapper.insertMemberInfoToDB(memberDTO);
	}
	
}
