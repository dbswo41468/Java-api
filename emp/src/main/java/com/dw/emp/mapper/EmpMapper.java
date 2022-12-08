package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.EmpVO;

@Mapper
public interface EmpMapper {

	public List<EmpVO> selectEmp();
	
	// 검색
	public EmpVO selectEmpfindByEmpno(int empno);
	
	// 삭제
	int deleteEmpno(int empno);
	
	// 추가
	int insertEmp(EmpVO vo);
	
	// 수정
	// 인서트 내용이 많으면 객체로 변환 후 수행
	int updateEmp(EmpVO vo);
	
}
