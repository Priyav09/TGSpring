package com.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.spring.aspect")
@EnableAspectJAutoProxy
public class StudentConfig {

	@Bean
	@Scope("prototype")
	public Student getStudent() {
		return new Student();
	}
	
	@Bean
	public StudentMainApp getStudentMain() {
		return new StudentMainApp();
	}
	
	@Bean
	public AfterAdviceAnnotation getAfterAdviceAnnotation() {
		return new AfterAdviceAnnotation();
	}
}
