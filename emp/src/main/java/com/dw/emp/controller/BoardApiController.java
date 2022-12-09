package com.dw.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dw.emp.service.BoardService;
import com.dw.emp.vo.BoaVO;
@RestController
public class BoardApiController {
	
	@Autowired
	BoardService BoardService;
	
	// 검색
	@GetMapping("/api/v1/board")
	public List<BoaVO> callBoa() {
		return BoardService.selectBoa();
	}
}
