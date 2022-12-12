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
	List<BoaVO> selectBoa(); // 메소드 정의
	
	// 작성한 쿼리 id와 메서드 이름이 동일해야 Mapping이 된다
	// insert, delete, update 는 int로 return함
	/**
	 * @Since : 2022. 12. 12.
	 * @Author : 미스터 빈
	 * @Return : int 	
	 * @comment : 게시물 생성
	 */
	public int insertBoard(BoaVO vo);
	
	/**
	 * @Since : 2022. 12. 12.
	 * @Author : 미스터 빈
	 * @Return : BoaVO 	
	 * @comment : 게시물 수정 하기 위해 페이지 이동후 정보 불러오기
	 */
	public BoaVO selectBoardFindByBoardNo(int boardNo);
	
	
	/**
	 * @Since : 2022. 12. 12.
	 * @Author : 미스터 빈
	 * @Return : BoaVO 	
	 * @comment : 게시물 삭제
	 */
	public int deleteBoard(int boardNo);
	
	/**
	 * @Since : 2022. 12. 12.
	 * @Author : 미스터 빈
	 * @Return : int 	
	 * @comment : 수정
	 */
	public int updateBoard(BoaVO boardNo);
}
