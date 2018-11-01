package com.flapper.stark.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
	
	@Autowired
	private MusicService musicService;
	
//	musicapp 홈
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String musicApp(Locale locale, Model model) {
		
		
		return "musicapp_main";
	}
	
//	musicapp track
	@RequestMapping(value = "/track")
	public ModelAndView musicAppTrack(Locale locale, ModelAndView mv) {
		String tag = "편지";
		List<MusicVO> resultList;
		
		resultList = musicService.MusicByTag(tag);
		
		mv.setViewName("musicapp_main_track");
		mv.addObject("list", resultList);
		return mv;
	}
	
//	musicapp album
	@RequestMapping(value = "/album")
	public ModelAndView musicAppAlbum(Locale locale, ModelAndView mv) {
		List resultList = null;
		// 구현 예정
		
		mv.setViewName("musicapp_main_album");
		mv.addObject("list", resultList);
		return mv;
	}
	
//	musicapp artist
	@RequestMapping(value = "/artist")
	public ModelAndView musicAppArtist(Locale locale, ModelAndView mv) {
		List resultList = null;
		// 구현 예정
		
		mv.setViewName("musicapp_main_artist");
		mv.addObject("list", resultList);
		return mv;
	}
}
