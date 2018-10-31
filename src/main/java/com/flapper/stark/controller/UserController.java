package com.flapper.stark.controller;

import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/user")
public class UserController {

		@RequestMapping(value = "", method = RequestMethod.GET)
		public ModelAndView home(Model model) {
			
			ModelAndView mv = new ModelAndView();
			String obj = "ssd";
			
			mv.setViewName("index");
			mv.addObject(obj);
			
			return mv;
		}
		
		
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Locale locale, Model model){
		
		
		return "login";
	}
}
