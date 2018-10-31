package com.flapper.stark.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.flapper.stark.model.MusicVO;

public class MusicDAO {
	
///////////////////////////////////////////////////////////////////////////	
//	 둘중 뭘 써야 하나 차이점이랑 자세히 알아볼 것!!!!
//	
//	@Autowired
//	LocalSessionFactoryBean sesstionFactoryBean;
	@Autowired
	SessionFactory sessionFactory;
///////////////////////////////////////////////////////////////////////////
	
	public void searchingByTag(String tag) {
		Session sess = sessionFactory.openSession();
		sess.beginTransaction();
		
		
		
//		critria 쿼리를 사용하기 위해서 VO 객체마다 VO_ 이름의 클래스를 정의해야하는 번거로움;;
//		저절로 정의되는 것 있는것 같지도 않음;;;
//		아 좀 나중에...
//		CriteriaBuilder builder = sess.getCriteriaBuilder();
//		CriteriaQuery<MusicVO> criteria = builder.createQuery(MusicVO.class);
//		
//		Root<MusicVO> root = criteria.from(MusicVO.class);
//		
////		root 객체로 부터 select 하겠다...
//		criteria.select(root);
//		criteria.where(builder.equal(root.get(MusicVO_.), y))
//		
//		
//		
//		criteria.where(builder.equal(x, y))
		
		sess.close();
		
	}
	
	public List music_list() {
		List<MusicVO> mList = null;
		
		Session sess = sessionFactory.openSession();
		sess.beginTransaction();
		
		Query query = sess.createQuery("from Item");
		
		mList = query.getResultList();
		
		sess.close();
		
		return mList;
	}
}