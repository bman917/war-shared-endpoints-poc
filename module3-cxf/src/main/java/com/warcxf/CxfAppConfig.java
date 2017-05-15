package com.warcxf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAspectJAutoProxy
@Import( {com.hello.impl.ServiceImplAppConfig.class, com.hello.rest.HelloSvRestConfig.class})
public class CxfAppConfig {
	
	@Bean
	public SecurityManager SecurityManager()
	{
		return new SecurityManager();
	}
}
