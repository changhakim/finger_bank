package com.finger.web.cmm;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired HttpServletRequest request;
	@Autowired HttpSession session;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/")
	public String home(Locale locale, Model model) {
		logger.info("홈진입");
        String ctx = request.getContextPath();
        session.setAttribute("ctx", ctx);
        session.setAttribute("css", ctx + "/resources/css");
        session.setAttribute("js", ctx + "/resources/js");
        session.setAttribute("img", ctx + "/resources/img");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	@RequestMapping(value="/home")
	public String loginaccess(Locale locale,Model model) {
		logger.info("=========index진입======");
		
		return"home";
	}
	
}
