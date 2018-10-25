package com.flapper.stark.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/music")
public class MusicController {
	private static final Logger logger = LoggerFactory.getLogger(MusicController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public String musicHome(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		List<String> list = new ArrayList<String>();
		list.add("helloWorld");
		
		model.addAttribute("name", "helloWorld");
		model.addAttribute("list", list);
		
		return "music_list";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String musicList(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("name", "helloWorld");
		
		return "music_list";
		
	}
}
