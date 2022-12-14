package com.dw.member.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.member.model.Member;
import com.dw.member.repository.MemberRepo;

@Controller

// @RestController = 데이터 전달용
@RestController
public class Membercontroller {
	@Autowired
	MemberRepo repo;

	// 조회
	// sql 만들기
	// 서비스
	// 전체를 찾는다
	@GetMapping("/member")
	public List<Member> callAllMembers() {
		// findAll == select * from <테이블 이름>
		return repo.findAll();
	}

	// 추가
	@PostMapping("/member")
	public Member callSaveMamber(@RequestBody Member member) {
		// save == update & insert
		// 동일한 pk 값이 있으면 update
		// 동일한 pk 값이 없으면 insert
		member = repo.save(member);
		return member;
	}

	// 수정
	@PatchMapping("/member")
	public Member updateMember(@RequestBody Member member) {
		// save == update & insert
		// 동일한 pk 값이 있으면 update
		// 동일한 pk 값이 없으면 insert
		member = repo.save(member);
		return member;
	}

	// 삭제
	@DeleteMapping("/member/{id}")
	public boolean callDeleMember(@PathVariable long id) {
		// deleteById == delete
		// By = where
		try {
			repo.deleteById(id); // 리턴 타입이 void
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	// 상세 조회

	@GetMapping("/member/{id}")
	public Member callMemberById(@PathVariable long id) {
		// findById == select * from emp where empno = 333;
		return repo.findById(id).get();
	}

}
