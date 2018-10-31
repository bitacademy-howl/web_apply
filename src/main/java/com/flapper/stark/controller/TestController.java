package com.flapper.stark.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/test")
public class TestController {
	
		private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
			
		@RequestMapping(value = "", method = RequestMethod.POST)
		public ModelAndView home(Locale locale, ModelAndView modelAndView) {
			logger.info("Welcome home! The client locale is {}.", locale);
			
			Date date = new Date();
			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
			
			
			
			
			String formattedDate = dateFormat.format(date);
			modelAndView.setViewName("music_home");

			return modelAndView;
		}
}
