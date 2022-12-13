package com.dw.member.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberPageController {
	
	@GetMapping("/members")
	public String loadMemberPage() {
		return "member";
	}

}
