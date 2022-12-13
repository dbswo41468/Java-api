package com.dw.member.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// vo 기능
// db에 테이블 생성 기능

// 테이블 이름은 "소"문자
@Entity
@Table(name = "dw_member")
public class Member {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	// Column(컬럼)이라고 지정한다
	@Column
	private long id; // pk
	@Column
	private String name; // 멤버이름
	@Column
	private int age; // 나이
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
