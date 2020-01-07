package com.finger.web.service;

import org.springframework.stereotype.Component;

import com.finger.web.domain.Member;

@Component
public interface MemberService {
	public void registMember(Member mem);
}
