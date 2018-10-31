package com.flapper.stark.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flapper.stark.model.UserVO;


@Repository
public class UserDaoImpl implements UserDao{

	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<UserVO> listUser() {
		Session sess = sessionFactory.openSession();
		String hql = "From UserVO";
		
		
		Query<UserVO> query = sess.createQuery(hql);
		List<UserVO> returnList = query.list();
		
//		List<UserVO> list = sess.createQuery("select * from user_table").getResultList();
		
		logger.info("person List :: " + returnList);
		
		sess.close();
		
		return returnList;
	}
	
}
