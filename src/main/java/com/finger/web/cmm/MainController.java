package com.finger.web.cmm;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finger.web.domain.Member;
import com.finger.web.service.MemberServiceImpl;

@RestController
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	@Autowired
	HashMap<String, Object> map;
	
	  @Autowired MemberServiceImpl memService;
	 
	
	@PostMapping("/catess/{cate}")
	public Map<?, ?> cateAlllist(@PathVariable String cate, @RequestBody Member param) {
		logger.info("=======  ProductController prosomelist:상품카테고리별 전체조회  진입 ======");
		map.clear();
		System.out.println(param.toString());
		memService.registMember(param);
		map.put("list", "어이");
		return map;
	}
}
