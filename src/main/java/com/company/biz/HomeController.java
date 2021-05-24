package com.company.biz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		System.out.println("== 메인 화면 ==");
		return "home";
	}

	@RequestMapping(value = "/organization")
	public String organization() {
		System.out.println("== 조직도 ==");
		return "about/organization";
	}
	
	@RequestMapping(value = "/aboutus")
	public String aboutus() {
		System.out.println("==회사 소개==");
		return "about/aboutus";
	}


	@RequestMapping(value = "/history")
	public String history() {
		System.out.println("==회사 연혁==");
		return "about/history";

	}
	
	@RequestMapping(value = "/contact")
	public String contact() {
		System.out.println("==찾아오시는 길==");
		return "contact/contact";
	}
	
	@RequestMapping(value = "/solution")
	public String solution() {
		System.out.println("==회사 솔루션==");
		return "solution/solution";

	}
	
	@RequestMapping(value = "/index.html")
	public String index() {
		System.out.println("== 조직도 ==");
		return "home";
	}
	
}
