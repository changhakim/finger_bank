package com.finger.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;




@Data@Component
public class Member {
	private String mid, password,address, name, phone, mail,account,birth;


}
