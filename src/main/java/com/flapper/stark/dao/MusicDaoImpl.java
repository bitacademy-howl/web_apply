package com.flapper.stark.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flapper.stark.model.MusicVO;
// 일반적으로 DAO에 사용되며 DB Exception을 DataAccessException으로 변환한다.
@Repository(value="musicDao")
public class MusicDaoImpl implements MusicDao{
	
	private static Logger logger = LoggerFactory.getLogger(MusicDaoImpl.class);
	
///////////////////////////////////////////////////////////////////////////	
// SessionFactory : 하이버네이트 지원
// LocalSessionFactoryBean : 하이버네이트의 SessionFactory 인터페이스를 사용하기 위한
//							  스프링에서 지원하는 구현클래스
//	bean 으로 등록해놓았기 때문에 인터페이스로 받아서 사용이 가능하다.
//	Thread safe 한 객체...
//	sessionfactory로부터 세션을 얻어오고, 세션 펙토리는 하이버네이트 내장 connection pool을
//	사용할 경우 커넥션 풀의 기능까지 관리하게 된다....
//	c3p0도 마찬가지....
	
	@Autowired
	private SessionFactory sessionFactory;
	
///////////////////////////////////////////////////////////////////////////
	@Override
	public List<MusicVO> getListByTag(String tag) {
		List<MusicVO> resultList = null;
		
		Session sess = sessionFactory.openSession();
		sess.beginTransaction();
		
		StringBuilder sb = new StringBuilder();
		sb.append("%");
		sb.append(tag);
		sb.append("%");
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		여기 작성중!!!!!!!!!!!!!!!!!!!!!
//
////		session 
//		CriteriaBuilder builder = sess.getCriteriaBuilder();
//
//		CriteriaQuery<MusicVO> criteria = builder.createQuery( MusicVO.class );
//		Root<MusicVO> root = criteria.from( MusicVO.class );
//		
//		criteria.select( root );
//		criteria.where( builder.equal( root.get( Person_.name ), "John Doe" ) );
//
//		List<Person> persons = entityManager.createQuery( criteria ).getResultList();
////		네이티브 쿼리는 테이블명, 컬럼명이 코드에 들어감
//		List<Object[]> persons = sess.createNativeQuery("SELECT * FROM MusicVO").getResultList();
//		
//		logger.info("person List :: " + resultList);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		sess.close();
		return resultList;
	}
	
	@Override
	public List<MusicVO> music_list() {
		List<MusicVO> mList;
		
		Session sess = sessionFactory.openSession();
		sess.beginTransaction();
		
		
		Query<MusicVO> query = sess.createQuery("from MusicVO");
		mList = query.getResultList();
		
		sess.close();
		
		return mList;
	}
}