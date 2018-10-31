package com.flapper.stark.before;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.flapper.stark.model.MusicVO;

// 자바 코드로 빈 설정 및 초기화
@Configuration
@EnableTransactionManagement
public class InitializeBean {
	
	@Autowired
	ApplicationContext applicationContext;
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean sessionFactoryBean;

		sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setConfigLocation(applicationContext.getResource("classpath:hibernate.cfg.xml"));
		sessionFactoryBean.setAnnotatedClasses(MusicVO.class);
		
		return sessionFactoryBean;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(getSessionFactory().getObject());
		return txManager;
	}
}
