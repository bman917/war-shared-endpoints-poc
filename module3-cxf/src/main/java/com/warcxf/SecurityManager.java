package com.warcxf;

import java.io.IOException;

import javax.servlet.ServletException;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class SecurityManager {
	
	@Around("execution(* com.hello.rest.HelloSvRest.xml(..))")
	public void checkAccess(ProceedingJoinPoint joinPoint) throws ServletException, IOException 
	{
		throw new RuntimeException("AOP-SECURITY Enabled!!! SecurityManager has rejected the request!!");
	}
}
