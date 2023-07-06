package com.lokos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lokos.service.MemberService;

@Controller
public class MemberController {

	@Autowired MemberService memberService;
		
	
	// 회원등록 페이지
	@GetMapping("/member/join/page")
	public String joinPage()
	{
		return "member/joinPage";
	}
	
	// 회원등록 제출
	@RequestMapping("member/join/submit")
	public String joinSubmit()
	{
		return "redirect:/";
	}
	
	
}
