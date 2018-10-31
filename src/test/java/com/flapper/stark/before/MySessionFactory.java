package com.flapper.stark.before;

// interfaces
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;

// classes
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySessionFactory{
	
	@Bean
	public SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = null;
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

		try {
			
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
		return sessionFactory;
	}
}
