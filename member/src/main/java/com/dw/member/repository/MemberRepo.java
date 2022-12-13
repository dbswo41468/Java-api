package com.dw.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.member.model.Member;

// Mapper 기능
// JAP를 상속 받는다
// @Mapper 라는 어노테이션을 사용 X
// 쿼리문이 다 들어있는 JpaRepository 을 상속 받았다
//<테이블이름, Long>
public interface MemberRepo extends JpaRepository<Member, Long>{


}
