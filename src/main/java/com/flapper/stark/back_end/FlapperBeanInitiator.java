package com.flapper.stark.back_end;

// interfaces
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;

// classes
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlapperBeanInitiator{

	@SuppressWarnings("finally")
	@Bean("sessionFactory")
	public SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = null;
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("META-INF/hibernate.cfg.xml").build();

		try {
			
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			
		} catch (Exception e) {
			
			StandardServiceRegistryBuilder.destroy(registry);
			
		} finally {
			
			return sessionFactory;
			
		}
	}
}