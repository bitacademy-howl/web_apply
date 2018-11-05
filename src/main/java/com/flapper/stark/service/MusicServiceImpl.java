package com.flapper.stark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flapper.stark.dao.MusicDao;
import com.flapper.stark.model.MusicVO;

@Service
public class MusicServiceImpl implements MusicService{
	
	@Autowired
	MusicDao musicDao;
	
	@Override
	public List<MusicVO> MusicByTag(String tag) {
//		List<MusicVO> rl = this.musicDao.getListByTag(tag);
//		
////////////////////////////////////////////////////////////////////////////////		
////		일단은 서브리스트를 넘긴다....
////		사실 DAO 에서 쿼리자체를 10개씩만 받아오는게 더 맞음.....
////		오버플로 될거 같다...
//		if(rl.size() > 10) {
//			rl = rl.subList(0, 10);
//		}
////		여기는 좀더 생각해볼 것!!!
////		서비스 계층에서 뭘 할지....
////		form 양식으로 받아온 것들 처리 및 검증이 될수도 있으려나....
////////////////////////////////////////////////////////////////////////////////
//		
//		return rl;
		
		return this.musicDao.getListByTag(tag);
		
		
	}
}
