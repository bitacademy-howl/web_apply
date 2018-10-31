package com.flapper.stark.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.flapper.stark.model.MusicVO;
import com.flapper.stark.service.MusicService;

@Controller
@RequestMapping(value="/music")
public class MusicController {
	private static final Logger logger = LoggerFactory.getLogger(MusicController.class);
	
	@Autowired
	private MusicService musicService;
	
//	musicapp 홈
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String music(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		
		return "musicapp_main";
	}
	
//	musicapp 에서 음원 눌렀을때의 홈
	@RequestMapping(value = "/track")
	public ModelAndView musicHome(ModelAndView mv) {
		String tag = "아이유";
		List<MusicVO> resultList;
		
		resultList = musicService.MusicByTag(tag);
		
		mv.setViewName("musicapp_main_test");
		mv.addObject("list", resultList);
		return mv;
	}
}
