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
	@Autowired 
	MemberServiceImpl memService;
	@Autowired
	Member mem;
	 
	
	@PostMapping("/login/{auth}")
	public Map<?, ?> cateAlllist(@PathVariable String auth, @RequestBody Member param) {
		logger.info("=======  로그인진입 ======");
		map.clear();
		
		System.out.println(param.toString());
		mem = memService.existsMember(param);
		
		
		  if(mem == null){
			  map.put("mid","idNull"); 
		  }else{
		  System.out.println(mem.getMid());
		  System.out.println(mem.getAccount()); 
		  map.put("member",mem);
		  map.put("mid",mem.getMid());
		  }
		 
		 
		return map;
	}
}
