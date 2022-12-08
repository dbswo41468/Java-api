package com.dw.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.emp.mapper.EmpMapper;
import com.dw.emp.vo.EmpVO;

@Service
public class EmpService {

	@Autowired
	EmpMapper empMapper;
	
	public List<EmpVO> selectEmp(){
		return empMapper.selectEmp();
	}
	
	// 검색
	public EmpVO selectEmpfindByEmpno(int empno) {
		return empMapper.selectEmpfindByEmpno(empno);
	}
	
	// 삭제
	public int deleteEmpno(int empno) {
		return empMapper.deleteEmpno(empno);
	}

	// 추가
	public int insertEmp(EmpVO dept) {
		return empMapper.insertEmp(dept);
	}
	
	// 수정
	public int updateEmp(EmpVO empno) {
		return empMapper.updateEmp(empno);
	}
}
