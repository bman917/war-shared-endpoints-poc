package com.hello.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hello.interfaces.HelloSvInterface;

@Configuration
public class HelloSvRestConfig {
	
	@Bean("HelloSvRest")
	public HelloSvRest HelloSvRest(HelloSvInterface impl)
	{
		HelloSvRest restSv= new HelloSvRest(impl);
		return restSv;
	}
}