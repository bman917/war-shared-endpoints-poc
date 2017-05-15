package com.hello.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hello.interfaces.HelloSvInterface;

@Configuration
public class ServiceImplAppConfig {
	
	@Bean
	public HelloSvInterface helloSv()
	{
		HelloSvImpl impl = new HelloSvImpl();
		return impl;
	}
}
