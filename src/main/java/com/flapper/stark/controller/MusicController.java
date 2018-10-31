package com.flapper.stark.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.flapper.stark.back_end.TestBeanC;
import com.flapper.stark.model.MusicVO;


@Controller
@RequestMapping(value="/music")
public class MusicController {
	private static final Logger logger = LoggerFactory.getLogger(MusicController.class);
	
	@Autowired
	DriverManagerDataSource dataSource;
	
	@Autowired
//	@Qualifier("testBean")
	TestBeanC testBean;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String music(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		
		return "music_home";
	}
	
	@RequestMapping(value = "/track")
	public ModelAndView musicHome() {
		Connection conn = null;
		ModelAndView mv = new ModelAndView();
		List<MusicVO> list = new ArrayList<MusicVO>();
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("select * from Music_table where Music_title like ?");
			pstmt.setString(1, "%편지%");
			ResultSet rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				MusicVO mvo = new MusicVO();
				mvo.setMusicID(rs.getInt("music_ID"));
				mvo.setMusicTitle(rs.getString("music_Title"));
				
				list.add(mvo);
			}
			
			rs.close();
			pstmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(conn !=null) {
					conn.close();
				}
				
				Iterator<MusicVO> itr = list.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		mv.setViewName("music_list");
		mv.addObject("list", list);
		mv.addObject("testc", testBean);
		return mv;
	}
}
