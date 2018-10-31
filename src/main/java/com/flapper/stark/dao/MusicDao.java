package com.flapper.stark.dao;

import java.util.List;

//import org.springframework.stereotype.Repository;

import com.flapper.stark.model.MusicVO;

//@Repository
public interface MusicDao {
	public List<MusicVO> getListByTag(String tag);
}
