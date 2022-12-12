package com.dw.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.emp.mapper.BoardMapper;
import com.dw.emp.vo.BoaVO;

@Service
public class BoardService {

	@Autowired
	BoardMapper boardMapper;

	// 검색
	public List<BoaVO> selectBoa() {
		return boardMapper.selectBoa();
	}

	// 게시물 생성
	public int selectBoa(BoaVO vo) {
		return boardMapper.insertBoard(vo);
	}

	// 게시물 수정 하기 위해 페이지 이동 후 정보 불러오기
	public BoaVO selectBoardFindByBoardNo(int boardNo) {
		return boardMapper.selectBoardFindByBoardNo(boardNo);
	}

	// 게시물 삭제
	public int deleteBoard(int boardNo) {
		return boardMapper.deleteBoard(boardNo);
	}

	// 수정
	public int updateBoard(BoaVO boardNo) {
		return boardMapper.updateBoard(boardNo);
	}
}
