package com.flapper.stark.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.flapper.stark.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView model) {
		String obj = "ssd";
		
		model.setViewName("user_home");
		model.addObject(obj);
		
		return model;
	}
		
		
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Locale locale, Model model){
		
		
		return "user_login";
	}
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
//	모델 맵을 사용하여본다...
//	모델 맵과 모델 모델&뷰 의 차이점 : 인터넷 참조(스프링 사이트)
	public String list(Locale locale, ModelMap model){
		
		model.addAttribute("user_List", userService.listUsers());
		return "user_list";
	}
}
