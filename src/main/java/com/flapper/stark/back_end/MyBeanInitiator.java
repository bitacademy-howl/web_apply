package com.flapper.stark.back_end;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanInitiator {

	@Bean("testBean")
	public TestBeanC getC() {
		TestBeanC testC = new TestBeanC();
		
		testC.setId(10);
		testC.setName("희웅");
		
		return testC;
	}
}
