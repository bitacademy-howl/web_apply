package com.flapper.stark.service;

import java.util.List;

import com.flapper.stark.model.MusicVO;

public interface MusicService {
	public List<MusicVO> MusicByTag(String tag);
}
