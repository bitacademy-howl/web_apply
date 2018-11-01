package com.flapper.stark.back_end;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.flapper.stark.model.AlbumVO;
import com.flapper.stark.model.ArtistVO;
import com.flapper.stark.model.MusicVO;
import com.flapper.stark.model.UserVO;

@Configuration
@EnableTransactionManagement
public class BeanInitiator {
 
    @Autowired
    private ApplicationContext context;
 
    @Bean("sessionFactory")
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setConfigLocation(context.getResource("classpath:META-INF/hibernate.cfg.xml"));
        
//        factoryBean.setAnnotatedPackages("com.stark.flapper.model");
        factoryBean.setAnnotatedClasses(
        		UserVO.class, 
        		MusicVO.class,
        		AlbumVO.class,
        		ArtistVO.class
        		);
//        factoryBean.setAnnotatedClasses(MusicVO.class);
        
        return factoryBean;
    }
 
    @Bean("txManager")
    public HibernateTransactionManager getTransactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory().getObject());
        return transactionManager;
    }
}
