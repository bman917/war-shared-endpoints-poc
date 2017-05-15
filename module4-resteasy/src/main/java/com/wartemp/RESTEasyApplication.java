package com.wartemp;

import java.util.HashSet;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hello.rest.HelloSvRest;

/**
 * RESTEasy Application
 */
@ApplicationScoped
@ApplicationPath("/rest/")
public class RESTEasyApplication extends Application
{
	ApplicationContext ctx = new AnnotationConfigApplicationContext(com.hello.impl.ServiceImplAppConfig.class, com.hello.rest.HelloSvRestConfig.class);
	private Set<Object> singletons;
	
	public RESTEasyApplication()
	{
		HelloSvRest holloSvRest = ctx.getBean(HelloSvRest.class);
		if (holloSvRest == null)
		{
			throw new RuntimeException("holloSvRest is null!!!");
		}
		
		singletons = new HashSet<Object>();
		singletons.add(holloSvRest);
	}
	
	
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
 }