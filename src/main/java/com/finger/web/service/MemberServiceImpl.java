package com.finger.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finger.web.domain.Member;
import com.finger.web.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired MemberMapper memMap;
	
	@Override
	public void registMember(Member mem) {
		 memMap.insertMember(mem); 
		
	}

}
