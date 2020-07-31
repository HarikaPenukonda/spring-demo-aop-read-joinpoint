package com.udemy.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	
	@Before("com.udemy.aopdemo.aspect.AopExpressions.forDaoPackageNoGetterSetter()") // Apply pointcut declaration to advice
	public void beforeAddAccountAdvice()
	{
		System.out.println("\n===> Performing beforeAddAccountAdvice ");
	}
	
	
	
	
	
	

}
