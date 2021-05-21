package com.company.biz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		System.out.println("== 硫붿씤 �솕硫� ==");
		return "home";
	}

	@RequestMapping(value = "/organization")
	public String organization() {
		System.out.println("== 議곗쭅�룄 ==");
		return "about/organization";
	}
	
	@RequestMapping(value = "/aboutus")
	public String aboutus() {
		System.out.println("==�쉶�궗 �냼媛�==");
		return "about/aboutus";
	}
	
	@RequestMapping(value = "/history")
	public String history() {
		System.out.println("== 회사 연혁 ==");
		return "about/history";
	}
	
}
