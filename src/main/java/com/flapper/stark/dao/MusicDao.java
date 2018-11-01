package com.flapper.stark.dao;

import java.util.List;
import com.flapper.stark.model.MusicVO;

public interface MusicDao {
	public List<MusicVO> getListByTag(String tag);
	public List<MusicVO> music_list();
}
