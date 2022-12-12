package com.dw.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	// 게시물 생성
	@PostMapping("/api/v1/board")
	public int callBoardSave(@RequestBody BoaVO vo) {
		return BoardService.selectBoa(vo);
	}

	// 게시물 수정시 해당 게시물 정보 불러오기
	@GetMapping("/api/v1/board/{boardNo}")
	public BoaVO callBoard(@PathVariable int boardNo) {
		return BoardService.selectBoardFindByBoardNo(boardNo);
	}

	// 삭제
	@DeleteMapping("/api/v1/board/{boardNo}")
	public int callDeleteBoard(@PathVariable int boardNo) {
		return BoardService.deleteBoard(boardNo);
	}

	// 수정
	@PatchMapping("/api/v1/board")
	public int callUpdateBoard(@RequestBody BoaVO boardNo) {
		return BoardService.updateBoard(boardNo);
	}
}
