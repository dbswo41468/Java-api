package com.dw.member.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 페이지 이동
@Controller
public class MemberPageController {
	
	@GetMapping("/members")
	public String loadMemberPage() {
		return "member";
	}

	@GetMapping("/login")
	public String loadLoginPage(){
		return"login";
	}

}