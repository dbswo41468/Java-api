package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.EmpVO;

@Mapper
public interface EmpMapper {

	/**
	 * @Since : 2022. 12. 7.
	 * @Author : 미스터 빈
	 * @Return : List<EmpVO> 	
	 * @comment : Emp 테이블 전체 조회
	 */
	List<EmpVO> select(); // 메소드 정의
}
