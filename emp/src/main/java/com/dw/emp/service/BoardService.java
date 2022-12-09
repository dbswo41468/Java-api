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
}
