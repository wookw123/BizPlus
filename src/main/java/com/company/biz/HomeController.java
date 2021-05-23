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
	
<<<<<<< HEAD
	@RequestMapping(value = "/contact")
	public String contact() {
		System.out.println("==찾아오시는 길==");
		return "about/contact";
=======
	@RequestMapping(value = "/history")
	public String history() {
		System.out.println("==회사 연혁==");
		return "about/history";
>>>>>>> 60ca93eb56da33a764bc5d22362b949c55ce33f2
	}
	
	
}
