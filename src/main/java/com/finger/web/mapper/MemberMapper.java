package com.finger.web.mapper;

import org.springframework.stereotype.Repository;

import com.finger.web.domain.Member;

@Repository
public interface MemberMapper {
	public void insertMember(Member mem);
	public Member existsMember(Member m);
}
