package com.flapper.stark.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.flapper.stark.model.MusicVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	MusicVO mvo;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
		
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		/////////////////////////////////////////////////////////////////////////////
		// 여기에 액션 추가....
		//
		mvo.setMusicID(14);
		System.out.println(mvo.getLyrics());
		
		
		
		model.addAttribute("mvo", mvo);
		/////////////////////////////////////////////////////////////////////////////
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
}
