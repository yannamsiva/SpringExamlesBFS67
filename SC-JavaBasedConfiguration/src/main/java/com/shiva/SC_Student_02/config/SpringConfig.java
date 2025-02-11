package com.shiva.SC_Student_02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.shiva.SC_Student_02.HelloWorld;
@Configuration
public class SpringConfig {

	@Scope("prototype")
	@Lazy(value = true)
	@Bean
	
	public HelloWorld getInfo()
	{
		HelloWorld g = new HelloWorld();
		g.setMessage("Welcome to Java Based configuration");
		return g;
	}
}
