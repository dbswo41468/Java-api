package com.dw.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardPageController {
	
	@GetMapping("/board")
	public String loaddorPage() {
		return "dw_board";
	}
	
	@GetMapping("/write")
	public String loadWritePage() {
		return "write";
	}
	
}
