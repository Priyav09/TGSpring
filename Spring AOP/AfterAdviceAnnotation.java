package com.spring;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterAdviceAnnotation {
	
	@AfterReturning("execution(* com.spring.StudentMainApp.get*(..))")
	public void afterReturningAdvice(JoinPoint jp){
		System.out.println("Method " + jp.getSignature().getName() + " invoked at " + new Date());
	}
}
