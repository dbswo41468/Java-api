package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.BoaVO;

@Mapper
public interface BoardMapper {

	/**
	 * @Since : 2022. 12. 9.
	 * @Author : 미스터 빈
	 * @Return : List<BoaVO> 	
	 * @comment : board 테이블 검색
	 */
	public List<BoaVO> selectBoa(); // 메소드 정의
}
