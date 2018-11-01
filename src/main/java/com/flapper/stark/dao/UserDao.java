package com.flapper.stark.dao;

import java.util.List;

//import org.springframework.stereotype.Repository;


import com.flapper.stark.model.UserVO;


public interface UserDao {
	public List<UserVO> listUser();
}
