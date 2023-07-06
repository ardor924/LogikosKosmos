package com.lokos.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.lokos.model.MemberDTO;

@Mapper
public interface MemberMapper {

	// 회원등록
	public int insertMemberInfoToDB(MemberDTO memberDTO);
	
}
