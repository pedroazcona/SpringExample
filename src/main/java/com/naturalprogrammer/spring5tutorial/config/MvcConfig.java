package com.naturalprogrammer.spring5tutorial.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/home2").setViewName("home2");
		registry.addViewController("/signup").setViewName("signup");
		registry.addViewController("/boot").setViewName("BoostrapTest");
	}
}
