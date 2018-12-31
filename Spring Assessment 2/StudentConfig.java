package com.spring;

import org.springframework.context.annotation.*;

@Configuration
public class StudentConfig {

	@Bean
	public Student getStudent() {
		return new Student();
	} 
	
	@Bean
	public StudentDetails getStudentDetails() {
		return new StudentDetails();
	}
	
	@Bean
	@Scope("prototype")
	public Test testDetails() {
		return new Test();
	}
}

