package com.flapper.stark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flapper.stark.dao.UserDao;
import com.flapper.stark.model.UserVO;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public List<UserVO> listUsers() {
		return this.userDao.listUser();
	}
	
}
