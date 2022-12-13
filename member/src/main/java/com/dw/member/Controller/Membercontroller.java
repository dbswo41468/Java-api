package com.dw.member.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.member.model.Member;
import com.dw.member.repository.MemberRepo;

@Controller
@RestController
public class Membercontroller {
	@Autowired
	MemberRepo repo;

	// sql 만들기
	// 전체를 찾는다
	@GetMapping("/member")
	public List<Member> callAllMembers() {
		// findAll == select * from <테이블 이름>
		return repo.findAll();
	}


	// 추가
	@PostMapping("/member")
	public Member callSaveMamber(@RequestBody Member member) {
		// save == insert
		member = repo.save(member);
		return member;
	}

	// 수정

	// 삭제
	/*
	 * @DeleteMapping("/member") public Member callSaveMamber(@RequestBody Member
	 * member) {
	 * 
	 * member = repo.(member) return member; }
	 */
}
